import random
import string

guessHistory = []
clueHistory = []

secretSpace = []

def populateSecretSpace():
    ''' space of possible secrets is 000-999 '''
    global secretSpace
    for i in string.digits:
        for j in string.digits:
            for k in string.digits:
#                if i != j and i != k and j != k:
                    ijk = i+j+k
                    secretSpace.append(ijk)


def filterPlayer(guessNum):
    global secretSpace

    def pruneSecretSpace():
        ''' remove all secrets that are incompatible with the most recent clue '''
        global secretSpace
        lastGuess = guessHistory[-1]
        lastClue = clueHistory[-1]
        newSpace = []
        for secret in secretSpace:
            if getClues(secret, lastGuess) == lastClue:
                newSpace.append(secret)
        secretSpace = newSpace

    if guessNum == 0:
        populateSecretSpace()

    if guessNum > 0:
        pruneSecretSpace()

    return random.choice(secretSpace)


def makeSecret():
    ''' Return a three character string composed of random digits (000-999).'''
    secret = random.choice(secretSpace) 
##    secret = ''
##    for i in range(3):
##        secret += random.choice(string.digits)
    return secret


def getClues(secret, guess):
    ''' In a game of bagels, given

        secret -- a three character string of digits 
        guess  -- a three character string of digits

        calculate and return a three-tuple of clues (fermis, picos, bagels).

        A fermi is a guess digit that matches the secret in value and position.
        A pico is a guess digit that matches a secret digit in value but not in
        position. A bagel is a guess digit that does not match a secret digit.

        Each guess digit may match at most one secret digit, and is assigned
        exactly one clue. Each secret digit may match at most one guess digit.
    '''
    fermis = picos = bagels = 0

    ''' Record whether each digit in secret has been matched with a digit
        in guess
    '''
    matched = [False, False, False]

    ''' Count fermis '''
    for i in range(3):              
        if guess[i] == secret[i]:  
            matched[i] = True
            fermis += 1
            
    ''' Count picos '''
    for guessIdx in range(3):
        for secretIdx in range(3):
            ''' Guess digit must be in different position than secret digit '''
            if guessIdx == secretIdx: 
                continue              

            ''' Secret digit must not already be matched '''
            if matched[secretIdx] == True: 
                continue                   
            
            if guess[guessIdx] == secret[secretIdx]: 
                matched[secretIdx] = True
                picos += 1
                break  

    ''' Each guess digit gets a clue, so clues add up to 3 '''
    bagels = 3-fermis-picos
    return (fermis, picos, bagels)
    

def getGuess(guessNum):
    ''' Input a three character guess in the range [000-999] from
        the (human) user and return it
    '''
    while True:
        guess = input('Your guess please (000-999): ')
        
        if len(guess) != 3:
            print('A guess must have exactly 3 digits')
            continue

        ''' Check if there is a nondigit in guess '''
        nondigit = False
        for chr in guess:
            if chr not in string.digits:
                nondigit = True
                break
        if nondigit == True:
             print('Digits only')
             continue
        
        return guess

def randomPlayer(guessNum):
    ''' Choose a random guess in the range [000-999] '''
    return(makeSecret())
    

def playBagels(player2):
    ''' Play a single game of bagels:

        i.   create a secret three digit string
        ii.  loop, getting a 3 digit guess from player2 on each iteration
        iii. for each guess, get the clues as a (f,p,b) tuple
        iv.  for each guess, print the clues for player2 if player2 is human
        iii. maintain global guessHistory and clueHistory lists that
             may be accessed by player2 (if Player2 is a computer function)

        When player2 guesses the secret, print and return the guess count.
    '''
    guessCount = 0
    populateSecretSpace()
    secret = makeSecret()
    
    while True:
        if player2 == 'human':
            guess = getGuess(guessCount)
        elif player2 == 'randomPlayer':
            guess = randomPlayer(guessCount)
        elif player2 == 'filterPlayer':
            guess = filterPlayer(guessCount)

        guessHistory.append(guess)
        guessCount += 1

        clues = getClues(secret, guess)
        clueHistory.append(clues)

        if player2 == 'human':
            print('For', guess, 'the clues (f/p/b) are', clues)

        if guess == secret:
            print('Guessed', secret, 'in', guessCount, 'guesses!')
            return guessCount

def playBagelsSeries(player2, numGames):
    min = max = sum = playBagels(player2)

    for i in range(numGames-1):
        guessCount = playBagels(player2)
        if guessCount < min:
            min = guessCount
        if guessCount > max:
            max = guessCount
        sum += guessCount

    print(numGames, 'games')
    print('min', min)
    print('max', max)
    print('average', sum/numGames)



def bagelCluesTest():
    testSuite = [
        ('011', '100', (0,2,1)),
        ('787', '878', (0,2,1)),
        ('060', '606', (0,2,1)),
        ('505', '050', (0,2,1)),
        ('577', '755', (0,2,1)),
        ('002', '220', (0,2,1)),
        ('212', '121', (0,2,1)),
        ('707', '070', (0,2,1)),
        ('080', '808', (0,2,1)),
        ('040', '404', (0,2,1)),
        ('787', '878', (0,2,1))
        ]
    print('running bagelCluesTest')
    for test in testSuite:
        print(test, end=' ')
        clues = getBagelClues(test[0],test[1])
        if clues == test[2]:
            print('PASS')
        else:
            print('FAIL')
            return

#playBagelsSeries('human', 1)
#playBagelsSeries('randomPlayer', 1000)
playBagelsSeries('filterPlayer', 1000)

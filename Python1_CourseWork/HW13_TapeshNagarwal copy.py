#Tapesh Nagarwal COED with Martin Z CS100 H01

import random
import string

global guess
guess = 0

def initial():
    global guess
    guess = 0
    
def createNextGuess(clues): #comes up with a number by checking each digit and seeing if it is equal to the guess
    print(clues) 
    global guess
    if clues[0] == False: 
           guess += 100
    if clues[1] == False:
            guess += 10
    if clues[2] == False:
            guess += 1
    if guess >999:
        guess=0
    if guess > 100:
        return str(guess)
    elif guess > 10:
        return '0'+ str(guess)
    else:
        return '00' + str(guess)
    
def hiddenGuess():  # returns guess as a 3 digit string.  
    global guess
    if guess > 100:
        return str(guess)
    elif guess > 10:
        return '0'+ str(guess)
    else:
        return '00' + str(guess) 

def makeSecret():
    secret = ''
    for i in range(3):
        secret += random.choice(string.digits)
    return secret

def checkGuess(guess, secret, test): #checks if each index are equal to corresponding index
    for i in range(3):
        if int(guess[i]) == int(secret[i]):
            test[i] = True
    return test

def playBagels():
    secret = makeSecret()
    guessCount = 0
    initial()
    test = [False,False,False] 
    while True:
        guess = hiddenGuess()
        print('p''', 's guess is ',guess)
        guessCount += 1
        if guess == secret:
            print('You guessed it in', guessCount, 'guesses')
            break
        else:
            print('Your clues (f/p/b):', getBagelClues(secret, guess))

        test = checkGuess(guess, secret, test)
        createNextGuess(test)
        if(test == [True, True, True]):
            break

def getBagelClues(secret, guess):
    fermis = picos = bagels = 0
    secretMatched = [False, False, False]

    '''Calculate fermis -- a guess that matches secret in both
       position and value.'''
    for i in range(3):
        if guess[i] == secret[i]:
            fermis += 1
            secretMatched[i] = True

    for guessIdx in range(3): 
        for secretIdx in range(3):
            if guessIdx == secretIdx:
                continue
            if secretMatched[secretIdx] == True:            
                continue
            elif guess[guessIdx] == secret[secretIdx]:
                picos += 1
                secretMatched[secretIdx] = True
                break
    bagels = 3-(fermis+picos)
    
    return (fermis, picos, bagels)

playBagels()

def bagelCluesTest():
    testSuite = [
        ('011', '100', (0,2,1))
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

bagelCluesTest()
            

    

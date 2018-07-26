import random

def convertToList(number):
    numbers = str(number)
    convertedList = [int(c) for c in numbers]
    return convertedList  
    
def check(guess,randomNum,index):
    rtrn = ''
    if guess[index] == randomNum[index]:
        rtrn += " FERMIS "      
    elif guess[index] in randomNum:
        rtrn += " PICOS "       
    elif (guess[index] != randomNum[0]) and (guess[index] != randomNum[1]) and (guess[index] != randomNum[2]):
       rtrn += " BAGEL "
    return rtrn

welcomeScreen = input("Welcome to the Bagel Game by Tapesh Nagarwal! Press any key to continue or 'Q' to quit: ")
byeScreen = ("Thanks for playing! Bye-Bye :)")
playAgainScreen = 'Y'

while playAgainScreen == 'Y' or playAgainScreen == 'y':
    print("I will think of a random three digit number")
    print("You will guess the number and I will give you hints about place value")
    print("FERMIS means the number is correct and in the right place value")
    print("PICOS means the number is correct but in the wrong place value")
    print("BAGEL means the number is not correct at all")
    print("Lets begin!")
    print('')
    if welcomeScreen != 'Q' and welcomeScreen != 'q':
        compNum = random.randint(100, 1000)
        #print(compNum)
        userNum = input ("Guess a three digit number from 100 - 999: ")
        userNum = int(userNum)
        
        while compNum != userNum:
            userNum1 = convertToList(userNum)
            compNum1 = convertToList(compNum)
            output = check(userNum1, compNum1, 0) + check(userNum1, compNum1, 1) + check(userNum1, compNum1, 2)
            print(output)
            userNum = input("Sorry! Guess again: ")
            userNum = int(userNum)
            
            
        print("Winner!")
        playAgainScreen = input("Do you want to play again? Press 'Y' or press any key to quit: ")
        
print(byeScreen)




        
    


        


 
    

#Tapesh Nagarwal CS100-H01
import string

#Problem 1
def twoWords(length, firstLetter):
    while True:
        userWord1 = input("A " + str(length) + "-letter word please: ")
        if len(userWord1) == length:
            break
    while True:
        userWord2 = input("A word beginning with " + firstLetter + " please: ")
        if userWord2.startswith(firstLetter.lower()) or userWord2.startswith(firstLetter.upper()):
            break
    return [userWord1, userWord2]        
    
#Problem 2
def twoWordsV2(length, firstLetter):
    while True:
        userWord1 = input("A " + str(length) + "-letter word please: ")
        if len(userWord1) == length:
            while True:
                userWord2 = input("A word beginning with " + firstLetter + " please: ")
                if userWord2.startswith(firstLetter.lower()) or userWord2.startswith(firstLetter.upper()):
                    return [userWord1, userWord2]     

#Problem 3
def lastfirst(nameList):
    firstNames = []
    lastNames = []
    output = [firstNames, lastNames]
    counter = 0
    while counter < len(nameList):
        pair = nameList[counter].split()
        firstNames.append(pair[0])
        lastNames.append(pair[1])
        counter += 1
    return output

#Problem 4
def mystery(n):
    counter = 0
    while True:
        if (n/2) >= 1:
            counter += 1
            n = (n/2)
        else:
            return counter
        
#Problem 5
def enterNewPassword():
    digits = ['1', '2', '3', '4', '5', '6', '7', '8', '9', '0']
    password = input("Enter a password with 8-15 characters, including at least one digit: ")
    validPass = False
    while True:
        if len(password) < 8 or len(password) > 15:
            print("Password needs to contain at least 8-15 characters")
            password = input("Enter a password with 8-15 characters, including at least one digit: ")
            continue
        for character in password:
            if character.isdigit():
                validPass = True
        if validPass:
            print("You've made a successful password!")
            break
        else:
            print("Your password needs to contain at least one digit")
            password = input("Enter a password with 8-15 characters, including at least one digit: ")



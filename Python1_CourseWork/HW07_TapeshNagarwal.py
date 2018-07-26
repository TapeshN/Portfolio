#Tapesh Nagarwal CS100H01
"""
Question #1
My Answer: C
Correct Answer: C
Reason: Because there are two if statements and once a condition is met, 'trueCount' get a value added on
"""
"""
Question #2
My Answer:B
Correct Answer:B
Reason:simple addition of 2, -1, 0
"""
"""
Question #3
My Answer:C
Correct Answer:B
Reason: '[]' is a empty set
"""
"""
Question #4
My Answer:C
Correct Answer:C
Reason:prints indexes till the stop value
"""
"""
Question #5
My Answer:
Correct Answer:
Reason:
"""
"""
Question #6
My Answer:B
Correct Answer:B
Reason:Process of elimination answer had to be an INT value
"""
"""
Question #7
My Answer:B
Correct Answer:B
Reason:First if conditional was true so it printed then the second was false so it went through with the else statement
"""
"""
Question #8
My Answer:A
Correct Answer:A
Reason: for loop that checks if the 'letter' is in 'circleLetter's and adds it to empty string 'accum'
"""
"""
Question #9
My Answer:A
Correct Answer:A
Reason:The first item in the list was a empy list and was true for the first if conditional statment
"""
"""
Question #10
My Answer:A
Correct Answer:B
Reason: NOT SURE
"""
"""
Question #11
"""
def dashes(t, numDashes, dashLength):
    for i in range(numDashes):
        t.forward(dashLength) 
        t.up()
        t.forward(dashLength)
        t.down()

import turtle        
s = turtle.Screen()
shelly = turtle.Turtle()
dashes(shelly, 10 , 20)

"""
Question 12
"""
def shortest(textList):
    shortestLen = len(textList[0])
    for string in textList:
        if len(string) < shortestLen:
            shortestLen = len(string)
    return shortestLen

beatleLine = ['I', 'am', 'the', 'walrus']
print(shortest(beatleLine))

"""
Question 13
"""
def nameHasLetter(aLetter):
    name = input("Enter your name: ")
    if aLetter in name:
        print("You name contains the letter: " + aLetter)
        return True
    else:
        print("Your name does not contain the letter: " + aLetter)
        return False

print(nameHasLetter('a'))

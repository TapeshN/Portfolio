#Tapesh Nagarwal Midterm#3

"""
Question #1
My Answer: D
Correct Answer: E
Reason: It prints the value each time I thought it printed the trueCount after the for loop
"""
###Break###
"""
Question #2
My Answer: A
Correct Answer:D
Reason: Overlooked the fact that 0 was in a string ('0'). Basically, you cant add a string and an integer
"""
###Break###
"""
Question #3
My Answer:A
Correct Answer:B
Reason: lists will always print out as list but this index was a sublist
"""
###Break###
"""
Question #4
My Answer:A
Correct Answer:A
Reason:You cant use operands on a string
"""
###Break###
"""
Question #5
My Answer:A
Correct Answer:A
Reason:Two overlapping triangles will be made with those dimensions
"""
###Break###
"""
Question #6
My Answer:E
Correct Answer:E
Reason:It should print out a
"""
###Break###
"""
Question #7
My Answer:A
Correct Answer:A
Reason:first conditional if statement was true
"""
###Break###
"""
Question #8
My Answer:C
Correct Answer:C
Reason:for loop adds any string that fits conditonal if statement
"""
###Break###
"""
Question #9
My Answer:D
Correct Answer:D
Reason:You can not call a function before it is defined in the code
"""
###Break###
"""
Question #10
My Answer:B
Correct Answer:B
Reason:function prints the parameter and print function will print as given
"""
###Break###
"""Question #11"""
def parallelLines(t, numLines, lineLength):
    for i in range(numLines):
        t.forward(lineLength)
        t.back(lineLength)
        t.up()
        t.right(90)
        t.forward(25)
        t.left(90)
        t.down()
        
"""Question #11 B"""
import turtle
s = turtle.Screen()
t = turtle.Turtle()
parallelLines(t, 5, 100)

"""Question #12"""
def containsLetter(aLetter, strList):
    returningList = []
    for i in range(len(strList)):
        if aLetter in strList[i]:
            returningList.append(strList[i])
    return returningList

"""Question #12 B"""
hulkLine = ["you", "wouldn't", "like", "me", "when", "i'm", "angry"]
string = 'hulk'
for letter in string:
    x = containsLetter(letter, hulkLine)
    print(x)

"""Question #13"""
def getInt(minInt,maxInt):
    userNum = input("Type a number between " + str(minInt) + " and " + str(maxInt) + ": ")
    if int(userNum) > int(minInt):
        if int(userNum) < int(maxInt):
            return (userNum)

"""Question #13 B"""
num = int(getInt(-10,12))
print(num)
if num > 0:
    print("Integer is positive")
if num < 0:
    print("Integer is negative")
if num == 0:
    print("Integer is zero")


    

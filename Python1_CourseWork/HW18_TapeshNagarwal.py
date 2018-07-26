#Tapesh Nagarwal Final Practice 1
"""
Problem # 1
My Answer: C
Correct Answer: B
Reason: I thought it would return 2 bc there are two e's in the word
"""
"""
Problem # 2
My Answer: E
Correct Answer: E
Reason: returns None
"""
"""
Problem # 3
My Answer: A
Correct Answer: A
Reason:3rd word
"""
"""
Problem # 4
My Answer: D
Correct Answer:D
Reason: just prints 'e'
"""
"""
Problem # 5
My Answer: D
Correct Answer: D
Reason: prints 0 in the dictonary value then goes to 1 index of 'zero'
"""
#Questions 11 A
import turtle
s = turtle.Screen()
turt = turtle.Turtle()
def capT(turt, height):
    turt.left(90)
    turt.forward(height)
    turt.left(90)
    turt.forward(height//4)
    turt.right(180)
    turt.forward(height//2)
    turt.back(height//4)
    turt.right(90)
    turt.up()
    turt.forward(height)
    turt.left(90)

#Question 11 PART B 
s = turtle.Screen()
t = turtle.Turtle()
def tRow(t, num, init, ratio):
    for i in range(num):
        if i == 0:
            capT(t, init)
        if i != 0:
            newInit = init * ratio
            t.up()
            t.forward(newInit//2)
            t.down()
            capT(t, newInit)
            init = newInit




#Question 12
import string
def fileStats(inFile, outFile):
    inF = open(inFile, 'r')
    outF = open(outFile, 'w')
    charCount = 0
    wordCount = 0
    lineCount = 0
    digitCount = 0
    punctCount = 0
    digit = string.digits
    punct = string.punctuation 
    lines = inF.readlines()
    for line in lines:
        lineCount += 1
        charCount += len(line)
        words = line.split()
        for word in words:
            wordCount += 1
            for character in word:
                if character in string.digits:
                    digitCount += 1
                if character in string.punctuation:
                    punctCount += 1
    outF.write('characters ' + str(charCount) + '\n')
    outF.write('words ' + str(wordCount) + '\n')
    outF.write('lines ' + str(lineCount) + '\n')
    outF.write('digits ' + str(digitCount) + '\n')
    outF.write('punctuation ' + str(punctCount) + '\n')
    inF.close()
    outF.close()

#Tapesh Nagarwal HW 17

#Problem 1
def pigLatin(iFile):
    vowels = ['aeiouAEIOU']
    inF = open(iFile,'r')
    lines = inF.readlines()
##    for vowel in vowels:
##        for line in lines:
##            line.strip('\n')
##            words = line.split()
##            for word in words:
##                for letter in word:
##                    if vowel == letter:
                        
        


#Problem 3
import turtle
s = turtle.Screen()
t = turtle.Turtle()
def wave(t, waveRadius, numWaves):
    for i in range(numWaves):
        if i%2 == 0:
            t.circle(waveRadius,180)
        if i%2 == 1:
            t.circle(-waveRadius,180)

def squareWave(t, sideLength, numWaves):
    for i in range(numWaves):
        if i%2 == 0:
            t.left(90)
            for i in range(3):
                t.forward(sideLength)
                t.right(90)
        if i%2 == 1:
            t.left(90)
            for i in range(3):
                t.forward(sideLength)
                t.left(90)
            t.right(180)
    t.left(90)

#Problem 5
def analyzeText(inFile):
    inF = open(inFile, 'r')
    d = {}
    lines = inF.readlines()
    for i in range(len(lines)):
        for line in lines:
            contentCount = len(line)
        d[i] = contentCount
    return d

#Problem 7
def wordCount(inFile, outFile, searchWord):
    inF = open(inFile, 'r')
    outF = open(outFile, 'w')
    lines = inF.readlines()
    for line in lines:
        count = 0
        words = line.split()
        for word in words:
            if searchWord == word:
               count += 1
        outF.write(str(count) + '\n')
    inF.close()
    outF.close()

#Problem 9
import turtle
s = turtle.Screen()
t = turtle.Turtle()
def drawTriangle(t, sideLen):
    for i in range(3):
        t.forward(sideLen)
        t.left(120)

#def triForce(t, sideLen):
"""Directions are fuzzy"""
    

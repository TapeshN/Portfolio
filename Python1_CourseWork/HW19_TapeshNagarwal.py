#Tapesh Nagarwal CS100-H01

"""
Question #1
My Answer: B
Correct Answer: B
Reason:
"""
"""
Question #2
My Answer: A
Correct Answer: A
Reason:
"""
"""
Question #3
My Answer: A
Correct Answer: A
Reason:
"""
"""
Question #4
My Answer: C
Correct Answer: C
Reason:
"""
"""
Question #5
My Answer: B
Correct Answer: B
Reason:
"""
#Question 11 PART A
import turtle
t = turtle.Turtle()
s = turtle.Screen()
def tri(t, size):
    for i in range(3):
        t.forward(size)
        t.left(120)

#Question 11 PART B
def trifecta(size, angle, num):
    for i in range(num):
        tri(t, size)
        t.right(angle)

#Question 12
def makeWordList(readFileName, writeFileName):
    inF = open(readFileName, 'r')
    outF = open(writeFileName, 'w')
    text = inF.read().lower()
    listWords = text.split()
    d = {}
    for word in listWords:
        if word not in d.keys():
            d[word] = 0
        if word in d:
            d[word] += 1
    for item in d.items():
        outF.write(str(item) + '\n')
    inF.close()
    outF.close()
makeWordList('test.txt','outtest.txt')
 
    
    
        
    
    

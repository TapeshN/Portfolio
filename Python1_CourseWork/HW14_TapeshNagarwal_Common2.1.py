#Tapesh Nagarwal Common2 num.1

"""
Question #1
My Answer: B
Correct Answer: C
Reason: The x += i is after the print then the for loop will run three times 0,1, and should result in 2,2,3 
"""
"""
Question #2
My Answer: C
Correct Answer: C
Reason: noise[0] = 'h' noise[1] = 'u' noise[2] = 'l' noise [3] = 'l' noise[3+4]= 'l'
"""
"""
Question #3
My Answer: A
Correct Answer: A
Reason: 2*s[:5] = 'GimmeGimme' + s[:] = 'GimmeASlice' = 'GimmeGimmeGimmeASlice'
"""
"""
Question 4
My Answer:D
Correct Answer:D
Reason: Dont know how to explain :( but its right!
"""
"""
Question 5
My Answer: D
Correct Answer: D
Reason: goes through 'Merida' and gets M, goes through 'Elinor' gets 'E', goes through 'Macintosh' gets 'M', goes through 'Fergus' and gets 'F'
"""
"""
Question 6
My Answer: C
Correct Answer: C
Reason: The slice contains '' and sublist ['Ebola','SARS']
"""
##Question 7 Skip
"""
Question 8
My Answer: C
Correct Answer: C
Reason: True and False = False, not True = False, True or False = True so break
"""
"""
Question 9
My Answer: E
Correct Answer: E
Reason: Should be list of integers
"""
"""
Question 10
My Answer: A
Correct Answer: C
Reason: Not sure
"""
#Question 11A
import turtle
s = turtle.Screen()
t = turtle.Turtle()

def halfSquare(t, length):
    t.forward(length)
    t.left(90)
    t.forward(length)
    t.left(90)

#Question 11B
import turtle
s = turtle.Screen()
t = turtle.Turtle()
def halfSquares(t, initial, increment, reps):
    halfSquare(t, initial)
    for i in range(reps):
        initial += increment 
        halfSquare(t, initial)

halfSquares(t, 20,20,10)

#Question 12
import string
def wordCount(inFile, outFile):
    inText = open(inFile, 'r')
    outText = open(outFile, 'w')
    lines = inText.readlines()
    for line in lines:
        outText.write(str(len(line.split())) + '\n')
    inText.close()
    outText.close()
    


 
    
    






















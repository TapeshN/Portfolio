#Tapesh Nagarwal CS100-H01 Practice Midterm 1

"""
Problem #1:
My answer: A
correct aswer: E
reason for difference: because I thought the Syntax for bools variable was inncorect
"""
#########break#########
"""
Problem #2:
My answer: A
Correct answer: A
Reason for difference:
"""
#########break#########
"""
Problem #3:
My answer: E
Correct answer: C
Reason for difference: I thought that the 0:-1 index was going to print out ['zero','-1']
"""
#########break#########
"""
Problem #4:
My answer: E
Correct answer: E
Reason for difference: NA
"""
#########break#########
"""
Problem #5:
My answer: D
Correct answer: C
Reason for difference: NA (NOT SURE)
"""
#########break#########
"""
Problem #11 PART A:
"""
import turtle
s = turtle.Screen()
t = turtle.Turtle()
def drawTick(t, tickLen):
    t.left(90)
    t.forward(tickLen)
    t.up()
    t.back(tickLen)
    t.down()
    t.right(90)
    return

"""
Problem #11 PART B:
"""
import turtle
s = turtle.Screen()
t = turtle.Turtle()
def drawTicks(t, tickLen, numTicks, distance):
  for i in range(numTicks):
    drawTick(t, tickLen)
    t.up()
    t.forward(distance)
    t.down()


#########break#########

#Class Word Problem:

def function1(n):
    list1 = []
    for x in range(1,n):
        for y in range(x,n):
            if ( x*x*x+y*y*y < n ):
                list1.append(x*x*x+y*y*y)
    return (list1)
      
        


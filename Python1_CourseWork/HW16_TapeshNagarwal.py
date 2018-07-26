#Tapesh Nagarwal HW16 Common 2 Practice 3
'''
Question #1
My Answer: D
Correct Answer: D
Reason: 0-7 = -7, -7-8 = -15, -15-9 = -24
'''
'''
Question #2
My Answer:C
Correct Answer: C
Reason: H shows up 2 times so 2 then A shows up 2 times too so instead it prints A then L shows up 3 times so it prints out 3 and L shows up 3 time so instead it prints out L and E shows up 1 time so it prints 1 then L gets printed again and U and J and A and H
'''
'''
Question #3
My Answer: E
Correct Answer: E
Reason: I thought it would print out 'bye-byeskansa' but the intrepertor interperts it as 'bye-bye kansas'... still got the right answer!
'''
'''
Question #4
My Answer: B
Correct Answer: B
Reason: 'ei' 'ei' was a substring printed twice
'''
'''
Question #5
My Answer: D
Correct Answer: D
Reason: hard to explain but had traced it correctly
'''
'''
Question #6
My Answer:C
Correct Answer:C
Reason: Takes the index of 2 for the first list then 1 of the sublist
'''
'''
Question #7
My Answer: B
Correct Answer: B
Reason: prints string with len of 5 or higher
'''
'''
Question #8
My Answer: C
Correct Answer: C
Reason: n should be even and a should be odd and b should be odd
'''
'''
Question #9
My Answer: A
Correct Answer: A
Reason: should print out 0-9 
'''
'''
Question #10
My Answer: E 
Correct Answer: E
Reason: You cant call a function unless its already defined
'''
#Question 11A
import turtle
def outposts(t, radius, side):
    t = turtle.Turtle()
    s = turtle.Screen()
    for i in range(4):
        t.down()
        t.circle(radius)
        t.up()
        t.forward(side)
        t.right(90)

#Question 11B
#outposts(5,10,50)

#Question 12
def hasDescender(s):
    descenders = ['g', 'j', 'p', 'q', 'y']
    checkList = []
    rtrnList = []
    words = s.split()
    for word in words:
        for descender in descenders:
            if descender in word:
                checkList.append(word)
    for item in checkList:
        if item not in rtrnList:
            rtrnList.append(item)
    return rtrnList
           
#Question 13
def wordLengths(inFile):
    d = {}
    inF = open(inFile)
    words = inF.read().replace('/n','').split()
    for word in words:
        for key in d.keys():
            if (str(len(word))) not in key:
                d[(len(word))] = (len(word))
    inF.close()
    print(d) 
#AHHHH :( Give up


    

        
                
    
    

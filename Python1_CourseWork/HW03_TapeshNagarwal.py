#Tapesh Nagarwal CS100-H01

#1
a = 3
b = 4
c = 5
if a < b:
    print('OK')
if c < b:
    print('OK')
if a+b == c:
    print('OK')
if a**2 and b**2 == c**2:
    print('OK')   
#2
if a < b:
    print('OK')
else:
    print('NOT OK')
if c < b:
    print('OK')
else:
    print('NOT OK')
if a+b == c:
    print('OK')
else:
    print('NOT OK')
if a**2 and b**2 == c**2:
    print("OK")
else:
    print('NOT OK')
#3
color = input('What color?')
lineWidth = input('What line width?')
lineLength = input('What line length?')
shape = input('line, triangle or square?')

import turtle
s = turtle.Screen()
t = turtle.Turtle()
t.pencolor(color)
t.pensize(lineWidth)
t.forward(lineLength)

if shape == 'line':
    t.forward(lineLength)          

if shape == 'triangle':
    for i in range(3):
        t.lineLength
        t.right(120)

if shape == 'square':
    for i in range(4):  
        t.lineLength
        t.right(90)


#Tapesh Nagarwal HW06

"""
Problem #6
My Answer:A
Correct Answer:A
Reason:The definition check will check if the string in the input equas the element +1
"""
###BREAK###
"""
Problem #7
My Answer:B
Correct Answer:E
Reason: The answer should read "give exam, car won't start"
"""
###BREAK###
"""
Problem #8
My Answer:D
Correct Answer:D
Reason:shortCount= everytime the string in the list isaac was three characters or less
"""
###BREAK###
"""
Problem #9
My Answer: B
Correct Answer:B
Reason: the function notIn returns a list of words from list quote if the letter the user input is not in the word
"""
###BREAK###
"""
Problem #10
My Answer:A
Correct Answer:D
Reason: I thought that it would print ['anagram'] but realized the element was a string
"""
###BREAK###
"""
Problem#12
"""
def beginsWith(letter,strList):     #define function 'beginsWith' with 2 parameters
    counter = 0                     #set a counter equal to 0    
    for str in strList:             #for loop strList 
        if str[0] == letter:        #condtional if statement
            counter += 1            #add to the counter if True
    return counter                  #return counter as output
    
###BREAK###
"""
Problem #13
"""
def greeting(greetStr):                 #define function 'greeting' with 1 parameter
    name = input('What is your name? ') #name = user input of their name
    day = input('What day is today? ')  #day = user input of the day             #
    print (greetStr + ' ' + day + ' ' + name) 
    if len(name) == len(day):           #conditional if statment if characters in 'name' equals characters in 'day' return:
        print('Your name has the same number of characters as today!')
    if len(name) > len(day):            #conditional if statement if characters in 'name' is greater than characters in 'day' return:
        print('Your name has more characters than today!')
    if len(name) < len(day):            #conditional if statment if characters in 'name' is less than characters in 'day' return:
        print('Your name has less characters than today!')
    return

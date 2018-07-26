"""
Question #6
My Answer: E
Correct Answer: E
Reason: Selects index 1 of list then prints Dict value of 1st which should be 'George'
"""
"""
Question #7
My Answer: D
Correct Answer: D
Reason: You cant print a value unless you day d.values() 
"""
"""
Question #8
My Answer: B
Correct Answer: B
Reason: If boolean is False, it add to the count and the count is printed
"""
"""
Question #9
My Answer: E
Correct Answer: E
Reason: The file was not read 
"""
"""
Question #10
My Answer: D 
Correct Answer: D
Reason: Does first if conditional and then does second then third
"""
#Question 13
def vowelContent(wordList):
    vowels = 'aeiou'
    d = {'mostly vowels':[],'mostly consonants':[],'half vowels':[]}
    for word in wordList:
        consonantCount = 0
        vowelCount = 0
        for letter in word:
            if letter in vowels:
                vowelCount += 1
            else:
                consonantCount += 1
        if consonantCount > vowelCount:
            if word not in d['mostly consonants']:
                d['mostly consonants'].append(word)
        if vowelCount > consonantCount:
            if word not in d['mostly vowels']:
               d['mostly vowels'].append(word)
        if vowelCount == consonantCount:
            if word not in d['half vowels']:
                d['half vowels'].append(word)
    return d

wList = ['its', 'a', 'death', 'trap', 'its', 'a', 'suicide', 'rap', 'we', 'gotta', 'get', 'out', 'while', 'were', 'young']
print(vowelContent(wList))










        

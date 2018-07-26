#HW13 Tapesh Nagarwal
import string

#Problem 1
def fcopy(inFileName, outFileName):
    inFile = open(inFileName, 'r')
    outFile = open(outFileName, 'w')
    outFile.writelines(inFile.readlines())
    inFile.close()
    outFile.close()


#Problem 2
def stats(inFile):
    f = open(inFile, 'r')
    print("line count: " + (str(len(f.readlines()))))
    f.seek(0)
    print("word count: " + (str(len(f.read().split()))))
    f.seek(0)
    print("character count: " + (str(len(f.read()))))
    f.seek(0)
    print(f.read())
    f.close()

#Problem 3
def repeatWords(inFileName, outFileName):
    inFile = open(inFileName,'r')
    outFile = open(outFileName, 'w')
    lines = inFile.readlines()
    for line in lines:
        wordsInLine = line.split()
        repeatedWordList = []
        for word in wordsInLine:
            if wordsInLine.count(word) > 1 and repeatedWordList.count(word) == 0:
                outFile.write(word.lower().strip() + ' ')
            repeatedWordList.append(word)
        outFile.write('\n')
    inFile.close()
    outFile.close()
                
            
    


    
     
    

    
    
    
    
    

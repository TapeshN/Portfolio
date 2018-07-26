#Tapesh Nagarwal CS100-H01

#3.20
months = ['January', 'February', 'March']   #variable 'months' = list containing 3 literal months
for month in months:                        #for loop iterates through each item in 'months'
    print(month[0:3])                       #prints the first three index(letters) in each item of the list 'months'
    
#3.21
list1 = [2, 3, 4, 5, 6, 7, 8, 9]            #variable 'list1' = list containing 8 Int values
for evenNum in list1:                       #for loop iterates through each item in list1
        if evenNum % 2 == 0:                #if statement condition: if Int value in list1 is divisable by 2 with no remainder == true
            print(evenNum)                  #prints evenNum when if statement == true (prints even Int values)          

#3.22
list2 = [2, 3, 4, 5, 6, 7, 8, 9]            #variable 'list2' = list containing 8 Int values
for specialCase in list2:                   #for loop itertes through each item in list2
    if((specialCase**2) % 8) == 0:          #if statement condition: if Int value in list2's square is divisable by 8 == true
        print(specialCase)                  #prints specialCase when if statement == true (prints Int value whose square is divisable by 8)

#3.23
#a
for i in range(0,2):                        #for loop that reiterates Int values in range of 0-2
    print(i)                                
#b
for i in range(0,1):                        #for loop that reiterates Int values in range 0-1
    print(i)                                
#c
for i in range(3,7):                        #for loop that reiterates Int values in range 3-7
    print(i)                                
#d
for i in range(0,2):                        #for loop that reiterates Int values in range 0-2
    print(i)                                
#e
for i in range(0,4,3):                      #for loop that reiterates Int values in range 0-4 and skips 3 every 4 Int value
    print(i)                                
#f
for i in range(5,22,4):                     #for loop that reiterates Int values in range 5-22 and skips every 4 Int value
    print(i)                                

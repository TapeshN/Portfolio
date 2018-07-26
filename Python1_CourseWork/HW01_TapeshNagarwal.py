#Tapesh Nagarwal CS100-H01

#Exercise 2.18
flowers = ['rose','bougainvillea','yucca','marigold','daylilly','lilly of the valley']
flowers.append('potato')
print ('potato' in flowers)
thorny = flowers [0:3]
print (thorny)
poisonous = flowers[6]
print (poisonous)
dangerous = thorny + [poisonous]
print (dangerous)

#Exercise 2.19
answers = ['Y','N','N','Y','N','Y','Y','Y','N','N','N']
numYes = answers.count('Y')
print (numYes)
numNo = answers.count('N')
print (numNo)
percentYes = (numYes / (numYes + numNo))
print ('{0:.0%}'.format(percentYes))
answers.sort()
print (answers)
f = answers.index('Y')
print (f)

#Exercise 2.21
#s is last name, t is first name
s = 'Nagarwal'
t = 'Tapesh'
initials = t[0] + s[0]
print (initials)

#Worksheet
grades = ['A','F','C','F','A','B','A']
frequency1 = grades.count('A')
frequency2 = grades.count('B')
frequency3 = grades.count('C')
frequency4 = grades.count('D')
frequency5 = grades.count('F')
frequency = [frequency1, frequency2, frequency3, frequency4, frequency5]
print (frequency)

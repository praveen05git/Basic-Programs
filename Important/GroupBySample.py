'''
import itertools
animalList = [("Animal", "cat"),
              ("Animal", "dog"),
              ("Bird", "peacock"),
              ("Bird", "pigeon")]

an_iterator = itertools.groupby(animalList, lambda x:x[0])

for key, group in an_iterator:
    key_and_group = {key : list(group)} 
    print(key_and_group)
'''

'''
from itertools import groupby
print([k for k, g in groupby('AAAABBBCCDAABBB')])
print([list(g) for k, g in groupby('AAAABBBCCD')])
'''

list = ["Apple","Orange","Apple","Mango"]
dict = {}
for num in list:
    if(num in dict):
        dict[num] = dict.get(num)+1
    else:
        dict[num] = 1
print(dict)

s = "hello.bello"
arr = s.split(".")
a=10
b=20
print("arr {},{}".format(a,b),end=" ")
print(s[::-1])

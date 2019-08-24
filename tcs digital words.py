letters=input()

words=1
vow=0
charc=0
space=0

for letter in letters:
    if letter == "a" or letter=="e" or letter=="i" or letter=="o" or letter=="u" or letter == "A" or letter=="E" or letter=="I" or letter=="O" or letter=="U":
        vow=vow+1

    if letter==" ":
        words=words+1
        space=space+1

    if letter!=" ":
        charc=charc+1
        
print("Charcters:"+str(charc)+"Spaces:"+str(space)+"Vowels:"+str(vow)+"Words:"+str(words))

'''
input:
asd asd asd
'''

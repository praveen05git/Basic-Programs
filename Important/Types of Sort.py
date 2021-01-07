
# Insertion sort
list = [2, 5, 1, 8, 3, 6]
for i in range(len(list)-1):
    while i >= 0:
        if list[i+1] < list[i]:
            list[i], list[i+1] = list[i+1], list[i]
            i -= 1
            print(list)
        else:
            break
    print(list)


# Bubble sort
arr = [2, 5, 8, 3, 6]

for i in range(len(arr)):
    for j in range(i + 1, len(arr)):
        if arr[i] > arr[j]:
            arr[i], arr[j] = arr[j], arr[i]
print(arr)


# New Array without remove
n = int(input())
oldArr = map(int, input().split())

arr = list(oldArr)
maxi = -200
newArr = []
i = 0

while i < n:
    for num in arr:
        if num > maxi and num not in newArr:
            maxi = num
    newArr.append(maxi)
    maxi = 0
    i += 1

print(newArr)


# New Array with remove
data_list = [2, 5, 8, 3, 6]
new_list = []

while data_list:
    minimum = data_list[0]  # arbitrary number in list
    for x in data_list:
        if x < minimum:
            minimum = x
    new_list.append(minimum)
    data_list.remove(minimum)

print(new_list)

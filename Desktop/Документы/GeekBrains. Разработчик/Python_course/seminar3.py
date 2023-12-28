#Задача 17.
#Дан список чисел. Определите, сколько в нем встречается различных чисел.

#list = [1, 1, 2, 0, -1, 3, 4, 4]
#list_1 = []

#for i in list:
#    if i not in list_1:
#        list_1.append(i)
#print(len(list_1))

#или
#list = [1, 1, 2, 0, -1, 3, 4, 4]
#list_1 = []
#count = 0
#for i in list:
#    if i not in list_1:
#        list_1.append(i)
#        count += 1
#print(count)

#или
#list = [1, 1, 2, 0, -1, 3, 4, 4]
#count = 0
#for i in range(len(list)):
#    if list[i] not in list[:i]:
#        count +=1
#print(count)

#или
#list = [1, 1, 2, 0, -1, 3, 4, 4]
#print(len(set(list)))



#Задача 19. 
#Дана последовательность из N целых чисел и число K. Необходимо сдвинуть всю последовательность
#на K элементов вправо, К - положительное число.

#a = [1, 2, 3, 4, 5]
#k = 3
#s = 0

#while s < k:
#    temp = a.pop(0)
#    a.append(temp)
#    s += 1
#print(a)


#или
# a = [1, 2, 3, 4, 5]
# k = 3
# print(a[3:] + a[:3])




#Напишите пр-му для печати всех уникальных значений в словаре.

# slovar = [{"V": "S001"}, {"V": "S002"}, {"VI": "S001"}, {"VI": "S005"}, {"VII": "S005"}, {" V ": "S009"}, {"VIII": "S007"}]
# res = set()
# for i in slovar:
#     for j in i.values():
#         k = j.strip()
#         if k not in res:
#             res.add(k)
# print(res)



#Дан массив, состоящий из целых чисел. Напишите пр-му, которая подсчитает кол-во элементов 
#массива, больших предыдущего.

a = [0, -1, 5, 2, 3]
count = 0
for i in range(1, len(a)):
    if a[i-1] < a[i]:
        count += 1
print(count)
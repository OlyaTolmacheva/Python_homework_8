#Задача 25.
# Напишите пр-му, которая принимает на вход строку, и отслеживает, сколько раз каждый символ уже
# встречался. Кол-во повторов добавляется к символам с помощью постфикса формата _n.
# Использовать .split().

# input_str = 'a a a b c a a d c d d'
# input_list = input_str.split()
# list = []
# dict = {}

# for i in input_list:
#     if i in dict:
#         dict[i] += 1
#         list.append(f"{i}_{dict[i]}")
#     else:
#         dict[i] = 0
#         list.append(i)
# print(*list)
# print(" ".join(list))

#или:

# input_str = 'a a a b c a a d c d d'
# input_list = input_str.split()
# dict = {}

# for i in range(len(input_list)):
#     if input_list[i] in dict:
#         dict[input_list[i]] += 1
#         input_list[i] = (f"{input_list[i]}_{dict[input_list[i]]}")
#     else:
#         dict[input_list[i]] = 0
#         input_list[i] = input_list[i]
# print(*input_list)



#Задача 27.
#Пользователь вводит текст (строку). Словом считается последовательность непробельных символов идущих
# подряд, слова разделены одним или большим числом пробелов. Определите, сколько различных слов 
# содержится в этом тексте. 

#input_str = """She sells sea shells on the sea shore The shells that she sells are sea shells I'm sure.So if she sells sea shells on the sea shore I'm sure that the shells are sea shore shells"""
# input_str = input_str.lower()
# list_1 = input_str.split()
# set_1 = set(list_1)
# print(len(set_1))

#или:
# input_str = """She sells sea shells on the sea shore The shells that she sells are sea shells I'm sure.So if she sells sea shells on the sea shore I'm sure that the shells are sea shore shells"""
# res = set(input_str.lower().split())
# print(len(res))

#Задача 29.

n = int(input('Введите целое число: '))
max_number = 0
while n != 0:
    n = int(input('Введите целое число: '))
    if max_number < n:
        max_number = n
print(max_number)
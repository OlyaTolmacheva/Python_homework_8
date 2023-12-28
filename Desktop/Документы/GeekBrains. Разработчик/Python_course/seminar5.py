# Задача 31.
# Найти N-е число Фибоначчи.
# Input: 7
# Output: 21

# def fibo(x, fibo_list = [0, 1]):
#     if len(fibo_list) == x+2:
#         return fibo_list[-1]
#     fibo_list.append(fibo_list[-1] + fibo_list[-2])
#     return fibo(x, fibo_list)

# print(fibo(7))

#или:
# def fibo(x, m = 0, n = 1):
#     if x == 0:
#         return n
#     m,n = n,m+n
#     x -= 1
#     return fibo(x, m, n)
# print(fibo(7))



# Задача 33.
# Хакер Василий получил доступ к классному журналу и хочет заменить все свои минимальные оценки 
# на максимальные. Напишите программу, которая заменяет оценки Василия, но наоборот: 
# все максимальные – на минимальные.
# Input: 5 -> 1 3 3 3 4 Output: 1 3 3 3 1

# def hack(list_1: list[int]):
#     min_ = min(list_1)
#     max_ = max(list_1)
#     for i in range(len(list_1)):
#         if max_ == list_1[i]:
#             list_1[i] = min_
#     return list_1


# def get_list(str_: str):
#     list_2 = str_.split()
#     for i in range(len(list_2)):
#         list_2[i] = int(list_2[i])
#     print(list_2)
#     return list_2

# input_str = '1 3 3 3 4'
# print(hack(get_list(input_str)))


# Задача 35.
# Напишите функцию, которая принимает одно число и проверяет, является ли оно простым
# Напоминание: Простое число - это число, которое имеет 2 делителя: 1 и n(само число)
# Input: 5 Output: yes

# def prime(n : int):
#     for i in range(2, n):
#         if n % i == 0:
#             return 'NO'
#     return 'YES'
# print(prime(4))


# Задача 37.
# Дано натуральное число N и последовательность из N элементов. Требуется вывести эту последовательность 
# в обратном порядке. Примечание. В программе запрещается объявлять массивы и использовать циклы 
# (даже для ввода и вывода).
# Input: 2 -> 3 4 Output: 4 3

def n_seq(n):
    k = input('Введите число: ')
    print(n, 'введено число:', k)
    if n == 1:
        return k
    return n_seq(n-1) + k

f = int(input('Введите количество элементов: '))
print(n_seq(f))
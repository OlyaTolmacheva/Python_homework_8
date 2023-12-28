# По данному целому неотрицательному n вычислите значение n!. Решить задачу используя while

#n = int(input('Введите число n: '))
#s = 1
#while n > 0:
#    s *= n
#    n = n - 1
#print(s)



"""
Дано натуральное число А > 1. Определите, каким по счету числом Фибоначчи оно является, т.е. выведите такое 
число N, что f(n)= А. Если А не является числом Фибоначчи, выведите число -1.

input_num = 5
fib_list = [0, 1]
while fib_list[-1] < input_num:
    fib_list.append(fib_list[-2] + fib_list[-1])
if fib_list[-1] == input_num:
    print(len(fib_list))
else:
    print(-1)
"""


"""
#Задача 13.

n = int(input('Введите количество дней: '))
t = [-20, 30, -40, 50, 10, -10]
count = 0
summ = 0
for el in t:
    if el > 0:
        count += 1
else:
    if count > summ:
        summ = count
    count = 0
print(max(summ, count))
"""

#Задача 15.
#Нужно выбрать самый тяжелый и самый легкий арбуз. Пользователь вводит число N - количество арбузов.
#Вторая строка - N чисел, записанных на новой строке каждое(масса арбуза).

n = int(input('Введите кол-во арбузов: '))
min_massa = None
max_massa = 0
for i in range(n):
    massa = int(input('Введите вес арбуза: '))
    if min_massa is None or massa < min_massa:
        min_massa = massa
    elif massa > max_massa:
        max_massa = massa

print(min_massa, max_massa)

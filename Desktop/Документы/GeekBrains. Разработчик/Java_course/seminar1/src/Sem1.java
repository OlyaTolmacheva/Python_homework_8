//Задача1.
// В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
//"Доброе утро, <Имя>!", если время от 05:00 до 11:59
// "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//"Доброй ночи, <Имя>!", если время от 23:00 до 4:59

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;
public class Sem1 {
    public static void main(String[] args) {
        System.out.println(num(2, -2));

        //System.out.println(task2("Добро пожаловать на курс по Java"));
        /*
        System.out.println("What is your name?"); // вывод в консоль
        Scanner scanner = new Scanner(System.in); // считывание из консоли
        String name = scanner.nextLine();
        LocalTime localTime = LocalTime.now();
        int hour = localTime.getHour();
        if (hour >= 5 && hour < 12) System.out.println("Good morning, " + name);
        else if (hour < 18) System.out.println("Good afternoon, " + name);
        else if (hour < 23) System.out.println("Good evening, " + name);
        else System.out.println("Good night, " + name);
        */

        //task0();
        //task1();
    }

//Задача2.
// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

    static void task0() {
        int[] arr = {1, 1, 0, 1, 1, 1};
        int count = 0;
        int maxOnes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) count++;
            else {
                if (maxOnes < count) maxOnes = count;
                count = 0;
            }
        }
        if (maxOnes < count) maxOnes = count;
        System.out.println(maxOnes);
    }

    // Задача3.
    // Дан массив nums = [3,2,2,3] и число val = 3.
    //Если в массиве есть числа, равные заданному, нужно перенести
    //эти элементы в конец массива.
    //Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
    //

    static void task1() {
        int[] nums = {3,2,2,3};
        int val = 3;
        int current = 0;
        int[] tempArr = new int[nums.length];
        Arrays.fill(tempArr, val);
        for (int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                tempArr[current++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(tempArr));
    }

// Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.

    static String task2(String str){
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        for (int i = 0; i < words.length / 2; i++) {
            String temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
        }
        return Arrays.toString(words);
    }

// Реализовать функцию возведения числа а в степень b. a, b из Z. Сводя количество выполняемых действий к минимуму.
// Пример 1: а = 3, b = 2, ответ: 9
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1

    static double num(int a, int b){
        double res = 1;
        if(b==0) return 1;
        else{
            for (int i = 0; i < Math.abs(b); i++){
                res*=a;
            }
            if (b > 0) return res;
            else return 1/res;
        }
    }
}

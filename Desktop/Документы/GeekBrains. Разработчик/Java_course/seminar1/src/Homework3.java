// Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел, реализует
// алгоритм сортировки слиянием. Метод должен возвращать отсортированный массив.
//Пример a = {5, 1, 6, 2, 3, 4} -> [1, 2, 3, 4, 5, 6]
/*
import java.util.Arrays;

class MergeSort {
    public static int[] mergeSort(int[] a) {
        int[] buffer1 = Arrays.copyOf(a, a.length);
        int[] buffer2 = new int[a.length];
        int[] result = mergeSortInner(buffer1, buffer2, 0, a.length);
        return result;
    }

    public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        //уже отсортирован
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        //слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
        }
    }

    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public class Homework3{
        public static void main(String[] args) {
            int[] a;

            if (args.length == 0) {
                // При отправке кода на Выполнение, вы можете варьировать эти параметры
                a = new int[]{5, 1, 6, 2, 3, 4};
            } else {
                a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            }

            MergeSort answer = new MergeSort();
            String itresume_res = Arrays.toString(answer.mergeSort(a));
            System.out.println(itresume_res);
        }
    }
*/
/*
// Дан произвольный массив целых чисел. Создайте список ArrayList, заполненный данными из этого массива.
// Необходимо удалить из списка четные числа и вернуть результирующий.
// Напишите свой код в методе removeEvenNumbers класса Answer. Метод removeEvenNumbers принимает на вход
// один параметр: Integer[] arr - список целых чисел, возвращает список ArrayList<Integer>
//Исходный массив: 1, 2, 3, 4, 5, 6, 7, 8, 9
//Результат: [1, 3, 5, 7, 9]
//Исходный массив: 2, 4, 6, 8
//Результат: []

import java.util.Arrays;
import java.util.ArrayList;

class Answer {
    public static void removeEvenNumbers(Integer[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(arr));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Homework3{
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{2, 4, 6, 8, 9, 10};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer ans = new Answer();
        ans.removeEvenNumbers(arr);
    }
}

 */

//Реализуйте метод, который принимает на вход целочисленный массив arr:
//- Создаёт список ArrayList, заполненный числами из исходого массива arr.
//- Сортирует список по возрастанию и выводит на экран.
//- Находит минимальное значение в списке и выводит на экран - Minimum is {число}
//- Находит максимальное значение в списке и выводит на экран - Maximum is {число}
//- Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
//Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:
//Integer[] arr - массив целых чисел.
//Исходный массив: 4, 2, 7, 5, 1, 3, 8, 6, 9
//Результаты:
//[1, 2, 3, 4, 5, 6, 7, 8, 9]
//Minimum is 1
//Maximum is 9

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class Answer {
    public static void analyzeNumbers(Integer[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(arr));

        Collections.sort(list);
        System.out.println(list);

        System.out.println("Minimum is " + Collections.min(list));
        System.out.println("Maximum is " + Collections.max(list));

        double average = 0;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
        }
        average = sum / arr.length;
        System.out.println("Average is = " + average);
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Homework3{
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer ans = new Answer();
        ans.analyzeNumbers(arr);
    }
}
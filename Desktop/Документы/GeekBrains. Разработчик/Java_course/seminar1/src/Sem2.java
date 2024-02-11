//Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Sem2 {
    public static void main(String[] args) {
        task0(30, 'h', 'a');
        //System.out.println(task1("safjdhfjhfdjsj"));
        //System.out.println(task2("Шалаш"));
        //task3(repeatStr(10, "Test"));
        //task4(repeatStr(10, "Test"));
    }

    static void task0(int n, char c1, char c2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            stringBuilder.append(c1).append(c2);
        }
        System.out.println(stringBuilder);
    }

    // Напишите метод, который сжимает строку.
    static String task1(String str) {
        char[] c = str.toCharArray();
        Arrays.sort(c); //отсортирует по алфавиту
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < c.length; i++) {
            if (c[i] == c[i - 1]) {
                count++;
            } else {
                stringBuilder.append(c[i - 1]).append(count + 1);
                count = 0; //обнуляем для подсчета следующей буквы
            }
        }
        stringBuilder.append(c[c.length - 1]).append(count + 1);
        return stringBuilder.toString();
    }

    //Напишите метод, который принимает на вход строку (String) и
    // определяет является ли строка палиндромом (возвращает boolean значение).
    static boolean task2(String str) {
        str = str.toLowerCase(); //в нижний регистр
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString().equals(str);
        // reverse - переворачивает, toString - превращает в строку, equals - сравнивает в первоначальной строкой,
        //возвращает true/false
    }

    // Напишите метод, который составит строку, состоящую из 100
    //повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.

    static String repeatStr(int n, String str) {
            return str.repeat(n); //n - количество повторений строки
    }
    static void task3(String str) {
        try {
            FileWriter fileWriter = new FileWriter("text.txt");
            fileWriter.write(str);
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения,
    // оно должно записаться в лог-файл.
    // FileHandler - это как FileWriter для логирования

    static void task4(String str) {
        Logger logger = Logger.getAnonymousLogger();
        try {
            FileHandler fileHandler = new FileHandler("log1.txt", true);
            logger.addHandler(fileHandler); //для установления связи между логгером и хэндлером
            // ошибки записываются корроче и их легче обрабатывать, есои использовать:
            SimpleFormatter simpleFormatter = new SimpleFormatter();
            fileHandler.setFormatter(simpleFormatter); //для установления связи между хэндлером и форматтером
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileWriter fileWriter = new FileWriter("t/t/t/text.txt");
            fileWriter.write(str);
            fileWriter.flush();
        } catch (IOException error) {
            error.printStackTrace();
            logger.log(Level.INFO, error.getMessage());
        }
    }
}

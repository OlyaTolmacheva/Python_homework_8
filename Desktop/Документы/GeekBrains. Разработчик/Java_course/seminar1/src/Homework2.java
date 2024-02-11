/*
import java.io.*;
import java.util.Arrays;

//Задача 1.
// Дана строка sql-запроса:
// select * from students where "
// Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные (параметры) для фильтрации приведены
// в виде json-строки в примере ниже. Если значение null, то параметр не должен попадать в запрос.
// Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:
// String QUERY - начало SQL-запроса String PARAMS - JSON с параметрами
// Пример: Строка sql-запроса:
// select * from students where
// Параметры для фильтрации:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"
// Результат:
// select * from students where name='Ivanov' and country='Russia' and city='Moscow'
class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS){
        StringBuilder queryBuilder = new StringBuilder(QUERY);
        PARAMS = PARAMS.trim().replaceAll("^\\{", "").replaceAll("\\}$", "");
        String[] pairs = PARAMS.split(","); // Разделяем по запятым

        boolean isFirstParam = true; // Флаг для определения, является ли параметр первым добавленным

        for (String pair : pairs) {
            String[] keyValue = pair.split(":");
            String key = keyValue[0].trim().replaceAll("\"", "");
            String value = keyValue[1].trim().replaceAll("\"", "");


            // Проверяем, что значение не равно "null"
            if (!value.equals("null")) {
                // Добавляем "and" перед каждым последующим параметром
                if (!isFirstParam) {
                    queryBuilder.append(" and ");
                }
                queryBuilder.append(key).append("='").append(value).append("'");
                isFirstParam = false; // Обновляем флаг, так как первый параметр уже добавлен
            }
        }
        return queryBuilder;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            QUERY = "select * from students where ";
            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        }
        else{
            QUERY = args[0];
            PARAMS = args[1];
        }

        Answer ans = new Answer();
        System.out.println(ans.answer(QUERY, PARAMS));
    }
}
*/
// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
//Напишите свой код в методе sort класса BubbleSort. Метод sort принимает на вход один параметр:
//int[] arr - числовой массив
//После каждого прохода по массиву ваш код должен делать запись в лог-файл 'log.txt' в формате год-месяц-день час:минуты
// {массив на данной итерации}. Для логирования использовать логгер logger класса BubbleSort.
//Пример
//arr = new int[]{9, 4, 8, 3, 1};
//sort(arr)
//// При чтении лог-файла получим:
//2023-05-19 07:53 [4, 8, 3, 1, 9]
//2023-05-19 07:53 [4, 3, 1, 8, 9]
//2023-05-19 07:53 [3, 1, 4, 8, 9]
//2023-05-19 07:53 [1, 3, 4, 8, 9]
//2023-05-19 07:53 [1, 3, 4,

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

class BubbleSort {
        private static Logger logger = null;

        static {
            System.setProperty("java.util.logging.SimpleFormatter.format",
                    "%1$tF %1$tR %5$s %n");
            logger = Logger.getLogger(BubbleSort.class.getName());
        }

        public void sort(int[] mas) {

            configureLogger();
            bubbleSort(mas);
        }
        private int[] bubbleSort(int[] mas) {
            boolean isSorted = false;
            int buffer;

            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < mas.length - 1; i++) {
                    if (mas[i] > mas[i + 1]) {
                        isSorted = false;

                        buffer = mas[i];
                        mas[i] = mas[i + 1];
                        mas[i + 1] = buffer;
                    }
                }
                logger.info(Arrays.toString(mas));
            }
            return mas;
        }
        public void configureLogger() {
            try {
                FileHandler fileHandler = new FileHandler("log.txt");
                logger.addHandler(fileHandler);
                SimpleFormatter formatter = new SimpleFormatter();
                fileHandler.setFormatter(formatter);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

        // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Homework2{
    public static void main(String[] args) {
        int[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new int[]{9, 4, 8, 3, 1};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        BubbleSort ans = new BubbleSort();
        ans.sort(arr);

        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
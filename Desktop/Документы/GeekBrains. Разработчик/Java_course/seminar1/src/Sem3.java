import java.lang.reflect.Array;
import java.util.*;

public class Sem3 {
    public static void main(String[] args) {
        //task0();
        //task1();
        //task3();

        List<ArrayList<String>> list = new ArrayList<>();
        books(list);
        books(list);
        books(list);
        System.out.println(list);

    }
    // Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
    static void task0() {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[] {'h','e','l','l','o'});

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);
        System.out.println(s4 == s5);
        System.out.println(s5 == s6);

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s4.equals(s5));
        System.out.println(s5.equals(s6));

    }

    // Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.
    static void task1() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(100));
        }
        Collections.sort(list); //  по возрастанию
        System.out.println(list);
    }

    // Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. Пройти по списку,
    // найти и удалить целые числа.

    static void task3() {
        ArrayList list = new ArrayList<>();
        list.add("cat");
        list.add(12);
        list.add(24);
        list.add(453);
        list.add("dog");
        list.add(14.46);
        Iterator iteratorList = list.iterator();
        while (iteratorList.hasNext()) { //пока есть следующее значение
            if (iteratorList.next() instanceof Integer) { //true/false
                iteratorList.remove();
            }
        }
        System.out.println(list);
    }

    // Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
    // что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях -
    // названия книг. Напишите метод для заполнения данной структуры.

    static void books(List<ArrayList<String>> myList) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите жанр: ");
        String genre = iScanner.nextLine();
        System.out.println("Введите название книги: ");
        String bookName = iScanner.nextLine();

        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).get(0).equals(genre)) {
                myList.get(i).add(bookName);
                return;
            }
        }
        ArrayList<String> list = new ArrayList<>();
        list.add(genre);
        list.add(bookName);
        myList.add(list);
    }
}

//Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
// их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован
// по убыванию числа телефонов.
import java.util.*;


class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {
        ArrayList<Integer> list = phoneBook.getOrDefault(name, new ArrayList<>());
        list.add(phoneNum);
        phoneBook.put(name, list);
    }

    public ArrayList<Integer> find(String name) {
        return phoneBook.getOrDefault((name), new ArrayList<>());
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        return phoneBook;
    }

    public static List<String> sortedPhoneBook() {
        List<Map.Entry<String, ArrayList<Integer>>> sortedList = new ArrayList(phoneBook.entrySet());
        sortedList.sort((e1, e2) -> e2.getValue().size() - e1.getValue().size());
        List<String> sortedPhoneBook = new ArrayList<>();
        for (Map.Entry<String, ArrayList<Integer>> entry : sortedList) {
            sortedPhoneBook.add(entry.getKey() + ": " + entry.getValue());
        }
        return sortedPhoneBook;
    }
}

// Не удаляйте этот класс!

public class Homework6 {
    public static void main(String[] args) {
        String name1;
        String name2;
        int phone1;
        int phone2;

        if (args.length == 0) {
            name1 = "Ivanov";
            name2 = "Petrov";
            phone1 = 123456;
            phone2 = 654321;
        } else {
            name1 = args[0];
            name2 = args[1];
            phone1 = Integer.parseInt(args[2]);
            phone2 = Integer.parseInt(args[3]);
        }

        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add(name1, phone1);
        myPhoneBook.add(name1, phone2);
        myPhoneBook.add(name2, phone2);

        System.out.println(myPhoneBook.find(name1));
        System.out.println(PhoneBook.getPhoneBook());
        System.out.println(myPhoneBook.find("Me"));
        System.out.println(PhoneBook.sortedPhoneBook());
    }
}
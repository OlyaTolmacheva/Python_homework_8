import java.util.*;

public class Sem5 {
    public static void main(String[] args) {

        //Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
        //123456 Иванов 321456 Васильев 234561 Петрова 234432 Иванов 654321 Петрова 345678 Иванов
        //Вывести данные по сотрудникам с фамилией Иванов.
/*
        Passports passports = new Passports();
        passports.add("123456", "Иванов");
        passports.add("321456", "Васильев");
        passports.add("234561", "Петрова");
        passports.add("234432", "Иванов");
        passports.add("654321", "Петрова");
        passports.add("324678", "Иванов");
        System.out.println(passports.getAll());
        System.out.println(passports.getByLastName("Иванов"));
        System.out.println(passports.getByPassNum("654321"));
        */
        //System.out.println(task0("paper", "title"));
        //System.out.println(task1("{a+]}{d*3)}"));
        task3("Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись");

    }

    // Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
    //1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
    //2. буква может не меняться, а остаться такой же. (Например, note - code)
/*
    static boolean task0(String str1, String str2) {
        //переведем слова в массив символов
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        //если длины слов не равны, можно не проверять дальше
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < c1.length; i++) {
            if (c2[i] != map.get(c1[i])) {
                return false;
            }else{
                map.put(c1[i], c2[i]);
            }
        }
        return true;
    }
 */
   //Написать программу, определяющую правильность расстановки скобок в выражении. Пример 1: a+(d*3) - истина
    //Пример 2: [a+(1*3) - ложь
    //Пример 3: [6+(3*3)] - истина
    //Пример 4: {a}[+]{(d*3)} - истина Пример 5: <{a}+{(d*3)}> - истина Пример 6: {a+]}{(d*3)} - ложь

    static boolean task1(String str) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('<','>');
        map.put('[',']');
        char[] c = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < c.length; i++) {
            if (map.containsKey(c[i])) stack.push(c[i]);
            if (map.containsValue(c[i])) {
                if (stack.isEmpty() || map.get(stack.pop()) != c[i]) return false;
            }
        }
        return stack.isEmpty();
    }

    static void task3(String str) {
        Map<Integer, List<String>> map = new HashMap<>();
        //разбиваем строку на слова по пробелам
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            int len = arr[i].length();
            //проверяем есть ли уже слова с такой длиной(ключом)
            if (map.containsKey(len)) {
                List<String> list = map.get(len);
                list.add(arr[i]);
            }else {
                List<String> list = new ArrayList<>();
                list.add(arr[i]);
                map.put(len,list);
            }
        }
        System.out.println(map);
    }
}

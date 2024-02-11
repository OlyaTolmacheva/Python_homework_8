import java.util.*;

//  Замерьте время, за которое в ArrayList добавятся 10000 элементов.
    //  Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
public class Sem4 {
    public static void main(String[] args) {
        //task0();
        //task1();
        //task2();

        //String[] arr = {"cat","dog","bird","333"};
        //string(arr);
        /*
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        System.out.println(myStack.size());
        //System.out.println(myStack.pop());
        //System.out.println(myStack.peek());
        //myStack.pop();
        //myStack.pop();
        //myStack.pop();
        //myStack.pop();
        System.out.println(myStack);

         */
    }

    static void task0() {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            list1.add(i);
        }
        long middle = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            list2.add(i);
        }
        long finish = System.currentTimeMillis();
        System.out.println(middle - start);
        System.out.println(finish-middle);
    }
    // Реализовать консольное приложение, которое:
        // 1. Принимает от пользователя строку вида
        //text~num
        //2. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
        //3. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
    static void task1() {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        boolean work = true;
        while (work) {
            System.out.println("Введите текст(text~num)");
            String line = scanner.nextLine();
            String[] arr = line.split("~"); //на нулевой позиции будет text, на первой - num
            String text = arr[0];
            int num = Integer.parseInt(arr[1]); //переводим строку arr[1] в целое число
            switch (text) {
                case "print":
                    System.out.println(list.remove(num));
                    break;
                case "exit":
                    work = false;
                    break;
                default:
                    list.add(num, text);
            }
        }
    }
// Реализовать консольное приложение, которое:
//1. Принимает от пользователя и “запоминает” строки.
//2. Если введено print, выводит строки так, чтобы последняя введенная
//была первой в списке, а первая - последней.
//3. Если введено revert, удаляет предыдущую введенную строку из памяти.

    static void task2() {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        boolean work = true;
        while (work) {
            System.out.println("Введите текст");
            String line = scanner.nextLine();
            switch (line) {
                case "print":
                    ListIterator listIterator = list.listIterator(list.size());
                    while (listIterator.hasPrevious()) { //перебирает с конца
                        System.out.println(listIterator.previous());
                    }
                    break;
                case "exit":
                    work = false;
                    break;
                case "revert":
                    list.removeLast();
                    break;
                default:
                    list.add(line);
            }
        }
    }

    // 1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
    //2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.

    public static void string(String[] arr) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(stack.pop());
        }
    }

    // Реализовать стэк с помощью массива. Нужно реализовать методы:
    //size(), empty(), push(), peek(), pop().


}

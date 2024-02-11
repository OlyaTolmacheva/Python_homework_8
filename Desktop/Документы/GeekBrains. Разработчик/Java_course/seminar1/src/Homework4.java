//Дан LinkedList с несколькими элементами разного типа. В методе revert класса LLTasks реализуйте разворот
// этого списка без использования встроенного функционала.
// Пример
//[1, One, 2, Two]
//Вывод
//[1, One, 2, Two]
//[Two, 2, One, 1]
/*
import java.util.LinkedList;
import java.util.ListIterator;

class LLTasks {
    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        LinkedList<Object> ll1 = new LinkedList<>();
        ListIterator<Object> listIterator = ll.listIterator(ll.size());
        while (listIterator.hasPrevious()) {
            ll1.add(listIterator.previous());
        }
        return ll1;
    }
}

    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public class Homework4 {
        public static void main(String[] args) {
            LinkedList<Object> ll = new LinkedList<>();

            if (args.length == 0 || args.length != 4) {
                // При отправке кода на Выполнение, вы можете варьировать эти параметры
                ll.add(1);
                ll.add("One");
                ll.add(2);
                ll.add("Two");
            } else {
                ll.add(Integer.parseInt(args[0]));
                ll.add(args[1]);
                ll.add(Integer.parseInt(args[2]));
                ll.add(args[3]);
            }

            LLTasks answer = new LLTasks();
            System.out.println(ll);
            LinkedList<Object> reversedList = answer.revert(ll);
            System.out.println(reversedList);
        }
    }
*/

//В классе MyQueue реализуйте очередь для типа данных Integer с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди
//dequeue() - возвращает первый элемент из очереди и удаляет его
//first() - возвращает первый элемент из очереди, не удаляя
//getElements() - возвращает все элементы в очереди
//Пример
//queue.enqueue(1);
//queue.enqueue(10);
//queue.enqueue(15);
//queue.enqueue(5);
//System.out.println(queue.getElements());
//Результат:
//[1, 10, 15, 5]
//queue.dequeue();
//queue.dequeue();
//System.out.println(queue.getElements());
//Результат:
//
// [15, 5]
//System.out.println(queue.first());
//Результат:
//
//15
/*
import java.util.LinkedList;
import java.util.Queue;

class MyQueue<T> {
    private LinkedList<Integer> elements = new LinkedList<>();
    Queue<Integer> queue = new LinkedList<>();
    public void enqueue(int element){
        elements.addLast(element);
    }
    public int dequeue(){
        return elements.removeFirst();
    }
    public int first(){
        return elements.getFirst();
    }
    public LinkedList<Integer> getElements() {
        return elements;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Homework4 {
    public static void main(String[] args) {
        MyQueue<Integer> queue;
        queue = new MyQueue<>();

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}
 */

//В обычный калькулятор без логирования добавьте возможность отменить последнюю операцию.
//Отмена последней операции должна быть реализована следующим образом: если передан
//оператор '<' калькулятор должен вывести результат предпоследней операции.
//
//calculate('+', 3, 7)
//calculate('+', 4, 7)
//calculate('<', 0, 0)
//
//// 10.0
//// 11.0
//// 10.0
//
//calculate('*', 3, 2)
//calculate('-', 7, 4)
//calculate('<', 0, 0)
//
//// 6.0
//// 3.0
//// 6.0

import java.util.ArrayDeque;
import java.util.Deque;

class Calculator {
    Deque<Double> results = new ArrayDeque<>();
    public int calculate(char op, int a, int b) {
        double result = 0;
        if (op == '+') {
            result = a + b;
        }
        if (op == '-') {
            result = a - b;
        }
        if (op == '*') {
            result = a * b;
        }
        if (op == '/') {
            result = a / b;
        }
        if (op == '<') {
            results.removeLast();
            result = results.removeLast();
        } else {
            results.add(result);
        }
        return (int) result;
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Homework4 {
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
            c = 4;
            op2 = '+';
            d = 7;
            undo = '<';
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
            c = Integer.parseInt(args[3]);
            op2 = args[4].charAt(0);
            d = Integer.parseInt(args[5]);
            undo = args[6].charAt(0);
        }

        Calculator calculator = new Calculator();
        double result = calculator.calculate(op, a, b);
        System.out.println(result);
        double result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        double prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);
    }
}
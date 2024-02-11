//Вычислить n-ое треугольного число(сумма чисел от 1 до n).
//Внутри класса Answer напишите метод countNTriangle, который принимает число n и возвращает его n-ое треугольное число.
//Если число n < 1 (ненатуральное) метод должен вернуть -1.
/*
    class Answer {
        public int countNTriangle(int n) {
            if (n < 1) return -1;
            else {
                Double d = Double.valueOf(n);
                return (int)((d / 2) * (d + 1));
            }
        }
    }

    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public class Homework1 {
        public static void main(String[] args) {
            int n = 0;

            if (args.length == 0) {
                // При отправке кода на Выполнение, вы можете варьировать эти параметры
                n = 5;
            } else {
                n = Integer.parseInt(args[0]);
            }

            // Вывод результата на экран
            Answer ans = new Answer();
            int itresume_res = ans.countNTriangle(n);
            System.out.println(itresume_res);
        }
    }
*/




//Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000,
// каждое на новой строке.
//Напишите свой код в методе printPrimeNums класса Answer.
/*
class Answer {
    public void printPrimeNums() {
        for (int i = 2; i <= 1000; i++) {
            boolean prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println(i);
            }
        }
    }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Homework1{
    public static void main(String[] args) {

        Answer ans = new Answer();
        ans.printPrimeNums();
    }
}
 */


//В методе calculate класса Calculator реализовать калькулятор, который будет выполнять математические операции
// (+, -, *, /) над двумя целыми числами и возвращать результат вещественного типа.
//В классе Printer необходимо реализовать проверку переданного оператора, при некорректном операторе программа
// должна вывести сообщение об ошибке "Некорректный оператор: 'оператор'".
//Аргументы, передаваемые в метод/функцию:
// '3'
// '+'
// '7'
//На выходе:
//10.0
/*
class Calculator {
    public int calculate(char op, int a, int b) {
        double res = 0;
        switch (op) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                res = a / b;
                break;
        }
        return (int)res;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Homework1{
    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            if (op != '+' & op != '-' & op != '*' & op != '/'){
                System.out.println("Некорректный оператор: 'оператор'");
            }
            b = 7;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        Calculator calculator = new Calculator();
        double result = calculator.calculate(op, a, b);
        System.out.println(result);
    }
}

 */
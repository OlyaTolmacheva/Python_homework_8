/*
public class MyStack {
    private int size;
    private int[] arr = new int[10];

    int size() {
        return size;
    }
    boolean empty() {
        return size == 0; //если true - пустой
    }
    int push(int item) {
        if (size == arr.length) { //если весь заполнен, то
            int[] tempArr = new int[arr.length*2];
            System.arraycopy(arr, 0, tempArr, 0, arr.length);
            //arr - массив, из которого копируем
            //0 - позиция, с которой начинаем копировать
            //tempArr - массив, в который копируем
            //0 - позиция, куда начинаем вставлять
            //arr.length - количество элементов
            arr = tempArr;
            arr[size++] = item;
        }
        //int peek() { //выводит последнее значение
            return arr[size-1];
        }
        //int pop() { //выводит последний и удаляет
            //return arr[--size];
        }
    }
}
*/
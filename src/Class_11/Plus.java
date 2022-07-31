package Class_11;

// Задание: Создать класс, который может складывать и числа и строки.

public class Plus<T> {

    public T method(T type) {
            return type;
        }

        public static void main (String[]args){

            Plus<String> plus = new Plus<String>();
            Plus<Integer> integerPlus = new Plus<Integer>();

            System.out.println(plus.method("Test") + integerPlus.method(10));
        }

}
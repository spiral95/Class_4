package Tasks;

// Задание: Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся числа.

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

public class Task_30 {

    public static Collection<Integer> delete(Collection<Integer> collection){
        return new HashSet<>(collection);
    }
// СОздаём метод delete, который будет удалять дубликаты в коллекции.
// new HashSet(Сollection С) - это стандартный конструктор, добавляющий элементы из другой коллекции
// Тип колекции HashSet хранит лишь уникальные элементы. Поэтому при создании коллекции HashSet в нашем примере
// в обрабатываемой коллекции удалились все повторяющиеся ссылки.


    public static void main(String[] args) {

        Random rand = new Random();

        Collection<Integer> collection = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            collection.add(rand.nextInt(10));
        }
// Создали коллекцию и заполнили её случайными числами.

        System.out.println(collection);
        System.out.println(delete(collection));
    }
}

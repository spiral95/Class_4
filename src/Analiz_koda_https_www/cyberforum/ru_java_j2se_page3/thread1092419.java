package Analiz_koda_https_www.cyberforum.ru_java_j2se_page3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class thread1092419 {

// Задание: Вывод элементов коллекции Set.
// Как вывести определенный элемент из коллекции HashSet?
//Знаю что в ArrayList есть ф-ция .get(), но в Set так нельзя.

    // Ответы:
// 1й Вариант:
//    Iterator<тип> iter = коллекция.listIterator();
//    while(iter.hasNext()) {
//        System.out.println(iter.next());
//    }
// listIterator - это подинтерфейс от Iterator. listIterator - это метод LinkedList. Он возвращает итератор
// списка, указывающий на элемент с данным номером. В отличие от
// Iterator он поддерживает перемещение элементов, как в прямом, так и в обратном направлениях, а также
// поддерживает удаление, обновление или вставку элемента во время итерации.

// Далее используем стандартный перебор коллекции с помощью итератора.
// Цикл while повторяет оператор или // блок операторов, пока значение его управляющего выражения истинно.
// hasNext - возвращает истину, если у итератора ещё остались элементы для перебора.
// next - переходит на следующий объект, и возвращает пройденный объект.


// 2й Вариант:
public static void main(String[] args) {
    HashSet<String> set = new HashSet<String>(); // Стандартное объявление HashSet
    Iterator iterator = set.iterator(); // Стандартное объявление Iterator
    while (iterator.hasNext()) { // чтобы hasNext не подчеркивалось, надо код загнать в psvm
        System.out.println(iterator.next());
    }
}

// если по индексу нужно обратиться, то можно добавить пару строчек:
// используем эту конструкцию вместо Iterator
//        ArrayList<String> list = new ArrayList<String>(); // Стандартное объявление ArrayList
//        for (int i = 0; i < set.size(); i++) { // проходим по длине set.size коллекции HashSet
//            list.add((String) set.toArray()[i]); // преобразовываем коллекцию set в массив с помощью toArray
// и добавляем в list с помощью add
//            System.out.println(list.get(i)); // выводим в консоль результат работы метода get(i) - он возвращает
// ссылку на элемент листа с указанным индексом.
        }

// 3й Вариант:
// Упрощенный вариант записи с ArrayList<String> list = new ArrayList<String>()
// здесь также используется конструкция set.toArray() преобразующая коллекцию в массив и присваивает
// ссылку на него в arr.
// далее с помощью цикла fori проходим по длине массива arr и выводим в консоль каждый элемент по индексу.

// данный вариант выбран, так как здесь используется только массив, а в предыдущем примере с ArrayList
// использовался и лист и массив (см. строку - list.add((String) set.toArray()[i]);), что усложняло написание
// и чтение кода.
//String [] arr = set.toArray();
//        for(int i=0; i<arr.length;i++){
//        System.out.println(arr[i]);
//        }

// 4й Вариант:
// Возможно самый простой вариант, из предложенных, для перебора коллекции стандартным циклом foreach и
// вывода на экран
//Set<String> set; // Объявляется коллекция Set
////...
//for ( String s : set )
//            System.out.println(s);
//}
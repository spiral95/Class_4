package Tasks;

// Задание: Написать класс, который умеет хранить в себе массив любых типов данных (int, long, ...). Реализовать
// метод get(int index), который возвращает любой элемент массива по индексу.

import java.lang.reflect.Array;

public class Task_28<T> {

// 1й Вариант.
// Создаем массив типа Object напрямую.Тип внутреннего массива класса - Object, но когда элемент берется,
// он преобразуется в определенный тип. (Обобщения стираются в классе, и их роль заключается в выполнении
// дополнительных проверок компилятором переданного значения и вставки преобразования переданного значения).


    public class GenericsArray<T> {
        private Object[] array; // Объявили массив array

        public GenericsArray(int size) {
            array = new Object[size];
        }
// Создали конструктор GenericsArray, который на вход получает размер массива size и присваивает объявленному
// массиву array новый массив объектов - new Object, размерностью - size.
// Таким образом у нас получился эквивалент записи - T[] array = new T[] (её нельзя использовать как дженерик).

        public void put(int index, T item) {
            array[index] = item;
        }
// Метод put получает на вход (индекс и значение), и помещает в коллекцию( в данном случае в класс) новый объект
// (в данном случае массив array).
// Вопрос? Не понятно, как этот метод используется для класса, ведь должен для коллекции Map???

        @SuppressWarnings("unchecked")
// Аннотация @SuppressWarnings используется для подавления предупреждений компилятора.
// Например, @SuppressWarnings ("unchecked") отключает предупреждения, связанные с "сырыми" типами (Raw Types)

        public T get(int index) {
            return (T) array[index];
        }
    }
// Пишем метод get(int index), который получает на вход индекс и возвращает значение массива по
// данному индексу array[index].

}


// 2й Вариант. Ключевые классы для создания универсальных массивов

    class GenericsArray {
        @SuppressWarnings({ "unchecked", "hiding" })
        public static <T>  T[] getArray(Class<T> componentType,int length) {
            return (T[]) java.lang.reflect.Array.newInstance(componentType, length);
        }
    }

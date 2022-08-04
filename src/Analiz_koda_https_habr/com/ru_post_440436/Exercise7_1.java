package Analiz_koda_https_habr.com.ru_post_440436;

import java.util.Collection;
import java.util.HashSet;

public class Exercise7_1 {
    //Задача:
    //Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.

    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection); // Обрати внимание на синтаксис (new HashSet<> и Collection<T> removeDuplicates)
    }
}


//Пояснения:
// Здесь объявляется метод removeDuplicates, который является дженериком <T>, тип метода - Collection<T> и на вход
// принимает коллекцию collection, типа - Collection<T>. Возвращает данный метод коллекцию HashSet
// (пишется как - new HashSet<>), которая обрабатывает подаваемую на вход коллекцию collection.
// new HashSet(Сollection С) - это стандартный конструктор, добавляющий элементы из другой коллекции

// Тип колекции HashSet хранит лишь уникальные элементы. Поэтому при создании коллекции HashSet в нашем примере
// в обрабатываемой коллекции удалились все повторяющиеся ссылки.

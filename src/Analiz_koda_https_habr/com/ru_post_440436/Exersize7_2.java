package Analiz_koda_https_habr.com.ru_post_440436;

import java.util.ArrayList;
import java.util.LinkedList;

public class Exersize7_2 {
    // Задание: 7.2. ArrayList и LinkedList
    //Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
    // Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз.
    // Замерьте время, которое потрачено на это. Сравните результаты и предположите, почему они именно такие.

    public static void compare2Lists() {
        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();
        final int N = 1000000;
        final int M = 1000;
        for (int i = 0; i < N; i++) {
            arrayList.add(Math.random()); //метод Math.random - возвращает рандомное число от 0,0 до 1,0
            linkedList.add(Math.random());
            //выполнили первое условие. Добавили 1000000 элементов в листы
        }
        long startTime = System.currentTimeMillis();
        //Метод System.currentTimeMillis() вернёт вам текущее время в миллисекундах.
        // Его потребуется вызвать до выполнения нужной задачи и после, а затем вычислить разницу.
        // В итоге мы узнаем время выполнения в миллисекундах

        for (int i = 0; i < M; i++) {
            arrayList.get((int) (Math.random() * (N - 1))); // возвращает ссылку на элемент в arrayList
        }
        System.out.println(System.currentTimeMillis() - startTime); // фиксирует итоговое время

        startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++) {
            linkedList.get((int) (Math.random() * (N - 1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }

    public static void main(String[] args) {
        compare2Lists();
    }
}

// ВОПРОС: Почему разные значения?
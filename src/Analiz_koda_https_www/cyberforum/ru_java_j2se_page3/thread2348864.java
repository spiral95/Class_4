package Analiz_koda_https_www.cyberforum.ru_java_j2se_page3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class thread2348864 {

// Задание: "Нужно вывести все элементы коллекции.
//Как можно вывести все элементы коллекции через метод display?"
// Дано:

    static class Auto {
        private String name;
        private int kol;
        private int pas;
        private String color;
// Объявили приватные переменные, а значит сразу объявляем геттеры и сеттеры к ним.
        public String getName() {
            return name;
        }

        public String getColor() {
            return color;
        }

        public int getKol() {
            return kol;
        }

        public int getPas() {
            return pas;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setKol(int kol) {
            System.out.println("Нельзя кол-во колес");
        }

        public void setPas(int pas) {
            System.out.println("Нельзя кол-во пассажиров");
        }

        public void setColor(String color) {
            this.color = color;
        }

        public Auto(String name, int kol, int pas, String color) {
            this.name = name;
            this.kol = kol;
            this.pas = pas;
            this.color = color;
        }
// Создали конструктор класса Auto, содержащий все заданные переменные.
        public void display() {
            System.out.println(name + " " + pas + " " + kol + " " + color);
        }
// Объявили метод display, который должен выводить в консоль нашу коллекцию объектов
    }

// Решение:

public class Main {

    public static void main(String[] args) {
        ArrayDeque<Auto> queue = new ArrayDeque<Auto>(); // Создали коллекцию queue
        BufferedReader buff=new BufferedReader(new InputStreamReader(System.in)); // Объявили ввод с консоли
        queue.add(new Auto("11",12,12,"11")); // добавляем в коллекцию новый объект Auto
        queue.add(new Auto("12",12,12,"12"));
        for(Auto auto : queue) { // С помощью foreach и метода display выводим коллекцию queue на консоль
            auto.display();
        }
    }
    }
}
// В данной задаче нужно обратить внимание, что большинство выводов на экран осуществляется через цикл foreach.
// В этом и была суть задачи.
// При выполнении такого цикла (foreach) итерационной переменной auto последовательно присваивается значение
// каждого элемента коллекции queue, после чего выполняется указанный блок кода auto.display().
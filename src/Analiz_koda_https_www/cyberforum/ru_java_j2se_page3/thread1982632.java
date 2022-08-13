package Analiz_koda_https_www.cyberforum.ru_java_j2se_page3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class thread1982632 {

// Задание: Напишите класс Student, предоставляющий информацию об имени
//студента методом getName() и о его курсе методом getCourse(). Напишите
//метод printStudents(LinkedList students, int course), который получает список
//студентов и номер курса и печатает в консоль имена тех студентов из списка,
//которые обучаются на данном курсе. Протестируйте ваш метод (для этого
//предварительно придется создать десяток объектов класса Student и
//поместить их в список). Напишите методы union(LinkedList set1, LinkedList
//set2) и intersect(LinkedList set1, LinkedList set2), реализующих операции
//объединения и пересечения двух множеств. Протестируйте работу этих
//методах на двух предварительно заполненных множествах. (Вам
//понадобится написать вспомогательный метод, выводящий все элементы
//множества на консоль.) Реализуйте интерфейс Comparable так, чтобы
//студенты сортировались по номеру курса. Проверить работу, используя класс
//TreeSet.

    public class Main {

        public static void main(String[] args) {
            ArrayList<Student> st = new ArrayList <Student>();
            st.add(new Student(3, "Гребенщиков"));
            st.add(new Student(2, "Васильев"));
            st.add(new Student(3, "Шахрин"));
            st.add(new Student(1, "Шевчук"));
            st.add(new Student(3, "Чиграков"));
            st.add(new Student(2, "Бутусов"));
            st.add(new Student(1, "Цой"));
            st.add(new Student(2, "Кинчев"));
            st.add(new Student(3, "Кипелов"));
            st.add(new Student(1, "Ревякин"));
// Здесь создаём список ArrayList из 10ти студентов ( объектов класса Student. Ниже описан данный класс и
// создан к нему конструктор Student, получающий на вход курс и фамилию). Каждый объект в список
// добавляем с помощью add.

// Выводим в консоль список фамилий студентов для каждого курса в отдельности. Используем написанный ниже метод
// printStudents, получающий на вход список st, созданный выше и курс.
            int course = 1;
            printStudents(st, course);

            course = 2;
            printStudents(st, course);

            course = 3;
            printStudents(st, course);

// Далее, согласно заданию, пишем методы union и intersect реализующие операции объединения и пересечения
// двух множеств. Это уже задача на потоки!!!
            Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
            Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));
            Set<Integer> union = Stream.concat(set1.stream(), set2.stream()).collect(Collectors.toSet());
            Set<Integer> intersect = set1.stream().filter(set2::contains).collect(Collectors.toSet());
            System.out.println(union + " - " + intersect);
        }
// Создаём коллеции HashSet, в которые сразу подаём массив значений.
// Метод Arrays.asList формирует список на основе массива.
// Метод Stream.concat - сводит поток из двух или более списков.
// Метод collect - преобразует данные из потока к коллекции. toSet - преобразование к типу Set,
// содержится в классе Collectors
        public static void printStudents(List<Student> students, int course) {
            System.out.println("Студенты " + course + " курса:");

            Iterator<Student> iter = students.iterator();

            while (iter.hasNext()) { // стандартно для итератора используем цикл while для перебора коллекции
                Student student = iter.next(); // возвращаем каждый пройденный объект и присваиваем его в student
                if (student.getCourse() == course) {
                    System.out.println(student.getName());
                }
// Создаём итератор для листа students, который подаётся на вход в методе printStudents.
// если курс в перебираемой коллекции равен курсу, который мы подаём на вход, то выводим в консоль
// фамилию студента.
            }
        }
    }

    public static class Student {

        private int course;
        private String name;

        public Student(int course, String name) {
            this.course = course;
            this.name = name;
        }

        public int getCourse() {
            return course;
        }

        public String getName() {
            return name;
        }

    }

}

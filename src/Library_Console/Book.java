package Library_Console;

public class Book {

    private static int id;
    private static String name;
    private static String ganre;
// Объявили приватные переменные, а значит сразу объявляем геттеры и сеттеры к ним.

    public static int getId() {
        return id;
    }

    public static String getName() {
        return name;
    }

    public static String getGanre() {
        return ganre;
    }

    public Book(int id, String name, String ganre) {
        Book.id = id;
        Book.name = name;
        Book.ganre = ganre;
    }
// Создали конструктор класса Book, содержащий все заданные переменные.
}



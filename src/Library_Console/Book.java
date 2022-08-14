package Library_Console;

public class Book {

    private int id;
    private String name;
    private String ganre;
// Объявили приватные переменные, а значит сразу объявляем геттеры и сеттеры к ним.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGanre() {
        return ganre;
    }

    public Book(int id, String name, String ganre) {
        this.id = id;
        this.name = name;
        this.ganre = ganre;
    }

// Создали конструктор класса Book, содержащий все заданные переменные.
}



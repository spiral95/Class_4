package Library_Console;

import java.util.ArrayList;
import java.util.Random;

public class Library extends Book {

    public Library(int id, String name, String ganre) {
        super(id, name, ganre);
    }

    static ArrayList<Book> books = new ArrayList<Book>();
// Создаём пустой список книг

    public static void addBook(Object Book) {
        if (getId() != getId()) {
            books.add(new Book(getId(), getName(), getGanre()));
        }
    }
// Создали метод, добавляющий объект Книга в ArrayList

    public static void getBook() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
// Создали метод, возвращающий все записи из ArrayList

    public void removeBook(int id) {
        if (id == getId()){
            books.remove(getId());
        }
    }
// Создали метод, удаляющий из списка книгу по id

    public void setBook(int index, Object Book) {
        for (int i = 0; i < books.size(); i++) {
            if(i == index){
                books.set(i, new Book(getId(), getName(), getGanre()));
            }
        }
    }

        public static void main (String[]args){

        ArrayList<Book> library = new ArrayList<Book>();

            Random rand = new Random();
            int id = rand.nextInt(100);
            Book book1 = new Book(id, "Java 8 Polnoe rukovodstvo - 2015", "Educational literature");
            Book book2 = new Book(id, "Prestuplenie i nakazanie", "Classical literature");
            Book book3 = new Book(id, "Rich Dad Poor Dad", "Classical literature");

            addBook(book1);
            addBook(book2);
            addBook(book3);
            System.out.println(library);


        }
    }

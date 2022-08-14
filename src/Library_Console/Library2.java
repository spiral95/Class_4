package Library_Console;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Library2 extends Book {

    public Library2(int id, String name, String ganre) {
        super(id, name, ganre);
    }

    ArrayList<Book> books = new ArrayList<Book>();
// Создаём пустой список книг

    public void addBook(Book book) {
        if (this.getId() != getId()) {
            books.add(book);
        }
    }
// Создали метод, добавляющий объект Книга в ArrayList

    public void getBook() {
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

    public void setBook(int index, Book book) {
        for (int i = 0; i < books.size(); i++) {
            if(i == index){
                books.set(i, book);
            }
        }
    }

        public static void main (String[]args){

            ArrayList<Book> library = new ArrayList<Book>();

            Random rand = new Random();
            Scanner scanner = new Scanner(System.in);
            int id = rand.nextInt(100);


            Book book1 = new Book(id, "Java 8 Polnoe rukovodstvo - 2015", "Educational literature");
            Book book2 = new Book(id, "Prestuplenie i nakazanie", "Classical literature");
            Book book3 = new Book(id, "Rich Dad Poor Dad", "Classical literature");

// Вопрос - почему метод не получается применить здесь??????
            library.addBook(book1);
            System.out.println(library);


        }
    }

package Library_Console;

import java.util.*;

public class Library2 extends Book {

    public Library2(int id, String name, String ganre) {
        super(id, name, ganre);
    }

    List<Book> books = new ArrayList<Book>();
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
    // Создали метод, редактирующий книгу по индексу

        public static void main (String[]args){

            ArrayList<Book> library = new ArrayList<Book>();

            Random rand = new Random();
            Scanner scanner = new Scanner(System.in);
//            int id = rand.nextInt(100);

            Book book1 = new Book(rand.nextInt(100), "Java 8 Polnoe rukovodstvo - 2015", "Educational literature");
            Book book2 = new Book(rand.nextInt(100), "Prestuplenie i nakazanie", "Classical literature");
            Book book3 = new Book(rand.nextInt(100), "Rich Dad Poor Dad", "Classical literature");

// Вопрос - почему метод не получается применить здесь??????
//            library.addBook(book1);
//            library.addBook(book2);
//            library.addBook(book3);
            library.add(book1);
            library.add(book2);
            library.add(book3);
            System.out.println(library.toString());

// Вопрос - почему метод не получается применить здесь??????
//            library.getBook();
            for (Book books : library) {
                System.out.println(books);
            }
            Collections.sort(library, new Comparator<Book>() {
                @Override
                public int compare(Book o1, Book o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });
            for (Book books: library) {
                System.out.println(books);
            }

// Вопрос - почему метод не получается применить здесь??????
//            library.removeBook(book1.getId());
            library.remove(book1.getId());

            for (Book books : library) {
                System.out.println(books);
            }


        }
    }

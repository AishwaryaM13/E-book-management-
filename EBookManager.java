import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private int numberOfPages;
    private double price;

    public Book(String title, String author, int numberOfPages, double price) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public double getPrice() {
        return price;
    }
    public String toString() {
        return "\nTitle: " + title + "\nAuthor: " + author + "\nPages: " + numberOfPages + "\nPrice: $" + price;
    }
}

public class EBookManager {
    private ArrayList<Book> books;

    public EBookManager() {
        books = new ArrayList<>();
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", 277, 8.99));
        books.add(new Book("Brave New World", "Aldous Huxley", 268, 9.99));
        books.add(new Book("Fahrenheit 451", "Ray Bradbury", 158, 7.99));
        books.add(new Book("The Picture of Dorian Gray", "Oscar Wilde", 254, 10.99));
}
public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {
        EBookManager manager = new EBookManager();
   manager.displayBooks();
       }
}

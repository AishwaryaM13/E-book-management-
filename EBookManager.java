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
    public void addBook(String title, String author, int numberOfPages, double price) {
        Book newBook = new Book(title, author, numberOfPages, price);
        books.add(newBook);
        System.out.println("Book added: " + newBook);
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
 Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book title:");
        String title = scanner.nextLine();
        System.out.println("Enter book author:");
        String author = scanner.nextLine();
        System.out.println("Enter number of pages:");
        int numberOfPages = scanner.nextInt();
        System.out.println("Enter book price:");
        double price = scanner.nextDouble();

        manager.addBook(title, author, numberOfPages, price);
        manager.displayBooks();
    }
}

		

import java.util.Scanner;

// Custom Exception
class BookNotAvailableException extends Exception {
    BookNotAvailableException(String message) {
        super(message);
    }
}

// Book class
class Book {
    String title;
    String author;
    boolean isAvailable;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    void display() {
        System.out.println("Title: " + title + " | Author: " + author + " | Status: " + (isAvailable ? "Available" : "Checked Out"));
    }

    void checkout() throws BookNotAvailableException {
        if (!isAvailable) {
            throw new BookNotAvailableException("Sorry! Book \"" + title + "\" is already checked out.");
        }
        isAvailable = false;
        System.out.println("Book \"" + title + "\" checked out successfully.");
    }
}

public class LibrarySystem {
    static Book[] books = new Book[5];

    // Initialize sample data
    static void initializeBooks() {
        books[0] = new Book("Java Programming", "Ayush Singh");
        books[1] = new Book("Python Basics", "Guido van Rossum");
        books[2] = new Book("C++ Fundamentals", "Bjarne Stroustrup");
        books[3] = new Book("Data Structures", "Mark Allen Weiss");
        books[4] = new Book("JavaScript Guide", "Brendan Eich");
    }

    // Search by partial title
    static void searchBook(String keyword) {
        boolean found = false;
        for (Book b : books) {
            if (b.title.toLowerCase().contains(keyword.toLowerCase())) {
                b.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No book found with the title containing \"" + keyword + "\".");
        }
    }

    // Display all books
    static void displayAllBooks() {
        for (Book b : books) {
            b.display();
        }
    }

    // Checkout a book
    static void checkoutBook(String title) {
        boolean matched = false;
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                matched = true;
                try {
                    b.checkout();
                } catch (BookNotAvailableException e) {
                    System.out.println(e.getMessage());
                }
                break;
            }
        }
        if (!matched) {
            System.out.println("Book titled \"" + title + "\" not found.");
        }
    }

    // Main Menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        initializeBooks();

        int choice;
        do {
            System.out.println("\n=== Library Menu ===");
            System.out.println("1. View All Books");
            System.out.println("2. Search Book by Title");
            System.out.println("3. Checkout Book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    displayAllBooks();
                    break;
                case 2:
                    System.out.print("Enter title keyword to search: ");
                    String keyword = sc.nextLine();
                    searchBook(keyword);
                    break;
                case 3:
                    System.out.print("Enter exact book title to checkout: ");
                    String title = sc.nextLine();
                    checkoutBook(title);
                    break;
                case 4:
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        sc.close();
    }
}

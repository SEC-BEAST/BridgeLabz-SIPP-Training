class Book {
    static String libraryName = "Central Library";

    final String isbn;
    String title, author;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    void display() {
        if (this instanceof Book) {
            System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
        }
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public static void main(String[] args) {
        Book b = new Book("Java Basics", "Ayush", "ISBN123");
        b.display();
        displayLibraryName();
    }
}

class LibraryBook {
    String title;
    boolean available;

    LibraryBook(String t) {
        title = t;
        available = true;
    }

    void borrow() {
        if (available) {
            System.out.println("Borrowed: " + title);
            available = false;
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public static void main(String[] args) {
        LibraryBook b = new LibraryBook("Java Programming");

        b.borrow(); // success
        b.borrow(); // already borrowed
    }
}

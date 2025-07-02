class Book2 {
    public String ISBN;
    protected String title;
    private String author;

    public Book2(String isbn, String t, String a) {
        ISBN = isbn;
        title = t;
        author = a;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book2 {
    public EBook(String isbn, String t, String a) {
        super(isbn, t, a);
    }

    void display() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);

        System.out.println("Author: " + getAuthor());
    }

    public static void main(String[] args) {
        EBook eb = new EBook("123-XYZ", "OOP in Java", "Ayush");
        eb.display();
    }
}

class Book {
    public String ISBN;          // public
    protected String title;      // protected
    private String author;       // private

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter for private author
    public String getAuthor() {
        return author;
    }

    // Setter for private author
    public voidsetAuthor(String author) {
        this.author = author;
    }

    public void displayDetails() {
        System.out.println("ISBN   : " + ISBN);
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
    }
}

// Subclass demonstrating access modifiers
class EBook extends Book {
    private String downloadLink;

    public EBook(String ISBN, String title, String author, String downloadLink) {
        super(ISBN, title, author);
        this.downloadLink = downloadLink;
    }
	 @Override
    public void displayDetails() {
        System.out.println("ISBN          : " + ISBN);           // public ✅
        System.out.println("Title         : " + title);          // protected ✅
        System.out.println("Author        : " + getAuthor());    // private via getter ✅
        System.out.println("Download Link : " + downloadLink);
    }
}

public class BookLibrary {
    public static void main(String[] args) {
        Book b1 = new Book("978-0-13-468599-1", "Effective Java", "Joshua Bloch");
        b1.displayDetails();

        System.out.println("\nUpdating author...");
        b1.setAuthor("J. Bloch");
        System.out.println("New Author: " + b1.getAuthor());

        System.out.println("\n--- EBook ---");
        EBook eb1 = new EBook("978-0-596-51774-8", "Head First Java",
                               "Kathy Sierra", "https://example.com/hfj.pdf");
        eb1.displayDetails();

        // eb1.author = "test"; ❌ ERROR: author is private
    }
}

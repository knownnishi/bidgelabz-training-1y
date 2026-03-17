class LibraryBook {
    String  title, author;
    double  price;
    boolean availability;

    LibraryBook(String title, String author, double price) {
        this.title        = title;
        this.author       = author;
        this.price        = price;
        this.availability = true;
    }

    void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("'" + title + "' borrowed.");
        } else {
            System.out.println("'" + title + "' not available.");
        }
    }

    void display() {
        System.out.println("Title: " + title
            + " | Available: " + availability);
    }
}
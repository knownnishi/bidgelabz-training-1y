class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    void bookTicket(int newSeat, double newPrice) {
        this.seatNumber = newSeat;
        this.price = newPrice;
        System.out.println("Ticket booked! Seat: " + seatNumber + ", Price: ₹" + price);
    }

    void displayDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Pushpa 2", 0, 0);
        ticket.bookTicket(15, 250.0);
        ticket.displayDetails();
    }
}
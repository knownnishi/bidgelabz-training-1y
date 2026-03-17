class CarRental {
    String customerName, carModel;
    int    rentalDays;
    static final double RATE_PER_DAY = 1500.0;

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel     = carModel;
        this.rentalDays   = rentalDays;
    }

    double calculateTotalCost() { return rentalDays * RATE_PER_DAY; }

    void display() {
        System.out.println("Customer: " + customerName
            + " | Car: " + carModel
            + " | Days: " + rentalDays
            + " | Total: ₹" + calculateTotalCost());
    }
}
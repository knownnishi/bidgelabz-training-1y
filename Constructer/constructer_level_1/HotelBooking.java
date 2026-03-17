class HotelBooking {
    String guestName, roomType;
    int    nights;

    HotelBooking() {
        guestName = "Guest";  roomType = "Standard";  nights = 1;
    }
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType  = roomType;
        this.nights    = nights;
    }
    HotelBooking(HotelBooking other) {   // copy constructor
        this.guestName = other.guestName;
        this.roomType  = other.roomType;
        this.nights    = other.nights;
    }
    void display() {
        System.out.println("Guest: " + guestName
            + " | Room: " + roomType + " | Nights: " + nights);
    }
}

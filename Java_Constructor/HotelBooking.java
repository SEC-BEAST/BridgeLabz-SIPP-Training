class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    HotelBooking(String n, String r, int d) {
        guestName = n;
        roomType = r;
        nights = d;
    }

    HotelBooking(HotelBooking h) {
        guestName = h.guestName;
        roomType = h.roomType;
        nights = h.nights;
    }

    void show() {
        System.out.println("Guest: " + guestName);
        System.out.println("Room: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking("Umang", "Regular", 7); // default
        HotelBooking b2 = new HotelBooking("Ayush", "Deluxe", 3); // parameterized
        HotelBooking b3 = new HotelBooking("Harshit", "SemiDelux", 2); // copy

        b1.show();
        System.out.println("-----");
        b2.show();
        System.out.println("-----");
        b3.show();
    }
}

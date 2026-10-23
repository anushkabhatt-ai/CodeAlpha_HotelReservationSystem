public class Reservation {
    private String bookingId;
    private String guestName;
    private int roomNumber;
    private String category;
    private int nights;
    private double totalAmount;
    private String paymentStatus;

    public Reservation(String bookingId, String guestName,
                       int roomNumber, String category,
                       int nights, double totalAmount,
                       String paymentStatus) {

        this.bookingId = bookingId;
        this.guestName = guestName;
        this.roomNumber = roomNumber;
        this.category = category;
        this.nights = nights;
        this.totalAmount = totalAmount;
        this.paymentStatus = paymentStatus;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getGuestName() {
        return guestName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void displayBooking() {
        System.out.println("\n========== BOOKING DETAILS ==========");
        System.out.println("Booking ID     : " + bookingId);
        System.out.println("Guest Name     : " + guestName);
        System.out.println("Room Number    : " + roomNumber);
        System.out.println("Room Category  : " + category);
        System.out.println("Number of Nights: " + nights);
        System.out.println("Total Amount    : ₹" + totalAmount);
        System.out.println("Payment Status  : " + paymentStatus);
        System.out.println("=====================================");
    }

    public String getBookingData() {
        return bookingId + "," +
               guestName + "," +
               roomNumber + "," +
               category + "," +
               nights + "," +
               totalAmount + "," +
               paymentStatus;
    }
}
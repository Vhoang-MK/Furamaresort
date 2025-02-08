package model;

public class Booking {
    private String bookingId;
    private String customerId;
    private String facilityId;
    private String startDate;
    private String endDate;

    public Booking(String bookingId, String customerId, String facilityId, String startDate, String endDate) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.facilityId = facilityId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Booking ID: " + bookingId + ", Customer ID: " + customerId +
               ", Facility ID: " + facilityId + ", Start Date: " + startDate +
               ", End Date: " + endDate;
    }
}

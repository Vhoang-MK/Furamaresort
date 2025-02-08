package service;

import model.Booking;

public interface BookingService extends Service<Booking> {
    void displayBookingList();
    void addNewBooking();
    void displayBookingMaintenanceList();
}

 package com.example.Backend.Service;

import com.example.Backend.Model.Booking;

public interface BookingService {

    Booking createBooking(Booking booking);

    Booking getBooking(String bookingId);

    Booking modifyBooking(String bookingId, Booking updatedBooking);

    void cancelBooking(String bookingId);

    void refundBooking(String bookingId);
}

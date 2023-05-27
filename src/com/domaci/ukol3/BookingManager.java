package com.domaci.ukol3;

import com.domaci.ukol3.Bookings;
import com.domaci.ukol3.Guests;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookingManager {

    public static final List<Bookings> bookingsList = new ArrayList<>();

    public void addAll(List<Bookings> bookingsList) {this.bookingsList.addAll(bookingsList);}

    public static int size() {return bookingsList.size();}

}
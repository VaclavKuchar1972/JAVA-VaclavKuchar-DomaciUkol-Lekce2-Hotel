package com.domaci.ukol3;

import com.domaci.ukol3.Bookings;
import com.domaci.ukol3.Guests;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    public static final List<Bookings> bookingsList = new ArrayList<>();
    public BookingManager() {}
    public void addAll(List<Bookings> bookingsList) {this.bookingsList.addAll(bookingsList);}
    public static int size() {return bookingsList.size();}

    private int numberBookings;
    private BigDecimal orderPrice;
    private int lengthStay;

    public int getNumberBookings() {return size();}
    public void setNumberBookings(int numberBookings) {this.numberBookings = numberBookings;}


    public BigDecimal getOrderPrice() {
        return orderPrice;}


    //public static int getLengthStay() {
    //    return (int) ChronoUnit.DAYS.between(bookedFrom, bookedUntil);
    //}




    public void setOrderPrice(BigDecimal orderPrice) {this.orderPrice = orderPrice;}
    //public int getLengthStay() {return (int) ChronoUnit.DAYS.between(bookingsList.,Bookings.bookedUntil());;}
    public void setLengthStay(int lengthStay) {this.lengthStay = lengthStay;}

    public BookingManager(int numberBookings, BigDecimal orderPrice, int lengthStay) {
        this.numberBookings = numberBookings;
        this.orderPrice = orderPrice;
        this.lengthStay = lengthStay;
    }




}
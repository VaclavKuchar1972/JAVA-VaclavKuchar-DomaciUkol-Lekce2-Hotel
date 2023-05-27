package com.domaci.ukol3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Bookings {
    private String whoBooked;
    private LocalDate reservedFrom;
    private LocalDate bookedUntil;
    private int numberBookedRoom;
    private boolean workStay;
    private boolean companyBooking;

    //public Bookings(String whoBooked) {}
    //public Bookings(int numberBookedRoom) {}
    public String getWhoBooked() {return whoBooked;}
    public void setWhoBooked(String whoBooked) {this.whoBooked = whoBooked;}
    public int getNumberBookedRoom() {return numberBookedRoom;}
    public void setNumberBookedRoom(int numberBookedRoom) {this.numberBookedRoom = numberBookedRoom;}
    public LocalDate getReservedFrom() {return reservedFrom;}
    public void setReservedFrom(LocalDate reservedFrom) {this.reservedFrom = reservedFrom;}
    public LocalDate getRezrvovanoDo() {return bookedUntil;}
    public void setRezrvovanoDo(LocalDate rezrvovanoDo) {this.bookedUntil = rezrvovanoDo;}
    public boolean isWorkStay() {return workStay;}
    public void setWorkStay(boolean workStay) {this.workStay = workStay;}
    public boolean isCompanyBooking() {return companyBooking;}
    public void setCompanyBooking(boolean companyBooking) {this.companyBooking = companyBooking;}

    public Bookings(String whoBooked, LocalDate reservedFrom, LocalDate bookedUntil, int numberBookedRoom,
                    boolean workStay, boolean companyBooking) {
        this.whoBooked = whoBooked;
        this.reservedFrom = reservedFrom;
        this.bookedUntil = bookedUntil;
        this.numberBookedRoom = numberBookedRoom;
        this.workStay = workStay;
        this.companyBooking = companyBooking;
    }
    public String getRozsahRezervace() {
        return "od " + reservedFrom.format(DateTimeFormatter.ofPattern("d.M.yyyy"))
        + " do " + bookedUntil.format(DateTimeFormatter.ofPattern("d.M.yyyy"));
    }
    public String getWorkStay() {if (workStay == true){return "PRACOVNÍ";} else {return "REKREAČNÍ";}}
    public String getCompanyBooking() {if (companyBooking == true){return "FIREMNÍ";} else {return "SOUKROMÁ";}}
}

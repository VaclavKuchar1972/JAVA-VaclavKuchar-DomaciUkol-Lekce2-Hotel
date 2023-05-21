package com.domaci.ukol2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {
    private String whoBooked;
    private LocalDate reservedFrom;
    private LocalDate bookedUntil;
    private int numberBookedRoom;

    public Reservation(String whoBooked) {}
    public Reservation(int numberBookedRoom) {}

    public String getWhoBooked() {return whoBooked;}
    public void setWhoBooked(String whoBooked) {this.whoBooked = whoBooked;}
    public int getNumberBookedRoom() {return numberBookedRoom;}
    public void setNumberBookedRoom(int numberBookedRoom) {this.numberBookedRoom = numberBookedRoom;}
    public LocalDate getReservedFrom() {return reservedFrom;}
    public void setReservedFrom(LocalDate reservedFrom) {this.reservedFrom = reservedFrom;}
    public LocalDate getRezrvovanoDo() {return bookedUntil;}
    public void setRezrvovanoDo(LocalDate rezrvovanoDo) {this.bookedUntil = rezrvovanoDo;}

    public Reservation(String whoBooked, LocalDate reservedFrom, LocalDate bookedUntil, int numberBookedRoom) {
        this.whoBooked = whoBooked;
        this.reservedFrom = reservedFrom;
        this.bookedUntil = bookedUntil;
        this.numberBookedRoom = numberBookedRoom;
    }
    public String getRozsahRezervace() {
        return "od " + reservedFrom.format(DateTimeFormatter.ofPattern("d.M.yyyy"))
        + " do " + bookedUntil.format(DateTimeFormatter.ofPattern("d.M.yyyy"));
    }

}

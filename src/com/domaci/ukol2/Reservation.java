package com.domaci.ukol2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {
    private String rezervaceOsoba;
    private LocalDate rezervovanoOd;
    private LocalDate rezervovanoDo;
    private int rezervovanyPokoj;

    public Reservation(String rezervaceOsoba) {}
    public Reservation(int rezervovanyPokoj) {}

    public String getRezervaceOsoba() {return rezervaceOsoba;}
    public void setRezervaceOsoba(String rezervaceOsoba) {this.rezervaceOsoba = rezervaceOsoba;}
    public int getRezervovanyPokoj() {return rezervovanyPokoj;}
    public void setRezervovanyPokoj(int rezervovanyPokoj) {this.rezervovanyPokoj = rezervovanyPokoj;}
    public LocalDate getRezervovanoOd() {return rezervovanoOd;}
    public void setRezervovanoOd(LocalDate rezervovanoOd) {this.rezervovanoOd = rezervovanoOd;}
    public LocalDate getRezrvovanoDo() {return rezervovanoDo;}
    public void setRezrvovanoDo(LocalDate rezrvovanoDo) {this.rezervovanoDo = rezrvovanoDo;}

    public Reservation(String rezervaceOsoba, LocalDate rezervovanoOd, LocalDate rezrvovanoDo, int rezervovanyPokoj) {
        this.rezervaceOsoba = rezervaceOsoba;
        this.rezervovanoOd = rezervovanoOd;
        this.rezervovanoDo = rezrvovanoDo;
        this.rezervovanyPokoj = rezervovanyPokoj;
    }
    public String getRozsahRezervace() {
        return "od " + rezervovanoOd.format(DateTimeFormatter.ofPattern("d.M.yyyy"))
        + " do " + rezervovanoDo.format(DateTimeFormatter.ofPattern("d.M.yyyy"));
    }

}

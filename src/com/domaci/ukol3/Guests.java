package com.domaci.ukol3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Guests {
    private String nameFirst;
    private String nameSecond;
    private LocalDate dateBirth;


    public void setNameFirst(String nameFirst) {this.nameFirst = nameFirst;}
    public String getNameSecond() {return nameSecond;}
    public void setNameSecond(String nameSecond) {this.nameSecond = nameSecond;}
    public void setDateBirth(LocalDate dateBirth) {this.dateBirth = dateBirth;}


    public Guests(String nameFirst, String nameSecond, LocalDate dateBirth) {
        this.nameFirst = nameFirst;
        this.nameSecond = nameSecond;
        this.dateBirth = dateBirth;
    }
    public String getNameFull() {return nameFirst + " " + nameSecond;}
    public String getDateBirth(int i) {return dateBirth.format(DateTimeFormatter.ofPattern("d.M.yyyy"));}

}

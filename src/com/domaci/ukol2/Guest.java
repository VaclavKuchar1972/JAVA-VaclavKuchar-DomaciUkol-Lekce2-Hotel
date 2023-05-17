package com.domaci.ukol2;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Guest  {
    String nameFirst;
    String nameSecond;
    LocalDate dateBirth;
    String nameFull;
    public Guest(String nameFirst, String nameSecond, LocalDate dateBirth) {
        this.nameFirst = nameFirst;
        this.nameSecond = nameSecond;
        this.dateBirth = dateBirth;
    }
    public String getNameFull() {
        return nameFirst + " " + nameSecond;
    }
    public String getDateBirth() {
        return dateBirth.format(DateTimeFormatter.ofPattern("d.M.yyyy"));
    }
}

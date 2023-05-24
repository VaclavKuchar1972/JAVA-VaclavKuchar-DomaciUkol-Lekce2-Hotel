package com.domaci.ukol2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Guests {
    private String nameFirst;
    private String nameSecond;
    private LocalDate dateBirth;

    // Mě se zdá, že následující Getry a Setry jsou úplně zbytečný, fungovalo to i bez nich,
    // ale mám je tam, protože jsi říkal, že tam bejt musej a když jsem se ptal Tvého kolegy,
    // který Tě suploval, který to říkal také a začal psát třídu bez nich, tak mi řekl,
    // že tam musí být, jen když se v té třídě pracuje s proměnnými, takže jsem z toho zmatenej,
    // ale mě to na to co jsem chtěl fungovalo

    public void setNameFirst(String nameFirst) {this.nameFirst = nameFirst;}
    public String getNameSecond() {return nameSecond;}
    public void setNameSecond(String nameSecond) {this.nameSecond = nameSecond;}
    public void setDateBirth(LocalDate dateBirth) {this.dateBirth = dateBirth;}
    // KONEC podle mě zbytečnejch Gettrů a Setrů
    // ALE RADĚJI JE TAM NECHÁM, KDYBYCH JE POTŘEBOVAL V BUDOUCNU

    // TOTO mi stačilo na to, aby to dělalo to, co jsem chtěl, Gettry a Settry výše jsem tam přidal
    // jen proto, že již jsem dvakrát slyšel, že tam bejt musej. ALe nevim.
    public Guests(String nameFirst, String nameSecond, LocalDate dateBirth) {
        this.nameFirst = nameFirst;
        this.nameSecond = nameSecond;
        this.dateBirth = dateBirth;
    }
    public String getNameFull() {return nameFirst + " " + nameSecond;}
    public String getDateBirth() {return dateBirth.format(DateTimeFormatter.ofPattern("d.M.yyyy"));}
    // KONEC

    // public static String getNameFirst() {return nameFirst;}
}

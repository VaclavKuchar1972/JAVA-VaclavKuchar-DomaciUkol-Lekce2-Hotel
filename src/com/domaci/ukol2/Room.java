package com.domaci.ukol2;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Room {
    private int cisloPokoje;
    private int pocetLuzek;
    private boolean balkon;
    private boolean vyhledMore;
    private BigDecimal cenaPokoje;

    public int getCisloPokoje() {return cisloPokoje;}
    public void setCisloPokoje(Integer cisloPokoje) {this.cisloPokoje = cisloPokoje;}
    public int getPocetLuzek() {return pocetLuzek;}
    public void setPocetLuzek(Integer pocetLuzek) {this.pocetLuzek = pocetLuzek;}
    public boolean isBalkon() {return balkon;}
    public void setBalkon(boolean balkon) {this.balkon = balkon;}
    public boolean isVyhledMore() {return vyhledMore;}
    public void setVyhledMore(boolean vyhledMore) {this.vyhledMore = vyhledMore;}
    public BigDecimal getCenaPokoje() {return cenaPokoje;}
    public void setCenaPokoje(BigDecimal cenaPokoje) {this.cenaPokoje = cenaPokoje;}

    public Room(int cisloPokoje, int pocetLuzek, boolean balkon, boolean vyhledMore, int cenaPokoje) {
        this.cisloPokoje = cisloPokoje;
        this.pocetLuzek = pocetLuzek;
        this.balkon = balkon;
        this.vyhledMore = vyhledMore;
        this.cenaPokoje = BigDecimal.valueOf(cenaPokoje);
    }
    public String getBalkonText() {if (balkon == true){return "ANO";} else {return "NE";}}
    public String getVyhledMoreText() {if (vyhledMore == true){return "ANO";} else {return "NE";}}
}

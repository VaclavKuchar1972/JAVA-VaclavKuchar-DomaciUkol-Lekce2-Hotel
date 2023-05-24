package com.domaci.ukol2;

import java.math.BigDecimal;

public class Rooms {
    private int rooomNumber;
    private int numberBeds;
    private boolean theBalcony;
    private boolean seaView;
    private BigDecimal roomPrice;

    public int getRooomNumber() {return rooomNumber;}
    public void setRooomNumber(Integer rooomNumber) {this.rooomNumber = rooomNumber;}
    public int getNumberBeds() {return numberBeds;}
    public void setNumberBeds(Integer numberBeds) {this.numberBeds = numberBeds;}
    public boolean isTheBalcony() {return theBalcony;}
    public void setTheBalcony(boolean theBalcony) {this.theBalcony = theBalcony;}
    public boolean isSeaView() {return seaView;}
    public void setSeaView(boolean seaView) {this.seaView = seaView;}
    public BigDecimal getRoomPrice() {return roomPrice;}
    public void setRoomPrice(BigDecimal roomPrice) {this.roomPrice = roomPrice;}

    public Rooms(int rooomNumber, int numberBeds, boolean theBalcony, boolean seaView, int roomPrice) {
        this.rooomNumber = rooomNumber;
        this.numberBeds = numberBeds;
        this.theBalcony = theBalcony;
        this.seaView = seaView;
        this.roomPrice = BigDecimal.valueOf(roomPrice);
    }

    // Tady vím, že žluťásky lze zjednodušit sintaxí, zatím si to nechám takto, až se trochu rozprogramuji,
    // odstraním je zjednodušeným zápisem, zatím řeším zcela jiné a DŮLEŽIŤĚJŠÍ problémy... :DD
    public String getTheBalconyText() {if (theBalcony == true){return "ANO";} else {return "NE";}}
    public String getSeaViewText() {if (seaView == true){return "ANO";} else {return "NE";}}
}

package com.domaci.ukol3;

public class TravelAgencies {

    private String companyName;
    private int iCO;

    public String getCompanyName() {return companyName;}
    public void setCompanyName(String companyName) {this.companyName = companyName;}
    public int getICO() {return iCO;}
    public void setICO(int iCO) {this.iCO = iCO;}

    public TravelAgencies(String companyName, int iCO) {
        this.companyName = companyName;
        this.iCO = iCO;
    }

}

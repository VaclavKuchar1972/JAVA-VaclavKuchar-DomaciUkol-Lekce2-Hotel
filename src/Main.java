import com.domaci.ukol2.Guest;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        String hotel1Name = "MODRÁ HVĚZDA";

        Integer numberGuests = 2;


        Guest HotelGuest
                = new Guest("Václav", "Kuchař", LocalDate.of(1972, 4, 1));




        System.out.println(HotelGuest.getNameFull() + "   Datum narození: " + HotelGuest.getDateBirth());




    }
}

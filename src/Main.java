import com.domaci.ukol2.Guest;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        // BEGIN Help variables
        int i = 0;
        // END Help variables

        // BEGIN variables that I should retrieve from the database and not like this
        String hotel1Name = "MODRÁ HVĚZDA";
        int numberGuests = 2;
        Guest[] HotelGuest = new Guest[numberGuests];
        HotelGuest[0] = new Guest("Václav", "Kuchař", LocalDate.of(1972, 4, 1));
        HotelGuest[1] = new Guest("Ilona", "Kuchařová", LocalDate.of(1970, 1, 6));

        // END variables that I should retrieve from the database and not like this

        for (i = numberGuests; i < numberGuests; i++) {
            System.out.println(HotelGuest[i-1].getNameFull() + "   Datum narození: " + HotelGuest[i-1].getDateBirth());
        }

        System.out.println(HotelGuest[0].getNameFull() + "   Datum narození: " + HotelGuest[0].getDateBirth());
        System.out.println(HotelGuest[1].getNameFull() + "   Datum narození: " + HotelGuest[1].getDateBirth());

    }
}




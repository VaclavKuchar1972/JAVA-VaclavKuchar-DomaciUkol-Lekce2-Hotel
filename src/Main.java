import com.domaci.ukol2.Guest;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        String hotel1Name = "MODRÁ HVĚZDA";
        int numberGuests = 2;

        Guest[] HotelGuest = new Guest[numberGuests];

        HotelGuest[0] = new Guest("Václav", "Kuchař", LocalDate.of(1972, 4, 1));
        HotelGuest[1] = new Guest("Jana", "Novotná", LocalDate.of(1985, 9, 15));

        System.out.println(HotelGuest[0].getNameFull() + "   Datum narození: " + HotelGuest[0].getDateBirth());
        System.out.println(HotelGuest[1].getNameFull() + "   Datum narození: " + HotelGuest[1].getDateBirth());
    }

}


import com.domaci.ukol3.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // ZAČÁTEK načtení dat, který by se podle mě měli načítat z nějaký databáze
        String hotel1Name = "MODRÁ HVĚZDA";

        // Guests HotelGuest = new Guests("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        // VZNÝST DOTAZ na Konzultacích: Jak to, že to funguje i bez řádku výše v poznámce nebo tak něco - ZASE nechápu!? :-(
        // Data POKOJ
        List<Rooms> roomsList = new ArrayList<>();
        roomsList.add(new Rooms(1,1,true,true, 1000));
        roomsList.add(new Rooms(2,1,true,true, 1000));
        roomsList.add(new Rooms(3,3,false,true, 2400));
        // Konec Dat POKOJ
        // Data HOSTÉ
        List<Guests> guestsList = new ArrayList<>();
        guestsList.add(new Guests("Adéla", "Malíková", LocalDate.of(1993, 3, 13)));
        guestsList.add(new Guests("Jan", "Dvořáček", LocalDate.of(1995, 5, 5)));
        guestsList.add(new Guests("Karel", "Dvořák", LocalDate.of(1972, 6, 1)));
        guestsList.add(new Guests("Alena", "Krásová", LocalDate.of(1977, 10, 23)));
        // Konec Dat HOSTÉ
        // Data FIREMNÍCH KLIENTŮ
        List<TravelAgencies> agenciesList = new ArrayList<>();
        agenciesList.add(new TravelAgencies("ABC Relax",26702924));
        // Konec Dat FIREMNÍCH KLIENTŮ

        // Data REZERVACE

        List<Bookings> bookingsList = new ArrayList<>();
        bookingsList.add(new Bookings(guestsList.get(0).getNameFull(), LocalDate.of(2021, 7, 19),
                LocalDate.of(2021, 7, 26), 1, true));
        // Tady mám problém s tím přidaným " a ", to musím do budoucna nějatruek automatizovat - soukromý problém,
        // není třeba reagovat, Martine. :-) ...navíc, co kdyby někdo měl 3 a více jmen, to se musí vyřešit. :-)
        bookingsList.add(new Bookings(guestsList.get(0).getNameFull() + " a " + guestsList.get(1).getNameFull(),
                LocalDate.of(2021, 9, 1),
                LocalDate.of(2021, 9, 14), 3, false));

        // Konec Dat REZERVACE
        // KONEC načtení dat, který by se podle mě měli načítat z nějaký databáze

        // ZAČÁTEK výstupu
        System.out.println("");
        System.out.println("SEZNAM POKOJŮ hotelu " + hotel1Name + ":");
        for (Rooms rooms : roomsList) {
            System.out.println("      Pokoj číslo " + rooms.getRooomNumber());
            System.out.println("         Počet lůžek: " + rooms.getNumberBeds());
            System.out.println("              Balkon: " + rooms.getTheBalconyText());
            System.out.println("      Výhled na moře: " + rooms.getSeaViewText());
            System.out.println("   Cena za jednu noc: " + rooms.getRoomPrice() + ",- Kč");
        }
        System.out.println("");
        System.out.println("SEZNAM SOUKROMÝCH HOSTŮ hotelu " + hotel1Name + ":");
        for (Guests guests : guestsList) {
            System.out.println("   " + guests.getNameFull());
            System.out.println("      Datum narození: " + guests.getDateBirth());
        }
        System.out.println("");
        System.out.println("SEZNAM FIREMNÍCH KLIENTŮ hotelu " + hotel1Name + ":");
        for (TravelAgencies travelAgencies : agenciesList) {
            System.out.println("   " + travelAgencies.getCompanyName());
            System.out.println("                 IČO: " + travelAgencies.getICO());
        }
        System.out.println("");
        System.out.println("SEZNAM REZERVACÍ hotelu " + hotel1Name + " ke dni "
                + LocalDate.now().format(DateTimeFormatter.ofPattern("d.M.yyyy")) +":");
        for (Bookings bookings : bookingsList) {
                System.out.println("       Jméno hosta/ů: " + bookings.getWhoBooked());
                System.out.println("    Rozsah rezervace: " + bookings.getRozsahRezervace());
                System.out.println("  Rezervace na pokoj: " + "č." + bookings.getNumberBookedRoom());
        }
        // KONEC výstupu


        BookingManager bookingManager = new BookingManager();
        bookingManager.addAll(bookingsList);

        System.out.println(BookingManager.size());


    }
}




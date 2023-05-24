import com.domaci.ukol2.Bookings;
import com.domaci.ukol2.Guests;
import com.domaci.ukol2.Rooms;

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

        // Data HOSTÉ
        List<Guests> listGuests = new ArrayList<>();
        listGuests.add(new Guests("Adéla", "Malíková", LocalDate.of(1993, 3, 13)));
        listGuests.add(new Guests("Jan", "Dvořáček", LocalDate.of(1995, 5, 5)));
        // Konec Dat HOSTÉ
        // Data POKOJ
        List<Rooms> listRooms = new ArrayList<>();
        listRooms.add(new Rooms(1,1,true,true, 1000));
        listRooms.add(new Rooms(2,1,true,true, 1000));
        listRooms.add(new Rooms(3,3,false,true, 2400));
        // Konec Dat POKOJ
        // Data REZERVACE
        List<Bookings> listBookings = new ArrayList<>();
        listBookings.add(new Bookings(listGuests.get(0).getNameFull(), LocalDate.of(2021, 7, 19),
                LocalDate.of(2021, 7, 26), 1));

        // Tady mám problém s tím přidaným " a ", to musím do budoucna nějak automatizovat - soukromý problém,
        // není třeba reagovat, Martine. :-) ...navíc, co kdyby někdo měl 3 a více jmen, to se musí vyřešit. :-)
        listBookings.add(new Bookings(listGuests.get(0).getNameFull() + " a " + listGuests.get(1).getNameFull(),
                LocalDate.of(2021, 9, 1),
                LocalDate.of(2021, 9, 14), 3));
        // Konec Dat REZERVACE
        // KONEC načtení dat, který by se podle mě měli načítat z nějaký databáze

        // ZAČÁTEK výstupu
        System.out.println("");
        System.out.println("SEZNAM HOSTŮ hotelu " + hotel1Name + ":");
        for (Guests guests : listGuests) {
            System.out.println("   " + guests.getNameFull());
            System.out.println("      Datum narození: " + guests.getDateBirth());
        }
        System.out.println("");
        System.out.println("SEZNAM POKOJŮ hotelu " + hotel1Name + ":");
        for (Rooms rooms : listRooms) {
            System.out.println("      Pokoj číslo " + rooms.getRooomNumber());
            System.out.println("         Počet lůžek: " + rooms.getNumberBeds());
            System.out.println("              Balkon: " + rooms.getTheBalconyText());
            System.out.println("      Výhled na moře: " + rooms.getSeaViewText());
            System.out.println("   Cena za jednu noc: " + rooms.getRoomPrice() + ",- Kč");
        }

        System.out.println("");
        System.out.println("SEZNAM REZERVACÍ hotelu " + hotel1Name + " ke dni "
                + LocalDate.now().format(DateTimeFormatter.ofPattern("d.M.yyyy")) +":");
        for (Bookings bookings : listBookings) {
                System.out.println("       Jméno hosta/ů: " + bookings.getWhoBooked());
                System.out.println("    Rozsah rezervace: " + bookings.getRozsahRezervace());
                System.out.println("  Rezervace na pokoj: " + "č." + bookings.getNumberBookedRoom());
        }
        // KONEC výstupu
    }
}




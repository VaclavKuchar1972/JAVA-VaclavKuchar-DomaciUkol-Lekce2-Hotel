import com.domaci.ukol2.Guests;
import com.domaci.ukol2.Rooms;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // ZAČÁTEK pomocných proměnných
        int i = 0;
        // int numberGuests;
        int numberOfRooms;
        int numberOfBookings;
        // KONEC pomocných proměnných

        // ZAČÁTEK načtení proměnných, který by se podle mě měli načítat z nějaký databáze
        String hotel1Name = "MODRÁ HVĚZDA";

        // Proměnné HOSTÉ
        // Guests HotelGuest = new Guests("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        // VZNÝST DOTAZ na Konzultacích: Jak to, že to funguje i bez řádku výše v poznámce nebo tak něco - ZASE nechápu? :-(
        List<Guests> listGuests = new ArrayList<>();
        listGuests.add(new Guests("Adéla", "Malíková", LocalDate.of(1993, 3, 13)));
        listGuests.add(new Guests("Jan", "Dvořáček", LocalDate.of(1995, 5, 5)));
        // Konec Proměnných HOSTÉ

        // Proměnné POKOJ
        List<Rooms> listRooms = new ArrayList<>();
        listRooms.add(new Rooms(1,1,true,true, 1000));
        listRooms.add(new Rooms(2,1,true,true, 1000));
        listRooms.add(new Rooms(3,3,false,true, 2400));



        // KONEC načtení proměnných, který by se podle mě měli načítat z nějaký databáze

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

        //System.out.println("SEZNAM HOSTŮ hotelu " + hotel1Name + ":");
        //for (i = 0; i < numberGuests; i++) {
        //    System.out.println("   " + HotelGuest[i].getNameFull());
        //    System.out.println("      Datum narození: " + HotelGuest[i].getDateBirth());
        //}

        //List<Bookings> listOfReservations = new ArrayList<>();
        //for (i = 0; i < numberOfBookings; i++) {
        //    listOfReservations.add(new Bookings(HotelReservation[i].getWhoBooked()));

        // Proměnné HOST
        //numberGuests = 2;
        //Guests[] HotelGuest = new Guests[numberGuests];
        //HotelGuest[0] = new Guests("Adéla", "Malíková",
        //        LocalDate.of(1993, 3, 13));
        //HotelGuest[1] = new Guests("Jan", "Dvořáček",
        //        LocalDate.of(1995, 5, 5));
        // Konec Proměnných HOST




        // Proměnné REZERVACE
        //numberOfBookings = 2;
        //Bookings[] HotelReservation = new Bookings[numberOfBookings];
        //HotelReservation[0] = new Bookings(HotelGuest[0].getNameFull(),
        //        LocalDate.of(2021, 7, 19),
        //        LocalDate.of(2021, 7, 26), hotelRooms[0].getRooomNumber());
        //HotelReservation[1] = new Bookings(HotelGuest[0].getNameFull() + " a "
        //        + HotelGuest[1].getNameFull(), LocalDate.of(2021, 9, 1),
        //        LocalDate.of(2021, 9, 14), hotelRooms[2].getRooomNumber());
        // hotelRooms[1] = new Bookings(2,1,true,true, 1000);
        // Konec Proměnných REZERVACE
        // KONEC načtení proměnných, který by se podle mě měli načítat z nějaký databáze

        // ZAČÁTEK vytvoření rozhraní typu List pro Rezervace
        //List<Bookings> listOfReservations = new ArrayList<>();
        //for (i = 0; i < numberOfBookings; i++) {
        //    listOfReservations.add(new Bookings(HotelReservation[i].getWhoBooked()));
        //    listOfReservations.add(new Bookings(HotelReservation[i].getRozsahRezervace()));
        //    listOfReservations.add(new Bookings(HotelReservation[i].getNumberBookedRoom()));
        //}
        // KONEC vytvoření rozhraní typu List pro Rezervace







        //System.out.println("");
        //System.out.println("SEZNAM REZERVACÍ hotelu " + hotel1Name + " ke dni "
        //        + LocalDate.now().format(DateTimeFormatter.ofPattern("d.M.yyyy")) +":");
        //for (i = 0; i < numberOfBookings; i++) {
        //    System.out.println("     Jméno hosta/ů: " + HotelReservation[i].getWhoBooked());
        //    System.out.println("  Rozsah rezervace: " + HotelReservation[i].getRozsahRezervace());
        //    System.out.println("Rezervace na pokoj: " + "č." + HotelReservation[i].getNumberBookedRoom());
        //}
        // KONEC výstupu
    }
}




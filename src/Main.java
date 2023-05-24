import com.domaci.ukol2.Guest;
import com.domaci.ukol2.Reservation;
import com.domaci.ukol2.Room;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

        // Guest HotelGuest = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        List<Guest> listGuest = new ArrayList<>();
        listGuest.add(new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13)));
        listGuest.add(new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5)));

        System.out.println("SEZNAM HOSTŮ hotelu " + hotel1Name + ":");
        for (Guest guest : listGuest) {
            System.out.println("   " + guest.getNameFull());

            // System.out.println(guest.getNameFull() + " " + guest.getDateBirth());
        }

        //List<Reservation> listOfReservations = new ArrayList<>();
        //for (i = 0; i < numberOfBookings; i++) {
        //    listOfReservations.add(new Reservation(HotelReservation[i].getWhoBooked()));

        // Proměnné HOST
        //numberGuests = 2;
        //Guest[] HotelGuest = new Guest[numberGuests];
        //HotelGuest[0] = new Guest("Adéla", "Malíková",
        //        LocalDate.of(1993, 3, 13));
        //HotelGuest[1] = new Guest("Jan", "Dvořáček",
        //        LocalDate.of(1995, 5, 5));
        // Konec Proměnných HOST



        // Proměnné POKOJ
        numberOfRooms = 3;
        Room[] HotelRooms = new Room[numberOfRooms];
        HotelRooms[0] = new Room(1,1,true,true, 1000);
        HotelRooms[1] = new Room(2,1,true,true, 1000);
        HotelRooms[2] = new Room(3,3,false,true, 2400);
        // Konec Proměnných POKOJ
        // Proměnné REZERVACE
        //numberOfBookings = 2;
        //Reservation[] HotelReservation = new Reservation[numberOfBookings];
        //HotelReservation[0] = new Reservation(HotelGuest[0].getNameFull(),
        //        LocalDate.of(2021, 7, 19),
        //        LocalDate.of(2021, 7, 26), HotelRooms[0].getRooomNumber());
        //HotelReservation[1] = new Reservation(HotelGuest[0].getNameFull() + " a "
        //        + HotelGuest[1].getNameFull(), LocalDate.of(2021, 9, 1),
        //        LocalDate.of(2021, 9, 14), HotelRooms[2].getRooomNumber());
        // HotelRooms[1] = new Reservation(2,1,true,true, 1000);
        // Konec Proměnných REZERVACE
        // KONEC načtení proměnných, který by se podle mě měli načítat z nějaký databáze

        // ZAČÁTEK vytvoření rozhraní typu List pro Rezervace
        //List<Reservation> listOfReservations = new ArrayList<>();
        //for (i = 0; i < numberOfBookings; i++) {
        //    listOfReservations.add(new Reservation(HotelReservation[i].getWhoBooked()));
        //    listOfReservations.add(new Reservation(HotelReservation[i].getRozsahRezervace()));
        //    listOfReservations.add(new Reservation(HotelReservation[i].getNumberBookedRoom()));
        //}
        // KONEC vytvoření rozhraní typu List pro Rezervace

        // ZAČÁTEK výstupu

        //System.out.println("SEZNAM HOSTŮ hotelu " + hotel1Name + ":");
        //for (i = 0; i < numberGuests; i++) {
        //    System.out.println("   " + HotelGuest[i].getNameFull());
        //    System.out.println("      Datum narození: " + HotelGuest[i].getDateBirth());
        //}


        System.out.println("");
        System.out.println("SEZNAM POKOJŮ hotelu " + hotel1Name + ":");
        for (i = 0; i < numberOfRooms; i++) {
            System.out.println("   Pokoj číslo " + HotelRooms[i].getRooomNumber());
            System.out.println("      Počet lůžek: " + HotelRooms[i].getNumberBeds());
            System.out.println("           Balkon: " + HotelRooms[i].getTheBalconyText());
            System.out.println("   Výhled na moře: " + HotelRooms[i].getSeaViewText());
            System.out.println("Cena za jednu noc: " + HotelRooms[i].getRoomPrice() + ",- Kč");
        }
        System.out.println("");
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




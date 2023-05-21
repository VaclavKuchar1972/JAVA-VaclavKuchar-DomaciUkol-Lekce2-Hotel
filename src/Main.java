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
        int numberGuests;
        int pocetPokoju;
        int pocetRezervaci;
        // KONEC pomocných proměnných

        // ZAČÁTEK načtení proměnných, který by se podle mě měli načítat z nějaký databáze
        String hotel1Name = "MODRÁ HVĚZDA";
        // Proměnné HOST
        numberGuests = 2;
        Guest[] HotelGuest = new Guest[numberGuests];
        HotelGuest[0] = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        HotelGuest[1] = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));
        // Konec Proměnných HOST
        // Proměnné POKOJ
        pocetPokoju = 3;
        Room[] HotelRooms = new Room[pocetPokoju];
        HotelRooms[0] = new Room(1,1,true,true, 1000);
        HotelRooms[1] = new Room(2,1,true,true, 1000);
        HotelRooms[2] = new Room(3,3,false,true, 2400);
        // Konec Proměnných POKOJ
        // Proměnné REZERVACE
        pocetRezervaci = 2;
        Reservation[] HotelReservation = new Reservation[pocetRezervaci];
        HotelReservation[0] = new Reservation(HotelGuest[0].getNameFull(), LocalDate.of(2021, 7, 19),
                LocalDate.of(2021, 7, 26), HotelRooms[0].getCisloPokoje());
        HotelReservation[1] = new Reservation(HotelGuest[0].getNameFull() + " a " + HotelGuest[1].getNameFull(),
                LocalDate.of(2021, 9, 1),
                LocalDate.of(2021, 9, 14), HotelRooms[2].getCisloPokoje());
        // HotelRooms[1] = new Reservation(2,1,true,true, 1000);
        // Konec Proměnných REZERVACE
        // KONEC načtení proměnných, který by se podle mě měli načítat z nějaký databáze

        // ZAČÁTEK vytvoření rozhraní typu List pro Rezervace
        List<Reservation> seznamRezervaciList = new ArrayList<>();
        for (i = 0; i < pocetRezervaci; i++) {
            seznamRezervaciList.add(new Reservation(HotelReservation[i].getRezervaceOsoba()));
            seznamRezervaciList.add(new Reservation(HotelReservation[i].getRozsahRezervace()));
            seznamRezervaciList.add(new Reservation(HotelReservation[i].getRezervovanyPokoj()));
        }
        // KONEC vytvoření rozhraní typu List pro Rezervace

        // ZAČÁTEK výstupu
        System.out.println("SEZNAM HOSTŮ hotelu " + hotel1Name + ":");
        for (i = 0; i < numberGuests; i++) {
            System.out.println("   " + HotelGuest[i].getNameFull());
            System.out.println("      Datum narození: " + HotelGuest[i].getDateBirth());
        }
        System.out.println("");
        System.out.println("SEZNAM POKOJŮ hotelu " + hotel1Name + ":");
        for (i = 0; i < pocetPokoju; i++) {
            System.out.println("   Pokoj číslo " + HotelRooms[i].getCisloPokoje());
            System.out.println("      Počet lůžek: " + HotelRooms[i].getPocetLuzek());
            System.out.println("           Balkon: " + HotelRooms[i].getBalkonText());
            System.out.println("   Výhled na moře: " + HotelRooms[i].getVyhledMoreText());
            System.out.println("Cena za jednu noc: " + HotelRooms[i].getCenaPokoje() + ",- Kč");
        }
        System.out.println("");
        String actualDate = LocalDate.now().format(DateTimeFormatter.ofPattern("d.M.yyyy"));
        System.out.println("SEZNAM REZERVACÍ hotelu " + hotel1Name + " ke dni " + actualDate +":");
        for (i = 0; i < pocetRezervaci; i++) {
            System.out.println("     Jméno hosta/ů: " + HotelReservation[i].getRezervaceOsoba());
            System.out.println("  Rozsah rezervace: " + HotelReservation[i].getRozsahRezervace());
            System.out.println("Rezervace na pokoj: " + "č." + HotelReservation[i].getRezervovanyPokoj());
        }
        // KONEC výstupu
    }
}




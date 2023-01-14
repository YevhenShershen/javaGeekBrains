package egzamins;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//выделаем класс на который будем писать тесты и нажимаем alt+ENTER
public class Osoba {
    private String imie;
    private int id = 0;
    public static int countObject = 0;

    public Osoba() {
        id = 0;
        imie = null;
        countObject++;
    }

    public Osoba(int id, String imie) {
        this.id = id;
        this.imie = imie;
        countObject++;
    }

    // konstruktor kopiujący
    public Osoba(Osoba copy) {
        id = copy.id;
        imie = copy.imie;
        countObject++;
    }

    public void personInfo(String name) {
        if (name == null || name == "") {
            System.out.println("Brak danych" + name + countObject);
        } else {
            System.out.println("Cześć " + name + ", mam na imie " + countObject);
        }
    }
    @Test
    public void testEgzamin(){
        //Wyświetlenie komunikatu <licznik>
        System.out.println("Liczba zarejestrowanych osób to " + this.countObject);
        //Utworzenie obiektu za pomocą konstruktora bezparametrowego
        Osoba osoba1 = new Osoba();
        osoba1.personInfo("Jan");
        //Utworzenie obiektu za pomocą konstruktora z dwoma parametrami.
        Osoba osoba2 = new Osoba(123, "Alex");
        osoba2.personInfo("Jan");
        //Utworzenie obiektu za pomocą konstruktora kopiującego
        Osoba osoba3 = new Osoba(osoba2);
        assertEquals(5, osoba3.countObject);
        //Wywołanie metody do wypisania imienia z parametrem wejściowym równym „Jan”
        osoba3.personInfo("Jan");
        //Ponowne wyświetlenie komunikatu <licznik>
        System.out.println("Liczba zarejestrowanych osób to " + this.countObject);
    }
}

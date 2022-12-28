package egzamins;

import static org.junit.jupiter.api.Assertions.*;

class OsobaTest {
    //    запуск теста shift + ctrl+ f10
//    @org.junit.jupiter.api.Test
//    void test1() {
//        Osoba osoba = new Osoba(123, "Alex");
//        assertEquals(1, osoba.countObject);
//        System.out.println("Liczba zarejestrowanych osób to " + osoba.countObject);
//    }
    @org.junit.jupiter.api.Test
    void testEgzamin() {
        //Wyświetlenie komunikatu <licznik>
        System.out.println("Liczba zarejestrowanych osób to " + new Osoba().countObject);
        new Osoba().personInfo("Jan");
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
        System.out.println("Liczba zarejestrowanych osób to " + osoba3.countObject);
    }

}
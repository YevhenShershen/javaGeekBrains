package egzamins;

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
}

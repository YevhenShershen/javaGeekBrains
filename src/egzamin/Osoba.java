package egzamin;

public class Osoba {
   private int id;
   private String imie;
    public static int countObject = 0;


   //три вида конструктора
    public Osoba(){
        id = 0;
        imie = null;
        countObject++;
    }
    public Osoba(int id, String imie){
        this.id = id;
        this.imie = imie;
        countObject++;
    }
    Osoba(Osoba copy) { //Przywołanie konstruktora kopiującego
        id = copy.id;
        imie = copy.imie;
        countObject++;
    }
}

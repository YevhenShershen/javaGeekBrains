package egzamins;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        int[] arr = {1, -22, 33, -4, 44, 12, 133, 0, 11, 1233, 33, 222, 1321, 11, 44, -1};
        Szyfrator szyfrator = new Szyfrator("PROGRAM");
        szyfrator.callEncryptedWord();
        Algorytmy algorytmy = new Algorytmy();
       algorytmy.sort();

    }
}

package egzamins;

public class Szyfrator {
    String word;
    String szyfr = "GADERYPOLUKI";
    String encryptedWord = "";

    public Szyfrator(String word) {
        this.word = word;
    }

    public void callEncryptedWord() {
        word = word.toUpperCase();
        for (int a = 0; a < word.length(); a++) {
            for (int b = 0; b < szyfr.length(); b++) {

                if (word.charAt(a) == szyfr.charAt(b)) {
                    if (b % 2 == 0) {
                        encryptedWord += szyfr.charAt(b + 1);
                    } else {
                        encryptedWord += szyfr.charAt(b - 1);
                    }
                }
            }
            if (encryptedWord.length() - a == 0) {
                encryptedWord += word.charAt(a);
            }
        }
        System.out.println(encryptedWord);
    }
}

package egzamins;

public class Szyfrator {
    String word;
    char[][] arrayEncrypt = {{'H', 'A'}, {'D', 'E'}, {'R', 'Y'}, {'P', 'O'}, {'L', 'U'}, {'K', 'I'}};
    String encryptedWord;

    public Szyfrator(String word) {
        this.word = word;
    }

    public void callEncryptedWord() {
        word = word.toUpperCase();
        for (int i = 0; i <= word.length() - 1; i++) {
            for (int y = 0; y <= arrayEncrypt.length - 1; y++) {
                System.out.println(y);
                if (word.charAt(i) == arrayEncrypt[y][0]) {
                    encryptedWord += arrayEncrypt[y][1];

                } else if (word.charAt(i) == arrayEncrypt[y][1]) {
                    encryptedWord += arrayEncrypt[y][0];
                } else {
                    encryptedWord += word.charAt(i);
                }
            }
        }
        System.out.println(encryptedWord);
    }
}

package lesson1;

public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Vaska", "White", 33);

        Cat cat2 = new Cat("Baron", "black", 44);
        cat2.age= 22;
        cat.setName("Amu");
        cat.info();
        cat2.info();
        Cat.doSomething();
cat.callArray();
    }
}

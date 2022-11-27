package lesson1;

import lesson1.animal.Cat;
import lesson1.animal.Dog;

public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Vaska", "White", 33, 122);

        Cat cat2 = new Cat("Baron", "black", 44,12);
//        cat2.age= 22;
        cat.setName("Amu");
        cat.info();
        cat2.info();
        Cat.doSomething();
        cat.callArray();
        Dog dog = new Dog("Barsik", "Red", 44);
        dog.info();
        dog.wof();
    }
}

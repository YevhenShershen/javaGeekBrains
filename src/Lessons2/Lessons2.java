package Lessons2;

import Lessons2.animals.Animal;
import Lessons2.animals.Dog;
import Lessons2.animals.HouseCat;
import Lessons2.animals.Tigers;

public class Lessons2 {
    public static void main(String[] args) {

        Animal[] animals = {
                new HouseCat("Barsik", 200),
                new HouseCat("Wasik", 300),
                new Dog("Bobik", 1000, 50),
                new Tigers("Tigra", 10000, 500)

        };
        for(Animal o : animals){
            o.run(800);
            o.swim(40);
        }
        System.out.println("Animals count " + Animal.count);
        System.out.println("Animals count " + Dog.count);
        System.out.println("Animals count " + HouseCat.count);
        System.out.println("Animals count " + Tigers.count);
    }
}

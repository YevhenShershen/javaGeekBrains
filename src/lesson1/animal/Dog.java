package lesson1.animal;

public class Dog extends Animal {

    public Dog ( String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void wof(){

        System.out.println("Wof Wof Wof");
    }
}


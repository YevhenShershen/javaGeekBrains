package Lessons2.animals;

public class HouseCat extends Cat{
    public static  int count;

    public HouseCat(String name, int maxRunDistance) {
        super("Домашний кот", name, maxRunDistance, 0);
        count++;
    }
}

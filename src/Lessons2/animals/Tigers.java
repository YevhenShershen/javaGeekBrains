package Lessons2.animals;

public class Tigers extends Cat{
    public static int count;

    public Tigers(String name, int maxRunDistance, int maxSwimDistance) {
        super("Тигр", name, maxRunDistance, maxSwimDistance);
        count++;
    }
}

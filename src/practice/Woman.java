package practice;

public class Woman extends Person{
    boolean sex = false;
    public Woman(String name, String secondname, int age) {
        super(name, secondname, age);
    }

    @Override
    public void callSex() {
        System.out.println("Your sex is woman");
    }
}

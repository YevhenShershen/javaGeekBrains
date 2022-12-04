package practice;

public class Man extends Person{
    boolean sex = true;
    public Man(String name, String secondname, int age) {
        super(name, secondname, age);
    }

    @Override
    public void callSex() {
        System.out.println("Your sex is man");
    }
}

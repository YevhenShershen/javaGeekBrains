package practice;

public class Person {
    String name;
    String secondname;
    int age;
    //create counstructor
    public Person(String name, String secondname, int age){
        this.name = name;
        this.secondname = secondname;
        this.age = age;
     }
    //create function
    public void callPersonInfo(){
        boolean isOld = age > 50 ? true: false;
            String infoAge = isOld ? "old" : "yang";
            System.out.println("Hi " + name + " " + secondname + "! " + "You are " + infoAge );
    }
    public void callSex(){
        System.out.println("Your sex is undefind");
    }
}

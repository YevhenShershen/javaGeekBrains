package practice;

public class Person {
    String name;
    String secondname;
    int age;
    public static int countPersons = 0;
    //create counstructor
    public Person(String name, String secondname, int age){
        countPersons++;
        this.name = name;
        this.secondname = secondname;
        this.age = age;
     }
    //create function
    public void callPersonInfo(){
        boolean isOld = age > 50 ? true: false;
            String infoAge = isOld ? "old" : "yang";
            System.out.println("Hi " + name + " " + secondname + "! " + "You are " + infoAge + countPersons);
             System.out.println("Count create persons is: " + countPersons);
    }
    public void callSex(){
        System.out.println("Your sex is undefind");
    }
}

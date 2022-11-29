package lesson1.animal;

public class Animal {
    //protected означает что это поле доступно всем классам внутри пакета и плюс любым наследникам
   String name;
    String color;
    int age;
        //конструкторов (Animal) может быть сколько угодно и они вызываются при создании
//    public Animal(){
//        this.name = "Unknown";
//        this.color = "Unknown";
//        this.age = 1;
//    }
//    public Animal(String name){
//        this.name = name;
//        this.color = "Unknown";
//        this.age = 1;
//    }
    public Animal(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public void info(){
        System.out.println(name + " " + color +" " + age);
    }
    public void voice(){
        System.out.println("ANIMAL VOICE");
    }
    //абстрактный метод это метод без реализации и он находится только в абстрактных классах
}

package Lessons2.animals;

public abstract class Animal {

    public static  int count ;

    String type;
    String name;

    int maxRunDistance;
    int maxSwimDistance;
// вызываем правой кнопкой мышки Generate  и делаем конструктов наших перемен
    public Animal(String type, String name, int maxRunDistance, int maxSwimDistance) {
        //когда мы животное создаем то animalsCount сам увеличивается на один
        count++;
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }
    public  void run(int distance){
        if (distance <= maxRunDistance) {
            System.out.println(type + " " + name + " успешно справился с кроссом:" + distance + " м.");
        } else{
            System.out.println(type + " " + name + " не смогу справиться с кроссом");
        }
    }

    public  void swim(int distance){
        if (maxSwimDistance == 0){
            System.out.println(type + " " + name + " не умеет плавать:" + distance + " м.");
            return;
        }
        if (distance <= maxSwimDistance) {
            System.out.println(type + " " + name + " успешно справился с заплывом:" + distance + " м.");
        } else{
            System.out.println(type + " " + name + " не смогу справиться с заплывом");
        }
    }
}

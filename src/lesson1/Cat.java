package lesson1;

public class Cat {
    //4-и модификатора доступа: private default protected public
    //private доступ возможен только изнутри данного класса
    //default доступ возможен из данного класса + из любого класса внутри апкета в котором лежи Кот
    //protected доступ так же как в приват и дефаулт+  любой наследник от класса Кет
    //public доступ везде
    private String name;
    private String color;
    private int age;
    //Создаем конструктор который позволит проинициализировать наши объекты при создании
  public Cat ( String name, String color, int age){
      this.name = name;
      this.color = color;
      this.age = age;
  }
    public void meow(){
        System.out.println(name + " meow");
    }
    public void info(){
        System.out.println(name + " " + color + " " + age);
    }

}

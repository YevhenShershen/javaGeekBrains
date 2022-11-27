package lesson1;

public class Cat extends Animal {
    //4-и модификатора доступа: private default protected public
    //private доступ возможен только изнутри данного класса
    //default доступ возможен из данного класса + из любого класса внутри апкета в котором лежи Кот
    //protected доступ так же как в приват и дефаулт+  любой наследник от класса Кет
    //public доступ везде
    //static при изминении значения данные будут применены ко всем объектам данного класса

    //Создаем конструктор который позволит проинициализировать наши объекты при создании
  public Cat ( String name, String color, int age){
      this.name = name;
      this.color = color;
      this.age = age;
  }
//Гетерый и Сетеры. Правой кнопкой мыши Generate... потом Getter and Setter
    //Геттер это метод который возвращает значение лежащее в поле
    public String getName() {
        return name;
    }
//Сеттер для изминения значения в поле
    public void setName(String name) {
      if(name.length() > 4){
        this.name = name;
      }
    }
public static void doSomething(){
      System.out.println(123);
}
        public static void callArray(){
                String [] seasons  = {"Winter", "Spring", "Summer", "Autumn"};
                System.out.println(seasons.length);
            }
        }

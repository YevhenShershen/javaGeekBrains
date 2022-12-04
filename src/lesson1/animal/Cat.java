package lesson1.animal;

public class Cat extends Animal {
    int clawsLength;
    //4-и модификатора доступа: private default protected public
    //private доступ возможен только изнутри данного класса
    //default доступ возможен из данного класса + из любого класса внутри апкета в котором лежи Кот
    //protected доступ так же как в приват и дефаулт+  любой наследник от класса Кет
    //public доступ везде
    //static при изминении значения данные будут применены ко всем объектам данного класса

    //Создаем конструктор который позволит проинициализировать наши объекты при создании
  public Cat ( String name, String color, int age, int clawsLength){
      //    super(name, color, age); прокидываем данные от родительского класса Animal
      super(name, color, age);
      this.clawsLength = clawsLength;

  }
  //Override
    @Override
    public void voice() {
        System.out.println(name + " Meow");
    }
}

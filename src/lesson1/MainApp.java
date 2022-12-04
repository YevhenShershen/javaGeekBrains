package lesson1;

import lesson1.animal.Cat;
import lesson1.animal.Dog;

public class MainApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Bars", "Blue", 23);
        dog.gawGaw();
//        Cat cat = new Cat("Vaska", "White", 33, 122);
//
//        Cat cat2 = new Cat("Baron", "black", 44,12);
////        cat2.age= 22;
//
//        cat.info();
//        cat2.info();
//        Dog dog = new Dog("Barsik", "Red", 44);
//        cat.voice();
//        dog.voice();

//        Cat [] cats ={
//                new Cat("Vaska", "White", 33, 122),
//                new Cat("Baron", "black", 44,12)
//        };
//        for (Cat el: cats){
//            el.info();
//        }
        algorytm();

}

    static void algorytm(){
        int x = 121223;
        int [] num = { 1,2,3,4,45,55,122};
        for(int i = 0; i < num.length; i++){
            if(num[i] == x){

                System.out.println("Stop, index is " + i);
                return;
            }


        }
        System.out.println("Nie ma takiego numeru w tablice");
        return;
    }
}

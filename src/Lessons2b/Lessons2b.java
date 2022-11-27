package Lessons2b;

public class Lessons2b {
    static  class Human{
private  Transport currentTransport;
public  void stop(){
    if(currentTransport != null){
        currentTransport.stop();
        currentTransport = null;
    }else{
        System.out.println("Я никуда и не еду");
    }
}
public void drive( Transport transport){
    transport.start();
    this.currentTransport = transport;
}

    }
        static class Bicycle implements Transport{
            @Override
            public void start() {
                System.out.println("Я еду на велосипеде");
            }

            @Override
            public void stop() {
                System.out.println("Я остановил велосипед");
            }
        }
        static class Skateboard implements Transport{
            @Override
            public void start() {
                System.out.println("Я еду на скейте");
            }

            @Override
            public void stop() {
                System.out.println("Я остановил скейт");
            }
        }
        static class Car implements Transport{
            @Override
            public void start() {
                System.out.println("Я еду на машине");
            }

            @Override
            public void stop() {
                System.out.println("Я остановил машину");
            }
        }
        static class Moto implements Transport{
            @Override
            public void start() {
                System.out.println("Я еду на мотоцикле");
            }

            @Override
            public void stop() {
                System.out.println("Я остановил мотоцикл");
            }
        }

    public static void main(String[] args) {
        Moto moto = new Moto();
        Human human = new Human();
        human.stop();
        human.drive(moto);
        human.stop();


        Flyable [] flyables = {
                new Duck(),
                new Airplane()
        };
        for(Flyable o: flyables){
            o.fly() ;
        }
    }
}

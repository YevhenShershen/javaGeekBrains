package practice;

public class MainApp {
    public static void main(String[] args) {
Man man = new Man("Alex", "Maximil",61);
man.callPersonInfo();
man.callSex();
Woman woman = new Woman("Ewa", "Krencicka", 30);
woman.callPersonInfo();
woman.callSex();
//создаем массив с людьми
Person [] persons = {
        new Man("Alex", "Maximil",61),
        new Woman("Ewa", "Krencicka", 30)
};
//перебираем каждый элемент в массиве и вызываем функцию callPersonInfo();
for (Person el: persons){
    el.callPersonInfo();
}
    }
}

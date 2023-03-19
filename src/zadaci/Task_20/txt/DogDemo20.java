package zadaci.Task_20.txt;
//Создать отдельный класс DogDemo,
//        объявить в нём main() метод и продемонстрировать
//        использование класса собака (Dog).
//
//        Создайте собаку,
//        заставьте её подать голос,
//        заставте её отпраздновать день рождение,
//        заставьте её подать голос снова и убедитесь в том,
//        что её возраст увеличился на 1.
public class DogDemo20 {
    public static void main(String[] args) {
        Dog20 dog = new Dog20();
        dog.voice();
        dog.happybirthday0();
        dog.voice();
        dog.happybirthday();

    }
}

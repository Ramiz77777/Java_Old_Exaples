package zadaci.Task_22.txt;
//Тема: создание класса Dog. Продолжение.
//
//        Создать класс собака (Dog)
//        и продемонстрировать его работу с ним в программе.
//
//        Бизнес требования:
//        - Должна быть возможность менять цвет собаки на другой.
//
//        PS: создайте в классе Dog метод:
//
//        void changeColor(String newColor) {
//        // напишите тут команду сохранения нового цвета в свойство класса
//        }
public class Dog22 {
    String name;
    int age;
    String color;

    public Dog22(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void voice(){
        System.out.println("gav" + name + age + color);
    }
    public void chancecolor(String newcolor) {
        color = newcolor;
        System.out.println(name + age + color);

    }
//    String name;
//    String color ;
//    int age;
//
//    public Dog22(String name, String color, int age) {
//        this.name = name;
//        this.color = color;
//        this.age = age;
//    }
//    public void voice(){
//        System.out.println("Gav" + " My name is " + name + ", My color is " + color + ", My age is " + age);
//    }
//    public void chancecolor(String newcolor){
//        String color = newcolor;
//        System.out.println("Gav" + " My name is " + name + ", My color is " + color + ", My age is " + age);


}

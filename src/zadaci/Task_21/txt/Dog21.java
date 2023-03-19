package zadaci.Task_21.txt;
//Бизнес требования:
//        - Сделайте возможность указывать цвет собаки.
//        - Пусть цвет задаётся просто строкой: "Red", "Black", etc.
//        - Собака должна уметь выполнять команду голос (voice()),
//        при выполнении этой команды на консоль должно выводиться
//        кличка собаки, ее возраст и цвет.
public class Dog21 {
    public Dog21(String name, String color,int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    String name;
    String color;
    int age;

    public void voice(){
        System.out.println("Gav " + name + color + age);
    }
}

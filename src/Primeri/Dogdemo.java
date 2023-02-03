package Primeri;

public class Dogdemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "kaki";
        dog1.age = 2;
        System.out.println("hi my name is " + dog1.name);
        System.out.println("amd my age is " + dog1.age);
        dog1.voiice();
        dog1.say("and what are you doing? ");

        Dog dog2 = new Dog();
        dog2.name = "coki";
        dog2.age = 5;
        dog2.voiice();
        System.out.println("my name is " + dog2.name);
        System.out.println("and my age is " + dog1.age);
        dog2.say("im sitting");
    }


}

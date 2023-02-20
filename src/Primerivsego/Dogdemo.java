package Primerivsego;



public class Dogdemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "ramiz";
        dog1.age = 4;
        dog1.isadog = true;
        System.out.println("hello my name is " + dog1.name);
        System.out.println("my age is " + dog1.age);
        System.out.println("am i a dog ? " + dog1.isadog);
        dog1.voice();

        Dog dog2 = new Dog();
        dog2.name = "kuki";
        dog2.age = 1;
        dog2.isadog = false;
        dog2.say("i can speak do you know?)");
        System.out.println("hello but my name is " + dog1.name);
        System.out.println("and my age is " + dog1.age);
        System.out.println("and im not a dog,im a cat " + dog2.isadog);
    }


}

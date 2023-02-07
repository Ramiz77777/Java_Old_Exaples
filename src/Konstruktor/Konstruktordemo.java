package Konstruktor;

public class Konstruktordemo {
    public static void main(String[] args) {
        konstruktor dog1 = new konstruktor("ramiz", 8,true);
        String message ="my cat name " + dog1.name + "age is " + dog1.age + "is hungru? " + dog1.ishungru;
        System.out.println(message);

    }
}

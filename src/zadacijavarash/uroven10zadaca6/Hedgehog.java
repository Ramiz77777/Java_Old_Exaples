package zadacijavarash.uroven10zadaca6;

public class Hedgehog {
    public void eat(Apple apple) {
        System.out.println("Яблоко было съедено!");
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        Hedgehog Hedgehog = new Hedgehog();
        Hedgehog.eat(apple);
    }

    public static class Apple {
    }

}

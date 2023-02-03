package lesson1;

public class dogdemo {
    public static void main(String[] args) {
        dog dog1 = new dog();
        dog1.name = "zevs";
        System.out.println(dog1.name);

        dog1.voice();

        dog1.say("my name is -" + dog1.name);
        dog1.say("listen you me ? " + dog1.name);
    }


}


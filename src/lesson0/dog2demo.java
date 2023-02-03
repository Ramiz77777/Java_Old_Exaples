package lesson0;

public class dog2demo  {
    public static void main(String[] args) {
        dog2 dog2 = new dog2();
        dog2.name = "etka";
        System.out.println(dog2.name);
        dog2.voice();
        dog2.say("hello " + dog2.name);
    }
}

package zadaci.Task_11.txt;

public class Robot {
    String name;

    public Robot(String name) {
        this.name = name;
    }
    public void sayhello(){
        System.out.println("hello");
    }

    public void whatisyourname() {
        System.out.println("my name is " + this.name);
    }
}

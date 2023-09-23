package aaNAsledovaniye;

public class MyPerson implements info{
    String name;

    public MyPerson(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println("Persons name is " + this.name);
    }
}

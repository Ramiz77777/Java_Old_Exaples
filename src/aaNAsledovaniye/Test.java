package aaNAsledovaniye;

public class Test {
    public static void main(String[] args) {
        MyAnimal myAnimal = new MyAnimal(3);
        MyPerson myPerson = new MyPerson("Bob");
        prinfinfo(myAnimal);
        prinfinfo(myPerson);
    }
    public static void prinfinfo(info info){
        info.showInfo();
    }
}

package deletePolimorfizm;

public class Animal {
    public void caneat(){
        System.out.println("Animal is eating");
    }
    public void cansleep(){
        System.out.println("Animal is sleeping");
    }
    public void walk(){
        System.out.println("Animal is walking");
    }
    public static void eachAnimal(Animal animal){
        animal.walk();
    }
}

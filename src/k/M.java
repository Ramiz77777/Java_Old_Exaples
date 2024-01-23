package k;

import java.util.*;

import java.util.stream.Collectors;
import java.util.stream.Stream;


public class M {
    public static void main(String[] args) {

        Person person = new Person(new Dog());
        person.callYourPet();



    }
        }
        interface Pet{
    public void say();
        }
        class Dog implements Pet{

            @Override
            public void say() {
                System.out.println("Bow-Wow");
            }
        }
        class Cat implements Pet{

            @Override
            public void say() {
                System.out.println("Meu-Meu");
            }
        }
class Person {
    Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }
    public void callYourPet(){
        System.out.println("Hi my lovely PEt");
        pet.say();
    }
}









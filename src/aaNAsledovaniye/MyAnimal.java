package aaNAsledovaniye;

import java.util.Scanner;

public class MyAnimal implements info{
    int id;

    public MyAnimal(int id) {
        this.id = id;
    }

//    public void isliving(){
//        System.out.println("yes");
//    }

    @Override
    public void showInfo() {
        System.out.println("Animals id is " + this.id);
    }
}

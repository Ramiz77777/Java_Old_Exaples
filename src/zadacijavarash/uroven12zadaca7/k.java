package zadacijavarash.uroven12zadaca7;


import java.util.*;

public class k {
    public static void main(String[] args) {
        ArrayList<String> listHello = new ArrayList<>();
        listHello.add("Hello");
        listHello.add("Hi");
        ArrayList<String> listBye = new ArrayList<>();
        listBye.add("bye");
        listBye.add("Good bye");
        ArrayList<ArrayList<String>> mylist = new ArrayList<>();
        mylist.add(listBye);
        mylist.add(listHello);
        System.out.println(listHello);
        System.out.println(listBye);
    }

    }


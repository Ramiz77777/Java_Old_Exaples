package zadacijavarash.uroven12zadaca5;

import java.util.ArrayList;

public class Primer {


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            if(i%2 == 0) {
                list.add(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) %4 == 0){
                list.remove(i);
                i--;
            }

        }
        System.out.println(list);
        }
    }



package zadaci2.Task_1.txt;

import zadaci.Task_2.txt.Userinput;

public class PhoneDemo {
    public static void main(String[] args) {

        ObjectsPhone op = new ObjectsPhone(true,true);
        ObjectsCar oc = new ObjectsCar(false,true);
        System.out.println("is phone new ;" + op.phoneisnew +",is phone sensor ;" +  op.phoneissensor);
        System.out.println("Is car sedan ;" + oc.carissedan + ",is car automat ;" +  oc.carisautomat);
    }
}

package fordelete;

import java.util.Random;
import java.util.Scanner;
/*
xod celoveka
xod kompyutera
proverka na viigrish
proverka na ne pravelniye bukbvi
 */
public class KamenNojniciBumaga {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static String COMPUTER_WIN = "computer win";
    static  String PLAYER_WIN = "player win";
    final static  String WRONG_INPUT = "your input is wrong";
    public static void main(String[] args) {
        while (true){
            System.out.println(checkwinner(xodkompa(),xodceloveka()));
            if(isendgame()){
                break;
            }
        }


        }





    static public String xodkompa(){
        String intrandomtostring = "";
        int egoxod = random.nextInt(3) + 1;
        if(egoxod == 1){
            intrandomtostring = "kamen";
        }else if(egoxod == 2) {
            intrandomtostring =  "nojnici";                 // +
        }else if(egoxod == 3 ){
            intrandomtostring = "bumaga";
        }
        return intrandomtostring;
    }


    public static String xodceloveka(){
        String move = "";
        while (true){
            System.out.println("vvedite svoy xod");                    // +
            move = scanner.nextLine();
            if(isRightMove(move)){
                break;
        }else {
                System.out.println(WRONG_INPUT);
        }
        }

        return move;
    }
    public static boolean isRightMove(String move){
        if(!move.equals("kamen") && !move.equals("nojnici") &&!move.equals("bumaga") ){
            return false;
        }else
            return true;
    }
    public static boolean isendgame() {
        char ch = ' ';
        while (true) {
            System.out.println("would you like to end the game \n" +
                    "y - yes\n" +
                    "n - no");
            ch = scanner.nextLine().charAt(0);
            if (ch == 'y' || ch == 'n') {
                break;
            } else {
                System.out.println(WRONG_INPUT);
            }

        }
        if(ch == 'y'){
            return true;
        }else {
            return false;
        }

    }

    public static String checkwinner(String xodkompa,String xodceloveka) {
        System.out.println("xod kompa ;" +  xodkompa + ", xod celoveka ;" + xodceloveka);
        if (xodkompa.equals("kamen") && xodceloveka.equals("nojnici")) {
            return COMPUTER_WIN;
        }
        if (xodkompa.equals("kamen") && xodceloveka.equals("bumaga")) {
            return PLAYER_WIN;
        }
        if (xodkompa.equals("nojnici") && xodceloveka.equals("kamen")) {
            return PLAYER_WIN;
        }
        if (xodkompa.equals("nojnici") && xodceloveka.equals("bumaga")) {
            return COMPUTER_WIN;
        }
        if (xodkompa.equals("bumaga") && xodceloveka.equals("kamen")) {
            return COMPUTER_WIN;
        }
        if (xodkompa.equals("bumaga") && xodceloveka.equals("nojnici")) {
            return PLAYER_WIN;
        }else{
            return "nichya";
        }
    }
    }


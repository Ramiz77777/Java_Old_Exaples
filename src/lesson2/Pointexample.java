package lesson2;

public class Pointexample {
    public static void main(String[] args) {
        Point point = new Point();
        point.xpointcoordinate = 2;
        point.ypointcoordinate = 3;
        point.comment = " my message ";
        System.out.println(point.xpointcoordinate + " " + point.ypointcoordinate + " " + point.comment);


        Point point2 = new Point();
        point2.xpointcoordinate = 7;
        point2.ypointcoordinate = 5;
        point2.comment = " your message";
        System.out.println(point2.xpointcoordinate + " " + point2.ypointcoordinate + " " + point2.comment);


    }

}

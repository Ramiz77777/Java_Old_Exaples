package zadacijavarash.uroven3lekciya6;
/*
Давайте напишем программу, которая рисует на экране треугольник:
 в первой строчке выводит 10 звездочек,
 во второй — 9 звездочек,
 затем 8, и т.д.
 */
public class ForIForJ {
    public static void main(String[] args) {
        for (int i = 10; i >0 ; i--) {
            int stolb = 0;
            for (int j = 0; j <i + stolb ; j++) {
                System.out.print("t");
            }
            System.out.println();
        }
//        for (int i = 0; i < 5; i++)
//        {
//            int starCount = 5 - i;
//            for (int j = 0; j < starCount; j++)
//                System.out.print("*");
//            System.out.println();
//        }
    }
}

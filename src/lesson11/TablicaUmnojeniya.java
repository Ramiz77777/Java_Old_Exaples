package lesson11;
/*
**. Дано трехзначное число.
Математическими операциями получить значение и вывести на экран все цифры этого числа по одной
 */


public class TablicaUmnojeniya {
    public static void main(String[] args) {
        int[][] myarray = new int[10][10];
        extracted1(myarray);
        extracted(myarray);
        System.out.println(findmax(myarray));
        System.out.println(findmin(myarray));


    }

    public static int findmin(int[][] myarray) {
        int min = myarray[0][0];
        for (int i = 0; i < myarray.length; i++) {

            for (int j = 0; j < myarray[0].length; j++) {
                if(min > myarray[i][j]){
                    min = myarray[i][j];
                }
            }

        }
        return min;
    }

    public static void extracted1(int[][] myarray) {
        for (int i = 0; i < myarray.length; i++) {
            for (int j = 0; j < myarray[0].length; j++) {
                myarray[i][j] = (i + 1) * (j + 1);

            }
        }
    }


    public static void extracted(int[][] myarray) {
        for (int i = 0; i < myarray.length; i++) {
            for (int j = 0; j < myarray[0].length; j++) {
                System.out.print(myarray[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static int findmax(int[][] myarray) {
        int max = myarray[0][0];
        for (int i = 0; i < myarray.length; i++) {
            for (int j = 0; j < myarray[0].length; j++) {
                if (max < myarray[i][j]) {
                    max = myarray[i][j];
                }
            }
        }
        return max;
    }


}



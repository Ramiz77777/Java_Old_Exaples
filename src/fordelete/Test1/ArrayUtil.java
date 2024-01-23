package fordelete.Test1;

public class ArrayUtil {
    public static void findMaxArrayElement(int[][] maxArray){
        int max = maxArray[0][0];

        for (int i = 0; i < maxArray.length; i++) {
            for (int j = 0; j < maxArray[0].length; j++) {
                if(maxArray[i][j] > max){
                    max = maxArray[i][j];
                }
            }
        }
        System.out.println(max);
    }
    public static void findMinArrayElement(int[][] minArray){
        int min = minArray[0][0];

        for (int i = 0; i < minArray.length; i++) {
            for (int j = 0; j < minArray[0].length; j++) {
                if(minArray[i][j] < min){
                    min = minArray[i][j];
                }
            }
        }
        System.out.println(min);
    }

}

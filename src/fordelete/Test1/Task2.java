package fordelete.Test1;

public class Task2 {
    public static int[][] createArray(int line,int colum){
        int[][] array = new int[line][colum];
        return array;
    }
    public static void fillArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
               array[i][j] = UserInput.userInput();
            }
        }
    }
    public static void fillWithRandom(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int)(Math.random()*100);
            }
        }
    }
}

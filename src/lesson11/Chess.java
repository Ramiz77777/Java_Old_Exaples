package lesson11;

public class Chess {
    public static void main(String[] args) {
        String[][] chessboard = new String[8][8];
        fillarraywithword(chessboard);

        


    }


    private static void fillarrayempty(String[][] chessboard) {
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[0].length; j++) {
                System.out.print(chessboard[i][j] + " ");
            }

        }
        System.out.println();
    }

    private static void fillarraywithword(String[][] chessboard) {
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[0].length; j++) {
                if(i + j %2 == 0 ){
                    System.out.print(" W ");
                }else {
                    System.out.print(" B ");
                }

            }
            System.out.println();
        }
    }
}

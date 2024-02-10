package aaa.Thread;

import java.io.*;
import java.util.concurrent.*;

public class ThreadDeleteNow {
    public static int factorial;
    public static void main(String[] args) throws IOException {
        String rubai = "rwerewrewrewrewrwerew";
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("C:\\Users\\ramiz\\OneDrive\\Рабочий стол\\text.txt");
            for (int i = 0; i < rubai.length(); i++) {
                fileWriter.write(rubai.charAt(i));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            fileWriter.close();
        }

    }
    }
//
//
//
//class Thread300 implements Runnable{
//
//    @Override
//    public void run() {
//        for (int i = 1_0_0; i > 0; i--) {
//            System.out.println(i);
//        }
//    }
//}
//class Thread400 implements Runnable{
//
//    @Override
//    public void run() {
//        for (int i = 1_0_0; i > 0; i--) {
//            System.out.println(i);
//        }
//    }
//}

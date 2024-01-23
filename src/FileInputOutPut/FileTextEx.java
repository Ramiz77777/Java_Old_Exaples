package FileInputOutPut;

import java.io.*;

public class FileTextEx {
    public static void main(String[] args)  {
//        String stix = " Сенокос идет в июле,\n" +
//                "Где-то гром ворчит порой.\n" +
//                "и готов покинуть улей\n" +
//                "Молодой пчелиный рой.\n" +
//                "https://docfish.ru/tags/malenkie-stihi";
//
//        try (FileWriter writer = new FileWriter("C:\\Users\\ramiz\\OneDrive\\Рабочий стол\\text.txt")){
//
//            writer.write(stix);
//            System.out.println("Done");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        try (FileReader reader = new FileReader("C:\\Users\\ramiz\\OneDrive\\Рабочий стол\\text.txt")){
////            reader = new FileReader("C:\\Users\\ramiz\\OneDrive\\Рабочий стол\\text.txt");
//            int count ;
//            while ((count = reader.read()) != -1){
//                System.out.print((char) count);
//            }
//        }
//        catch (IOException e ){
//            e.printStackTrace();
//        }

        try (BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("text2.txt"));
        ){
            int c ;
            while ((c = reader.read())!= -1){
                writer.write(c);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}

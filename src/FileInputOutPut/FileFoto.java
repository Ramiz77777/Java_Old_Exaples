package FileInputOutPut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileFoto {
    public static void main(String[] args)  {
        try(FileInputStream fileInputStream = new FileInputStream("C:\\Users\\ramiz\\OneDrive\\Рабочий стол\\Becker.jpg");
            FileOutputStream OutputStream = new FileOutputStream("Becker.jpg")
        ) {
            int i ;
            while ((i = fileInputStream.read()) != -1){
                OutputStream.write(i);
            }
            System.out.println("Done!");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}

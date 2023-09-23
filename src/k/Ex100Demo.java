package k;

import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex100Demo {
    public static void main(String[] args) throws IOException {
//
//            String s = "Часов однообразный бой,\n" +
//                    "Томительная ночи повесть!\n" +
//                    "Язык для всех равно чужой\n" +
//                    "И внятный каждому, как совесть!\n" +
//                    "Кто без тоски внимал из нас,\n" +
//                    "Среди всемирного молчанья,\n" +
//                    "Глухие времени стенанья,\n" +
//                    "Пророчески-прощальный глас?\n" +
//                    "\n" +
//                    "Нам мнится: мир стенанья осиротелый\n" +
//                    "Неотразимый Рок настиг —\n" +
//                    "И мы, в борьбе, стенанья природой целой\n" +
//                    "Покинуты на нас самих.\n" ;
//            Pattern pattern = Pattern.compile("а");
//            Matcher matcher = pattern.matcher(s);
//            while (matcher.find()){
//                System.out.println("Position; " + matcher.start() + "  " + matcher.group());
//        }
        String s = "abc4 abce abcz abc8";
        Pattern pattern = Pattern.compile("abc[3-6|d-p]");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()){
            System.out.println("Position: " + matcher.start() + "  "+ matcher.group());
        }
    }


}



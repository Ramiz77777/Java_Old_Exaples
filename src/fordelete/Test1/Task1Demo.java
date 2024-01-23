package fordelete.Test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1Demo {
    public static void main(String[] args) {
//        int line = UserInput.userInput();
//        int colum = UserInput.userInput();
//        int[][] array = Task2.createArray(line,colum);
//        Task2.fillWithRandom(array);
//        System.out.println(Arrays.deepToString(array));
//        ArrayUtil.findMaxArrayElement(array);
//        ArrayUtil.findMinArrayElement(array);
//        System.out.println(Arrays.toString(array));
//        Task2.fillArray(array);
//        System.out.print(Arrays.deepToString(array));

//        String str = "privet+mena zovut ramzes777 moy email ramiz90151@gmai.com moy nomer telefona +4917544343566";
//        Pattern pattern = Pattern.compile("\\d{13}");
//
//        Matcher matcher = pattern.matcher(str);
//
//        while (matcher.find()) {
//            System.out.println("line count " + matcher.start() + " " + " number is " + matcher.group());
//        }

        String[] array = {"privet","kak","dela"};

        Arrays.stream(array).map(element-> element.length()).forEach(e-> System.out.println(e));



        System.out.println(Arrays.toString(array));
    }
}
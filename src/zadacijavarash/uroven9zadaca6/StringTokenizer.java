package zadacijavarash.uroven9zadaca6;

import java.util.Arrays;

/*
Используя StringTokenizer раздели query на части по разделителю delimiter.

Пример:
getTokens("java.util.stream", "\\.")
возвращает массив строк
{"java", "util", "stream"}

Hint: решить задачу поможет метод countTokens().

Требования:
•	Нужно, чтобы метод getTokens(String, String) использовал StringTokenizer.
•	Нужно, чтобы метод getTokens(String, String) возвращал массив типа String, заполненный согласно условию задачи.
 */
public class StringTokenizer {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));


    }


    public static String[] getTokens(String query, String delimiter) {
//        java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(query,delimiter);
//        String bread = stringTokenizer.nextToken();                         // po uslovitu nujno,no ne ispolzuyetsa
        return query.split(delimiter);


    }

//    public static String[] getTokens(String query, String delimiter) {
//        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
//        String[] result = new String[stringTokenizer.countTokens()];
//        int i = 0;
//        while (stringTokenizer.hasMoreTokens()) {
//            result[i++] = stringTokenizer.nextToken();
//        }
//        return result;
//    }
}

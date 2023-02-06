package Lesson4.Stringoperationsexaple;

public class Workwithstrings2 {
    public static void main(String[] args) {
        String text = "  Это текст Для проверки Работы методов Типа String  ";

        System.out.println("Our working text is - " + text);

        String testString1 = "работ";
        /*
        prevrashayet vse v malenkiye bukvi
         */


        String textToLowCase = text.toLowerCase();

        System.out.println(textToLowCase);


        boolean resultContains = textToLowCase.contains(testString1);

        System.out.println("String " + testString1 + " contains? - " + resultContains);

        //-------- 1 этап -------
        /*
        obrezayet probeli po krayam
         */


        String textAfterTrim =  text.trim();

        System.out.println(textAfterTrim);

        String oldString = "In java, Olga the best, super java programmer!";
        /*
        zamena znaceniye s odnogo na drugoy tut vnuzu v j na *
         */

        String newString = oldString.replace('j','*');
        System.out.println(newString);
        /*
        zamena znaceniye s odnogo na drugoy tut vnuzu v olga na @all group 240123
         */

        newString = oldString.replace("Olga","@All group 240123");
        System.out.println(newString);
        /*
        ostanavlivayetsa na toy bukve ili simvole kotoriy ti ukazivayesh
         */


        System.out.println(newString.indexOf('@'));

        String finalModifyText = textToLowCase.trim();
        finalModifyText = finalModifyText.replace(" ","");
        System.out.println(finalModifyText);
    }
}

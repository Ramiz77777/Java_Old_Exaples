package Lesson4.Stringoperationsexaple;

public class Workwithstrings {
    public static void main(String[] args) {

        String text = "  Это текст для проверки работы методов типа String  ";

        System.out.println("Our working text is - " + text);

        String testString1 = "работ";
        /*
        text.contains vozvrashayet boolean znaceniye
        opredelayet eta stroka vxodit v druguyu ili net(est li takoy nabor simvolov)
         */


        boolean resultContains = text.contains(testString1);
        /*

         */

        System.out.println("String " + testString1 + " contains? - " + resultContains);

        //-------- 1 этап -------

        testString1 = "Pert";

        resultContains = text.contains(testString1);

        System.out.println("String " + testString1 + " contains? - " + resultContains);
        /*
        prevratit vse v bolshiye bukvi
         */

        String textUpperCase = text.toUpperCase();
        /*
        prevratit vse v bolshiye bukvi
         */

        System.out.println(textUpperCase);

        /*
        prevratit vse v malenkiye bukvi
         */
        System.out.println(text.toLowerCase());

        System.out.println(text);



        //----------------


    }
}

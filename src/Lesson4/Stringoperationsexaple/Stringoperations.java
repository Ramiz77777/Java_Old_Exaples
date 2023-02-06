package Lesson4.Stringoperationsexaple;

public class Stringoperations {
    public static void main(String[] args) {

        String text = "Это текст для проверки работы методов типа String";

        String text1="";

        String str1 = "java";
        String str2 = new String("java");

        /*
          ti pishesh text.  i tebe vixodit spisok cto ti mojesh sdelat s nim
        pokazivayet dlinu stroki i ona ravna 49
         */

        System.out.println(text.length());
        /*
        pokazivayet dlinu stroki text.1 i ona ravna nulu
         */

        System.out.println(text1.length());
        /*
        pokazivayet stroka pustaya ili net

         */

        System.out.println(text.isEmpty());
        System.out.println(text1.isEmpty());
        /*
        esli est kakoye to znaceniye v tekste to on govorit false
        a esli pustaya ili probel to true
         */

        System.out.println(text.isBlank());
        System.out.println(text1.isBlank());
        /*
        beret bunkvu pod indexom 2(0,1,2)(pod opredelennim indeksom eto mojet bit vse cto ugodno
         */

        char simbol = text.charAt(2);

        System.out.println(simbol);
        /*
        vibirayesh etot .charAt i esli ukazat v skobkax nomer simvola kotoriy tebe nujen on tebe ego pokajet
         */

        System.out.println(text.charAt(3));
        System.out.println(text.charAt(10));
        System.out.println(text.charAt(14));
        System.out.println(text.charAt(48));

         /*
        beret ot indeksa kotorogo mi ukazali i do konca stroki
         */


        System.out.println(text.substring(45));
        /*
        vozvrashayem mne kusok ot kakogo do kakogo indexa mne nujno tak kak ti ukazal cto ot 0 do 11(ne vklucitelno)
        pecetayet text s 0 do 11 i smotrish kolicestvo znaceniy skolko tam simvolov
         */

        String subText = text.substring(0,11);
        System.out.println(subText + " " + subText.length());


        System.out.println(text.charAt(48));
        //System.out.println(text.charAt(49));
        String subText2 = text.substring(0,49);
        System.out.println(subText2 + " " + subText2.length());


        String text33 = "Это текст для проверки работы методов типа String. Это текст для проверки работы методов типа String. Это текст для проверки работы методов типа String!";
        /*
        vitashil dlinu
         */
        System.out.println(text33.length());
        /*
        esli tebe nujen posledniy simvol== vsa dlina minus
        pokaji simvol (dlina minus 1 )
         */
        System.out.println(text33.charAt(text33.length()-1));



    }
}


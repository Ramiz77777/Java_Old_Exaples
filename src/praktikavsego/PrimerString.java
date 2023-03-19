package praktikavsego;

public class PrimerString {
    public static void main(String[] args) {
        String word = "Hello";
        System.out.println(word.length());
        System.out.println(word.charAt(3));
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println(word.trim());
        System.out.println(word.contains("H"));
        System.out.println(word.replace('H','p'));
        System.out.println(word.substring(2));
        System.out.println(word.substring(0,3));
        System.out.println(word.indexOf('e'));
        System.out.println(word.charAt(word.length()-1));

    }


}

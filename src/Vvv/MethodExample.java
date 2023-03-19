package Vvv;

public class MethodExample {
    public static void main(String[] args) {
        methom("name ;","surname ; ",28);
    }

    static void methom(String numer1,String numer2,int numer3){
        System.out.println(numer1 + numer2 + numer3);
        System.out.println(numer1 + numer3 + numer2);
        System.out.println(numer2 + numer1 + numer3);
        System.out.println(numer2 + numer3 + numer1);
    }
}

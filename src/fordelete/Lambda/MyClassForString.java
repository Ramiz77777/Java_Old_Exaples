package fordelete.Lambda;

public class MyClassForString {
    public static void main(String[] args) {
        int a = 10;

        abc(myString -> {
            System.out.println(a);
            return myString.length() ;
        });
    }

    static void abc(MyInterfaceForString1 myClassForString1){
        System.out.println(myClassForString1.strtoint("l"));
    }
}
interface MyInterfaceForString1 {
    int strtoint(String myString);
}

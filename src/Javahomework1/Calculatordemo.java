package Javahomework1;

public class Calculatordemo {
    public static void main(String[] args) {
        Calculatoroperations cal = new Calculatoroperations();
        int a1 = 0b000000100; //4
        int b1 = 0b000000010; // 2
        int c = cal.sum(a1,b1);
        System.out.println(c);

        int k = 0b000001000;//8
        int k2 = 0b000000100; // 4
        int resultofminus = cal.minus(k,k2);
        int resultofminus2 = cal.minus(0b000000100,0b000000010);   //4,2
        System.out.println(resultofminus);
        System.out.println(resultofminus2);


        int p2 = 0b000000011; // 3
        int p1 = 0b000000101; // 5
        int resultofmultiplication = cal.multiplication(p2,p1);
        System.out.println(resultofmultiplication);

        double d1 = 12.2;
        double d2 = 5.3;
        double resultofdiv = cal.div(d1, d2);
        System.out.println(resultofdiv);
        int x = 0b000000101;  // 0b000000100; 0b000000101;
        System.out.println(x);

    }

}

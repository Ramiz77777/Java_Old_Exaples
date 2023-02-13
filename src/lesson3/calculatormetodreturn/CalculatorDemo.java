package lesson3.calculatormetodreturn;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculatoroperation = new Calculator();
        int a = 10;
        int b = 3;
        int summaminus = calculatoroperation.summofBothparametrs(a,b);
        System.out.println(summaminus);

        int minus = calculatoroperation.summofminus(a,b);
        System.out.println(minus);
        int umnojeniye = calculatoroperation.summofumnojeniye(a,b);
        System.out.println(umnojeniye);
        int deleniye = calculatoroperation.summofdeleniye(a,b);
        System.out.println(deleniye);
        double deleniyesostatkom = calculatoroperation.deleniyedouble(a,b);
        System.out.println(deleniyesostatkom);


    }
}

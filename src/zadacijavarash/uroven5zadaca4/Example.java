package zadacijavarash.uroven5zadaca4;

public class Example {
    public static void main(String[] args) {
        int n = 100;
        int[] a = new int[n];
        a[n-1] = 2;
//        a[n-2] = 3;
        a[n/5] = a[n-1] + a[n-2];
        System.out.println(a[20]);

    }
}

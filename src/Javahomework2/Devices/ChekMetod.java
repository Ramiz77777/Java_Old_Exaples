package Javahomework2.Devices;

public class ChekMetod {
    public static void extracted(int temperature1, int temperature2) {

        if(temperature1 >100 && temperature2 <100)  {
            System.out.println("device work correct");
        }else if(temperature1 == 100 && temperature2 ==100) {
            System.out.println("attention");
        }else {
            System.out.println("device work not  correct");
        }

    }
}


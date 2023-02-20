package Primerivsego.carssprivatclasomidrugimiklasami;

public class CarDemo {
    public static void main(String[] args) {
        CarManufaktory proizvoditel = new CarManufaktory();
        CarColor carcolor = new CarColor();

        Car mashina = new Car("gls 600",200,true);
        System.out.println("marka - " + mashina.mark  + " " +  "limit - " + mashina.speedlimit + " is this sedan? -" + " "+ mashina.issedan);
        proizvoditel.setManufaktory("mers");
        carcolor.setColor("blue");
        System.out.println("proizvoditel - " + proizvoditel.getManufaktory());
        System.out.println("color - " + carcolor.getColor());
    }
}

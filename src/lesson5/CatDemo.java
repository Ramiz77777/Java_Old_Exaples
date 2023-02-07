package lesson5;
//sozdayem class s vavodom vsego cto u nas est

public class CatDemo {
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        UserOutput uo = new UserOutput();
        CatUtil catUtil = new CatUtil();

        Cat myFirstCat = catUtil.createCat();   //sozdayem 1 koshku
        Cat mySecondCat = catUtil.createCat();  //sozdayem 2 koshku
        uo.printCat(myFirstCat); //rapecatat infu o 1-voy koshke
        uo.printCat(mySecondCat);  //rapecatat infu o 2-roy koshke

        System.out.println(myFirstCat); //ssilka cat@79fc0f2f uvidish v konsole raspecativayet yeyo
        System.out.println(mySecondCat); //ssilka cat@79fc0f2f uvidish v konsole raspecativayet yeyo

        OurCat ourCats = new OurCat();

        ourCats.cat1 = myFirstCat;
        ourCats.cat2 = mySecondCat;

        System.out.println(ourCats.cat1);

        System.out.println(ourCats.cat2);

        System.out.println(ourCats.cat3);

        uo.printCat(ourCats.cat1);
        uo.printCat(ourCats.cat2);



    }
}

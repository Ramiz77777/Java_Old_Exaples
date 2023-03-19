package Primerivsego.primercat;

public class CatUtil {
    void catsout(){
        UserInput ui = new UserInput();
        String name = ui.catname("enter cat name ");
        String color = ui.catcolor("Enter color of cat ");
        int age = ui.catage("Enter cat age");
        System.out.println("cat name is ;" + name + "cat color is "+ color +", cat age is ;" + age);

    }
}

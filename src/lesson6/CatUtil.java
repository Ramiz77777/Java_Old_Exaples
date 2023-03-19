package lesson6;

public class CatUtil {
    public void catinfo(){
        UserInput ui = new UserInput();
        String catsname = ui.catname("Enter cat name");
        int catsage = ui.catage("Enter cat age ");
        System.out.println("Cat name is  =" + catsname +",Cat age is =" +  catsage);
    }
}

package Javahomework3;

public class Test {
    String name;
    String surname;

    public Test(String myname, String mysurname) {
        name = myname;
        surname = mysurname;
        System.out.println(myname + " "+ mysurname);
    }

}
class Test3 {
    public static void main(String[] args) {
        Test test = new Test("ramiz","Alasgarov");
    }
}
package lesson9.student.random;



public class Students {
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        Random random = new Random();
        random.studenstnumber = ui.userinput("Enter number of student ");
        System.out.println(random.numebrofstudenst());
//        for (int i = 0; i < 50; i++) {
//            System.out.println(random.numebrofstudenst());
//        }
    }
}

package lesson9.student.random;

public class Random {
    int studenstnumber;

    public int numebrofstudenst(){
        int maxstudent = studenstnumber;
        int minsstudent = 1;
        int result = (int) (Math.random() * (studenstnumber - minsstudent + 1) + minsstudent);
        return result;

    }
}

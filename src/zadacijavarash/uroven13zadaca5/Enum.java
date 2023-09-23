package zadacijavarash.uroven13zadaca5;

public class Enum {
    public static void main(String[] args) {
        Season months = Season.Winter;
        Season months2 = Season.Autumn;
        Season months3 = Season.Spring;
        Season months4 = Season.Summer;
        System.out.println(months4 +" " +  months3 + " "+ months2 + " " + months);
    }
    enum Season{
        Winter,
        Summer,
        Autumn,
        Spring

    }
}

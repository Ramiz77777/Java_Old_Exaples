package Javahomework2.Canwalk;

public class CanIWalkDemo {
    public static void main(String[] args) {
        if (CanWalk.isWeekend && CanWalk.israin) {
            System.out.println("we can not go walk");
        } else if (CanWalk.isWeekend && !CanWalk.israin) {
            System.out.println("we can go for a wolk :)");
        }

    }
}




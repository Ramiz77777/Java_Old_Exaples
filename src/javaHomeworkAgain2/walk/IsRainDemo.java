package javaHomeworkAgain2.walk;
//Описание занятия: - Создайте две переменные isWeekend и isRain.
//        Создайте переменную canWalk, значение которой должно быть истинным,
//        если это выходной день (isWeekend=true) и не идет дождь (isRain=false).
public class IsRainDemo {
    public static void main(String[] args) {
        if (CanWalkInWeekend.isweekend && !CanWalkInWeekend.israin){
            System.out.println("Can go walk");
        } else if (CanWalkInWeekend.isweekend && CanWalkInWeekend.israin) {
            System.out.println("Can not go walk");
        }
    }
}

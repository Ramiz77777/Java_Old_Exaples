package fordelete;


import java.util.*;

/*
Создайте массив из 5 случайных целых чисел из интервала [10;99]
    Выведите его на экран в строку.
    Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью. (отредактировано)

 */
public class gff {
    public static void main(String[] args) {
        int[] array = {4,5,67,3,1,456,8,9,};
        int searcharraynumber = 9;
        int indexofthisnumberis = linearsearch(array,searcharraynumber);
        System.out.println(indexofthisnumberis);
    }
    public static int linearsearch(int[] workingaaray,int searchnumber){
        for (int i = 0; i < workingaaray.length; i++) {
            if(workingaaray[i] == searchnumber ){
                return  i ;
            }
        }
        return -1;
    }
}

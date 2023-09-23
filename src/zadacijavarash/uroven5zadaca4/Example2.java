package zadacijavarash.uroven5zadaca4;

public class Example2 {
    public static void main(String[] args) {
        int a = 3 ;
        int[] array; //Создаем переменную-массив типа int[]
        if (a < 10) //Если переменная a меньше 10,
            array = new int[10]; //то создать массив из 10 элементов.
        else //Иначе
            array = new int[20]; //создать массив из 20 элементов
        for (int i = 0; i < array.length; i++) //Цикл по всем элементам массива: от 0 и до длины array.length — 1
        {
            System.out.println(array[i]);
        }
    }
}

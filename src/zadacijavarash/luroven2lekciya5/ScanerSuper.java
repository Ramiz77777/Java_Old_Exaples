package zadacijavarash.luroven2lekciya5;

import java.util.Scanner;

public class ScanerSuper {
    public static void main(String[] args) {
        /**
        hasNextInt() — метод проверяет, является ли следующая порция введенных данных числом, или нет (возвращает, соответственно, true или false).
         */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("vvedite int cilso ");
//        if(scanner.hasNextInt()){
//            int usersinputinteger = scanner.nextInt();
//            System.out.println("vashe cislo " + usersinputinteger);
//        }else {
//            System.out.println("perezapustite programmu i vvedite int cislo ");
//        }

        /**
        Еще один важный метод, на который стоит обратить внимание — useDelimiter().
         */

        Scanner scan = new Scanner("На голой ветке'" +
                "Ворон сидит одиноко.'" +
                "Осенний вечер." +
                "''***''" +
                "В небе такая луна,'" +
                "Словно дерево спилено под корень:'" +
                "Белеет свежий срез." +
                "''***''" +
                "Как разлилась река!'" +
                "Цапля бредет на коротких ножках,'" +
                "По колено в воде.");

        scan.useDelimiter("'");

        while (scan.hasNext()) {
            System.out.println(scan.next());
        }

        scan.close();/**
        В этом же примере есть еще один метод, на который нужно обязательно обратить внимание — close().
         Как и любой объект, работающий с потоками ввода-вывода,
         сканер должен быть закрыт по завершении своей работы,
         чтобы больше не потреблять ресурсы нашего компьютера.

Никогда не забывай о методе close()!
         */

    }
}

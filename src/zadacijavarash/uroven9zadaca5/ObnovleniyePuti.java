package zadacijavarash.uroven9zadaca5;
/*
Реализуй метод changePath(String, String) так, чтобы он заменял версию jdk в пути,
 полученном первым параметром метода, на версию, полученную вторым параметром, и возвращал новый путь.
Версия jdk начинается со строки "jdk" и заканчивается на "/".

Пример:
путь — "/usr/java/jdk1.8/bin/"
версия jdk — "jdk-13"

Метод changePath(путь, версия jdk) должен вернуть путь — "/usr/java/jdk-13/bin/".
Метод main() не принимает участия в тестировании.

Требования:
•	Нужно, чтобы метод changePath(String, String) был реализован согласно условию.
 */
public class ObnovleniyePuti {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        int firsindexof = path.indexOf("jdk");
        int lastindexof = path.indexOf("/",firsindexof);
        String oldjdk = path.substring(firsindexof,lastindexof);
        return path.replace(oldjdk,jdk);
    }
}
/*
int firstIndex = path.indexOf("jdk");
        System.out.println(firstIndex);
        int lastIndex = path.indexOf("/", firstIndex);
        System.out.println(lastIndex);
        String oldJdk = path.substring(firstIndex, lastIndex);

        return path.replace(oldJdk, jdk);
 */

package zadacijavarash.uroven8zadaca7;
/*
Внеси исправления в метод main(), чтобы он выводил в консоли число 12.

Требования:
•	В методе main() расставь одну пару скобок так, чтобы в консоли вывелось число 12. Остальной код не изменяй.
•	Метод main() должен выводить число 12.
 */
public class Prioriteti {
    public static void main(String[] args) {
        int number = 2;
        System.out.println(number + number * number + ++number);

        int a = 5;
        int b = ++a + ++a;
        System.out.println(b);
    }
    /*
    public static void main(String[] args) {

        int number = 2;
        System.out.println(number + number * (number + ++number));

     */
}

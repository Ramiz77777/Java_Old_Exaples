package zadacijavarash.uroven8zadaca1;
/*
Исправь методы класса Solution, используя класс Math:

sqrt(double) — должен возвращать квадратный корень переданного аргумента.
cbrt(double) — должен возвращать кубический корень переданного аргумента.
pow(int, int) — должен возвращать значение первого аргумента, возведенного в степень второго аргумента.
Требования:
•	Реализуй метод sqrt(double) согласно условию.
•	Реализуй метод cbrt(double) согласно условию.
•	Реализуй метод pow(int, int) согласно условию.
 */
public class UtilitniyClass2 {
    /*
            public static double sqrt(double a) {
            return Math.sqrt(a);
        }

        public static double cbrt(double a) {
            return Math.cbrt(a);
        }

        public static double pow(int number, int power) {
            return Math.pow(number, power);
        }
             */ // - resheniye
        public static double sqrt ( double a){
            return a * a;
        }

        public static double cbrt ( double a){
            return a * a * a;
        }

        public static double pow ( int number, int power){
            if (power == 0) {
                return 1;
            }

            int modulus = power < 0 ? power * -1 : power;
            int result = number;
            for (int i = 1; i < modulus; i++) {
                result *= number;
            }
            return power < 0 ? 1.0 / result : result;
        }


    }


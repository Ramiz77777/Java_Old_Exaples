package zadacijavarash.uroven10zadaca2;
/*
Попробуем сконструировать свой первый небоскреб и объявить о результате выполнения в консоли.
 Для этого тебе нужно вызвать конструктор класса Skyscraper в методе main и в теле конструктора вывести в консоль текст "Небоскреб построен.".

Требования:
•	В классе Skyscraper должен быть публичный конструктор без параметров.
•	В методе main тебе нужно создать один объект класса Skyscraper.
•	В конструкторе класса Skyscraper должен выводиться текст "Небоскреб построен." в консоль.
 */
public class SozdayemNeboskreb {
    String nebosktreb;

    public SozdayemNeboskreb(String nebosktreb) {
        this.nebosktreb = nebosktreb;
    }

    public static void main(String[] args) {
        SozdayemNeboskreb sozdayemNeboskreb = new SozdayemNeboskreb("Небоскреб построен.");
        System.out.println(sozdayemNeboskreb.nebosktreb);
    }
}

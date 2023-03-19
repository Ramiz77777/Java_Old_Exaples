package zadaci.Task_20.txt;
//Создать класс собака (Dog)
//        и продемонстрировать его работу с ним в программе.
//
//        Бизнес требования:
//        - Должна быть возможность увеличивать возраст собаки на один.
//
//        PS: научите собаку праздновать свой день рождения,
//        создайте в классе Dog метод:
//
//        void happyBirthday() {
//        // напишите тут команду увеличения возраста на 1
//        }
public class Dog20 {
    int age = 1;




    public void voice() {
        System.out.println("Gav " + "Today is my birthday");
    }
    public void happybirthday0(){
        System.out.println(age);
    }

    public void happybirthday() {
        System.out.println(age + 1);
        }


    }

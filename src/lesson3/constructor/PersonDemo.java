package lesson3.constructor;

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person("ramiz","alasgarov","blonde",29,185.5);
        System.out.println(person1.name +"  "+ person1.surname +"  "+ person1.haircolor +"  "+ person1.age +"  "+ person1.tall);
        Person person2 = new Person("ramiz2", "Alasgarov2","blue",17,255.3);
        System.out.println(person2.name +"  "+ person2.surname +"  "+ person2.haircolor +"  "+ person2.age +"  "+ person2.tall);


//        person1.name = "ramiz";                 //toje samoye prosto kak naverxu legce
//        person1.age = 28;
//        person1.surname = "Alasgarov";
//        person1.ishungry = true;
//        System.out.println(person1.name + person1.surname + person1.age + person1.ishungry);

    }




    }


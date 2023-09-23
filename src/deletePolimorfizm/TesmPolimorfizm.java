package deletePolimorfizm;

import static deletePolimorfizm.Animal.eachAnimal;

public class TesmPolimorfizm {
    public static void main(String[] args) {
        eachAnimal(new Cat());
        eachAnimal(new Dog());
    }

}

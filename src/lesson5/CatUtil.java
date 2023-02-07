package lesson5;


public class CatUtil {
    Cat createCat(){
        UserInput ui = new UserInput();
        String catName = ui.userInputText("Please enter cat name "); // on doljen polucit danniye ob imeni
        String catColor = ui.userInputText("Please enter cat color "); //doljen polucit danniye o cvete
        int catAge = ui.userInputInt("Please enter cat age ");  //doljen polucit danniye o vozraste
        boolean catHungry = ui.userInputBoolean("Is cat hungry? "); // doljen polucit danniye o tom cto golodniy

        Cat newCat = new Cat(catName,catColor,catAge,catHungry); //ispolzovat eti danniye ctobi sozdat novuyu koshku
        System.out.println("Create new cat - "+newCat);


        return newCat; // vozvratit znaceniye etoy koshki
    }
}


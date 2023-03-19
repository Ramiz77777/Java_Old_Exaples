package lesson7.xoroshiyprimer;

public class Resultat {
    public static void main(String[] args) {
        /*
        toje samoye cto i vnizu prosto tut
        mi sozdayem vse po otdelnosti a vnizu vse srazu

         */
        MaminaPodruga yeyopodruga = new MaminaPodruga("Ulica mokraya 22");
        Otec myotec = new Otec("Ulica vishkina 33");
        Mat moyamat = new Mat(myotec,yeyopodruga,"e");
        System.out.println(moyamat.gdeONjivet.adrssEGOprojivaniya + "===" + moyamat.gdeONAjivet.adressYEYOprojivaniya + "==" + moyamat.nashainformaciya);


        /*
beri kak 3 vetki cto - v infe u nas naxodatsa 3 vetke s informaciyey- 2 s prodoljeniyem a 1 na pramuyu
v infe u nas ssilka na mat v kotoroy gdeONjivet xranitsa ssilka na Class Otec v kotoroy informaciya kotoruyu mi napisali "Ulica vishkina 33"
v infe u nas ssilka na mat v kotoy gdeONAjivet xranitsa ssilka na Class MaminaPodruga v kotoy informaciya kotoruyu mi napisali "Ulica mokraya 22"
v infe i nas uje pramaya ssilka  na nasheinformaciya,tak kak dalshe netu ssilki
         */

        Mat infa = new Mat(new Otec("Ulica vishkina 33"),new MaminaPodruga("Ulica mokraya 22"),"ura");
        System.out.println(infa.gdeONjivet.adrssEGOprojivaniya);//v infe u nas ssilka na mat v kotoroy gdeONjivet xranitsa ssilka na Class Otec v kotoroy informaciya kotoruyu mi napisali "Ulica vishkina 33"
        System.out.println(infa.gdeONAjivet.adressYEYOprojivaniya);//v infe u nas ssilka na mat v kotoy gdeONAjivet xranitsa ssilka na Class MaminaPodruga v kotoy informaciya kotoruyu mi napisali "Ulica mokraya 22"
        System.out.println(infa.nashainformaciya);//v infe i nas uje pramaya ssilka  na nasheinformaciya,tak kak dalshe netu ssilki
    }

    }



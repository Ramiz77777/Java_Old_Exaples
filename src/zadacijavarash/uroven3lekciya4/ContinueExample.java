package zadacijavarash.uroven3lekciya4;

public class ContinueExample {
    public static void main(String[] args) {
//        int i = 1;
//        while (i <= 20) {
//            if ((i % 7) == 0)
//                continue;                                 //propuskaet komanndu i tut ona propustila sled 2 komandi
//                                                          //System.out.println(i); i    i++; poetomu ostanovilas
//            System.out.println(i);
//            i++;
//        }
        int i = 0;
        while (i < 20) // poka usloviye menshe 20
        {
            i++; // probav + 1
            if ((i % 7) == 0)// no esli i%7== 0 propusk(continue)
                continue;
            System.out.println(i); // i raspecativay
        }
    }
}

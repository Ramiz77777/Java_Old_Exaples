package zadacijavarash.uroven8zadaca2;

public class MagicBallDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Заработаю ли я себе на BMW?");
            System.out.println(Magic8Ball.getPrediction());
        }

    }
}

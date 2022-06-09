package observator.exercice;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Bourse bourse = new Bourse();

        BourseSubscriber achteur = new TraderAchter();
        bourse.subscriber(achteur);

        BourseSubscriber vendeur = new TraderVendeur();
        bourse.subscriber(vendeur);

        while (true) {

            // aléatoirement le prix du BTC évolue
            // Nombre aléatoire entre -5000 et 5000
            int random = (new Random().nextInt(10_000) - 5000);
            bourse.setPrixBTC(28_396 + random);

             try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

    }

}

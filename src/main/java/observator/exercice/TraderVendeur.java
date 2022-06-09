package observator.exercice;

public class TraderVendeur implements BourseSubscriber{

    public void update(int prix){
        if(prix > 32_000){
            System.out.println("vendre du BTC !!!! car il vaut " );
        }
    }
}

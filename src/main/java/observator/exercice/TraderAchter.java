package observator.exercice;

public class TraderAchter implements BourseSubscriber{

    public void update(int prix){
        if(prix < 25_000){
            System.out.println("Acheter du BTC !!!! car il vaut " + prix);
        }
    }
}

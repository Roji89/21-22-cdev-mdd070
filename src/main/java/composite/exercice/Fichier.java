package composite.exercice;

public class Fichier implements components {
    private int tailleEnKo;

    public Fichier(String titre, int tailleEnKo) {
        this.tailleEnKo = tailleEnKo;
    }

    public int getTaille() {
        return tailleEnKo;
    }
}

package composite.exercice;

import java.util.ArrayList;
import java.util.List;

public class Dossier implements components {

    private List<components> components = new ArrayList<>();
    private String titre;

    public Dossier(String titre) {
        this.titre = titre;
    }

    public void addSousDosser(Dossier dossier2) {
        components.add(dossier2);
    }

    public void addFichier(Fichier fichier1) {
        components.add(fichier1);
    }

    public int getTaille() {
        int tailleTotal = 0;
        for (components components: components){
            int taille = components.getTaille();
            tailleTotal = tailleTotal +taille;
        }
        return tailleTotal;
    }
}

package composite.exercice;

import iterator.arbre.Arbre;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Fichier fichier1 = new Fichier("fichier1", 20);
        Fichier fichier2 = new Fichier("fichier2", 30);
        Fichier fichier3 = new Fichier("fichier3", 10);

        Dossier dossier1 = new Dossier("dossier1");
        Dossier dossier2 = new Dossier("dossier2");

        dossier1.addSousDosser(dossier2);
        dossier1.addFichier(fichier1);

        dossier2.addFichier(fichier2);
        dossier2.addFichier(fichier3);

        // calculer poids dossier => utiliser le design patter composite pour calculer le poids d'un dossier
        System.out.println(dossier1.getTaille());
    }
}

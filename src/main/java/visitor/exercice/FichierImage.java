package visitor.exercice;

public class FichierImage implements Fichier {

    public FichierImage(String nom, int hauteur, int largeur, String typeCompression) {
        this.nom = nom;
        this.hauteur = hauteur;
        this.largeur = largeur;
        this.typeCompression = typeCompression;
    }

    private String nom;
    private int hauteur;
    private int largeur;
    private String typeCompression;

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String getType() {
        return "docx";
    }

    public int getHauteur() {
        return hauteur;
    }

    public int getLargeur() {
        return largeur;
    }

    public String getTypeCompression() {
        return typeCompression;
    }
}

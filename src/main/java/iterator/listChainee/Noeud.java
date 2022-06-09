package iterator.listChainee;

public class Noeud {

    public String getValue() {
        return value;
    }

    private String value;
    public Noeud suivent;


    public Noeud(String value){
        this.value =value;
    }

    public Noeud getSuivent() {
        return suivent;
    }

    public void setSuivent(Noeud suivent) {
        this.suivent = suivent;
    }
}

package iterator.listChainee;

public class ListChainee {


    private Noeud debut ;

    public Noeud getDebut() {
        return debut;
    }

    public void add(String a){
        Noeud noeud = new Noeud(a);

        if(this.debut == null){
            this.debut = noeud;
        }
        else {
            Noeud noeudCourant = this.debut;
            while (noeudCourant.getSuivent() != null){
                noeudCourant= noeudCourant.getSuivent();
            }
            noeudCourant.setSuivent(noeud);
        }

    }
    public ListChaineeIterator iterator() {
        return new ListChaineeIterator(this);
    }

}

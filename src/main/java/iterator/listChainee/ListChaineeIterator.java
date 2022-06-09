package iterator.listChainee;

import java.util.Iterator;

public class ListChaineeIterator implements Iterator {

    private  Noeud noeudCourant;

    public ListChaineeIterator(ListChainee listChainee){
        this.noeudCourant = listChainee.getDebut();
    }
    public boolean hasNext(){
        return noeudCourant != null;
    };

    public String next(){
        String value = noeudCourant.getValue();
        noeudCourant = noeudCourant.getSuivent();

        return value;
    }
}

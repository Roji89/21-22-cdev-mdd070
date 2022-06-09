package iterator.listChainee;

import iterator.PlateauIterator;

import javax.swing.*;
import java.util.Iterator;

public class Main {

    public static void main(String[] arge){
        ListChainee listChainee = new ListChainee();
        listChainee.add("a");
        listChainee.add("b");
        listChainee.add("c");

        Noeud n = listChainee.getDebut();
        while (n != null){
            System.out.println(n.getValue());
            n = n.getSuivent();
        }


    }
    private static void traitementQuiBoucleSurUneStructure(Iterable iterable) {
        for (Iterator iterator = iterable.iterator(); iterator.hasNext(); ) {
            Object element = iterator.next();
            System.out.println(element);
        }
    }

    }


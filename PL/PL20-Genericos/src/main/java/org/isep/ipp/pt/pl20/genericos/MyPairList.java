package org.isep.ipp.pt.pl20.genericos;

import java.util.ArrayList;
import java.util.List;

public class MyPairList<E> {

    public static void main(String[] args) {

        List<Pair> listaPares = new ArrayList<>();

        Pair nomeNota = new Pair((String)"João", (double)10);
        Pair codigoNome = new Pair((int)726181, "Breno");
        Pair latLong = new Pair((float)10.12, (float)-1.124);

        listaPares.add(nomeNota);
        listaPares.add(codigoNome);
        listaPares.add(latLong);
        
        listaPares.add(nomeNota);
        listaPares.add(codigoNome);
        
        
    }
}

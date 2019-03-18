package org.dei.isep.ipp.pt.pl7_contadoresdomesticos;

public abstract class ContElect extends Contador {

    private static int numContadoresElect = 0;

    public static int getNumContadoresElect() {
        return numContadoresElect;
    }
    
    /**
     * 
     * Criador contador simples
     * 
     * @param nome
     * @param consumo 
     */
    public ContElect(String nome, int consumo) {
        super(nome, consumo);
    }
    
    /**
     * 
     * Criador contador Bi-horário
     * 
     * @param nome
     * @param consumoV
     * @param consumoFV
     */
    public ContElect(String nome, int consumoV, int consumoFV) {
        super(nome, consumoV, consumoFV);
    }

    @Override
    public String init() {
        numContadoresElect++;
        return String.format("ELECT-%d", numContadoresElect);
    }
}

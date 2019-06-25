package org.dei.isep.ipp.pt.na_tp2_1181436_1180005;

public enum Atividade {
    CAMINHADA ("Caminhada", 208.75, 0.73, 208.75, 0.73),
    CORRIDA ("Corrida", 208.75, 0.73, 208.75, 0.73),
    CICLISMO ("Ciclismo", 189, 0.56, 202, 0.72),
    NATACAO ("Natação", 204, 1.7, 204, 1.7);
    
    private final String nome;
    private final double cteAMasc;
    private final double cteBMasc;
    private final double cteAFem;
    private final double cteBFem;
    
    private Atividade(String nome, double cteAMasc, double cteBMasc, double cteAFem, double cteBFem) {
        this.nome = nome;
        this.cteAMasc = cteAMasc;
        this.cteBMasc = cteBMasc;
        this.cteAFem = cteAFem;
        this.cteBFem = cteBFem;
    }
    
    String getNome(){
        return this.nome;
    }
    
    int calcularFCM(Atleta atleta) {
        String genero = atleta.getGenero();
        Atividade atividade = atleta.getAtividade();
        double cteA = 0;
        double cteB = 0;
        if(genero.equals(Atleta.MASCULINO)) {
            cteA = atividade.cteAMasc;
            cteB = atividade.cteBMasc;
        } else if(genero.equals(Atleta.FEMININO)){
            cteA = atividade.cteAFem;
            cteB = atividade.cteBFem;
        }
        return (int) (cteA - cteB * atleta.getIdade());
    }
}

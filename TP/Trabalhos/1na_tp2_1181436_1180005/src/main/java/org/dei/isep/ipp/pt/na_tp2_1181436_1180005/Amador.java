package org.dei.isep.ipp.pt.na_tp2_1181436_1180005;

public class Amador extends NaoProfissional {

    // Declaração das variáveis utilizadas nos cálculos de Amador
    private static double perCentPremios = 0.07;
    private static int numAtletasAmadores = 0;
    private static int valorMinimo = 5;

    /**
     * 
     * Construtor da instância Amador com todos os parâmetros
     * 
     * @param nome          - nome do alteta Amador
     * @param nif           - nif do atleta Amador
     * @param genero        - genero do atleta Amador
     * @param idade         - idade do atleta Amador
     * @param atividade     - atividade do atleta Amador
     * @param fcr           - fcr do atleta Amador
     */
    public Amador(String nome, double nif, String genero, int idade, Atividade atividade, int fcr) {
        super(nome, nif, genero, idade, atividade, fcr);
        numAtletasAmadores++;
    }
    
    /**
     * 
     * Cria uma instância de Amador que é cópia de outra instância
     * 
     * @param at - instância a copiar
     */
    public Amador(Atleta at){
        super(at);
    }
    
    /**
     * 
     * Cria uma instância de Amador sem parâmetros
     * 
     */
    public Amador(){
        numAtletasAmadores++;
    }

    /**
     * 
     * Retorna o valor mínimo que Amador recebe.
     * 
     * @return - salario minimo do atleta
     */   
    public static int getValorMinimo() {
        return valorMinimo;
    }
    
    /**
     * 
     * Permite definir o valor mínimo que Amador recebe.
     * 
     * @param valorMinimo - salario minimo do atleta
     */
    public static void setValorMinimo(int valorMinimo) {
        Amador.valorMinimo = valorMinimo;
    }
    
    /**
     * 
     * Retorna a % fixa relativa aos prémios.
     * 
     * @return - % fixa relativa aos prémios
     */
    public static double getPerCentPremios() {
        return perCentPremios;
    }

    /**
     * 
     * Retorna o número de instâncias de Atleta criados.
     * 
     * @return - número de atletas amadores
     */
    public static int getNumAtletas() {
        return numAtletasAmadores;
    }
    
    /**
     * 
     * Permite definir a % fixa relativa aos prémios.
     * 
     * @param perCentPremios - % fixa relativa aos prémios
     */
    public static void setPerCentPremios(double perCentPremios) {
        Amador.perCentPremios = perCentPremios;
    }

    /**
     * 
     * Calcula o salário de Amador.
     * 
     * @return - salário do atleta Amador
     */
    @Override
    public double calcularSalario() {
        double perCentPremiosAntiguidade = this.getPercentAntiguidade();
        double premios = this.getPremios();

        double valorTotal = perCentPremios * premios + perCentPremiosAntiguidade * premios;

        if (valorTotal < Amador.valorMinimo) {
            return valorMinimo;
        } else {
            return valorTotal;
        }
    }

    /**
     * 
     * @return String com as informações do Atleta Amador
     */
    @Override
    public String toString() {
        return super.toString() + "\nCategoria: Amador";
    }

    @Override
    public double valorIRS() {
        return 0;
    }
}

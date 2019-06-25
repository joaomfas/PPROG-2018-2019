package org.dei.isep.ipp.pt.na_tp2_1181436_1180005;

public class Semiprofissional extends NaoProfissional {

    // Declaração das variáveis utilizadas nos cálculos de Semiprofissional
    private static double parcelaFixaSalario = 0;
    private static int numAtletasSemiprofissionais = 0;
    private static final double percentIRS = 0.1;

    /**
     * 
     * Constrói uma instância de Semiprofissional com todos os parametros
     * 
     * @param nome          - nome do Atleta Semiprofissional
     * @param nif           - nif do Atleta Semiprofissional
     * @param genero        - genero do Atleta Semiprofissional
     * @param idade         - idade do Atleta Semiprofissional
     * @param atividade     - atividade do Atleta Semiprofissional
     * @param fcr           - fcr do Atleta Semiprofissional
     */
    public Semiprofissional(String nome, double nif, String genero, int idade, Atividade atividade, int fcr) {
        super(nome, nif, genero, idade, atividade, fcr);
        numAtletasSemiprofissionais++;
    }
    
    /**
     * 
     * Cria uma instância de Semiprofissional que é cópia de outra instância
     * 
     * @param at - instância a copiar
     */
    public Semiprofissional(Atleta at){
        super(at);
    }

    /**
     * 
     * Cria uma instância de Semiprofissional sem parâmetros
     * 
     */
    public Semiprofissional() {
        numAtletasSemiprofissionais++;
    } 

    /**
     *
     * Retorna o número de instâncias de Semiprofissional criadas
     * 
     * @return - número de instâncias de Semiprofissional criadas
     */
    public static int getNumAtletas() {
        return numAtletasSemiprofissionais;
    }
    
    /**
     * 
     * Retorna o valor da parcela fixa do salário
     * 
     * @return - valor da parcela fixa do salário
     */
    public static double getParcelaFixaSalario() {
        return parcelaFixaSalario;
    }

    /**
     * 
     * Permite definir o valor da parcela fixa do salário
     * 
     * @param parcelaFixaSalario - valor da parcela fixa do salário
     */
    public static void setParcelaFixaSalario(double parcelaFixaSalario) {
        Semiprofissional.parcelaFixaSalario = parcelaFixaSalario;
    }

    /**
     * 
     * Calcula o Salário do Atleta Semiprofissional
     * 
     * @return - Salário do Atleta Semiprofissional
     */
    @Override
    public double calcularSalario() {
        double perCentPremiosAntiguidade = this.getPercentAntiguidade();
        return parcelaFixaSalario + perCentPremiosAntiguidade * this.getPremios();
    }
    
    /**
     * 
     * Calcula o valor da parcela de IRS
     * 
     * @return - o valor da parcela de IRS
     */
    @Override
    public double valorIRS(){
        double salario = this.calcularSalario();
        return salario*percentIRS;
    }

    /**
     * 
     * @return - String com os dados de Atleta Semiprofissional
     */
    @Override
    public String toString() {
        return (super.toString()+"\nCategoria: Semiprofissional");
    }
}

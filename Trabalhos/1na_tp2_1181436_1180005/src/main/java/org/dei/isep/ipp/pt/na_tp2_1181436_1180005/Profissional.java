package org.dei.isep.ipp.pt.na_tp2_1181436_1180005;

public class Profissional extends Atleta {

    // Declaração das variáveis utilizadas nos cálculos de Profissional
    private double parcelaFixaSalario = 0;
    private double parcelaVariavelSalarioPerCent = 0.2;
    private static int numAtletasProfissionais = 0;
    private static final double percentIRS = 0.1;

    /**
     *
     * Constrói uma instância de Profissional com todos os parâmetros
     *
     * @param nome - nome do Atleta Profissional
     * @param nif - nif do Atleta Profissional
     * @param genero - genero do Atleta Profissional
     * @param idade - idade do Atleta Profissional
     * @param atividade - atividade do Atleta Profissional
     * @param fcr - fcr do Atleta Profissional
     */
    public Profissional(String nome, double nif, String genero, int idade, Atividade atividade, int fcr) {
        super(nome, nif, genero, idade, atividade, fcr);
        numAtletasProfissionais++;
    }
    
    /**
     * 
     * Cria uma instância de Profissional que é cópia de outra instância
     * 
     * @param at - instância a copiar
     */
    public Profissional(Atleta at){
        super(at);
    }

    /**
     *
     * Cria uma instância de Profissional sem parâmetros
     *
     */
    public Profissional() {
        numAtletasProfissionais++;
    }

    /**
     *
     * Retorna o número de instâncias de Profissional criadas
     *
     * @return - número de instâncias de Profissional criadas
     */
    public static int getNumAtletas() {
        return numAtletasProfissionais;
    }

    /**
     *
     * Permite definir o valor da parcela fixa do salario
     *
     * @param parcelaFixaSalario - valor da parcela fixa do salario
     */
    public void setParcelaFixaSalario(double parcelaFixaSalario) {
        this.parcelaFixaSalario = parcelaFixaSalario;
    }

    /**
     *
     * Permite definir a % aplicada na parcela variável do salario
     *
     * @param parcelaVariavelSalarioPerCent - % aplicada na parcela variável do
     * salario
     */
    public void setParcelaVariavelSalarioPerCent(double parcelaVariavelSalarioPerCent) {
        this.parcelaVariavelSalarioPerCent = parcelaVariavelSalarioPerCent;
    }

    /**
     *
     * Retorna o valor da parcela fixa do salário
     *
     * @return - valor da parcela fixa do salário
     */
    public double getParcelaFixaSalario() {
        return parcelaFixaSalario;
    }

    /**
     *
     * Retorna % aplicada na parcela variável do salario
     *
     * @return - % aplicada na parcela variável do salario
     */
    public double getParcelaVariavelSalarioPerCent() {
        return parcelaVariavelSalarioPerCent;
    }

    /**
     *
     * Calcula o salário do Atleta Profissional
     *
     * @return - salário do Atleta Profissional
     */
    @Override
    public double calcularSalario() {
        double premios = this.getPremios();
        return parcelaFixaSalario + parcelaVariavelSalarioPerCent * premios;
    }

    /**
     *
     * Calcula o valor da parcela de IRS
     *
     * @return - o valor da parcela de IRS
     */
    @Override
    public double valorIRS() {
        double salario = this.calcularSalario();
        return salario * percentIRS;
    }

    /**
     *
     * @return - String com os dados do Atleta Profissional
     */
    @Override
    public String toString() {
        return super.toString() + "\nCategoria: Profissional";
    }
}

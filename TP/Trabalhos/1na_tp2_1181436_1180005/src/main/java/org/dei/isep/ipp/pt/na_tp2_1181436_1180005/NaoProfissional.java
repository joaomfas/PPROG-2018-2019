package org.dei.isep.ipp.pt.na_tp2_1181436_1180005;

public abstract class NaoProfissional extends Atleta {

    // Declaração das variáveis utilizadas nos cálculos de NaoProfissional
    int antiguidade = 0;
    protected double ant5_10 = 0.02;
    protected double ant10_20 = 0.08;
    protected double ant20 = 0.20;

    /**
     *
     * Cria uma instancia de NaoProfissional com todos os parâmetros
     *
     * @param nome - nome do Atleta Não-Profissional
     * @param nif - nif do Atleta Não-Profissional
     * @param genero - genero do Atleta Não-Profissional
     * @param idade - idade do Atleta Não-Profissional
     * @param atividade - atividade do Atleta Não-Profissional
     * @param fcr - fcr do Atleta Não-Profissional
     */
    public NaoProfissional(String nome, double nif, String genero, int idade, Atividade atividade, int fcr) {
        super(nome, nif, genero, idade, atividade, fcr);
    }
    
    /**
     * 
     * Cria uma instância de NaoProfissional que é cópia de outra instância
     * 
     * @param at - instância a copiar
     */
    public NaoProfissional(Atleta at){
        super(at);
    }

    /**
     *
     * Cria uma instância de NaoProfissional sem parâmetros
     *
     */
    public NaoProfissional() {
    }

    /**
     *
     * Retorna a % aplicada no cálculo do Salario em função da antiguidade:
     *
     * @return - % aplicada no cálculo do Salario em função da antiguidade
     */
    protected double getPercentAntiguidade() {
        double perCent = 0;
        if (antiguidade < 5) {
            perCent = 0;
        } else if (antiguidade >= 5 && antiguidade <= 10) {
            perCent = ant5_10;
        } else if (antiguidade > 10 && antiguidade <= 20) {
            perCent = ant10_20;
        } else {
            perCent = ant20;
        }
        return perCent;
    }
    
    /**
     *
     * Retorna a antiguidade
     *
     * @return - antiguidade
     */
    public int getAntiguidade() {
        return antiguidade;
    }

    /**
     *
     * Permite definir a antiguidade
     *
     * @param antiguidade - antiguidade
     */
    public void setAntiguidade(int antiguidade) {
        this.antiguidade = antiguidade;
    }

    /**
     *
     * Retorna a % aplicada no cálculo do Salario para 5_ant_10
     *
     * @return - % aplicada no cálculo do Salario para 5_ant_10
     */
    public double getAnt5_10() {
        return ant5_10;
    }

    /**
     *
     * Permite definir a % aplicada no cálculo do Salario para 5_ant_10
     *
     * @param ant5_10 - a % aplicada no cálculo do Salario para 5_ant_10
     */
    public void setAnt5_10(double ant5_10) {
        this.ant5_10 = ant5_10;
    }

    /**
     *
     * Retorna a % aplicada no cálculo do Salario para 10_ant_20
     *
     * @return - % aplicada no cálculo do Salario para 10_ant_20
     */
    public double getAnt10_20() {
        return ant10_20;
    }

    /**
     *
     * Permite definir a % aplicada no cálculo do Salario para 10_ant_20
     *
     * @param ant10_20 - % aplicada no cálculo do Salario para 10_ant_20
     */
    public void setAnt10_20(double ant10_20) {
        this.ant10_20 = ant10_20;
    }

    /**
     *
     * Retorna a % aplicada no cálculo do Salario para ant_20
     *
     * @return - % aplicada no cálculo do Salario para ant_20
     */
    public double getAnt20() {
        return ant20;
    }

    /**
     *
     * Permite definir a % aplicada no cálculo do Salario para ant_20
     *
     * @param ant20 - % aplicada no cálculo do Salario para ant_20
     */
    public void setAnt20(double ant20) {
        this.ant20 = ant20;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAntiguidade: " + antiguidade + " anos";
    }

}

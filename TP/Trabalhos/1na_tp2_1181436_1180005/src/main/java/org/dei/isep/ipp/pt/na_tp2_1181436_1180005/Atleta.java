package org.dei.isep.ipp.pt.na_tp2_1181436_1180005;

/**
 *
 * @author joaoferreira
 */
public abstract class Atleta {

    // Declaração de variáveis estáticas constantes
    public static final String FEMININO = "Feminino";
    public static final String MASCULINO = "Masculino";
    public static final double IT_QUEIMA_GORDURA = 0.6;
    public static final double IT_TREINA_CARDIO = 0.75;

    // Variáveis por omissão para a instanciação de Atleta
    public static final String NOME_POR_OMISSAO = "Sem nome";
    public static final String GENERO_POR_OMISSAO = "Sem género";
    public static final String ATIVIDADE_POR_OMISSAO = "Sem atividade";
    public static final double NIF_POR_OMISSAO = 0000000;
    public static final int IDADE_POR_OMISSAO = 000;
    public static final int FCR_POR_OMISSAO = 000;

    // Declaração as variáveis que caracterizam Atleta
    private String nome;
    private String genero;
    private Atividade atividade;
    private double nif;
    private int idade;
    private double premios;
    private int fcr;

    /**
     *
     * Construtor da instância Atleta com todos os parâmetros (sem prémios)
     *
     * @param nome - nome o Atleta
     * @param nif - nif do Atleta
     * @param genero - genero do Atleta
     * @param idade - idade do Atleta
     * @param atividade - atividade do Atleta
     * @param fcr - fcr do Atleta
     */
    public Atleta(String nome, double nif, String genero, int idade, Atividade atividade, int fcr) {
        this.nome = nome;
        this.nif = nif;
        this.genero = genero;
        this.idade = idade;
        this.atividade = atividade;
        this.fcr = fcr;
    }

    /**
     *
     * Construtor da instância Atleta sem parâmetros
     *
     */
    public Atleta() {
        this.nome = NOME_POR_OMISSAO;
        this.nif = NIF_POR_OMISSAO;
        this.genero = GENERO_POR_OMISSAO;
        this.idade = IDADE_POR_OMISSAO;
        this.atividade = null;
        this.fcr = FCR_POR_OMISSAO;
    }

    /**
     * 
     * Constrói instância de Atleta que é uma cópia de outra instância de Atleta
     * 
     * @param outroAtleta - instância de Atleta a copiar
     */
    public Atleta(Atleta outroAtleta) {
        this.nome = outroAtleta.getNome();
        this.genero = outroAtleta.getGenero();
        this.atividade = outroAtleta.getAtividade();
        this.nif = outroAtleta.getNif();
        this.idade = outroAtleta.getIdade();
        this.premios = outroAtleta.getPremios();
        this.fcr = outroAtleta.getFcr();
    }

    /**
     * 
     * Retorna o FCR do Atleta
     * 
     * @return - FCR do Atletas
     */
    public int getFcr() {
        return fcr;
    }

    /**
     *
     * Permite definir FCR de Atleta
     *
     * @param fcr - FCR de atleta
     */
    public void setFcr(int fcr) {
        this.fcr = fcr;
    }

    /**
     *
     * Retorna o Nome de Atleta
     *
     * @return - nome do Atleta
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * Permite definir o Nome de Atleta
     *
     * @param nome - nome do Atleta
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * Retorna o NIF de Atleta
     *
     * @return - nif do Atleta
     */
    public double getNif() {
        return nif;
    }

    /**
     *
     * Permite definir o NIF de Atleta
     *
     * @param nif - nif do Atleta
     */
    public void setNif(double nif) {
        this.nif = nif;
    }

    /**
     *
     * Retorna o Género de Atleta
     *
     * @return - género do Atleta
     */
    public String getGenero() {
        return genero;
    }

    /**
     *
     * Permite definir o Género de Atleta
     *
     * @param genero - género do Atleta
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     *
     * Retorna a Idade de Atleta
     *
     * @return - idade do Atleta
     */
    public int getIdade() {
        return idade;
    }

    /**
     *
     * Permite definir a Idade de Atleta
     *
     * @param idade - idade do Atleta
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     *
     * Retorna a Atividade de Atleta
     *
     * @return - Atividade do Atleta
     */
    public Atividade getAtividade() {
        return this.atividade;
    }
    
    /**
     * 
     * Retorna o nome da Atividade de Atleta
     * 
     * @return - nome da Atividade de Atleta
     */
    public String getNomeAtividade(){
        return this.atividade.getNome();
    }

    /**
     * 
     * Retorna a categoria de Atleta
     * 
     * @return - cat de Atleta
     */
    public String getCategoria(){
        if (this instanceof Amador) {
                return "amador";
            } else if (this instanceof Semiprofissional) {
                return "semiprofissional";
            } else {
                return "profissional";
            }
    }
    
    /**
     *
     * Permite definir a Atividade de Atleta
     *
     * @param atividade - Atividade do Atleta
     */
    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

    /**
     *
     * Retorna os Prémios de Atleta
     *
     * @return - Prémios do Atleta
     */
    public double getPremios() {
        return premios;
    }

    /**
     *
     * Permite definir os Prémios de Atleta
     *
     * @param premios - Prémios do Atleta
     */
    public void setPremios(double premios) {
        this.premios = premios;
    }

    /**
     *
     * Calcula FCT retorna um array com os valores de FCT para cada um dos
     * objetivos de treino FCT[0] : FCT para um treino com o objetivo de queimar
     * gordura FCT[1] : FCT para um treino com o objetivo de trabalhar a
     * capacidade cardiorespiratoria
     *
     * @return - FCT do Atleta
     */
    public int[] calcularFCT() {
        int fcm = this.calcularFCM();
        int FCT_QUEIMA_GORDURA = (int) (fcr + IT_QUEIMA_GORDURA * (fcm - fcr));
        int FCT_TREINA_CARDIO = (int) (fcr + IT_TREINA_CARDIO * (fcm - fcr));
        int[] FCT = {FCT_QUEIMA_GORDURA, FCT_TREINA_CARDIO};
        return FCT;
    }

    /**
     *
     * Calcula e retorna o valor de FCM consoante a atividade e género de Atleta
     *
     * @return - FCM do Atleta
     */
    public int calcularFCM() {
        return atividade.calcularFCM(this);
    }

    /**
     *
     * Retorna uma String com os dados do Atleta
     *
     * @return - String com os dados do Atleta
     */
    @Override
    public String toString() {
        return String.format("\nDados do Atleta\nNome: %s\nNIF: %.0f\nGénero: %s\nIdade: "
                + "%d\nAtividade: %s\nPrémios: %.0f\nFCR: %d",
                nome, nif, genero, idade, this.getNomeAtividade(), premios, fcr);
    }

    /**
     *
     * Declaração do método abstrato calcularSalario.
     *
     * @return - Salario de Atleta
     */
    public abstract double calcularSalario();
    
    /**
     *
     * Declaração do método abstrato valorIRS.
     *
     * @return - Parcela de IRS
     */
    public abstract double valorIRS();
}

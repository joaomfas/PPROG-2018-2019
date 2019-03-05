package org.dei.isep.ipp.pt.pl4_utenteginasio;

public class Utente {

    // Atributos de Utente
    private String nome;
    private String genero;
    private int idade;
    private double altura;
    private double peso;

    // Valores por omissão
    private static final String NOME_POR_OMISSAO = "N/A";
    private static final String GENERO_POR_OMISSAO = "N/A";
    private static final int IDADE_POR_OMISSAO = 0;
    private static final double ALTURA_POR_OMISSAO = 0;
    private static final double PESO_POR_OMISSAO = 0;

    // Valores de referência para cálculo do IMC
    private static int grauMagro = 18;
    private static int grauSaudavel = 25;

    // Número de instância de Utente    
    private static int numUtentes = 0;

    /**
     *
     * Constrói uma instância de Utente sem parametros
     *
     */
    public Utente() {
        this.nome = NOME_POR_OMISSAO;
        this.genero = GENERO_POR_OMISSAO;
        this.idade = IDADE_POR_OMISSAO;
        this.altura = ALTURA_POR_OMISSAO;
        this.peso = PESO_POR_OMISSAO;
        numUtentes++;
    }

    /**
     *
     * Constrói uma instância de Utente com os parametros nome e idade
     *
     * @param nome
     * @param idade
     */
    public Utente(String nome, int idade) {
        this.nome = nome;
        this.genero = GENERO_POR_OMISSAO;
        this.idade = idade;
        this.altura = ALTURA_POR_OMISSAO;
        this.peso = PESO_POR_OMISSAO;
        numUtentes++;
    }

    /**
     *
     * Constrói uma instância de Utente com os parametros nome, genero, idade,
     * altura, peso
     *
     * @param nome
     * @param genero
     * @param idade
     * @param altura
     * @param peso
     */
    public Utente(String nome, String genero, int idade, double altura, double peso) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        numUtentes++;
    }

    /**
     *
     * Devolve o valor de nome do Utente
     *
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * Devolve o valor de genero do Utente
     *
     * @return
     */
    public String getGenero() {
        return genero;
    }

    /**
     *
     * Devolve o valor de idade do Utente
     *
     * @return
     */
    public int getIdade() {
        return idade;
    }

    /**
     *
     * Devolve o valor de altura do Utente
     *
     * @return
     */
    public double getAltura() {
        return altura;
    }

    /**
     *
     * Devolve o valor de peso do Utente
     *
     * @return
     */
    public double getPeso() {
        return peso;
    }

    /**
     *
     * Modifica o limite inferior dos parametros de IMC
     *
     * @param grauMagro
     */
    public static void setGrauMagro(int grauMagro) {
        Utente.grauMagro = grauMagro;
    }

    /**
     *
     * Modifica o limite superior dos parametros de IMC
     *
     * @param grauSaudavel
     */
    public static void setGrauSaudavel(int grauSaudavel) {
        Utente.grauSaudavel = grauSaudavel;
    }

    /**
     *
     * Modifica o nome de Utente
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * Modifica o genero de Utente
     *
     * @param genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     *
     * Modifica a idade de Utente
     *
     * @param idade
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     *
     * Modifica a altura de Utente
     *
     * @param altura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     *
     * Modifica o peso de Utente
     *
     * @param peso
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     *
     * Devolve a descrição textual do Utente
     *
     * @return
     */
    @Override
    public String toString() {
        return "\nnome: " + nome + "\ngénero: " + genero + "\nidade: " + idade + "\naltura: " + altura + "\npeso: " + peso;
    }

    /**
     *
     * Devovle a diferença de idades entre a instância de Utente e a instância
     * de Utente passada por parametro
     *
     * @param ut2
     * @return
     */
    public int diferencaIdades(Utente ut2) {
        int dif = 0;

        dif = this.idade - ut2.idade;

        return dif;
    }

    /**
     * 
     * Retorna o valor de IMC de Utente
     * 
     * @return 
     */
    public int calcularIMC() {
        return (int) (this.peso / Math.pow(this.altura, 2));
    }

    /**
     * 
     * Retorna uma string com o grau de obesidade de Utente
     * 
     * @return 
     */
    public String grauObesidade() {

        if (calcularIMC() < grauMagro) {
            return "Magro";
        } else {
            if (calcularIMC() >= grauMagro || calcularIMC() <= grauSaudavel) {
                return "Saudável";
            } else {
                if (calcularIMC() > grauSaudavel) {
                    return "Obeso";
                }
            }
        }
        return "";
    }

    /**
     * 
     * Retorna true/false conforme Utente seja saudavel
     * 
     * @return 
     */
    public boolean verificaSaudavel() {
        return grauObesidade().equals("Saudável");
    }

    /**
     * 
     * Verifica se é mais novo do que o Utente passado por parametro.
     * 
     * @param ut2
     * @return 
     */
    public int verificaMaisNovo(Utente ut2) {
        if (this.idade < ut2.idade) {
            return 1;
        } else {
            if (this.idade > ut2.idade) {
                return 2;
            } else {
                if (this.idade == ut2.idade) {
                    return 0;
                }
            }
        }
        return 0;
    }

    /**
     * 
     * Retorna o número de instâncias de Utentes.
     * 
     * @return 
     */
    public static int getNumUtentes() {
        return numUtentes;
    }
}

package org.dei.isep.ipp.pt.pl4_utenteginasio;

public class Utente {

    private String nome;
    private String genero;
    private int idade;
    private double altura;
    private double peso;

    private static final String NOME_POR_OMISSAO = "N/A";
    private static final String GENERO_POR_OMISSAO = "N/A";
    private static final int IDADE_POR_OMISSAO = 0;
    private static final double ALTURA_POR_OMISSAO = 0;
    private static final double PESO_POR_OMISSAO = 0;

    private static int grauMagro=18;
    private static int grauSaudavel=25;
    
    
    private static int numUtentes = 0;

    public Utente() {
        this.nome = NOME_POR_OMISSAO;
        this.genero = GENERO_POR_OMISSAO;
        this.idade = IDADE_POR_OMISSAO;
        this.altura = ALTURA_POR_OMISSAO;
        this.peso = PESO_POR_OMISSAO;
        numUtentes++;
    }

    public Utente(String nome, int idade) {
        this.nome = nome;
        this.genero = GENERO_POR_OMISSAO;
        this.idade = idade;
        this.altura = ALTURA_POR_OMISSAO;
        this.peso = PESO_POR_OMISSAO;
        numUtentes++;
    }

    public Utente(String nome, String genero, int idade, double altura, double peso) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        numUtentes++;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public static void setGrauMagro(int grauMagro) {
        Utente.grauMagro = grauMagro;
    }

    public static void setGrauSaudavel(int grauSaudavel) {
        Utente.grauSaudavel = grauSaudavel;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "\nnome: " + nome + "\ngénero: " + genero + "\nidade: " + idade + "\naltura: " + altura + "\npeso: " + peso;
    }

    public int diferencaIdades(Utente ut2) {
        int dif = 0;

        dif = this.idade - ut2.idade;

        return dif;
    }

    public int calcularIMC() {
        return (int) (this.peso / Math.pow(this.altura, 2));
    }

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

    public boolean verificaSaudavel() {
        return grauObesidade().equals("Saudável");
    }

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

    public static int getNumUtentes() {
        return numUtentes;
    }
}


package org.dei.isep.ipp.pt.pl8_escola;

public class Bolseiro extends Aluno implements Encargos{
     private float valorBolsa;
    
    public Bolseiro(String nome, String email, int nif, int nrMec, float valorBolsa) {
        super(nome, email, nif, nrMec);
        this.valorBolsa = valorBolsa;
    }
    
    public Bolseiro() {
        this("Sem Nome", "Sem E-Mail", 999999999, 1234567, 0f);
    }

    public float getValorBolsa() {
        return valorBolsa;
    }

    public void setValorBolsa(float valorBolsa) {
        this.valorBolsa = valorBolsa;
    }
    
    @Override
    public String toString() {
        return String.format("%sValor Bolsa: %.2f €%n", super.toString(), this.valorBolsa);
    }
    
    @Override
    public float encargo() {
        return this.valorBolsa;
    }
}

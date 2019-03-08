package org.dei.isep.ipp.pt.pl6_impostoextraordinario;

public class Desempregado extends Contribuinte {

    private double outroRendimento;
    private int mesesParagem;
    private double taxaOR = 0.02;

    public Desempregado(String nome, Morada morada, double outroRend, int mesesParagem) {
        super(nome, morada);
        this.outroRendimento = outroRend;
        this.mesesParagem = mesesParagem;
    }

    public double getOutroRendimento() {
        return outroRendimento;
    }

    public double getTaxaOR() {
        return taxaOR;
    }

    public int getMesesParagem() {
        return mesesParagem;
    }

    public void setMesesParagem(int mesesParagem) {
        this.mesesParagem = mesesParagem;
    }
    
    public void setTaxaOR(double taxaOR) {
        this.taxaOR = taxaOR;
    }

    public void setOutroRendimento(double outroRendimento) {
        this.outroRendimento = outroRendimento;
    }

    @Override
    public double calcularTaxa() {
        return taxaOR * this.outroRendimento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMeses de paragem: " + mesesParagem + "\nOutro Rendimento: " + outroRendimento;
    }
}

package org.dei.isep.ipp.pt.pl6_impostoextraordinario;

public class Reformado extends Contribuinte {

    private double rendimentoTrabalho;
    private double outroRendimento;
    private double taxaOR = 0.03;
    private double taxaRT = 0.01;

    public Reformado(String nome, Morada morada, double rendTrabalho, double outroRend) {
        super(nome, morada);
        this.rendimentoTrabalho = rendTrabalho;
        this.outroRendimento = outroRend;
    }

    public double getRendimentoTrabalho() {
        return rendimentoTrabalho;
    }

    public double getOutroRendimento() {
        return outroRendimento;
    }

    public double getTaxaOR() {
        return taxaOR;
    }

    public double getTaxaRT() {
        return taxaRT;
    }

    public void setTaxaOR(double taxaOR) {
        this.taxaOR = taxaOR;
    }

    public void setTaxaRT(double taxaRT) {
        this.taxaRT = taxaRT;
    }

    public void setRendimentoTrabalho(double rendimentoTrabalho) {
        this.rendimentoTrabalho = rendimentoTrabalho;
    }

    public void setOutroRendimento(double outroRendimento) {
        this.outroRendimento = outroRendimento;
    }

    @Override
    public double calcularTaxa() {
        return taxaRT * this.rendimentoTrabalho + taxaOR * this.outroRendimento;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nRendimento Trabalho: " + rendimentoTrabalho + "\nOutro Rendimento: " + outroRendimento;
    }
}

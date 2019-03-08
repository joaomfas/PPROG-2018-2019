package org.dei.isep.ipp.pt.pl6_impostoextraordinario;

public class TrabalhadorContaOutrem extends Contribuinte {

    private double rendimentoTrabalho;
    private double outroRendimento;
    private String empresa;
    private double taxaOR = 0.02;
    private double taxaRT1 = 0.01;
    private double taxaRT2 = 0.02;

    public TrabalhadorContaOutrem(String nome, Morada morada, double rendTrabalho, double outroRend, String empresa) {
        super(nome, morada);
        this.rendimentoTrabalho = rendTrabalho;
        this.outroRendimento = outroRend;
        this.empresa = empresa;
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

    public double getTaxaRT1() {
        return taxaRT1;
    }

    public double getTaxaRT2() {
        return taxaRT2;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    public void setTaxaOR(double taxaOR) {
        this.taxaOR = taxaOR;
    }

    public void setTaxaRT1(double taxaRT1) {
        this.taxaRT1 = taxaRT1;
    }

    public void setTaxaRT2(double taxaRT2) {
        this.taxaRT2 = taxaRT2;
    }

    public void setRendimentoTrabalho(double rendimentoTrabalho) {
        this.rendimentoTrabalho = rendimentoTrabalho;
    }

    public void setOutroRendimento(double outroRendimento) {
        this.outroRendimento = outroRendimento;
    }

    @Override
    public double calcularTaxa() {
        double taxaTotal = 0;

        if (this.rendimentoTrabalho > 30000) {
            taxaTotal = this.rendimentoTrabalho * taxaRT1;
        } else {
            taxaTotal = this.rendimentoTrabalho * taxaRT2;
        }

        taxaTotal += this.outroRendimento * taxaOR;

        return taxaTotal;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEmpresa: " + empresa + "\nRendimento Trabalho: " + rendimentoTrabalho + "\nOutro Rendimento: " + outroRendimento;
    }
}

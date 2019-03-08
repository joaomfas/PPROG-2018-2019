package org.dei.isep.ipp.pt.pl6_impostoextraordinario;

public class TrabalhadorContaPropria extends Contribuinte {

    private double rendimentoTrabalho;
    private double outroRendimento;
    private String profissao;
    private double taxaRT = 0.03;
    private double taxaOR1 = 0.02;
    private double taxaOR2 = 0.05;

    public TrabalhadorContaPropria(String nome, Morada morada, double rendTrabalho, double outroRend, String profissao) {
        super(nome, morada);
        this.rendimentoTrabalho = rendTrabalho;
        this.outroRendimento = outroRend;
        this.profissao = profissao;
    }

    public double getRendimentoTrabalho() {
        return rendimentoTrabalho;
    }

    public double getOutroRendimento() {
        return outroRendimento;
    }

    public double getTaxaRT() {
        return taxaRT;
    }

    public double getTaxaOR1() {
        return taxaOR1;
    }

    public double getTaxaOR2() {
        return taxaOR2;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void setTaxaRT(double taxaRT) {
        this.taxaRT = taxaRT;
    }

    public void setTaxaOR1(double taxaOR1) {
        this.taxaOR1 = taxaOR1;
    }

    public void setTaxaOR2(double taxaOR2) {
        this.taxaOR2 = taxaOR2;
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

        if (this.outroRendimento > 50000) {
            taxaTotal = this.outroRendimento * taxaOR2;
        } else {
            taxaTotal = this.outroRendimento * taxaOR1;
        }

        taxaTotal += this.rendimentoTrabalho * taxaRT;

        return taxaTotal;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProfissão: " + profissao + "\nRendimento Trabalho: " + rendimentoTrabalho + "\nOutro Rendimento: " + outroRendimento;
    }
}

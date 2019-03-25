package org.dei.isep.ipp.pt.pl8_escola;

public class Aluno extends Pessoa{
     /**
     * Número Mecanográfico do Aluno
     */
    private int nrMec;
    
    public Aluno(String nome, String email, int nif, int nrMec) {
        super(nome, email, nif);
        this.nrMec=nrMec;
    }
    
    public Aluno() {
        this("Sem Nome", "Sem E-Mail", 999999999, 1234567);
    }

    public int getNrMec() {
        return nrMec;
    }

    public void setNrMec(int nrMec) {
        this.nrMec = nrMec;
    }

    @Override
    public String toString() {
        return String.format("ALUNO%n%s%nNr. Mecanográfico: %d%n", super.toString(), this.nrMec);
    }
}

package app.exceptions;

/**
 * Exceção lançada quando da criação de uma instância de Disponibilidade
 * é enviado ao construtor duas Datas/Tempos invalidos
 * 
 */
public class PeriodoInvalido extends IllegalArgumentException{
    /**
      * Constrói uma PeriodoInvalidoException com a mensagem "Peridodo indicado é inválido!!".
     */    
    public PeriodoInvalido() {
        super("Peridodo indicado é inválido!!");
    }
    
    /**
     * Constrói uma PeriodoInvalidoException contendo a mensagem recebida.
     * 
     * @param mensagem a mensagem transmitida pela exceção
     */
    public PeriodoInvalido(String mensagem) {
        super(mensagem);
    }
}

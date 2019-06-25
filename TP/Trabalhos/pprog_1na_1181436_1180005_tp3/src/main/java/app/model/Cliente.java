package app.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 *
 */
public class Cliente implements Serializable {

    private String nome;
    private String NIF;
    private String telefone;
    private String email;
    private ListaEnderecoPostal listaMoradas = new ListaEnderecoPostal();

    /**
     *
     * Cria uma instância de Cliente com Morada
     *
     * @param strNome Nome do Cliente
     * @param strNIF NIF do Cliente
     * @param strTelefone Telefone do Cliente
     * @param strEmail Email do Cliente
     * @param oMorada Morada do Cliente
     */
    public Cliente(String strNome, String strNIF, String strTelefone, String strEmail, EnderecoPostal oMorada) {
        if ((strNome == null) || (strNIF == null) || (strTelefone == null)
                || (strEmail == null) || (oMorada == null)
                || (strNome.isEmpty()) || (strNIF.isEmpty()) || (strTelefone.isEmpty())
                || (strEmail.isEmpty())) {
            throw new IllegalArgumentException("Nenhum dos argumentos pode ser nulo ou vazio.");
        }

        this.nome = strNome;
        this.email = strEmail;
        this.NIF = strNIF;
        this.telefone = strTelefone;
        listaMoradas.addEnderecoPostal(oMorada);
    }

    /**
     *
     * Cria uma instância de Cliente sem Morada
     *
     * @param strNome Nome do Cliente
     * @param strNIF NIF do Cliente
     * @param strTelefone Telefone do Cliente
     * @param strEmail Email do Cliente
     */
    public Cliente(String strNome, String strNIF, String strTelefone, String strEmail) {
        if ((strNome == null) || (strNIF == null) || (strTelefone == null)
                || (strEmail == null)
                || (strNome.isEmpty()) || (strNIF.isEmpty()) || (strTelefone.isEmpty())
                || (strEmail.isEmpty())) {
            throw new IllegalArgumentException("Nenhum dos argumentos pode ser nulo ou vazio.");
        }

        this.nome = strNome;
        this.email = strEmail;
        this.NIF = strNIF;
        this.telefone = strTelefone;
    }

    /**
     *
     * Retorna o nome do Cliente
     *
     * @return Nome do Cliente
     */
    public String getNome() {
        return this.nome;
    }

    /**
     *
     * Retorna o email do Cliente
     *
     * @return Email do Cliente
     */
    public String getEmail() {
        return this.email;
    }

    /**
     *
     * Verifica se o Cliente tem um determinado email
     *
     * @param strEmail Email a analisar
     * @return True/false conforme se verifique ou não
     */
    public boolean hasEmail(String strEmail) {
        return this.email.equalsIgnoreCase(strEmail);
    }

    /**
     *
     * Adiciona um endereço postal ao Cliente
     *
     * @param oMorada Endereço Postal a adicionar
     * @return Retorna true/false confornme o sucesso/insucesso da operação
     */
    public boolean addEnderecoPostal(EnderecoPostal oMorada) {
        return this.listaMoradas.addEnderecoPostal(oMorada);
    }

    /**
     *
     * Remove um endereço postal ao Cliente
     *
     * @param oMorada Endereço Postal a remover
     * @return Retorna true/false confornme o sucesso/insucesso da operação
     */
    public boolean removeEnderecoPostal(EnderecoPostal oMorada) {
        return this.listaMoradas.removeEnderecoPostal(oMorada);
    }

    /**
     * 
     * Retorna os endereços postais do Cliente
     * 
     * @return Endereços postais do Cliente
     */
    public List<EnderecoPostal> getEnderecosPostais() {
        return listaMoradas.getEnderecosPostais();
    }

    /**
     * 
     * Compara dois clientes
     * 
     * @param o Cliente a comparar
     * @return Retorna true/false conforme dois Cliente são iguais ou não
     */
    @Override
    public boolean equals(Object o) {
        // Inspirado em https://www.sitepoint.com/implement-javas-equals-method-correctly/

        // self check
        if (this == o) {
            return true;
        }
        // null check
        if (o == null) {
            return false;
        }
        // type check and cast
        if (getClass() != o.getClass()) {
            return false;
        }
        // field comparison
        Cliente obj = (Cliente) o;
        return (Objects.equals(email, obj.email) || Objects.equals(NIF, obj.NIF));
    }

    /**
     * 
     * Retorna os dados do Cliente
     * 
     * @return Dados do Cliente
     */
    @Override
    public String toString() {
        return this.email;
    }

}

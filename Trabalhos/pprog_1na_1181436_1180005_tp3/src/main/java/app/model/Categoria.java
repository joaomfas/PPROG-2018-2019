package app.model;

import java.io.Serializable;
import java.util.Objects;

public class Categoria implements Serializable{

    private String codId;
    private String descricao;

    /**
     * 
     * Cria uma instância de Categoria
     * 
     * @param strCodigo Código da categoria
     * @param strDescricao Descrição da categoria
     */
    public Categoria(String strCodigo, String strDescricao) {
        if ((strCodigo == null) || (strDescricao == null)
                || (strCodigo.isEmpty()) || (strDescricao.isEmpty())) {
            throw new IllegalArgumentException("Nenhum dos argumentos pode ser nulo ou vazio.");
        }

        this.codId = strCodigo;
        this.descricao = strDescricao;
    }

    /**
     * 
     * Devolve o código da categoria
     * 
     * @return Código da cateogira
     */
    public String getCodigo() {
        return this.codId;
    }

     /**
     * 
     * Verifica se a categoria tem um determinado código
     * 
     * @param strCod Código a determinar se pertence à categoria
     * @return Retorna True/False conforme se verifique ou não
     */
    public boolean hasCodigo(String strCod) {
        return this.codId.equalsIgnoreCase(strCod);
    }

    /**
     * 
     * Verifica se duas categorias são iguais
     * 
     * @param o Categoria a comparar
     * @return True/False conforme se verifique a igualdade ou não
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
        Categoria obj = (Categoria) o;
        return (Objects.equals(codId, obj.codId));
    }

    /**
     * 
     * Retorna as informações da categoria
     * 
     * @return Informações da categoria
     */
    @Override
    public String toString() {
        return String.format("%s - %s ", this.codId, this.descricao);
    }
}

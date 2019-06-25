package app.model;

public class Administrativo {

    private String name;
    private String email;

    /**
     *
     * Cria uma instância de Administrativo
     *
     * @param name Nome do Administrativo
     * @param email Email do Administrativo
     */
    public Administrativo(String name, String email) {
        this.name = name;
        this.email = email;
    }

    /**
     *
     * Retorna o nome do Administrativo
     *
     * @return Nome do Administrativo
     */
    public String getName() {
        return name;
    }

    /**
     *
     * Retorna o email do Administrativo
     *
     * @return Email do Administrativo
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * Define o nome do Administrativo
     *
     * @param name Nome do Aministrativo a definir
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * Define o email do Administrativo
     *
     * @param email Email do Administrativo a definir
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * Retorna uma String com os dados do Administrativo
     * 
     * @return Dados do Administrativo
     */
    @Override
    public String toString() {
        return this.email;
    }

}

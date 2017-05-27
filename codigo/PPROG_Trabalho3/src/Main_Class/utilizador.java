package Main_Class;

import java.io.Serializable;

/**
 *
 * @author Marco
 */
public class utilizador implements Serializable {

    private String nome;
    private String email;
    private String username;
    private String password;

    /**
     * construtor com parametros para inciar o objecto utilizador
     *
     * @param nome nome
     * @param email email
     * @param username username
     * @param password password
     */
    public utilizador(String nome, String email, String username, String password) {
        this.nome = nome;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    /**
     * construtor sem parametros para inciar o objecto utilizador
     */
    public utilizador() {
    }

    /**
     * get nome do utilizador
     *
     * @return nome
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * set nome do utilizador
     *
     * @param nome nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * get o email do utilizador
     *
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * set email do utilizador
     *
     * @param email email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * get username do utilizador
     *
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * set ao username do utilizador
     *
     * @param username username
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     * devolve a password do utilizador metodo utilizado pela escrita para txt
     * @return password
     */
    public String getPassword() {
        return this.password;
    }
    
    /**
     * faz set à password do utilizador, utilizado para a leitura de txt
     * @param password password
     */
    public void setPassword (String password){
        this.password = password;
    }

    @Override
    public String toString() {
        return "Utilizador " + "Nome:" + nome + "; Email:" + email + "; Username: " + username;
    }


    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || getClass() != outroObjeto.getClass()) {
            return false;
        }
        utilizador outroUtilizador = (utilizador) outroObjeto;
        return this.getUsername().equalsIgnoreCase(outroUtilizador.getUsername())
                && this.getEmail().equalsIgnoreCase(outroUtilizador.getEmail());
    }


}

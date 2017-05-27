package Main_Class;

import java.io.Serializable;

/**
 *
 * @author Marco
 */
public class fae implements Serializable {

    private utilizador user;

    /**
     * construtor sem parametros para a criação do objecto FAE
     */
    public fae() {
    }

    /**
     * construtor com parametros que recebe um utilizador
     * @param user
     */
    public fae(utilizador user) {
        this.user = user;
    }

    /**
     * devolve o utilizador que compoe o fae
     * @return
     */
    public utilizador getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "::FAE::" + "user=" + user + '}';
    }

    /**
     * devolve o fae e o username do fae
     * @return
     */
    public String toStringUsername() {
        return "::FAE::" + " Username=" + user.getUsername();
    }

    /**
     * devolve apenas o nome do username do fae
     * @return
     */
    public String toStringNome() {
        return user.getNome();
    }

    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || getClass() != outroObjeto.getClass()) {
            return false;
        }
        fae outroFAE = (fae) outroObjeto;
        return this.user.equals(outroFAE.user);
    }
}

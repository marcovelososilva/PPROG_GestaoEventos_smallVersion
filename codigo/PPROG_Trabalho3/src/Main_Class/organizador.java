package Main_Class;

import java.io.Serializable;

/**
 *
 * @author Marco
 */
public class organizador implements Serializable {

    utilizador user;

    /**
     * construtor do metodo organizador com parametros um utilizador
     * @param user
     */
    public organizador(utilizador user) {
        this.user = user;
    }

    /**
     * devolve o utilizador que está contido no organizador
     * @return
     */
    public utilizador getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "::ORGANIZADOR:: Username=" + user.getUsername();
    }

    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || getClass() != outroObjeto.getClass()) {
            return false;
        }
        organizador outroOrganizador = (organizador) outroObjeto;
        return this.user.equals(outroOrganizador.user);
    }

}

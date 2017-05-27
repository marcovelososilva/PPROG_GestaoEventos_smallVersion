package Main_Class;

import java.io.Serializable;

/**
 *
 * @author Marco
 */
public class gestorDeEventos implements Serializable {

    private final utilizador user;

    /**
     *contrutor com parametros do gestor de eventos
     * recebe um utilizador
     * @param user utilizador
     */
    public gestorDeEventos(utilizador user) {
        this.user = user;
    }

    /**
     * devolde o utilizador contido no gestor de eventos
     * @return utilizador
     */
    public utilizador getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "::Gestor de Eventos:: Username=" + user.getUsername();
    }

    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || getClass() != outroObjeto.getClass()) {
            return false;
        }
        gestorDeEventos outroGestorEventos = (gestorDeEventos) outroObjeto;
        return this.user.getUsername().equalsIgnoreCase(outroGestorEventos.user.getUsername());
    }

}

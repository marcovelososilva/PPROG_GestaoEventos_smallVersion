package Main_Class;

import java.io.Serializable;


public class gestorDeEventos implements Serializable{
    
    private utilizador user;
    
    public gestorDeEventos(utilizador user) {
        this.user = user;
    }

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
        return  this.user.getUsername().equalsIgnoreCase(outroGestorEventos.user.getUsername()) &&
                this.user.getPassword().equalsIgnoreCase(outroGestorEventos.user.getPassword());
    }
    
    
}
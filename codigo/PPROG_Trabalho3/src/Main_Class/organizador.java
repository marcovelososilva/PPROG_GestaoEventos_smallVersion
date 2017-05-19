package Main_Class;

import java.io.Serializable;

public class organizador implements Serializable{
    
    utilizador user;

    public organizador(utilizador user) {
        this.user = user;
    }

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
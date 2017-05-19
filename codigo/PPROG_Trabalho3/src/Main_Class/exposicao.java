package Main_Class;

import java.io.Serializable;

public class exposicao implements EventType, Serializable{

    public exposicao() {
    }

    @Override
    public String toString() {
        return "exposicao";
    }

    @Override
    public String toStringNomeTipo() {
         return "exposicao";
    }

    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || getClass() != outroObjeto.getClass()) {
            return false;
        }
        EventType outraExposicao = (EventType) outroObjeto;
        return this.toString().equalsIgnoreCase(outraExposicao.toString());
    }
}
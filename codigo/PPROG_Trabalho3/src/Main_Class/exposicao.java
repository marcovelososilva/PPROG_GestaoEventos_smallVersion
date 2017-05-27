package Main_Class;

import java.io.Serializable;

/**
 *
 * @author Marco
 */
public class exposicao implements EventType, Serializable {

    /**
     *construtor do objecto exposicao sem parametros
     */
    public exposicao() {
    }

    @Override
    public String toString() {
        return "exposicao";
    }

    /**
     * devolve uma string com o nome da classe
     * @return
     */
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

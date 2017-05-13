package Main_Class;

public class exposicao implements EventType {

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
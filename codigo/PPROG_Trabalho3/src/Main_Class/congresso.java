package Main_Class;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marco
 */
public class congresso implements EventType, Serializable {

    private List<workshop> listaWorshops;

    /**
     * construtor de um confgresso sem parametros que inicaliza um array list
     * para guardar a lista de workshops
     */
    public void congresso() {
        listaWorshops = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "congresso{" + "listaWorshops=" + listaWorshops + '}';
    }

    /**
     * devolve o nome da classe
     * @return
     */
    @Override
    public String toStringNomeTipo() {
        return "congresso";
    }

}

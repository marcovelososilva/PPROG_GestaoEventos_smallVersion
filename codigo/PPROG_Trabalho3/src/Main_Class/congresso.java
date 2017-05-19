package Main_Class;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class congresso implements EventType, Serializable{

        private List <workshop> listaWorshops;
    
    	public void congresso() {
            listaWorshops = new ArrayList<>();
	}

        /**
	 * 
	 * @param w
	 */
	public void addWorkshop(workshop w) {
		// TODO - implement congresso.addWorkshop
		throw new UnsupportedOperationException();
	}


	/**
	 * 
	 * @param w
	 */
	public void registaWorkshop(workshop w) {
		// TODO - implement congresso.registaWorkshop
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param e
	 */
	public void selectCongresso(evento e) {
		// TODO - implement congresso.selectCongresso
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param w
	 */
	public void validaWorkshop(workshop w) {
		// TODO - implement congresso.validaWorkshop
		throw new UnsupportedOperationException();
	}

    @Override
    public String toString() {
        return "congresso{" + "listaWorshops=" + listaWorshops + '}';
    }

    @Override
    public String toStringNomeTipo() {
        return "congresso";
    }

}
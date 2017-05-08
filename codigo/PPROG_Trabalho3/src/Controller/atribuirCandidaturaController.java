package Controller;

import Main_Class.centroDeEventos;
import java.util.ArrayList;
import Main_Class.evento;
import java.util.List;

public class atribuirCandidaturaController {
    private final centroDeEventos ce;
    
    public atribuirCandidaturaController(centroDeEventos ce) {
        this.ce = ce;
    }

	/**
	 * 
	 * @param e
	 */
	public List getAlgoritmosAtribuicao(evento e) {
            return ce.getAlgoritmosAtribuicao();
	}

	/**
         * 
         * @param e
         * @return 
         */
	public List getListaFAE(evento e) {
            return e.getListaFAE();
	}

	/**
	 * 
	 * @param e
	 */
	public List getListaCandidatura(evento e) {
            return e.getListaCandidatura();
	}

	/**
	 * 
	 * @param listAlg
	 * @param listFAE
	 * @param listCand
	 */
	public void executeAlgoritmo(ArrayList listAlg, ArrayList listFAE, ArrayList listCand) {
		// TODO - implement atribuirCandidaturaController.executeAlgoritmo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param la
	 */
	public void registaAlteracoes(ArrayList la) {
		// TODO - implement atribuirCandidaturaController.registaAlteracoes
		throw new UnsupportedOperationException();
	}

    public List getListaEventosDataSubmissaoCaducada() {
        return ce.getListaEventosOrganizadorDataSubmissaoFinalizada();
    }
    
    public List criarAtribuicao(int numAtribuicoes, evento e) {
	return 	e.novasAtribuicoesSegundoNumFAES(numAtribuicoes);
    }

}
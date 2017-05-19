package Controller;

import Main_Class.centroDeEventos;
import java.util.ArrayList;
import Main_Class.evento;
import Main_Class.organizador;
import java.util.List;

public class atribuirCandidaturaController {

    private final centroDeEventos ce;
    private organizador org;

    public atribuirCandidaturaController(centroDeEventos ce) {
        this.ce = ce;
    }

    /**
     *
     * @param e
     */
    public List getAlgoritmosAtribuicao() {
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

        public List<organizador> getListaOrganizadorUnicosDosEventos() {
        List<organizador> listaorganizador = new ArrayList<>();
        List<evento> listaEventos = ce.getListaEvento();
        for (evento ev: listaEventos){
            List<organizador> listaFAEEvento = ev.getListaOrganizadores();
                for (organizador org: listaFAEEvento){
                    if (!listaorganizador.contains(org)) listaorganizador.add(org);
                }
        } 
        return listaorganizador;
    }
    
    
    public List getListaEventosOrganizadorDataSubmissaoFinalizada(organizador org) {
        return ce.getListaEventosOrganizadorDataSubmissaoFinalizada(org);
    }
//    public List criarAtribuicao(int numAtribuicoes, evento e) {
//	return 	e.novasAtribuicoesSegundoNumFAES(numAtribuicoes);
//    }

    public List getListaAtribuicoes(evento e) {
        return e.getListaAtribuicoes();
    }

}

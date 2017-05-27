package Controller;

import Main_Class.centroDeEventos;
import java.util.ArrayList;
import Main_Class.evento;
import Main_Class.organizador;
import Utils.Data;
import java.util.List;

/**
 *
 * @author Marco
 */
public class atribuirCandidaturaController {

    private final centroDeEventos ce;

    /**
     * contrunstor do metodo atribuir candidatura controller
     * @param ce centro de evento
     */
    public atribuirCandidaturaController(centroDeEventos ce) {
        this.ce = ce;
    }

    /**
     *  get algoritmos de atribuicao do centro de eventos
     * @return a lista de algoritmos de atribuição
     */
    public List getAlgoritmosAtribuicao() {
        return ce.getAlgoritmosAtribuicao();
    }

    /**
     * get da lista de FAEs de um evento que recebe por parametro
     *@param e- evento - evento
     * @return List  - FAEs
     */
    public List getListaFAE(evento e) {
        return e.getListaFAE();
    }

    /**
     * get lista de candidaturas de um evento que recebe por parametro
     *@param e- evento
     * @return List - candidaturas
     */
    public List getListaCandidatura(evento e) {
        return e.getListaCandidatura();
    }

    /**
     * metodo que devolve a lista de organizadores unicos que tem eventos de 
     * com submissao caducada
     * @return List - organizadores
     */
    public List<organizador> getListaOrganizadorUnicosComEventosComDataSubmissaoCaducada() {
        List<organizador> listaorganizador = new ArrayList<>();
        List<evento> listaEventos = ce.getListaEvento();
        for (evento ev : listaEventos) {
            Data hoje = Data.dataAtual();
            if ((ev.getDataLimiteSubmissaoCandidaturas().compareTo(hoje)) < 0 && ev.getDataFim().compareTo(hoje) > 0 && ev.getListaAtribuicoes().isEmpty()) {
                List<organizador> listaOrgEvento = ev.getListaOrganizadores();
                for (organizador org : listaOrgEvento) {
                    if (!listaorganizador.contains(org)) {
                        listaorganizador.add(org);
                    }
                }
            }
        }
        return listaorganizador;
    }
        
    /**
     * get lista que o centro de eventos devolve de eventos de um determinado organizador
     * enviado como parametro com a data de submissao finalizada
     * @param org organizador
     * @return lista de eventos do organizador com submissao finalizada
     */
    public List getListaEventosOrganizadorDataSubmissaoFinalizada(organizador org) {
        return ce.getListaEventosOrganizadorDataSubmissaoFinalizada(org);
    }

    /**
     *get lista de atribuições que um determinado evento tem
     * 
     *@param e- evento
     * @return List - atribuições
     */
    public List getListaAtribuicoes(evento e) {
        return e.getListaAtribuicoes();
    }

}

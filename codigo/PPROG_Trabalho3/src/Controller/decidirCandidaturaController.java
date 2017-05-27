package Controller;

import Main_Class.*;
import Utils.Data;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marco
 */
public class decidirCandidaturaController {

    private final centroDeEventos ce;
    private decisao decisaoCandidatura;
            
    /**
     * construtor da classe decidir candidatura recebe como parametroo centro de eventos
     * @param ce
     */
    public decidirCandidaturaController(centroDeEventos ce) {
        this.ce = ce;
    }


    /**
     * get lista de FAE unicos que existem nos eventos que tem a data de submissão caducada e com atribuicao efectuada
     * @return 
     */
    public List<fae> getListaFAEUnicosDosEventosComDataSubmissaoCaducadaEAtribuicaoEfectuada() {
        List<fae> listaFAE = new ArrayList<>();
        List<evento> listaEventos = ce.getListaEvento();
        for (evento ev : listaEventos) {
            Data hoje = Data.dataAtual();
            if ((ev.getDataLimiteSubmissaoCandidaturas().compareTo(hoje)) < 0 && ev.getDataFim().compareTo(hoje) > 0
                    && ev.getListaAtribuicoes().size()>0){
                List<fae> listaFAEEvento = ev.getListaFAE();
                for (fae f : listaFAEEvento) {
                    if (!listaFAE.contains(f)) {
                        listaFAE.add(f);
                    }
                }
            }
        }
        return listaFAE;
    }

    /**
     * get lista de eventos dos organizadores com data de submissao finalizada 
     * que é devolida do centro de evento
     * @param org
     * @return
     */
    public List getListaEventosOrganizadorDataSubmissaoFinalizada(organizador org) {
        return ce.getListaEventosOrganizadorDataSubmissaoFinalizada(org);
    }
    
    /**
     * get a lista de eventos de um fae com a dta de submissao finalizada de um 
     * determindado fae enviado por parametro
     * @param f
     * @return
     */
    public List getListaEventosFAEDataSubmissaoFinalizada(fae f){
        return ce.getListaEventosFAEDataSubmissaoFinalizada(f);
    }
    
    /**
     * seleciona uma candidatura e cria uma decisao
     * @param cand
     * @return
     */
    public decisao selecionarCandidaturaCriaDecisao(candidatura cand) {
        return cand.selecionaCandidaturaCriaDecisao();
    }

    /**
     * devolve a lista de candidaturas que existe num evento que foi enviado
     * como parametro
     * @param e
     * @return
     */
    public List getListaCandidatura(evento e){
        return e.getListaCandidatura();
    }
    
    /**
     * devolve se uma candidatura tem decisao
     * @param cand
     * @return
     */
    public boolean temDecisao(candidatura cand){
        return decisaoCandidatura.isAprovada();
    } 
    /**
     * set a uma decisao previamente criada
     * @param d
     * @param aprovacao
     * @param textoDecisao
     * @param f
     */
    public void setDecisao(decisao d,boolean aprovacao, String textoDecisao, fae f ) {
        d.setAprovada(aprovacao);
        d.setTextoDecisao(textoDecisao);
        d.setFaeAtribuido(f);
    }


}

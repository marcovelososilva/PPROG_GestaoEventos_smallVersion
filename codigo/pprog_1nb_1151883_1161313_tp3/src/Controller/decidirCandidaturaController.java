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
     * @param ce - centro de eventos
     */
    public decidirCandidaturaController(centroDeEventos ce) {
        this.ce = ce;
    }


    /**
     * get lista de FAE unicos que existem nos eventos que tem a data de submissão caducada e com atribuicao efectuada
     * @return lista de FAEs
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
     * get a lista de eventos de um fae com a dta de submissao finalizada de um 
     * determindado fae enviado por parametro
     * @param f - fae
     * @return lista de eventos de fae com data de submissao finalizada
     */
    public List getListaEventosFAEDataSubmissaoFinalizada(fae f){
        return ce.getListaEventosFAEDataSubmissaoFinalizada(f);
    }
    
    /**
     * seleciona uma candidatura e cria uma decisao
     * @param cand - candidatura
     * @return decisao criada
     */
    public decisao selecionarCandidaturaCriaDecisao(candidatura cand) {
        return cand.selecionaCandidaturaCriaDecisao();
    }

    /**
     * devolve a lista de candidaturas que existe num evento que foi enviado
     * como parametro
     * @param e - evento
     * @return lista de candidaturas
     */
    public List getListaCandidatura(evento e){
        return e.getListaCandidatura();
    }
    
    /**
     * devolve se uma candidatura tem decisao
     * @param cand - candidatura
     * @return boolean se a candidatura tem decisao ou não
     */
    public boolean temDecisao(candidatura cand){
        return decisaoCandidatura.isAprovada();
    } 
    /**
     * set a uma decisao previamente criada
     * @param d - decisao
     * @param aprovacao - aprovacao
     * @param textoDecisao - texto desicao
     * @param f - fae
     */
    public void setDecisao(decisao d,boolean aprovacao, String textoDecisao, fae f ) {
        d.setAprovada(aprovacao);
        d.setTextoDecisao(textoDecisao);
        d.setFaeAtribuido(f);
    }


}

package Controller;

import Main_Class.*;
import Utils.Data;
import java.util.ArrayList;
import java.util.List;

public class decidirCandidaturaController {

    private centroDeEventos ce;
    private evento eventoSelecionado;
    private candidatura candidaturaSelecionada;
    private decisao decisaoCandidatura;
    private List<fae> listaFAEEvento;
    private fae f;
            
    public decidirCandidaturaController(centroDeEventos ce) {
        this.ce = ce;
    }


    /**
     *
     * @param u
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

    public List getListaEventosOrganizadorDataSubmissaoFinalizada(organizador org) {
        return ce.getListaEventosOrganizadorDataSubmissaoFinalizada(org);
    }
    
    public List getListaEventosFAEDataSubmissaoFinalizada(fae f){
        return ce.getListaEventosFAEDataSubmissaoFinalizada(f);
    }
    
    /**
     *
     * @param e
     * @param u
     */
    public void selecionaEvento(evento e, utilizador u) {
        // TODO - implement decidirCandidaturaController.selecionaEvento
        throw new UnsupportedOperationException();
    }

    public decisao selecionarCandidaturaCriaDecisao(candidatura cand) {
        this.candidaturaSelecionada = cand;
        decisaoCandidatura = cand.selecionaCandidaturaCriaDecisao();
        return decisaoCandidatura;
    }

    //deixa de existir 
//    public void createDecisao() {
//        // TODO - implement decidirCandidaturaController.createDecisao
//        throw new UnsupportedOperationException();
//    }
    
    public List getListaCandidatura(evento e){
        return e.getListaCandidatura();
    }
    
    public boolean temDecisao(candidatura cand){
        boolean ok = decisaoCandidatura.isAprovada();
        return ok;
    } 
    /**
     *
     * @param d
     * @param txt
     */
    public void setDecisao(decisao d,boolean aprovacao, String textoDecisao) {
        d.setAprovada(aprovacao);
        d.setTextoDecisao(textoDecisao);
    }

    /**
     *
     * @param d
     */
    public void gravarDecisao(decisao d) {
        // TODO - implement decidirCandidaturaController.gravarDecisao
        throw new UnsupportedOperationException();
    }

}

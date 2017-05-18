package Controller;

import Main_Class.*;
import java.util.ArrayList;
import java.util.List;

public class decidirCandidaturaController {

    private centroDeEventos ce;
    private evento eventoSelecionado;
    private candidatura candidaturaSelecionada;
    private decisao decisaoCandidatura;
    private List<fae> listaFAEEvento;
            
    public decidirCandidaturaController(centroDeEventos ce) {
        this.ce = ce;
    }


    /**
     *
     * @param u
     * @return 
     */
    public List<fae> getListaEventosFAE() {
        List<fae> listaFAE = new ArrayList<>();
        List<evento> listaEventos = ce.getListaEvento();
        for (evento ev: listaEventos){
            List<fae> listaFAEEvento = ev.getListaFAE();
                for (fae f: listaFAEEvento){
                    if (!listaFAE.contains(f)) listaFAE.add(f);
                }
        } 
        System.out.println("espaco"+listaFAE.size());
        return listaFAE;
    }

    public List getListaEventosOrganizadorDataSubmissaoFinalizada() {
        return ce.getListaEventosOrganizadorDataSubmissaoFinalizada();
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

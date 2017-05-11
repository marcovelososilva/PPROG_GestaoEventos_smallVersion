package Controller;

import Main_Class.*;
import java.util.List;

public class decidirCandidaturaController {

    private centroDeEventos ce;
    private evento eventoSelecionado;
    private candidatura candidaturaSelecionada;
    private decisao decisaoCandidatura;
    
    public decidirCandidaturaController(centroDeEventos ce) {
        this.ce = ce;
    }


    /**
     *
     * @param u
     */
    public void getListaEventosFAE(utilizador u) {
        // TODO - implement decidirCandidaturaController.getListaEventosFAE
        throw new UnsupportedOperationException();
    }

    public List getListaEventosSubmissaoActiva() {
        return ce.getListaEventosSubmissaoActiva();
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
        candidaturaSelecionada = cand;
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

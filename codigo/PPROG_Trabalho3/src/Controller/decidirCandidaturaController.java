package Controller;

import Main_Class.*;
import Utils.Data;
import java.util.ArrayList;
import java.util.List;

public class decidirCandidaturaController {

    private centroDeEventos ce;
    private decisao decisaoCandidatura;
            
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
    

    public decisao selecionarCandidaturaCriaDecisao(candidatura cand) {
        return cand.selecionaCandidaturaCriaDecisao();
    }

    
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
    public void setDecisao(decisao d,boolean aprovacao, String textoDecisao, fae f ) {
        d.setAprovada(aprovacao);
        d.setTextoDecisao(textoDecisao);
        d.setFaeAtribuido(f);
    }


}

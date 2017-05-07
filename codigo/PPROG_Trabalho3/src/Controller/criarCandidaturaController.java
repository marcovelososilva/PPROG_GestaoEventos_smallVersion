package Controller;

import Main_Class.*;
import java.util.List;

public class criarCandidaturaController {

    private centroDeEventos ce;
    private evento eventoSelecionado;
    private candidatura candidaturaEvento;

    private String nomeEmpresa;
    private String responsavelCandidatura;
    private String morada;
    private int telefone;
    private String textoExplicativoCandidatura;

    public criarCandidaturaController(centroDeEventos ce) {
        this.ce = ce;
    }

    /**
     * pedir ao Centro de Eventos que me envie a lista de eventos para os quais
     * se pode fazer a candidatura;
     *
     * @return LIST com todos os eventos que à data de hoje ainda não caducou a
     * data de submissão.
     */
    public List getListaEventosSubmissaoActiva() {
        return ce.getListaEventosSubmissaoActiva();
    }

    /**
     *
     * @param e
     */
    public candidatura selecionarEvento(evento e) {
        eventoSelecionado = e;
        candidaturaEvento = e.selecionaEventoCriaCandidatura();
        return candidaturaEvento;
    }

    /**
     *
     * @param dados
     */
    public void setDadosCandidatura(String nomeEmpresa, String responsavelCandidatura, String morada, int telefone, String textoExplicativoCandidatura) {
        candidaturaEvento.setNomeEmpresa(nomeEmpresa);
        candidaturaEvento.setResponsavelCandidatura(responsavelCandidatura);
        candidaturaEvento.setMorada(morada);
        candidaturaEvento.setTelefone(telefone);
        candidaturaEvento.setTextoExplicativoCandidatura(textoExplicativoCandidatura);
    }

    public void validaDados() {
        candidaturaEvento.validaDadosCandidatura();
    }

    /**
     * validação global da candidatura a ver se já não existe uma igual
     *
     * @param c - candidatura
     */
    public boolean validaCandidatura(candidatura c) {
        return eventoSelecionado.validaCandidatura(c);
    }

    /**
     *
     * @param c
     */
    public boolean registaCandidatura(candidatura c) {
        return eventoSelecionado.registaCandidatura(c);
    }
}

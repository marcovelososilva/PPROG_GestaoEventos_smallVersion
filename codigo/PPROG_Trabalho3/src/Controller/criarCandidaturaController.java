package Controller;

import Main_Class.*;
import Utils.Data;
import java.util.List;

/**
 *
 * @author Marco
 */
public class criarCandidaturaController {

    private centroDeEventos ce;
    private evento eventoSelecionado;
    private candidatura candidaturaEvento;

    /**
     *
     * @param ce
     */
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
     * recebe um evento e cria uma candidatura par ao mesmo devolvendo a candidatura
     * @param e
     * @return 
     */
    public candidatura selecionarEvento(evento e) {
        eventoSelecionado = e;
        candidaturaEvento = e.selecionaEventoCriaCandidatura();
        return candidaturaEvento;
    }
    
    /**
     * set dados a uma candiadtura préviamente criada
     * @param nomeEmpresa
     * @param responsavelCandidatura
     * @param morada
     * @param telefone
     * @param textoExplicativoCandidatura 
     */
    public void setDadosCandidatura(String nomeEmpresa, String responsavelCandidatura, String morada, int telefone, String textoExplicativoCandidatura) {
        candidaturaEvento.setNomeEmpresa(nomeEmpresa);
        candidaturaEvento.setResponsavelCandidatura(responsavelCandidatura);
        candidaturaEvento.setMorada(morada);
        candidaturaEvento.setTelefone(telefone);
        candidaturaEvento.setTextoExplicativoCandidatura(textoExplicativoCandidatura);
        candidaturaEvento.setDataCandidatura(Data.dataAtual());
    }

    /**
     * validação global da candidatura a ver se já não existe uma igual
     *
     * @param c
     * @return BOOLEAN informa se a operação foi efectuada com sucesso
     */
    public boolean validaCandidatura(candidatura c) {
        return eventoSelecionado.validaCandidatura(c);
    }

    /**
     * Método que recebe um candidatura e vai á classe evento fazer uma validação global e adicionar à
     * respectiva lista correspondente, devolve TRUE se a operação for efectuada com sucesso;
     * 
     * @param c
     * @return BOOLEAN informando se a operação foi efectuada com sucesso
     */
    public boolean registaCandidatura(candidatura c) {
        return eventoSelecionado.registaCandidatura(c);
    }
}

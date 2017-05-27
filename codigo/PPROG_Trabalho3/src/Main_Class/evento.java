package Main_Class;

import java.util.ArrayList;
import java.util.List;
import Utils.*;
import java.io.Serializable;

/**
 *
 * @author Marco
 */
public class evento implements Serializable {

    private String titulo;
    private String textoDescritivo;
    private Data dataInicio;
    private Data dataFim;
    private String local;
    private Data dataLimiteSubmissaoCandidaturas;
    private final List<fae> listaFAE;
    private final List<organizador> listaOrganizadores;
    private final List<atribuicao> listaAtribuicao;
    private final List<candidatura> listaCandidaturas;
    private EventType tipo;

    /**
     * construtor com parametros:
     * titulo, texto descritivo, data de inicio data de fim local data limite de submissao de candidaturas e o tipo  do evento
     * @param titulo titulo
     * @param textoDescritivo texto descritivo
     * @param dataInicio data de inicio
     * @param dataFim data de fim
     * @param local local
     * @param dataLimiteSubmissaoCandidaturas data limite submissao candidatura
     * @param tipo tipo
     */
    public evento(String titulo, String textoDescritivo, Data dataInicio, Data dataFim, String local, Data dataLimiteSubmissaoCandidaturas, EventType tipo) {
        this.titulo = titulo;
        this.textoDescritivo = textoDescritivo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.local = local;
        this.dataLimiteSubmissaoCandidaturas = dataLimiteSubmissaoCandidaturas;
        this.tipo = tipo;
        listaFAE = new ArrayList<>();
        listaOrganizadores = new ArrayList<>();
        listaAtribuicao = new ArrayList<>();
        listaCandidaturas = new ArrayList<>();
    }

    /**
     * construtor com parametros que aceita o tipo de evento em string utilizado pelo
     * metodo que le o ficheiro de texto 
     * @param titulo titulo
     * @param textoDescritivo texto descritivo
     * @param dataInicio data inicio
     * @param dataFim data fim
     * @param local local
     * @param dataLimiteSubmissaoCandidaturas data limite submissao candidatura
     * @param tipo tipo
     */
    public evento(String titulo, String textoDescritivo, Data dataInicio, Data dataFim, String local, Data dataLimiteSubmissaoCandidaturas, String tipo) {
        this.titulo = titulo;
        this.textoDescritivo = textoDescritivo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.local = local;
        this.dataLimiteSubmissaoCandidaturas = dataLimiteSubmissaoCandidaturas;
        if (tipo.equalsIgnoreCase("congresso")) {
            this.tipo = new congresso();
        } else {
            this.tipo = new exposicao();
        }
        listaFAE = new ArrayList<>();
        listaOrganizadores = new ArrayList<>();
        listaAtribuicao = new ArrayList<>();
        listaCandidaturas = new ArrayList<>();
    }

    /**
     * construtor sem parametros
     */
    public evento() {
        listaFAE = new ArrayList<>();
        listaOrganizadores = new ArrayList<>();
        listaAtribuicao = new ArrayList<>();
        listaCandidaturas = new ArrayList<>();
    }

    /**
     * converter a uma lista em string
     * @param lista uma lista de objectos
     * @return string 
     */
    private String converterListaEmString(List lista) {
        String porExtenso = "";
        for (Object o : lista) {
            porExtenso = porExtenso + "; \n" + o.toString();
        }
        return porExtenso;
    }

    /**
     * get o titulo do evento
     * @return titulo
     */
    public String getTitulo() {
        return this.titulo;
    }

    /**
     * set titulo ao evento
     * @param titulo titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * get texto descritivo do evento
     * @return texto descritivo
     */
    public String getTextoDescritivo() {
        return this.textoDescritivo;
    }

    /**
     * set texto descritivo do evento
     * @param textoDescritivo texto descritivo
     */
    public void setTextoDescritivo(String textoDescritivo) {
        this.textoDescritivo = textoDescritivo;
    }

    /**
     * get data de incio do evento
     * @return data inicio
     */
    public Data getDataInicio() {
        return this.dataInicio;
    }

    /**
     * set data da inicio do evento
     * @param dataInicio data de inicio
     */
    public void setDataInicio(Data dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * get data de fim do evento
     * @return data
     */
    public Data getDataFim() {
        return this.dataFim;
    }

    /**
     * set dat de fim de evento
     * @param dataFim data da fim
     */
    public void setDataFim(Data dataFim) {
        this.dataFim = dataFim;
    }

    /**
     * get local do evento
     * @return local do evento
     */
    public String getLocal() {
        return this.local;
    }

    /**
     * set ao local do evento
     * @param local
     */
    public void setLocal(String local) {
        this.local = local;
    }

    /**
     * get da data limite de submissao de candidaturas
     * @return
     */
    public Data getDataLimiteSubmissaoCandidaturas() {
        return this.dataLimiteSubmissaoCandidaturas;
    }

    /**
     * set data limite de submissao de candidaturas
     * rrecebendo como parametro uma nova data
     * @param dataLimiteSubmissaoCandidaturas
     */
    public void setDataLimiteSubmissaoCandidaturas(Data dataLimiteSubmissaoCandidaturas) {
        this.dataLimiteSubmissaoCandidaturas = dataLimiteSubmissaoCandidaturas;
    }

    /**
     * get tipo de evento
     * @return
     */
    public EventType getTipo() {
        return this.tipo;
    }

    /**
     * set tipo de evento recebendo como parametro um tipo
     * @param tipo
     */
    public void setTipo(EventType tipo) {
        this.tipo = tipo;
    }

    /**
     * get lista de FAEs
     * @return 
     */
    public List getListaFAE() {
        return listaFAE;
    }

    /**
     * get lista de candidaturas
     * @return 
     */
    public List getListaCandidatura() {
        return listaCandidaturas;
    }
    
    /**
     * get lista de candidaturas
     * @param FEA
     * @return 
     */
    public List getListaCandidaturas(fae FEA) {
        return listaCandidaturas;
    }
    
    /**
     * get lista de atribuicoes do evento
     * @return
     */
    public List getListaAtribuicoes() {
        return listaAtribuicao;
    }

    /**
     * get lista de organizador deste evento
     * @return
     */
    public List<organizador> getListaOrganizadores() {
        return listaOrganizadores;
    }
    
    /**
     * adiciona uma atribuição à lista de atribuições recebendo 
     * como parametro uma atribuição
     * @param a
     */
    public void registaAtribuicao(atribuicao a) {
        listaAtribuicao.add(a);
    }


    /**
     * Cria uma nova candidatura para o evento onde estamos;
     * @return 
     */
    public candidatura selecionaEventoCriaCandidatura() {
        return new candidatura();
    }

    /**
     * adiciona uma candidatura valida à lista de candidaturas do evento
     *
     * @param c
     * @return 
     */
    public boolean registaCandidatura(candidatura c) {
        boolean ok = validaCandidatura(c);
        listaCandidaturas.add(c);
        return ok;
    }

    /**
     * validação global da candidatura (compara uma candidatura com as restantes
     * presentes na lista e confirma se existe já uma igual metodo EQUALS
     * candidatura;
     *
     * @param c candidatura
     * @return boolean se candidatura é unica
     */
    public boolean validaCandidatura(candidatura c) {
        boolean candidaturaUnica = true;
        for (candidatura cand : listaCandidaturas) {
            if (cand.equals(c)) {
                candidaturaUnica = false;
                return candidaturaUnica;
            }
        }
        return candidaturaUnica;
    }

    /**
     * adiciona um novo fae á lista de FAE recebendo como parametro um utilizador
     * @param u
     */
    public void addUtilizadorFAE(utilizador u) {
        fae novoFAE = new fae(u);
        listaFAE.add(novoFAE);
    }

    /**
     * adiciona um novo organizador à lista de organizadores recebendo como parametro um utilizador
     * @param u utilizador
     */
    public void addUtilizadorOrganizador(utilizador u) {
        organizador novoOrganizador = new organizador(u);
        listaOrganizadores.add(novoOrganizador);
    }

    /**
     *
     * @param faeSelecionado fae selecionado
     * @param candidaturaSelecionada candidatura selecionada
     */
    public void addAtribuicaoFicheiro(fae faeSelecionado, candidatura candidaturaSelecionada) {
        atribuicao a = new atribuicao();
        a.setFAEeCandidatura(faeSelecionado, candidaturaSelecionada);
        listaAtribuicao.add(a);
    }

    /**
     * to string personalizado com fae e organizador impresso
     * @return string personalizada
     */
    public String toStringComFaeOrganizador() {
        return "\nEVENTO:" + "\nTitulo: " + titulo + ",\nTexto Descritivo: " + textoDescritivo + ",\n"
                + "Data de Inicio: " + dataInicio + ",\nData de Fim: " + dataFim + ",\n"
                + "Local: " + local + ",\nData Limite de Submissão de Candidaturas: " + dataLimiteSubmissaoCandidaturas + ",\n"
                + "Tipo de Evento: " + tipo.toString() + "\n"
                + "Organizadores: " + converterListaEmString(listaOrganizadores) + "\n"
                + "FAE: " + converterListaEmString(listaFAE) + "\n"
                + "Candidaturas: " + converterListaEmString(listaCandidaturas) + "\n"
                + "Atribuições: " + converterListaEmString(listaAtribuicao) + "\n";
    }
    
        @Override
    public String toString() {
        return "\nEVENTO:" + "\nTitulo: " + titulo + ",\nTexto Descritivo: " + textoDescritivo + ",\n"
                + "Data de Inicio: " + dataInicio + ",\nData de Fim: " + dataFim + ",\n"
                + "Local: " + local + ",\nData Limite de Submissão de Candidaturas: " + dataLimiteSubmissaoCandidaturas + ",\n"
                + "Tipo de Evento: " + tipo.toStringNomeTipo() + "\n";
    }

    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || getClass() != outroObjeto.getClass()) {
            return false;
        }
        evento outroEvento = (evento) outroObjeto;
        return this.getTitulo().equalsIgnoreCase(outroEvento.getTitulo())
                && this.getLocal().equalsIgnoreCase(outroEvento.getLocal())
                && this.getDataInicio().equals(outroEvento.getDataInicio())
                && this.getDataFim().equals(outroEvento.getDataFim());
    }

}

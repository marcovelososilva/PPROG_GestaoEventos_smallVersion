package Main_Class;

import java.util.ArrayList;
import java.util.List;
import Utils.*;

public class evento {

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

    public evento() {
        listaFAE = new ArrayList<>();
        listaOrganizadores = new ArrayList<>();
        listaAtribuicao = new ArrayList<>();
        listaCandidaturas = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "\nEVENTO:" + "\nTitulo: " + titulo + ",\nTexto Descritivo: " + textoDescritivo + ",\n"
                + "Data de Inicio: " + dataInicio + ",\nData de Fim: " + dataFim + ",\n"
                + "Local: " + local + ",\nData Limite de Submissão de Candidaturas: " + dataLimiteSubmissaoCandidaturas + ",\n"
                + "Tipo de Evento: " + tipo.toStringNomeTipo() + "\n";
    }

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

    private String converterListaEmString(List lista) {
        String porExtenso = "";
        for (Object o : lista) {
            porExtenso = porExtenso + "; \n" + o.toString();
        }
        return porExtenso;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTextoDescritivo() {
        return this.textoDescritivo;
    }

    public void setTextoDescritivo(String textoDescritivo) {
        this.textoDescritivo = textoDescritivo;
    }

    public Data getDataInicio() {
        return this.dataInicio;
    }

    public void setDataInicio(Data dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Data getDataFim() {
        return this.dataFim;
    }

    public void setDataFim(Data dataFim) {
        this.dataFim = dataFim;
    }

    public String getLocal() {
        return this.local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Data getDataLimiteSubmissaoCandidaturas() {
        return this.dataLimiteSubmissaoCandidaturas;
    }

    public void setDataLimiteSubmissaoCandidaturas(Data dataLimiteSubmissaoCandidaturas) {
        this.dataLimiteSubmissaoCandidaturas = dataLimiteSubmissaoCandidaturas;
    }

    public EventType getTipo() {
        return this.tipo;
    }

    public void setTipo(EventType tipo) {
        this.tipo = tipo;
    }

    /**
     *
     * @param e
     */
    public List getListaFAE() {
        return listaFAE;
    }

    /**
     *
     * @param e
     */
    public List getListaCandidatura() {
        return listaCandidaturas;
    }

    /**
     *
     * @param la
     */
    public void registaAtribuicao(atribuicao a) {
        listaAtribuicao.add(a);
    }

    /**
     *
     * @param FEA
     */
    public List getListaCandidaturas(fae FEA) {
        return listaCandidaturas;
    }

    /**
     * Cria uma nova candidatura para o evento onde estamos;
     */
    public candidatura selecionaEventoCriaCandidatura() {
        return new candidatura();
    }

    /**
     * adiciona uma candidatura valida à lista de candidaturas do evento
     *
     * @param c
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
     * @param c
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
     *
     * @param e
     * @param u
     */
    public void addUtilizadorFAE(utilizador u) {
        fae novoFAE = new fae(u);
        listaFAE.add(novoFAE);
    }

    /**
     *
     * @param u
     */
    public void addUtilizadorOrganizador(utilizador u) {
        organizador novoOrganizador = new organizador(u);
        listaOrganizadores.add(novoOrganizador);
    }

    public void addAtribuicaoFicheiro(fae faeSelecionado, candidatura candidaturaSelecionada) {
        atribuicao a = new atribuicao();
        a.setFAEeCandidatura(faeSelecionado, candidaturaSelecionada);
        listaAtribuicao.add(a);
    }

    public List getListaAtribuicoes() {
        return listaAtribuicao;
    }

    public List<organizador> getListaOrganizadores() {
        return listaOrganizadores;
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

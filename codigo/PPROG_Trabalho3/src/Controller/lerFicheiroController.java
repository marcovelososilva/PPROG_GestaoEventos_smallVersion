/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Main_Class.centroDeEventos;
import Utils.Data;

/**
 *
 * @author Marco
 */
public class lerFicheiroController {

    private final centroDeEventos ce;

    /**
     * construtor que inicializa o controller do ler ficheiro de texto
     * @param ce
     */
    public lerFicheiroController(centroDeEventos ce) {
        this.ce = ce;
    }

    /**
     * método que é responsavel por inicializar o utilizador
     * @param conteudo
     */
    public void lerUtilizadorController(String[] conteudo) {
        String nome = conteudo[0];
        String email = conteudo[1];
        String username = conteudo[2];
        String pass = conteudo[3];
        ce.novoRegistoUtilizadorFicheiro(nome, email, username, pass);
    }

    /**
     * * método que é responsavel por inicializar o evento
     * @param conteudo
     */
    public void lerEventoController(String[] conteudo) {
        String titulo = conteudo[0];
        String textoDescritivo = conteudo[1];
        String dataInicio = conteudo[2];
        String dataFim = conteudo[3];
        String local = conteudo[4];
        String dataLimiteSubmissao = conteudo[5];
        String tipo = conteudo[6];
        ce.novoRegistoEventoFicheiro(titulo, textoDescritivo, dataInicio, dataFim, local, dataLimiteSubmissao, tipo);
    }

    /**
     * * método que é responsavel por inicializar o FAE
     * @param conteudo
     */
    public void lerFAEController(String[] conteudo) {
        String evento = conteudo[0];
        String utilizador = conteudo[1];
        ce.novoRegistoFaeEmEventoFicheiro(evento, utilizador);
    }

    /**
     * * método que é responsavel por inicializar a Candidatura
     * @param conteudo
     */
    public void lerCandidatura(String[] conteudo) {
        String evento = conteudo[0];
        String nomeEmpresa = conteudo[1];
        String responsavelCandidatura = conteudo[2];
        String morada = conteudo[3];
        int telefone = Integer.parseInt(conteudo[4]);
        String textoExplicativoCandidatura = conteudo[5];
        String dataCandidatura = conteudo[6];
        ce.novoRegistoCandidaturaEmEventoFicheiro(evento, nomeEmpresa, responsavelCandidatura, morada, telefone, textoExplicativoCandidatura, dataCandidatura);

    }

    /**
     * * método que é responsavel por inicializar o Organizador
     * @param conteudo
     */
    public void lerOrganizadorController(String[] conteudo) {
        String evento = conteudo[0];
        String utilizador = conteudo[1];
        ce.novoRegistoOrganizadorEmEventoFicheiro(evento, utilizador);
    }

    /**
     * * método que é responsavel por inicializar o Gestor Eventos
     * @param conteudo
     */
    public void lerGestorController(String[] conteudo) {
        String utilizador = conteudo[0];
        ce.novoRegistoGestorFicheiro(utilizador);
    }

    /**
     * * método que é responsavel por inicializar a Atribuicao
     * @param conteudo
     */
    public void lerAtribuicoes(String[] conteudo) {
        String evento = conteudo[0];
        String candidatura = conteudo[1];
        Data dataCandidatura = new Data(conteudo[2]);
        String fae = conteudo[3];
        ce.novoRegistoAtribuicoesFicheiro(evento, candidatura, dataCandidatura, fae);
    }

    /**
     * * método que é responsavel por inicializar a decisao
     * @param conteudo
     */
    public void lerDecisoes(String[] conteudo) {
        String evento = conteudo[0];
        String candidatura = conteudo[1];
        Data dataCandidatura = new Data(conteudo[2]);
        String fae = conteudo[3];
        Boolean decisaoFavoravel = Boolean.parseBoolean(conteudo[4]);
        String textoExplicativo = conteudo[5];
        ce.novoRegistoDecisoesFicheiro(evento, candidatura, dataCandidatura, fae,decisaoFavoravel,textoExplicativo);
    }
}

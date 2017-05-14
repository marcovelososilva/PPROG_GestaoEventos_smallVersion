/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Main_Class.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marco
 */
public class escreverFicheiroController {
 
    private final centroDeEventos ce;
    private final List<String> listaUtilizadores;
    private final List<String> listaGestoresEventos;
    private final List<String> listaEventos;
    private final List<String> listaFae;
    private final List<String> listaOrganizadores;
    private final List<String> listaCandidaturas;
    private final List<String> listaAtribuicoes;

    public escreverFicheiroController(centroDeEventos ce) {
        this.ce = ce;
        this.listaUtilizadores = new ArrayList<>();
        this.listaGestoresEventos= new ArrayList<>();
        this.listaEventos= new ArrayList<>();
        this.listaFae= new ArrayList<>();
        this.listaOrganizadores= new ArrayList<>();
        this.listaCandidaturas= new ArrayList<>();
        this.listaAtribuicoes= new ArrayList<>();
    }

    public List<String> getListaUtilizadores() {
        return listaUtilizadores;
    }

    public List<String> getListaGestoresEventos() {
        return listaGestoresEventos;
    }

    public List<String> getListaEventos() {
        return listaEventos;
    }

    public List<String> getListaFae() {
        return listaFae;
    }

    public List<String> getListaOrganizadores() {
        return listaOrganizadores;
    }

    public List<String> getListaCandidaturas() {
        return listaCandidaturas;
    }

    public List<String> getListaAtribuicoes() {
        return listaAtribuicoes;
    }
     
    public void runCollectInformacao(){
        listaUtilizadores.add("utilizadores");
        listaGestoresEventos.add("gestoreseventos");
        listaEventos.add("eventos");
        listaFae.add("fae");
        listaOrganizadores.add("organizadores");
        listaCandidaturas.add("candidaturas");
        listaAtribuicoes.add("atribuicao");
//lista de utlizadores (utilizadores) dados;
//ex: André Zulu;andrezulu@email.pt;azulu;zulu123;
        List <utilizador> listaParaGravarUtilizador = ce.getListaUtilizadores();
        for (utilizador u: listaParaGravarUtilizador){
            String adiciona = u.getNome()  + ";" + u.getEmail() + ";" + u.getUsername() + ";" + u.getPassword() + ";";
            listaUtilizadores.add(adiciona);
        }
    
//lista de gestores de eventos (gestoreseventos) utilizador.getUsername();
//ex: azulu;
        List <gestorDeEventos> listaParaGravarGestoresEventos = ce.getListaGestoresEventos();
        for (gestorDeEventos ge: listaParaGravarGestoresEventos){
            String adiciona = ge.getUser().getUsername() + ";";
            listaGestoresEventos.add(adiciona);
        }
        
//lista de eventos (eventos) dados;
        //ex: Expo Carros;exposição de carros e material para carros;2017/06/03;2017/06/04;Porto;2017/05/28;exposicao;
        List <evento> listaParaGravarEventos = ce.getListaEvento();
        for (evento e : listaParaGravarEventos){
            String adiciona = e.getTitulo() + ";" + e.getTextoDescritivo() + ";" + e.getDataInicio().toStringEmNumeros() 
                    + ";" + e.getDataFim().toStringEmNumeros() + ";" + e.getLocal() + ";" 
                    + e.getDataLimiteSubmissaoCandidaturas().toStringEmNumeros() + ";" + e.getTipo().toStringNomeTipo()+ ";";
            listaEventos.add(adiciona);
                
    //lista de fae (fae) evento.getTitulo; utilizador.getUsername();
                //ex: Expo Carros;azulu;
                List <fae> listaParaGravarFAEEvento = e.getListaFAE();
                for (fae uniFAE: listaParaGravarFAEEvento){
                    String adicionaFAE = e.getTitulo() + ";" + uniFAE.getUser().getUsername() + ";";
                    listaFae.add(adicionaFAE);
                }
    //lista de organizadores (organizadores) evento.getTitulo();utilizador.getUsername();
                //ex: Expo Carros;azulu;
                List <organizador> listaParaGravarOrganizadorEvento = e.getListaOrganizadores();
                for (organizador o: listaParaGravarOrganizadorEvento){
                    String adicionaOrganizador = e.getTitulo() + ";" + o.getUser().getUsername() + ";";
                    listaOrganizadores.add(adicionaOrganizador);
                }
    //lista de candidaturas (candidaturas) dados;
                //ex: Expo Carros;JulinhoSA;julio;Porto;225511447;textoExplicativoCandidatura1;2017/06/24;            
                List <candidatura> listaParaGravarCandidaturaEvento = e.getListaCandidatura();
                for (candidatura c: listaParaGravarCandidaturaEvento){
                    String adicionaCandidatura = e.getTitulo() + ";" + c.getNomeEmpresa() + ";" + 
                            c.getResponsavelCandidatura() + ";" + c.getMorada() + ";" + 
                            c.getTelefone() + ";" + c.getTextoExplicativoCandidatura() + ";" + 
                            c.getDataCandidatura().toStringEmNumeros() + ";";
                    listaCandidaturas.add(adicionaCandidatura);
                }    
    //lista de atribuições (atribuicao) evento.getTitulo();candidatura.getNomeEmpresa();candidatura.getdataCandidatura();fae.getUtilizador.getUsername(); 
                //ex: Expo Carros;JulinhoSA;2017/06/24;azulu;     
                List <atribuicao> listaParaGravarAtribuicaoEvento = e.getListaAtribuicoes();
                for (atribuicao a: listaParaGravarAtribuicaoEvento){
                    String adicionaAtribuicao = e.getTitulo() + ";" + a.getCandidatura().getNomeEmpresa() + ";" + 
                            a.getCandidatura().getDataCandidatura().toStringEmNumeros() + ";" + a.getFae().getUser().getUsername() + ";";
                    listaAtribuicoes.add(adicionaAtribuicao);
                }
                   
        }
        
        listaUtilizadores.add("end");
        listaGestoresEventos.add("end");
        listaEventos.add("end");
        listaFae.add("end");
        listaOrganizadores.add("end");
        listaCandidaturas.add("end");
        listaAtribuicoes.add("end");
    }

    
}
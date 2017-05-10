/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_CONSOLA;

import Main_Class.*;
import Controller.*;
import java.util.List;

/**
 *
 * @author Marco
 */
public class escreverFicheiroUI_CONSOLA {
    
    private final centroDeEventos ce;
    private final escreverFicheiroController efController;

    public escreverFicheiroUI_CONSOLA(centroDeEventos ce) {
        this.ce = ce;
        this.efController = new escreverFicheiroController(ce);
    }
    
    public void run(){
        efController.runCollectInformacao();
//lista de utlizadores (utilizadores);
        List<String> listaUtilizadores = efController.getListaUtilizadores();     
//lista de gestores de eventos (gestoreseventos);
        List<String> listaGestoresEventos = efController.getListaGestoresEventos();     
//lista de eventos (eventos);
        List<String> listaEventos = efController.getListaEventos();    
//lista de fae (fae);
        List<String> listaFae = efController.getListaFae();     
//lista de organizadores (organizadores);
        List<String> listaOrganizadores = efController.getListaOrganizadores();  
//lista de candidaturas (candidaturas);
        List<String> listaCandidaturas = efController.getListaCandidaturas();
//lista de atribuições (atribuicao);     
        List<String> listaAtribuicoes = efController.getListaAtribuicoes();
        
        gravarFicheiro(listaUtilizadores, listaGestoresEventos, listaEventos, listaFae, listaOrganizadores, listaCandidaturas, listaAtribuicoes);
        
    }
    
    private boolean gravarFicheiro (List<String> listaUtilizadores, List<String> listaGestoresEventos, List<String> listaEventos, List<String> listaFae, List<String> listaOrganizadores, List<String> listaCandidaturas, List<String> listaAtribuicoes){
        boolean tudoOK = true;
        
        System.out.println("olé era capaz de imprimir isto agora..lol\n");
        
        listaUtilizadores.forEach((u) -> {
            System.out.println(u);
        });
        System.out.println("");
        listaGestoresEventos.forEach((s) -> {
            System.out.println(s);
        });
        System.out.println("");
        listaEventos.forEach((s) -> {
            System.out.println(s);
        });
        System.out.println("");
        listaFae.forEach((s) -> {
            System.out.println(s);
        });
        System.out.println("");
        listaOrganizadores.forEach((s) -> {
            System.out.println(s);
        });
        System.out.println("");
        listaCandidaturas.forEach((s) -> {
            System.out.println(s);
        });
        System.out.println("");
        listaAtribuicoes.forEach((s) -> {
            System.out.println(s);
        });
        
        /*
        aqui o resto do codigo para gravar para o ficheiro
        */
        return tudoOK;
    }
}

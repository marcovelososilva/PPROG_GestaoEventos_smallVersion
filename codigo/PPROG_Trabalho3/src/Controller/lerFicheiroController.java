/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Main_Class.centroDeEventos;

/**
 *
 * @author Marco
 */
public class lerFicheiroController {
    private final centroDeEventos ce;

    public lerFicheiroController(centroDeEventos ce) {
        this.ce = ce;
    }
    
    
    public void lerUtilizadorController (String[] conteudo){
        String nome = conteudo[0];
        String email = conteudo[1];
        String username = conteudo[2];
        String pass = conteudo[3];
        ce.novoRegistoUtilizadorFicheiro(nome, email, username, pass);
    }
    
    public void lerEventoController (String[] conteudo){
        String titulo = conteudo[0]; 
        String textoDescritivo = conteudo[1]; 
        String dataInicio = conteudo[2]; 
        String dataFim = conteudo[3];
        String local = conteudo[4];
        String dataLimiteSubmissao = conteudo[5]; 
        String tipo = conteudo[6];
        ce.novoRegistoEventoFicheiro(titulo, textoDescritivo, dataInicio, dataFim, local, dataLimiteSubmissao, tipo);
    }
    
    public void lerFAEController (String[] conteudo){
        String evento = conteudo[0]; 
        String utilizador = conteudo[1];
        ce.novoRegistoFaeEmEventoFicheiro(evento, utilizador);
    }
    
    public void lerOrganizadorController (String[] conteudo){
        String evento = conteudo[0]; 
        String utilizador = conteudo[1];
        ce.novoRegistoOrganizadorEmEventoFicheiro(evento, utilizador);
    }
    
    public void lerGestorController (String[] conteudo){
        String utilizador = conteudo[0];
        ce.novoRegistoGestorFicheiro(utilizador);
    }
}

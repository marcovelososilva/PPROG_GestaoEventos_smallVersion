/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_CONSOLA;

import Main_Class.*;
import Controller.*;
import Utils_Consola.utilitariosConsola;
import java.io.*;
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
    
    public void run(String nomeFile){
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
        
   //     utilitariosConsola.escreverConsola("qual o nome do ficheiro que quer guardar?");
   //     String nomeFile = utilitariosConsola.lerConsolaNextLine();
        
        if (!nomeFile.endsWith(".txt")){
            nomeFile = nomeFile + ".txt";
        }
        
        boolean tudoOK = gravarFicheiro(listaUtilizadores, listaGestoresEventos, listaEventos, listaFae, listaOrganizadores, listaCandidaturas, listaAtribuicoes, nomeFile);
        
        if (tudoOK){
            utilitariosConsola.escreverConsola("OPERAÇÃO REALIZADA COM SUCESSO!");
        }else{
            utilitariosConsola.escreverConsola("OPERAÇÃO NÃO CONCLUIDA! ERRO!");
        }
        
    }
    
    private boolean gravarFicheiro (List<String> listaUtilizadores, List<String> listaGestoresEventos, List<String> listaEventos, List<String> listaFae, List<String> listaOrganizadores, List<String> listaCandidaturas, List<String> listaAtribuicoes, String nomeFile){
        boolean tudoOK = true;
        try {
            FileWriter fileWriter =
                new FileWriter(nomeFile);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (String s : listaUtilizadores){
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.newLine();
            
            for (String s : listaGestoresEventos){
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.newLine();
            
            for (String s : listaEventos){
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.newLine();
            
            for (String s : listaFae){
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.newLine();
            
            for (String s : listaOrganizadores){
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.newLine();
            
            for (String s : listaCandidaturas){
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.newLine();
            
            for (String s : listaAtribuicoes){
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println("ERRO ao ESCREVER O FICHEIRO '" + nomeFile + "'");
            tudoOK = false;
        }

        return tudoOK;
    }
}

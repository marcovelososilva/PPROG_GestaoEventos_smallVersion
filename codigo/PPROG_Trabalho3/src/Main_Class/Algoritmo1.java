/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_Class;

import java.util.List;

public class Algoritmo1 implements algoritmoAtribuicao {
    private final String nome;
    private final String descritivo;

    public Algoritmo1() {
        nome = "Algoritmo 1 - Ordem Alfabética 2 cada";
        descritivo = "Algoritmo distribui as candidaturas pelos FAE's por ordem alfabética de FAE's 2 para cada minimo";
    }

    
    
    @Override
    public atribuicao runAlgoritmo(List<fae> listaFAE, List<candidatura> listaCandidaturas, decisao d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

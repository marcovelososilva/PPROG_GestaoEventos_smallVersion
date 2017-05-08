/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_Class;

import java.util.List;

/**
 *
 * @author Marco
 */
public class Algoritmo3 implements algoritmoAtribuicao{
    private final String nome;
    private final String descritivo;

    public Algoritmo3() {
        nome = "Algoritmo 3 - Ordem Alfabética invertida";
        descritivo = "Algoritmo distribui as candidaturas pelos FAE's por ordem alfabética invertida 1 cada ate acabar";
    }

    @Override
    public atribuicao runAlgoritmo(List<fae> listaFAE, List<candidatura> listaCandidaturas, List<atribuicao> listaAtribuicoes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

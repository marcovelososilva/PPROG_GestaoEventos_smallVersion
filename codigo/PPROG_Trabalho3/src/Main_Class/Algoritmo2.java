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
public class Algoritmo2 implements algoritmoAtribuicao{
    private final String nome;
    private final String descritivo;

    public Algoritmo2() {
        nome = "Algoritmo 2 - Ordem Aleatória";
        descritivo = "Algoritmo distribui as candidaturas pelos FAE's por ordem aleatória sem qualquer parametro 1 a cada até acabar.";
    }
    
    @Override
    public String toString() {
        return nome + ",\nDescritivo:\n" + descritivo;
    }

    @Override
    public List runAlgoritmo(List<fae> listaFAE, List<candidatura> listaCandidaturas, List<atribuicao> listaAtribuicoes) {
        listaAtribuicoes.clear();
        int contaFAE = listaFAE.size()-1;
        for (candidatura c : listaCandidaturas){
            atribuicao a = new atribuicao();
            a.setFAEeCandidatura(listaFAE.get(contaFAE), c);
            listaAtribuicoes.add(a);
            contaFAE = contaFAEs(listaFAE.size(), 0);
        }
        
        
        return listaAtribuicoes;
    }
    
    private static int contaFAEs (int contagemActual, int contMaximo){
        contagemActual --;
        if (contagemActual < contMaximo){
            return contagemActual;
        } else {
            return 0;
        }
    }
        @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || getClass() != outroObjeto.getClass()) {
            return false;
        }
        algoritmoAtribuicao outroAlgoritmo = (algoritmoAtribuicao) outroObjeto;
        return  this.toString().equalsIgnoreCase(outroAlgoritmo.toString());
    }
}

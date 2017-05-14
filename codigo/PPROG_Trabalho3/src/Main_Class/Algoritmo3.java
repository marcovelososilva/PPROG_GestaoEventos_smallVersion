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
        nome = "Algoritmo 3 - Ordem Aleatória invertida";
        descritivo = "Algoritmo distribui as candidaturas pelos FAE's por ordem Aleatória invertida 1 cada ate acabar";
    }

    @Override
    public String toString() {
        return nome + ",\nDescritivo:\n" + descritivo;
    }
    
    @Override
    public List runAlgoritmo(List<fae> listaFAE, List<candidatura> listaCandidaturas, List<atribuicao> listaAtribuicoes) {
        listaAtribuicoes.clear();
        int indiceFAE = 0;
        for (candidatura c : listaCandidaturas){
            atribuicao a = new atribuicao();
            a.setFAEeCandidatura(listaFAE.get(indiceFAE), c);
            listaAtribuicoes.add(a);
            indiceFAE = contaFAEs(indiceFAE, listaFAE.size());
        }
        
        
        return listaAtribuicoes;
    }
    
    private static int contaFAEs (int contagemActual, int contMaximo){
        contagemActual ++;
        if (contagemActual > contMaximo-1){
            return 0;
        } else {
            return contagemActual;
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

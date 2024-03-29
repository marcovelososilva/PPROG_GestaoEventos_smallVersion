/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_Class;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Marco
 */
public class Algoritmo1 implements algoritmoAtribuicao, Serializable {

    private final String nome;
    private final String descritivo;

    /**
     * construtor vazio que inicia o algoritmo 1
     */
    public Algoritmo1() {
        nome = "Algoritmo 1 - TUDO A 1";
        descritivo = "Algoritmo distribui as candidaturas apenas por um FAE.";
    }

    /**
     * devolve o nome do algoritmo
     *
     * @return o nome do algoritmo
     */
    public String getNome() {
        return nome;
    }

    /**
     * devolve o descritivo do algoritmo
     *
     * @return a descrição do algoritmo
     */
    public String getDescritivo() {
        return descritivo;
    }

    @Override
    public String toString() {
        return nome + ",\nDescritivo:\n" + descritivo;
    }

    @Override
    public List runAlgoritmo(List<fae> listaFAE, List<candidatura> listaCandidaturas, List<atribuicao> listaAtribuicoes) {
        listaAtribuicoes.clear();
        for (candidatura c : listaCandidaturas) {
            atribuicao a = new atribuicao();
            a.setFAEeCandidatura(listaFAE.get(0), c);
            listaAtribuicoes.add(a);
        }

        return listaAtribuicoes;
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
        return this.toString().equalsIgnoreCase(outroAlgoritmo.toString());
    }

}

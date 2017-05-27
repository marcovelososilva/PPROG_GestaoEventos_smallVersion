/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_Class;

import Controller.*;
import UI_CONSOLA.*;
import learnGUI.testGui;

/**
 *
 * @author Marco
 */
public class main {

    /**
     * metodo main que inicializa o programa
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CRIAR O CENTRO DE EVENTO:

        //COMEÇAR UM NOVO VAZIO SEMPRE:
        //        centroDeEventos ce = new centroDeEventos();
        //COMEÇAR UM EXISTEM-TE SE O HOUVER:
        centroDeEventos ce = new lerFicheiroBinarioController().lerBinario();

        //COMEÇAR PELA INTERFACE GRÁFICA:
        testGui tg = new testGui(ce);
        tg.setVisible(true);

        //COMEÇAR PELA INTERFACE CONSOLA:
//        menuUI_CONSOLA menu = new menuUI_CONSOLA(ce);
//        menu.run();
    }

}

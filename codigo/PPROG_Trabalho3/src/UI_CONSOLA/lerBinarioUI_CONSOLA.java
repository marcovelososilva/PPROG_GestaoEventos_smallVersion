/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_CONSOLA;

import Controller.escreverFicheiroBinarioController;
import Controller.lerFicheiroBinarioController;
import java.io.FileNotFoundException;
import java.io.Serializable;

/**
 *
 * @author Marco
 */
public class lerBinarioUI_CONSOLA implements Serializable{
    
    public static void main(String[] args) throws FileNotFoundException{
        String fileNameIn = "evento.out";
        
        escreverFicheiroBinarioController efbController = new escreverFicheiroBinarioController();
        lerFicheiroBinarioController lfbController = new lerFicheiroBinarioController();
        
//        lfbController.escreverSerial();
        efbController.serializationFicheiro(fileNameIn);
        lfbController.lerBinario(fileNameIn);
    }
}

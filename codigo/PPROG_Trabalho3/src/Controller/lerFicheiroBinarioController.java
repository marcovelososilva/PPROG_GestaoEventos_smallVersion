/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.*;
import Main_Class.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class lerFicheiroBinarioController implements Serializable {
    
    /**
     *  método responsavel por fazer a leitura de um ficheiro binario
     * responsavel por restaurar o centro de eventos ao programa PERCISTENCIA de dados
     * @return 
     */
    public centroDeEventos lerBinario() {
        centroDeEventos ce = new centroDeEventos();
        try {
            FileInputStream fileIn = new FileInputStream("ficheiroBinarioCentroEventos.bin");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            ce = (centroDeEventos) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException i) {
            JOptionPane.showMessageDialog(null, "Nao foi encontrado nenhum ficheiro de dados de uma sessao anterior \n Vai ser criado uma base de dados nova", "Informação", JOptionPane.INFORMATION_MESSAGE);
            ce = new centroDeEventos();
        } finally{
            return ce;
        }
}

}

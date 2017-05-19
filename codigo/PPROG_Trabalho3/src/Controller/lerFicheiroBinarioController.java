/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.*;
import Main_Class.*;

/**
 *
 * @author Marco
 */
public class lerFicheiroBinarioController implements Serializable {
    
    public centroDeEventos lerBinario( ) {
        centroDeEventos ce = new centroDeEventos();
        try {
            FileInputStream fileIn = new FileInputStream("ficheiroBinarioCentroEventos.bin");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            ce = (centroDeEventos) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException i) {
            ce = new centroDeEventos();
        } finally{
            return ce;
        }
}

}

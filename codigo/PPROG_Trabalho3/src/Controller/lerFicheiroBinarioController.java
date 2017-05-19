/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.*;
import Main_Class.*;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marco
 */
public class lerFicheiroBinarioController implements Serializable {
    

    public void lerBinario(String fileName) {

        evento e = null;
        try {
            FileInputStream fileIn = new FileInputStream("binario.bin");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (evento) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("o evento lido foi:" + e.toString());
        } catch (IOException i) {
            System.out.println("NUM DEU!");
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
        }
    }

}

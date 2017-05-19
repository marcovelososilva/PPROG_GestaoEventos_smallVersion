/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Main_Class.centroDeEventos;
import java.io.*;

/**
 *
 * @author Marco
 */
public class escreverFicheiroBinarioController implements Serializable{
    
    private final centroDeEventos ce;

    public escreverFicheiroBinarioController(centroDeEventos ce) {
        this.ce = ce;
    }
    
    
    public void serializationFicheiro () {
      try {
         FileOutputStream fileOut = new FileOutputStream("ficheiroBinarioCentroEventos.bin");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(ce);
         out.close();
         fileOut.close();
      }catch(IOException i) {
          System.out.println("IO EXCEPTION - erro!");
      }
}
}

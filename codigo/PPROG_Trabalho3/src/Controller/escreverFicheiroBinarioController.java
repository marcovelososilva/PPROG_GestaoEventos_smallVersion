/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Main_Class.evento;
import Utils.Data;
import java.io.*;

/**
 *
 * @author Marco
 */
public class escreverFicheiroBinarioController implements Serializable{
    
    public void serializationFicheiro (String fileName) {
        evento e = new evento("titulo Oi", "texto Descritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
      
      try {
         FileOutputStream fileOut = new FileOutputStream("binario.bin");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in /tmp/employee.ser");
      }catch(IOException i) {
          System.out.println("IO EXCEPTION - erro!");
      }
    }
}

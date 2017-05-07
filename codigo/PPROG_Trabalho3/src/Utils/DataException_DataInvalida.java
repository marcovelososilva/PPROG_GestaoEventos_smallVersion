/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

/**
 *
 * @author Marco
 */
public class DataException_DataInvalida extends IllegalArgumentException {
    
    public DataException_DataInvalida() {
        super("Data é inválido!! não está no formato pretendido ANO/MES/DIA!");
    }
    
    public DataException_DataInvalida(String mensagem) {
        super(mensagem);
    }
    

}


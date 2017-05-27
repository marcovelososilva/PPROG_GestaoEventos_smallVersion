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
    
    /**
     * excepção apanha o facto do da string inicial estar incorrecto na data que se tentou criar
     */
    public DataException_DataInvalida() {
        super("Data é inválido!! não está no formato pretendido ANO/MES/DIA!");
    }
    
    /**
     * excepção apanha o facto do da string inicial estar incorrecto na data que se tentou criar
     * @param mensagem - mensagem gerada
     */
    public DataException_DataInvalida(String mensagem) {
        super(mensagem);
    }
    

}


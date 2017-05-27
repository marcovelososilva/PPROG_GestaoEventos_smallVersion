package Utils;

/**
 *
 * @author Marco
 */
public class DataException_MesInvalido extends IllegalArgumentException {

    /**
     * excepção apanha o facto do mes estar incorrecto na data que se tentou criar
     */
    public DataException_MesInvalido() {
        super("Mês é inválido!!");
    }
    
    /**
     * excepção apanha o facto do mes estar incorrecto na data que se tentou criar
     * @param mensagem - mensagem gerada
     */
    public DataException_MesInvalido(String mensagem) {
        super(mensagem);
    }

}

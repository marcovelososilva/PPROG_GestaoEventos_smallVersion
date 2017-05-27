package Utils;

/**
 *
 * @author Marco
 */
public class DataException_DiaInvalido extends IllegalArgumentException {

    /**
     * excepção apanha o facto do dia estar incorrecto na data que se tentou criar
     */
    public DataException_DiaInvalido() {
        super("Dia é inválido!!");
    }
    
    /**
     * excepção apanha o facto do dia estar incorrecto na data que se tentou criar
     * @param mensagem
     */
    public DataException_DiaInvalido(String mensagem) {
        super(mensagem);
    }

}

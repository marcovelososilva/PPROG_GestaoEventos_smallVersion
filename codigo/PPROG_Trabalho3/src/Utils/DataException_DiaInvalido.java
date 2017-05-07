package Utils;

public class DataException_DiaInvalido extends IllegalArgumentException {

    public DataException_DiaInvalido() {
        super("Dia é inválido!!");
    }
    
    public DataException_DiaInvalido(String mensagem) {
        super(mensagem);
    }

}

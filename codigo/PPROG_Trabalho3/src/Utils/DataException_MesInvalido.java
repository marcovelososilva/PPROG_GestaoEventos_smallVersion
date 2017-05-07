package Utils;

public class DataException_MesInvalido extends IllegalArgumentException {

    public DataException_MesInvalido() {
        super("Mês é inválido!!");
    }
    
    public DataException_MesInvalido(String mensagem) {
        super(mensagem);
    }

}

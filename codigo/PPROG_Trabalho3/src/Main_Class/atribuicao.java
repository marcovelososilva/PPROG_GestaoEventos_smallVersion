package Main_Class;

public class atribuicao {
	private fae fae;
	private candidatura candidatura;

    public atribuicao() {
    }

    public fae getFae() {
        return fae;
    }


    public candidatura getCandidatura() {
        return candidatura;
    }

    public void setFAEeCandidatura(fae fae, candidatura candidatura) {
        this.candidatura = candidatura;
        this.fae = fae;
    }

    @Override
    public String toString() {
        return " FAE: " + fae.toStringUsername() + ", responsável por decidir sobre candidatura: " + candidatura.toStringEmpresaData() + ";";
    }
    
    
}
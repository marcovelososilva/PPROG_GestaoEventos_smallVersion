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
}
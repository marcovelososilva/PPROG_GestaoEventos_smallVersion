package Main_Class;

import java.io.Serializable;

public class atribuicao implements Serializable{
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
    
    /**
     * metodo equals reescrito para verificar se duas candidaturas são iguais
     * utiliza os metodos equals das candidaturas e faes.
     * @param outroObjeto
     * @return 
     */
    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || getClass() != outroObjeto.getClass()) {
            return false;
        }
        atribuicao outraAtribuicao = (atribuicao) outroObjeto;
        return this.candidatura.equals(outraAtribuicao.candidatura) &&
                this.fae.getUser().equals(outraAtribuicao.fae.getUser());
    }
}
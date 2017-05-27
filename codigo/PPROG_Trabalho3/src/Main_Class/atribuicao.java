package Main_Class;

import java.io.Serializable;

/**
 *
 * @author Marco
 */
public class atribuicao implements Serializable {

    private fae fae;
    private candidatura candidatura;

    /**
     * construtor sem parametros
     */
    public atribuicao() {
    }

    /**
     * devolve o fae a quem foi atribuida uma candidatura
     * @return
     */
    public fae getFae() {
        return fae;
    }

    /**
     * devolve a candidatura que foi atribuida a um fae 
     * @return
     */
    public candidatura getCandidatura() {
        return candidatura;
    }

    /**
     * set aos dois dados que compoe uma atribuição
     * um fae e uma candidatura
     * 
     * @param fae
     * @param candidatura
     */
    public void setFAEeCandidatura(fae fae, candidatura candidatura) {
        this.candidatura = candidatura;
        this.fae = fae;
    }

    @Override
    public String toString() {
        return " FAE: " + fae.toStringUsername() + ", responsável por decidir sobre candidatura: " + candidatura.toStringEmpresaData() + "\n";
    }

    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || getClass() != outroObjeto.getClass()) {
            return false;
        }
        atribuicao outraAtribuicao = (atribuicao) outroObjeto;
        return this.candidatura.equals(outraAtribuicao.candidatura)
                && this.fae.getUser().equals(outraAtribuicao.fae.getUser());
    }
}

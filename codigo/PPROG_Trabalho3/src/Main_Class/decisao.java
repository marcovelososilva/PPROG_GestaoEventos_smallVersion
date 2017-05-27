package Main_Class;

import java.io.Serializable;

/**
 *
 * @author Marco
 */
public class decisao implements Serializable {

    private String textoDecisao;
    private boolean aprovada;
    private fae faeAtribuido;

    /**
     * contrutor sem parametos da decisao
     */
    public decisao() {
    }

    /**
     * construtor com parametros da decisao que espera uma strign com o texto da decisao e um boolean com a aprovação não aprovação
     * @param textoDecisao
     * @param aprovada
     */
    public decisao(String textoDecisao, boolean aprovada) {
        this.aprovada = aprovada;
        this.textoDecisao = textoDecisao;
    }

    /**
     * devolveo texto de decisao
     * @return
     */
    public String getTextoDecisao() {
        return textoDecisao;
    }

    /**
     * faz set ao texto de decisao
     * @param textoDecisao
     */
    public void setTextoDecisao(String textoDecisao) {
        this.textoDecisao = textoDecisao;
    }

    /**
     * responde se a decisao foi aprovada ou não
     * @return
     */
    public boolean isAprovada() {
        return aprovada;
    }

    /**
     * faz set à aprovação, aceita um boolean  com a aprovação
     * @param aprovada
     */
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    /**
     * get fae que decidiu esta candidatura
     * @return
     */
    public fae getFaeAtribuido() {
        return faeAtribuido;
    }
    
    /**
     * set ao fae que fez a decisao
     * @param faeAtribuido 
     */
    public void setFaeAtribuido(fae faeAtribuido) {
        this.faeAtribuido = faeAtribuido;
    }



    @Override
    public String toString() {
        return aprovada + " - texto de decisao: " + textoDecisao;
        //faeAtribuido.toStringUsername();
        //+ " texto de decisao: " + textoDecisao + ", candidatura aprovada: " + aprovada + ".";
    }

    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || getClass() != outroObjeto.getClass()) {
            return false;
        }
        decisao outraDecisao = (decisao) outroObjeto;
        return this.aprovada == outraDecisao.aprovada
                && this.faeAtribuido == outraDecisao.getFaeAtribuido();
    }

}

package Main_Class;

import java.io.Serializable;

public class decisao implements Serializable{

    private String textoDecisao;
    private boolean aprovada;
    private fae faeAtribuido;

    public decisao() {
    }

    public decisao(String textoDecisao,boolean aprovada){
        this.aprovada=aprovada;
        this.textoDecisao=textoDecisao;
    }
    
    public String getTextoDecisao() {
        return textoDecisao;
    }

    public void setTextoDecisao(String textoDecisao) {
        this.textoDecisao = textoDecisao;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public fae getFaeAtribuido() {
        return faeAtribuido;
    }

    public void setFaeAtribuido(fae faeAtribuido) {
        this.faeAtribuido = faeAtribuido;
    }

    @Override
    public String toString() {
        return aprovada+" - texto de decisao: " + textoDecisao;
                //faeAtribuido.toStringUsername();
        //+ " texto de decisao: " + textoDecisao + ", candidatura aprovada: " + aprovada + ".";
    }

    //////////////////////////////
    public boolean validarDadosDecisao() {
        // TODO - implement decisao.validarDadosDecisao
        throw new UnsupportedOperationException();
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

package Main_Class;

import Utils.Data;
import java.io.Serializable;

/**
 *
 * @author Marco
 */
public class candidatura implements Serializable {

    private String nomeEmpresa;
    private String responsavelCandidatura;
    private String morada;
    private int telefone;
    private String textoExplicativoCandidatura;
    private Data dataCandidatura;
    private decisao decisaoCandidatura;

    /**
     * construtor com parametros que inicializa a candidatura
     * recebe como parametro nome da empresa, responsavel de candidatura 
     * morada, telefone texto explicativo e data de candidatura
     * @param nomeEmpresa
     * @param responsavelCandidatura
     * @param morada
     * @param telefone
     * @param textoExplicativoCandidatura
     * @param dataCandidatura
     */
    public candidatura(String nomeEmpresa, String responsavelCandidatura, String morada, int telefone, String textoExplicativoCandidatura, Data dataCandidatura) {
        this.nomeEmpresa = nomeEmpresa;
        this.responsavelCandidatura = responsavelCandidatura;
        this.morada = morada;
        this.telefone = telefone;
        this.textoExplicativoCandidatura = textoExplicativoCandidatura;
        this.dataCandidatura = dataCandidatura;
    }

    /**
     * construtor com parametro vazio
     */
    public candidatura() {
    }

    /**
     *get do nome da empresa
     * @return
     */
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    /**
     * set o nome da empresa
     * @param nomeEmpresa
     */
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    /**
     *get o responsavel da candidatura
     * @return
     */
    public String getResponsavelCandidatura() {
        return responsavelCandidatura;
    }

    /**
     * set responvasel pela candidatura
     * @param responsavelCandidatura
     */
    public void setResponsavelCandidatura(String responsavelCandidatura) {
        this.responsavelCandidatura = responsavelCandidatura;
    }

    /**
     * get morada da candidatura
     * @return
     */
    public String getMorada() {
        return morada;
    }

    /**
     * set a morada da candidatura
     * @param morada
     */
    public void setMorada(String morada) {
        this.morada = morada;
    }

    /**
     * get telefone
     * @return
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * set telefone da candidatura
     * @param telefone
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    /**
     * get ao texto explicativo da candidatura
     * @return
     */
    public String getTextoExplicativoCandidatura() {
        return textoExplicativoCandidatura;
    }

    /**
     * set ao texto explicativo da candidatura
     * @param textoExplicativoCandidatura
     */
    public void setTextoExplicativoCandidatura(String textoExplicativoCandidatura) {
        this.textoExplicativoCandidatura = textoExplicativoCandidatura;
    }

    /**
     * get da data de candidatura
     * @return
     */
    public Data getDataCandidatura() {
        return dataCandidatura;
    }

    /**
     * set data da candidatura
     * @param dataCandidatura
     */
    public void setDataCandidatura(Data dataCandidatura) {
        this.dataCandidatura = dataCandidatura;
    }

    /**
     *get a decisao da candidatura
     * @return
     */
    public decisao getDecisao() {
        return decisaoCandidatura;
    }

    /**
     * cria uma nova decisao para a candidatura recebendo como parametro uma string
     * o texto explicativo e um boolean sobre a decisao tomada
     * @param textoExplicativo
     * @param decisaoFavoravel
     */
    public void addDecisaoFicheiro(String textoExplicativo, boolean decisaoFavoravel, fae faeSelecionado) {
        decisaoCandidatura = new decisao(textoExplicativo, decisaoFavoravel);
        decisaoCandidatura.setFaeAtribuido(faeSelecionado);
    }

    /**
     *cria uma nova decisao para a candidatura
     * @return 
     */
    public decisao selecionaCandidaturaCriaDecisao() {
        decisaoCandidatura = new decisao();
        return decisaoCandidatura;

    }
    
    /**
     * return a string com o nome da empresa e data de candidatura
     * @return
     */
    public String toStringEmpresaData() {
        return " Empresa: " + nomeEmpresa + ", candidatura data: " + dataCandidatura;
    }

    @Override
    public String toString() {
        if (decisaoCandidatura == null) {
            return "Candidatura da empresa: " + nomeEmpresa + " \nEfectuada na data: " + dataCandidatura + "\n"
                    + "Com a morada: " + morada + "\nTelefone: " + telefone + "\n"
                    + "Pessoa Responsavel pela Candidatura: " + responsavelCandidatura + "\n"
                    + "Com o seguinte texto explicativo: " + textoExplicativoCandidatura + "\n" // +"::Decisao::" + " - Não tomada"
                    ;
        } else {
            return "Candidatura da empresa: " + nomeEmpresa + " - Efectuada na data: " + dataCandidatura + "\n"
                    + "Com a morada: " + morada + " - Telefone: " + telefone + "\n"
                    + "Pessoa Responsavel pela Candidatura: " + responsavelCandidatura + "\n"
                    + "Com o seguinte texto explicativo: " + textoExplicativoCandidatura + "\n"
                    + "::Decisao:: " + decisaoCandidatura;
        }
    }


    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (this.getClass() != outroObjeto.getClass()) {
            return false;
        }
        candidatura outracandidatura = (candidatura) outroObjeto;
        return this.nomeEmpresa.equals(outracandidatura.getNomeEmpresa())
                && this.morada.equals(outracandidatura.getMorada())
                && this.telefone == outracandidatura.getTelefone();
    }
}

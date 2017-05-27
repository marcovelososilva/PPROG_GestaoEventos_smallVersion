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
     * @param nomeEmpresa - nome empresa
     * @param responsavelCandidatura - responsavel candidatura
     * @param morada - morada
     * @param telefone - telefone
     * @param textoExplicativoCandidatura texto explicativo candidatura
     * @param dataCandidatura data candidatura
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
     * @return nome da empresa
     */
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    /**
     * set o nome da empresa
     * @param nomeEmpresa nome da empresa
     */
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    /**
     *get o responsavel da candidatura
     * @return responsavel candidatura
     */
    public String getResponsavelCandidatura() {
        return responsavelCandidatura;
    }

    /**
     * set responvasel pela candidatura
     * @param responsavelCandidatura responsavel da candidatura
     */
    public void setResponsavelCandidatura(String responsavelCandidatura) {
        this.responsavelCandidatura = responsavelCandidatura;
    }

    /**
     * get morada da candidatura
     * @return morada
     */
    public String getMorada() {
        return morada;
    }

    /**
     * set a morada da candidatura
     * @param morada morada
     */
    public void setMorada(String morada) {
        this.morada = morada;
    }

    /**
     * get telefone
     * @return telefone
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * set telefone da candidatura
     * @param telefone telefone
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    /**
     * get ao texto explicativo da candidatura
     * @return texto explicativo
     */
    public String getTextoExplicativoCandidatura() {
        return textoExplicativoCandidatura;
    }

    /**
     * set ao texto explicativo da candidatura
     * @param textoExplicativoCandidatura texto explicativo da candidatura
     */
    public void setTextoExplicativoCandidatura(String textoExplicativoCandidatura) {
        this.textoExplicativoCandidatura = textoExplicativoCandidatura;
    }

    /**
     * get da data de candidatura
     * @return data candidaturas
     */
    public Data getDataCandidatura() {
        return dataCandidatura;
    }

    /**
     * set data da candidatura
     * @param dataCandidatura data de candiadtura
     */
    public void setDataCandidatura(Data dataCandidatura) {
        this.dataCandidatura = dataCandidatura;
    }

    /**
     *get a decisao da candidatura
     * @return decisao candidatura
     */
    public decisao getDecisao() {
        return decisaoCandidatura;
    }

    /**
     * cria uma nova decisao para a candidatura recebendo como parametro uma string
     * o texto explicativo e um boolean sobre a decisao tomada
     * @param textoExplicativo texto explçicativo
     * @param decisaoFavoravel decisao favoravel
     * @param faeSelecionado fae selecionado
     */
    public void addDecisaoFicheiro(String textoExplicativo, boolean decisaoFavoravel, fae faeSelecionado) {
        decisaoCandidatura = new decisao(textoExplicativo, decisaoFavoravel);
        decisaoCandidatura.setFaeAtribuido(faeSelecionado);
    }

    /**
     *cria uma nova decisao para a candidatura
     * @return decisao candidatura
     */ 
    public decisao selecionaCandidaturaCriaDecisao() {
        decisaoCandidatura = new decisao();
        return decisaoCandidatura;

    }
    
    /**
     * return a string com o nome da empresa e data de candidatura
     * @return to string empresa data
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

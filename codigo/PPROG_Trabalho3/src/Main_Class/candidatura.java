package Main_Class;

import Utils.Data;
import java.io.Serializable;

public class candidatura implements Serializable{

    private String nomeEmpresa;
    private String responsavelCandidatura;
    private String morada;
    private int telefone;
    private String textoExplicativoCandidatura;
    private Data dataCandidatura;
    private decisao decisaoCandidatura;

    public candidatura(String nomeEmpresa, String responsavelCandidatura, String morada, int telefone, String textoExplicativoCandidatura, Data dataCandidatura) {
        this.nomeEmpresa = nomeEmpresa;
        this.responsavelCandidatura = responsavelCandidatura;
        this.morada = morada;
        this.telefone = telefone;
        this.textoExplicativoCandidatura = textoExplicativoCandidatura;
        this.dataCandidatura = dataCandidatura;
    }

    public candidatura() {
    }

    @Override
    public String toString() {
        if (decisaoCandidatura==null){
            return "Candidatura da empresa: " + nomeEmpresa +" - Efectuada na data: " + dataCandidatura+"\n"
                +"Com a morada: " + morada + " - Telefone: " + telefone + "\n"
                +"Pessoa Responsavel pela Candidatura: " + responsavelCandidatura  + "\n"
                +"Com o seguinte texto explicativo: " + textoExplicativoCandidatura + "\n"
                +"::Decisao::" + " - Não tomada";
        } else {
        return "Candidatura da empresa: " + nomeEmpresa +" - Efectuada na data: " + dataCandidatura+"\n"
                +"Com a morada: " + morada + " - Telefone: " + telefone + "\n"
                +"Pessoa Responsavel pela Candidatura: " + responsavelCandidatura  + "\n"
                +"Com o seguinte texto explicativo: " + textoExplicativoCandidatura + "\n"
                +"::Decisao:: " + decisaoCandidatura;
    }
    }
    public String toStringEmpresaData(){
        return " Empresa: " + nomeEmpresa + ", candidatura data: " + dataCandidatura;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getResponsavelCandidatura() {
        return responsavelCandidatura;
    }

    public void setResponsavelCandidatura(String responsavelCandidatura) {
        this.responsavelCandidatura = responsavelCandidatura;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getTextoExplicativoCandidatura() {
        return textoExplicativoCandidatura;
    }

    public void setTextoExplicativoCandidatura(String textoExplicativoCandidatura) {
        this.textoExplicativoCandidatura = textoExplicativoCandidatura;
    }

    public Data getDataCandidatura() {
        return dataCandidatura;
    }

    public void setDataCandidatura(Data dataCandidatura) {
        this.dataCandidatura = dataCandidatura;
    }

    /**
     *
     * @param d
     */
    public boolean validaDecisao(decisao d) {
        return d.validarDadosDecisao();
    }

    public boolean validaDadosCandidatura() {
        boolean dadosValidos = true;
//    nomeEmpresa;
//    responsavelCandidatura;
//    morada;
//    telefone;
//    textoExplicativoCandidatura;
        return dadosValidos;
    }

    /**
     *
     * @param d
     */
    public void addDecisaoFicheiro(String textoExplicativo, boolean decisaoFavoravel) {
        decisaoCandidatura = new decisao(textoExplicativo, decisaoFavoravel);
    }
    

    /**
     *
     * @param d
     */
    public decisao selecionaCandidaturaCriaDecisao() {
        decisaoCandidatura= new decisao();
        return decisaoCandidatura;
         
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
        return  this.nomeEmpresa.equals(outracandidatura.getNomeEmpresa()) &&
                this.morada.equals(outracandidatura.getMorada()) &&
                this.telefone == outracandidatura.getTelefone();
    }
}


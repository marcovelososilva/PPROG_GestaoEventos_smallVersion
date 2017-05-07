package Main_Class;

import Utils.Data;

public class candidatura {

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
        return "Candidatura: " + " Pessoa Responsavel pela Candidatura: " + responsavelCandidatura + ", da empresa: " + nomeEmpresa + ", com a morada: " + morada + ", telefone: " + telefone + ", com o seguinte texto explicativo: " + textoExplicativoCandidatura + ", efectuada na data: " + dataCandidatura;
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
    public void gravarDecisao(decisao d) {
        // TODO - implement candidatura.gravarDecisao
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param d
     */
    public decisao addDecisao() {
        decisaoCandidatura = new decisao();
        return decisaoCandidatura;
    }

    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || getClass() != outroObjeto.getClass()) {
            return false;
        }
        candidatura outracandidatura = (candidatura) outroObjeto;
        return  this.nomeEmpresa.equals(outracandidatura.getNomeEmpresa()) &&
                this.morada.equals(outracandidatura.getMorada()) &&
                this.telefone == outracandidatura.getTelefone();
    }
}


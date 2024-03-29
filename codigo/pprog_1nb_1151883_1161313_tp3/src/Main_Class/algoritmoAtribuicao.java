package Main_Class;

import java.util.List;

/**
 *
 * @author Marco
 */
public interface algoritmoAtribuicao {

    /**
     * metodo que vai fazer correr o algoritmo responsavel pela distribuição de fae por candidaturas
     * implementado em todos o smetodos que implementem o algoritmoAtibuicao
     * @param listaFAE - lista de faes
     * @param listaCandidaturas -  lista de candidaturas
     * @param listaAtribuicoes - lista de atribuições
     * @return uma lista que resulta do algoritmo
     */
    public List runAlgoritmo(List<fae> listaFAE, List<candidatura> listaCandidaturas, List<atribuicao> listaAtribuicoes);

    /**
     * metodo que devolve o Nome do algoritmo
     * implementado em todos o smetodos que implementem o algoritmoAtibuicao
     * @return STRING
     */
    public Object getNome();

    /**
     * metodo que devolve o descritivo do algoritmo
     * implementado em todos o smetodos que implementem o algoritmoAtibuicao
     * @return STRING
     */
    public String getDescritivo();

}

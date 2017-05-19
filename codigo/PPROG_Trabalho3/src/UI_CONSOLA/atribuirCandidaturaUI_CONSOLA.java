package UI_CONSOLA;

import Controller.atribuirCandidaturaController;
import Main_Class.*;
import Utils_Consola.*;
import java.util.List;

public class atribuirCandidaturaUI_CONSOLA {

    private final centroDeEventos ce;
    private final atribuirCandidaturaController acController;
    private organizador org;
    
    public atribuirCandidaturaUI_CONSOLA(centroDeEventos ce) {
        this.ce = ce;
        acController = new atribuirCandidaturaController(ce);
    }

    public void run() {
        utilitariosConsola.inicioEscritaConsola("ATRIBUIR CANDIDATURA");
//          1. obter a lista de eventos com a submissao caducada
        List<evento> listaEventosDataCaducados = acController.getListaEventosOrganizadorDataSubmissaoFinalizada(org);
//          2. selecionar o evento (e)
        //imprime a lista de eventos
        utilitariosConsola.escreverConsola("###EVENTOS:");
        int i = 0;
        for (evento e : listaEventosDataCaducados) {
            utilitariosConsola.escreverConsola(i + e.toString());
            i++;
        }
        //pede para selecionar um
        utilitariosConsola.escreverConsola("Escolha um evento!");
        int numEvento = utilitariosConsola.lerConsolaNextIntEntreValores(0, listaEventosDataCaducados.size());
//        acController.selecionaEvento(listaEventosDataCaducados.get(numEvento));
//          3. obter a lista de fae do (e)
        List<fae> listaFAEdoEvento = acController.getListaFAE(listaEventosDataCaducados.get(numEvento));
//          4. obter a lista de candidaturas do (e)
        List<candidatura> listaCandidaturasEEvento = acController.getListaCandidatura(listaEventosDataCaducados.get(numEvento));
        //imprime as estatisticas relativas ao Evento
        System.out.println("Para o evento selecionado: " + listaEventosDataCaducados.get(numEvento).getTitulo() + ", existem:\n "
                           + listaFAEdoEvento.size() + " FAE´s\n " + listaCandidaturasEEvento.size() + " Candidaturas.");
//          5. apresentar a lista de algoritmos
        List<algoritmoAtribuicao> listaAlgoritmos = acController.getAlgoritmosAtribuicao();
//          6. seleciona um algoritmo
        //imprime a lista de algoritmos
        utilitariosConsola.escreverConsola("###ALGORITMOS:");
        int j = 0;
        for (algoritmoAtribuicao a : listaAlgoritmos) {
            utilitariosConsola.escreverConsola(j+ "\n" + a.toString() + "\n");
            j++;
        }
        //pede para selecionar um
        utilitariosConsola.escreverConsola("Escolha um algoritmo!");
        int numAlgoritmo = utilitariosConsola.lerConsolaNextIntEntreValores(0, listaAlgoritmos.size()-1);
        //get lista e atribuicoes
        List listaAtribuicoesEvento = acController.getListaAtribuicoes(listaEventosDataCaducados.get(numEvento));
        
        boolean confirma = false;
        do{
            listaAtribuicoesEvento.clear();
//          7.run o algoritmo e cria objecto atribuição
//            utilitariosConsola.escreverConsola(listaAlgoritmos.get(numAlgoritmo).toString());
            List<atribuicao> atribuicaoTEMP = listaAlgoritmos.get(numAlgoritmo).runAlgoritmo(listaFAEdoEvento, listaCandidaturasEEvento, listaAtribuicoesEvento);
//          8. apresenta as distribuições
        utilitariosConsola.escreverConsola("ALGORITMO ESCOLHIDO: " + listaAlgoritmos.get(numAlgoritmo).toString() + "\n");
        for (atribuicao atri : atribuicaoTEMP) {
            utilitariosConsola.escreverConsola(i + atri.toString());
        }
//          9. confirma
            utilitariosConsola.escreverConsola("Está satisfeito com esta atribuição?");
            confirma = utilitariosConsola.lerConsolaBoolean();
            //se nao confirmar diz qual o proximo algoritmo a executar
            if (!confirma){
                numAlgoritmo = fornecerProximoIntAlgoritmo(numAlgoritmo, listaAlgoritmos.size());
                utilitariosConsola.escreverConsola("RESULTADO COM UM NOVO ALGORITMO");
            } else {
//                listaAtribuicoesEvento.addAll(atribuicaoTEMP);
//          10.informa do sucesso da operação               
                utilitariosConsola.escreverConsola("OPERAÇÃO REALIZADA COM SUCESSO");
            }          
        }while (!confirma);
        utilitariosConsola.fimEscritaConsola();
    }
    
    private static int fornecerProximoIntAlgoritmo (int vaiNo, int numAlgoritmos){
        vaiNo++;
        if (vaiNo > numAlgoritmos-1){
            return 0;
        } else {
            return vaiNo;
        }   
    }

}

package UI_CONSOLA;

import Controller.atribuirCandidaturaController;
import Main_Class.*;
import Utils_Consola.*;
import java.util.List;

public class atribuirCandidaturaUI_CONSOLA {

    private final centroDeEventos ce;
    private final atribuirCandidaturaController acController;

    public atribuirCandidaturaUI_CONSOLA(centroDeEventos ce) {
        this.ce = ce;
        acController = new atribuirCandidaturaController(ce);
    }

    public void run() {
        utilitariosConsola.inicioEscritaConsola("ATRIBUIR CANDIDATURA");
//          1. obter a lista de eventos com a submissao caducada
        List<evento> listaEventosDataCaducados = acController.getListaEventosDataSubmissaoCaducada();
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
        List<algoritmoAtribuicao> listaAlgoritmos = acController.getAlgoritmosAtribuicao(listaEventosDataCaducados.get(numEvento));
//          6. seleciona um algoritmo
        //imprime a lista de algoritmos
        utilitariosConsola.escreverConsola("###ALGORITMOS:");
        int j = 0;
        for (algoritmoAtribuicao a : listaAlgoritmos) {
            utilitariosConsola.escreverConsola(i + a.toString());
            j++;
        }
        //pede para selecionar um
        utilitariosConsola.escreverConsola("Escolha um algoritmo!");
        int numAlgoritmo = utilitariosConsola.lerConsolaNextIntEntreValores(0, listaAlgoritmos.size());
//          7. cria objecto atribuição
        acController.criarAtribuicao(numAlgoritmo, listaEventosDataCaducados.get(numEvento));
        boolean confirma = false;
        
        do{     
            
//          8. apresenta as distribuições
        
//          pergunta se ok ou outra vez!
//          9. confirma
        }while (!confirma);
//          10.informa do sucesso da operação
        utilitariosConsola.fimEscritaConsola();
    }

}

package UI_CONSOLA;

import Main_Class.*;
import Controller.*;
import Utils_Consola.*;
import java.util.List;

public class decidirCandidaturaUI_CONSOLA {

    private final centroDeEventos ce;
    private final decidirCandidaturaController decidirCandController;
    private List<evento> listaEventosActivos;
    private List<candidatura> listaCandidaturas;
    private evento eventoSelecionado;
    private candidatura candidaturaFeita;
    private decisao decisaoFeita;

    public decidirCandidaturaUI_CONSOLA(centroDeEventos ce) {
        this.ce = ce;
        decidirCandController = new decidirCandidaturaController(ce);
    }

    public void run() {
        utilitariosConsola.inicioEscritaConsola("DECIDIR CANDIDATURA");
        //pede a lista de eventos com submissao terminada
        listaEventosActivos = decidirCandController.getListaEventosOrganizadorDataSubmissaoFinalizada();

        //imprime a lista de eventos
        utilitariosConsola.escreverConsola("###EVENTOS:");
        int i = 0;
        for (evento e : listaEventosActivos) {
            utilitariosConsola.escreverConsola(i + e.toString());
            i++;
        }
        //pede para selecionar um evento
        utilitariosConsola.escreverConsola("Escolha um evento!");
        int numEvento = utilitariosConsola.lerConsolaNextIntEntreValores(0, listaEventosActivos.size());

        //Seleciona um evento pede a lista de candidaturas
        listaCandidaturas = decidirCandController.getListaCandidatura(listaEventosActivos.get(numEvento));

        //imprime a lista de candidaturas
        utilitariosConsola.escreverConsola("###CANDIDATURAS:");
        i = 0;
        for (candidatura cand : listaCandidaturas) {
            utilitariosConsola.escreverConsola(i + cand.toString());
            i++;
        }
        if (i == 0) {
            System.out.println("Sem Candidaturas");
        }
        //pede para selecionar uma candidatura
        utilitariosConsola.escreverConsola("Escolha uma candidatura!");
        int numcandidatura = utilitariosConsola.lerConsolaNextIntEntreValores(0, listaEventosActivos.size());

        //seleciona a candidatura e cria a decisao na candidatura     
        decisaoFeita = decidirCandController.selecionarCandidaturaCriaDecisao(listaCandidaturas.get(numcandidatura));

//        //solicita os dados sobre a decisao
        utilitariosConsola.inicioEscritaConsola("##DESCREVA A DECISAO SOBRE A CANDIDATURA");
        System.out.println("XXXXXXXXX");
        utilitariosConsola.escreverConsola(listaEventosActivos.get(numEvento).toString());
        System.out.println("XXXXXXXXX");
        System.out.println("XXXXXXXXX");
        utilitariosConsola.escreverConsola(listaCandidaturas.get(numcandidatura).toString());
        System.out.println("XXXXXXXXX");
        utilitariosConsola.escreverConsola("Decisão Favoravel?");
        Boolean decisaoFavoravel = utilitariosConsola.lerConsolaBoolean();
        utilitariosConsola.escreverConsola("Texto Explicativo");
        String textoDecisao = utilitariosConsola.lerConsolaNextLine();
        utilitariosConsola.fimEscritaConsola();
        
        //faz set dos dados previamente solicitados 
        decidirCandController.setDecisao(decisaoFeita, decisaoFavoravel, textoDecisao);

        //validação global da candidatura, (existe já alguma candidatura EQUALS candidatura)
        utilitariosConsola.fimEscritaConsola();
    }

}

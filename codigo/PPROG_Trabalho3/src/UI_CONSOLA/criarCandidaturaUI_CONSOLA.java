package UI_CONSOLA;

import Main_Class.*;
import Controller.*;
import Utils_Consola.*;
import java.util.List;

public class criarCandidaturaUI_CONSOLA {
    
    private final centroDeEventos ce;
    private final criarCandidaturaController criarCandController;
    private List<evento> listaEventosActivos;
    private evento eventoSelecionado;
    private candidatura candidaturaFeita;

    public criarCandidaturaUI_CONSOLA(centroDeEventos ce) {
        this.ce = ce;
        criarCandController = new criarCandidaturaController(ce);
    }
    
    public void run(){
        utilitariosConsola.inicioEscritaConsola("CRIAR CANDIDATURA");
        listaEventosActivos = criarCandController.getListaEventosSubmissaoActiva();
        
        utilitariosConsola.escreverConsola("###EVENTOS:");
        for (evento e: listaEventosActivos){
           utilitariosConsola.escreverConsola(e.toString());
        }
        
        eventoSelecionado = new evento();
        candidaturaFeita = criarCandController.selecionarEvento(eventoSelecionado);
        //seleciona evento
        
        utilitariosConsola.inicioEscritaConsola("DADOS CANDIDATURA");
        utilitariosConsola.escreverConsola("nome?");
        String nomeEmpresa = utilitariosConsola.lerConsolaNextLine();
        utilitariosConsola.escreverConsola("responsavel Candidatura?");
        String responsavelCandidatura = utilitariosConsola.lerConsolaNextLine();
        utilitariosConsola.escreverConsola("morada?");
        String morada = utilitariosConsola.lerConsolaNextLine();
        utilitariosConsola.escreverConsola("telefone?");
        int telefone = utilitariosConsola.lerConsolaNextInt();
        utilitariosConsola.escreverConsola("texto Explicativo da candidatura?");
        String textoExplicativoCandidatura = utilitariosConsola.lerConsolaNextLine();
        utilitariosConsola.fimEscritaConsola();
        
        criarCandController.setDadosCandidatura(nomeEmpresa, responsavelCandidatura, morada, telefone, textoExplicativoCandidatura);
        //validação global da candidatura, (existe já alguma candidatura EQUALS candidatura)
        if( criarCandController.validaCandidatura(candidaturaFeita)){
            //apresentação e validação dos dados pelo utilizador
            utilitariosConsola.escreverConsola(candidaturaFeita.toString() + "\nOs dados estão correctos?");
            if (utilitariosConsola.lerConsolaBoolean()){
                //validação global, seguida da gravação na lista da candidatura
                if (criarCandController.registaCandidatura(candidaturaFeita)){
                    utilitariosConsola.escreverConsola("OPERAÇÃO REALIZADA COM SUCESSO!");
                } else {
                    utilitariosConsola.escreverConsola("OPERAÇÃO FRACASSADA: erro a adicionar ao array!");
                }
            } else {
                utilitariosConsola.escreverConsola("OPERAÇÃO CANCELADA POR SUA ORDEM: dados incorrectos!");
            }
        } else {
            utilitariosConsola.escreverConsola("OPERAÇÃO FRACASSADA: Já existe uma candidatura com os mesmos dados!");
        }
        utilitariosConsola.fimEscritaConsola();
        
        utilitariosConsola.escreverConsola("\n\no que foi introduzido\n\n" + candidaturaFeita.toString());
    }
    
     
    
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_CONSOLA;

import Controller.escreverFicheiroBinarioController;
import Main_Class.centroDeEventos;
import Main_Class.congresso;
import Main_Class.evento;
import Main_Class.exposicao;
import Main_Class.utilizador;
import Utils.Data;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Marco
 */
public class menuUI_CONSOLA {
    
    private final centroDeEventos ce;

    public menuUI_CONSOLA(centroDeEventos ce) {
        this.ce = ce;
    }
    
    
    
    public void run () {
        String opcao;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("\n Menu:");
            System.out.println("1. CARREGAR DADOS BRUTUS FORCE");
            System.out.println("2. IMPRIMIR UTILIZADORES E EVENTOS");
            System.out.println("3. CARREGAR DE FICHEIRO");
            System.out.println("4. CRIAR CANDIDATURA");
            System.out.println("5. ATRIBUIR CANDIDATURA");
            System.out.println("6. ESCREVER EM FICHEIRO");
            System.out.println("7. DECIDIR CANDIDATURA");
            System.out.println("8. ESCREVER BINARIO");
            System.out.println("9. --XXX--");
            System.out.println("0. Sair");
            System.out.println("\nPor favor escolha uma das opções apresentadas.\n");
            opcao = input.nextLine();
            switch (opcao) {
                case "1":
                    System.out.println("\n==CARREGAR DADOS BRUTUS FORCE==");
                    carregarDadosBrutus(ce);
                    break;
                case "2":
                    System.out.println("\n==IMPRIMIR UTILIZADORES E EVENTOS==");
                    printListaUserEventos(ce);
                    break;
                case "3":
                    System.out.println("\n==CARREGAR DE FICHEIRO==");
                    lerFicheiroUI_CONSOLA lfUI_CONSOLA = new lerFicheiroUI_CONSOLA(ce);
                    lfUI_CONSOLA.run("input.txt");
                    break;
                case "4":
                    System.out.println("\n==CRIAR CANDIDATURA==");
                    criarCandidaturaUI_CONSOLA ccUI_CONSOLA = new criarCandidaturaUI_CONSOLA(ce);
                    ccUI_CONSOLA.run();
                    break;
                case "5":
                    System.out.println("\n==ATRIBUIR CANDIDATURA==");
                    atribuirCandidaturaUI_CONSOLA acUI_CONSOLA = new atribuirCandidaturaUI_CONSOLA(ce);
                    acUI_CONSOLA.run();
                    break;
                case "6":
                    System.out.println("\n==ESCREVER EM FICHEIRO==");
                    escreverFicheiroUI_CONSOLA efUI_CONSOLA = new escreverFicheiroUI_CONSOLA(ce);
                    //          efUI_CONSOLA.run();
                    break;
                case "7":
                    System.out.println("\n==DECIDIR CANDIDATURA==");
                    decidirCandidaturaUI_CONSOLA dcUI_CONSOLA = new decidirCandidaturaUI_CONSOLA(ce);
                    dcUI_CONSOLA.run();
                    break;
                case "8":
                    System.out.println("\n==ESCREVER BINARIO==");
                    escreverFicheiroBinarioController ebController = new escreverFicheiroBinarioController(ce);
                    ebController.serializationFicheiro();
                    break;
                case "9":
                    System.out.println("\n==--XXX--==");
                    break;
                case "0":
                    System.out.println("\n==OBRIGADO==");
                    break;
                default:
                    System.out.println("Opção inválida.\n");
            }
        } while (!opcao.equals("0"));
    }

    private static void carregarDadosBrutus(centroDeEventos ce) {
        ce.addRegistoUtilizadores(new utilizador("André Zulu", "andrezulu@email.pt", "azulu", "zulu123"));
        ce.addRegistoUtilizadores(new utilizador("Bruno Yazalde", "brunoyazalde@email.pt", "byazalde", "yazalde123"));
        ce.addRegistoUtilizadores(new utilizador("Carlos Xaile", "carlosxaile@email.pt", "cxaile", "xaile123"));
        ce.addRegistoUtilizadores(new utilizador("Daniel Veiga", "danielveiga@email.pt", "dveiga", "veiga123"));
        ce.addRegistoUtilizadores(new utilizador("Emanuel Uva", "emanueluva@email.pt", "euva", "uva123"));
        ce.addRegistoUtilizadores(new utilizador("Francisco Torres", "franciscotorres@email.pt", "ftorres", "torres123"));
        ce.addRegistoUtilizadores(new utilizador("Guilherme Silva", "guilhermesilva@email.pt", " gsilva", "silva123"));
        ce.addRegistoUtilizadores(new utilizador("Hugo Ramos", "hugoramos@email.pt", "hramos", "ramos123"));
        ce.addRegistoUtilizadores(new utilizador("Igor Pedroso", "igorpedroso@email.pt", "ipedroso", "pedroso123"));

        ce.createEvento(new evento("Expo Informática", "exposição de informática e material para informática", new Data("2017/06/17"), new Data("2017/06/18"), "Valongo", new Data("2017/05/05"), new exposicao()));
        ce.createEvento(new evento("Expo Desporto", "exposição de desporto e material para desporto", new Data("2017/06/24"), new Data("2017/06/25"), "Santo Tirso", new Data("2017/06/18"), new exposicao()));
        ce.createEvento(new evento("Cong Medicina", "congresso de medicina e sobre medicina", new Data("2017/07/01"), new Data("2017/07/02"), "Ermisinde", new Data("2017/06/25"), new congresso()));
        ce.createEvento(new evento("Cong Treinadores", "congresso de treinadores e sobre treinadores", new Data("2017/07/08"), new Data("2017/07/09"), "Vila Nova Gaia", new Data("2017/07/02"), new congresso()));
    }

    private static void printListaUserEventos(centroDeEventos ce) {
        List<utilizador> utili = ce.getListaUtilizadores();
        List<evento> event = ce.getListaEvento();

        for (int i = 0; i < utili.size(); i++) {
            System.out.println(i + " " + utili.get(i).toString());
        }

        for (evento e : event) {
            System.out.println(e.toStringComFaeOrganizador());
        }

    }
}

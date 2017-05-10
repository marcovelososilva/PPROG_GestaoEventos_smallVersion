/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_CONSOLA;

import Controller.lerFicheiroController;
import Main_Class.*;
import Utils_Consola.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Marco
 */
public class lerFicheiroUI_CONSOLA {

    private final centroDeEventos ce;
    private final lerFicheiroController lfcontroller;

    public lerFicheiroUI_CONSOLA(centroDeEventos ce) {
        this.ce = ce;
        this.lfcontroller = new lerFicheiroController(ce);
    }

    public void run() {
        utilitariosConsola.escreverConsola("Qual o nome do ficheiro? (default: input.txt)");
        String ficheiro = utilitariosConsola.lerConsolaNextLine();
        try {
            boolean tudoOk = inputFicheiroInicial(ficheiro);
            if (tudoOk) {
                utilitariosConsola.escreverConsola("OPERAÇÃO REALIZADA COM SUCESSO!");
            } else {
                utilitariosConsola.escreverConsola("OPERAÇÃO GEROU ERROS E NÃO FOI COMPLETADA");
            }
        } catch (IOException e) {
            utilitariosConsola.escreverConsola("O FICHEIRO " + ficheiro + " não existe ou não tem permissões para ser lido!");
        }
    }

    private boolean inputFicheiroInicial(String fileName) throws IOException {
        boolean tudoOk = true;
        String estouLendo = "procura";

        try (Scanner input = new Scanner(new File(fileName))) {
            while (input.hasNext()) {
                String linha = input.nextLine();
                if (linha.trim().length() > 0) {
                    switch (linha) {
                        case "utilizadores":
                            estouLendo = "lerUtilizador";
                            break;
                        case "eventos":
                            estouLendo = "lerEvento";
                            break;
                        case "gestoreseventos":
                            estouLendo = "lerGestor";
                            break;
                        case "fae":
                            estouLendo = "lerFAE";
                            break;
                        case "organizadores":
                            estouLendo = "lerOrganizador";
                            break;
                        case "candidaturas":
                            estouLendo = "lerCandidaturas";
                            break;
                        case "atribuicao":
                            estouLendo = "lerAtribuicoes";
                            break;    
                        case "end":
                            estouLendo = "procura";
                            break;
                        default:
                            switch (estouLendo) {
                                case "lerUtilizador":
                                    lerUtilizador(linha);
                                    break;
                                case "lerEvento":
                                    lerEvento(linha);
                                    break;
                                case "lerGestor":
                                    lerGestor(linha);
                                    break;
                                case "lerFAE":
                                    lerFAE(linha);
                                    break;
                                case "lerOrganizador":
                                    lerOrganizador(linha);
                                    break;
                                case "lerCandidaturas":
                                    lerCandidaturas(linha);
                                    break;
                                case "lerAtribuicoes":
                                    lerAtribuicoes(linha);
                                    break;    
                                default:
                                    break;
                            }
                            break;
                    }

                }
            }
            input.close();
        } catch (FileNotFoundException ex) {
            System.out.println("[ i ] O ficheiro " + fileName + " não existe no directorio atual");
        }
        return tudoOk;
    }

    private void lerUtilizador(String linha) {
        String conteudo[] = linha.split(";");
        lfcontroller.lerUtilizadorController(conteudo);
    }

    private void lerEvento(String linha) {
        String conteudo[] = linha.split(";");
        lfcontroller.lerEventoController(conteudo);
    }

    private void lerFAE(String linha) {
        String conteudo[] = linha.split(";");
        lfcontroller.lerFAEController(conteudo);
    }

    private void lerOrganizador(String linha) {
        String conteudo[] = linha.split(";");
        lfcontroller.lerOrganizadorController(conteudo);
    }

    private void lerCandidaturas(String linha) {
        String conteudo[] = linha.split(";");
        lfcontroller.lerCandidatura(conteudo);
    }

    private void lerGestor(String linha) {
        String conteudo[] = linha.split(";");
        lfcontroller.lerGestorController(conteudo);
    }

    private void lerAtribuicoes(String linha) {
        String conteudo[] = linha.split(";");
        lfcontroller.lerAtribuicoes(conteudo);
    }
}

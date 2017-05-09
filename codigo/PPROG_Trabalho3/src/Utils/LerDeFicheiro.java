/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Controller.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Marco
 */
public class LerDeFicheiro {
    
    lerFicheiroController lfcontroller;

    public boolean inputFicheiroInicial (String fileName, lerFicheiroController lfcontroller) throws IOException {
        this.lfcontroller = lfcontroller;
        boolean tudoOk = false;
        String estouLendo = "procura";
        
        try (Scanner input = new Scanner(new File(fileName))) {
            while (input.hasNext()) {
                String linha = input.nextLine();
                if (linha.trim().length() > 0) {
                        switch (linha) {
                            case "utilizador": 
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
                                System.out.println("encontrouxxxx");
                                     break;
                            case "organizadores":  
                                estouLendo = "lerOrganizador";
                                System.out.println("encontrouxxxx");
                                     break;
                            case "candidatura":
                                estouLendo = "lerCandidatura";
                                System.out.println("encontrouxxxx");
                                    break;
                            case "end":
                                estouLendo = "procura";
                                     break;
                            default: 
                                switch (estouLendo){
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
                                    case "lerCandidatura":
                                        lerCandidatura(linha);
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

    public void lerUtilizador (String linha){
        String conteudo [] = linha.split(";");
        lfcontroller.lerUtilizadorController(conteudo);
    }
    
    private void lerEvento (String linha){
        String conteudo [] = linha.split(";");
        lfcontroller.lerEventoController(conteudo);
    }
    
    private void lerFAE (String linha){
        String conteudo [] = linha.split(";");
        lfcontroller.lerFAEController(conteudo);
    }
    
    private void lerOrganizador (String linha){
        String conteudo [] = linha.split(";");
        lfcontroller.lerOrganizadorController(conteudo);
    }
    
    private void lerGestor (String linha){
        String conteudo [] = linha.split(";");
        lfcontroller.lerGestorController(conteudo);
    }
    private void lerCandidatura (String linha){
        String conteudo [] = linha.split(";");
        lfcontroller.lerCandidatura(conteudo);
    }
    
    
/*
    public static String topGravarFicheiro(int[] param, String[] topDados, double[][] matriz, double[] pesos, String[] nomesCriterios, String[] nomesAlternativas, String colunasCustos) {
//copia para o string final os nomes dos criterios        
        String[] tempNomesCriterios = new String[nomesCriterios.length];
        tempNomesCriterios = topDados[3].trim().split(";");
        for (int i = 0; i < nomesCriterios.length; i++) {
            nomesCriterios[i] = tempNomesCriterios[i];
        }
//copia para o string final o nomes das alternativas        
        String[] tempNomesAlternativas = new String[nomesAlternativas.length];
        tempNomesAlternativas = topDados[4].trim().split(";");
        for (int i = 0; i < nomesAlternativas.length; i++) {
            nomesAlternativas[i] = tempNomesAlternativas[i];
        }
//copia os criterios que são custos para uma string caso não tenha a flag -1 (que avisa o metodo TOPSIS que não existem custos)
        if (!topDados[0].equalsIgnoreCase("-1")) {
            String[] tempCustos = new String[topDados[0].split(";").length];
            tempCustos = topDados[0].split(";");
            tempCustos = ordenarVetor(tempCustos);
            colunasCustos = verificaIdentificaCustos(tempCustos, nomesCriterios);
        } else {
            colunasCustos = ("-1");
        }
//copia se tiver informação os nomes e pesos dos PESOS CRITERIOS organiza e armazena os dados, caso não os haja divide 1 pelo numero de criterios
        if (!topDados[1].equalsIgnoreCase("0")) {
            String[] tempVecPesos = new String[topDados[1].split(";").length];
            String[] tempNumVecPesos = new String[topDados[2].split(";").length];
            tempVecPesos = topDados[1].split(";");
            tempNumVecPesos = topDados[2].split(";");

            String[] ordenado = new String[param[0]];
            for (int i = 0; i < param[0]; i++) {
                for (int f = 0; f < param[0]; f++) {
                    if (tempVecPesos[i].equalsIgnoreCase(nomesCriterios[f])) {
                        ordenado[f] = tempNumVecPesos[i];
                        break;
                    }
                }
            }
            copiaArrayStringParaDouble(ordenado, pesos);
        } else {
            for (int i = 0; i < param[0]; i++) {
                pesos[i] = (double) 1 / param[0];
            }
        }
//copia a informação da Matriz comparação        
        String[] tempMatriz1 = new String[topDados[5].split(";").length];
        tempMatriz1 = topDados[5].split(";");
        double[] tempMatriz = new double[topDados[5].split(";").length];
        copiaArrayStringParaDouble(tempMatriz1, tempMatriz);
        int cont = 0;
        for (int i = 0; i < param[1]; i++) {
            for (int f = 0; f < param[0]; f++) {
                matriz[i][f] = tempMatriz[cont];
                cont++;
            }
        }
        return colunasCustos;
    }
*/
}

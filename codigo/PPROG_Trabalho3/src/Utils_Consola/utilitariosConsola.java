/*
 * Classe de utilitários de interface com a consola;
 * leitura e escrita, e metodos genericos e uteis de aceitação de dados;
 * TUDO RELACIONADO COM INTERFACE CONSOLA!!!
 */
package Utils_Consola;

import java.util.InputMismatchException;
import java.util.Scanner;


public class utilitariosConsola {    

    /**
     * metodo para ler da consola
     * @return valor lido na consola
     */
    public static String lerConsolaNextLine(){
        Scanner input = new Scanner (System.in);
        return input.nextLine();
    }
    
    /**
     * Metodo para apenas receber valores inteiros entre um valor minimo e um valor maximo
     * alertando se for introduzido qualquer tipo de valor que nao cumpra
     * @param valorMinimo valor minimo
     * @param valorMaximo valor maximo
     * @return
     */
    public static int lerConsolaNextIntEntreValores(int valorMinimo, int valorMaximo){
        Scanner input = new Scanner (System.in);
        int resposta = -1;
        boolean taBem = false;
        
        do{
            try{
                resposta = input.nextInt();
                if (resposta < valorMinimo || resposta > valorMaximo){
                    System.out.println("Por favor inserir um número entre " + valorMinimo + " e " + valorMaximo);
                    input.nextLine();
                    taBem = false;
                } else {
                    taBem = true;
                }
            } catch(InputMismatchException ex){
                escreverConsola("Por Favor só números!");
                input.nextLine();
                taBem = false;
            } catch (Exception ex){
                escreverConsola("ERRO! Por Favor Repita");
                input.nextLine();
                taBem = false;
            }  
        }while(!taBem);

        return resposta;
    }
    
    /**
     *
     * @return
     */
    public static int lerConsolaNextInt(){
        Scanner input = new Scanner (System.in);
        int resposta;
        do{
            try{
               resposta = input.nextInt();
            } catch(InputMismatchException ex){
                escreverConsola("Por Favor só números!");
                resposta = -1;
            } catch (Exception ex){
                escreverConsola("ERRO! Por Favor Repita");
                resposta = -1;
            }
        } while(resposta == -1);    
        return resposta;
    }
    
    /**
     *
     * @return
     */
    public static float lerConsolaNextFloat(){
        Scanner input = new Scanner (System.in);
        float resposta;
            try{
               resposta = input.nextFloat();
            } catch(InputMismatchException ex){
                escreverConsola("Por Favor só números!");
                resposta = -1;
            } catch (Exception ex){
                escreverConsola("ERRO! Por Favor Repita");
                resposta = -1;
            }
        return resposta;
    }
    
    /**
     *
     * @return
     */
    public static boolean lerConsolaBoolean(){
        Scanner input = new Scanner (System.in);
        System.out.println("1.Sim\n2.Não");
        boolean ok = false;
        int resposta=0;
            
        do{
            try{
               resposta = input.nextInt();
               if ( resposta < 1 || resposta > 2){
                escreverConsola("Por Favor escolher 1. para Sim ou 2. para Não");
                input.nextLine();
                ok = false;
            } else{
                ok = true;
            }
            } catch(InputMismatchException ex){
                escreverConsola("Por Favor só números!");
                input.nextLine();
            } catch (Exception ex){
                escreverConsola("ERRO! Por Favor Repita");
                input.nextLine();
            }
        } while(!ok);
            
        
        return (resposta == 1);
    }
    
    /**
     * metodo para escrever na consola
     * @param escrever para escrever
     */
    public static void escreverConsola(String escrever){
        System.out.println(escrever);
    }
    
    /**
     * Método que imprime no final do output inicio de highlight
     * @param titulo texto que aparecerá no cabeçalho da escrita do método
     */
    public static void inicioEscritaConsola (String titulo){
        System.out.println("\n=====" + titulo + "=====");
    }
    
    /**
     * Método que imprime no final do output fim de highlight
     */
    public static void fimEscritaConsola(){
        System.out.println("=========================\n");
    }
    
    /**
     * Método de final de operação com enter para continuar o programa
     */
    public static void enterParaContinuar(){
        Scanner input = new Scanner (System.in);
        System.out.println("\n\nCarregue Enter para continuar...");
        try{
        input.nextLine();
        }catch (Exception e)
        { }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
    }

}

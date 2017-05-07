/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_Class;

import UI.*;
import UI_CONSOLA.criarCandidaturaUI_CONSOLA;
import Utils.Data;
import java.util.List;
/**
 *
 * @author Marco
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        centroDeEventos ce = new centroDeEventos();
        ce.addRegistoUtilizadores(new utilizador("André Zulu", "andrezulu@email.pt", "azulu", "zulu123"));
        ce.addRegistoUtilizadores(new utilizador("Bruno Yazalde", "brunoyazalde@email.pt", "byazalde", "yazalde123"));
        ce.addRegistoUtilizadores(new utilizador("Carlos Xaile", "carlosxaile@email.pt", "cxaile", "xaile123"));
        ce.addRegistoUtilizadores(new utilizador("Daniel Veiga", "danielveiga@email.pt", "dveiga", "veiga123"));
        ce.addRegistoUtilizadores(new utilizador("Emanuel Uva", "emanueluva@email.pt", "euva", "uva123"));
        ce.addRegistoUtilizadores(new utilizador("Francisco Torres", "franciscotorres@email.pt", "ftorres", "torres123"));
        ce.addRegistoUtilizadores(new utilizador("Guilherme Silva", "guilhermesilva@email.pt"," gsilva", "silva123"));
        ce.addRegistoUtilizadores(new utilizador("Hugo Ramos", "hugoramos@email.pt", "hramos", "ramos123"));
        ce.addRegistoUtilizadores(new utilizador("Igor Pedroso", "igorpedroso@email.pt", "ipedroso", "pedroso123"));
        
        ce.createEvento(new evento("Expo Informática", "exposição de informática e material para informática", new Data("2017/06/17"), new Data("2017/06/18"), "Valongo", new Data("2017/06/11"), new exposicao()));
        ce.createEvento(new evento("Expo Desporto", "exposição de desporto e material para desporto", new Data("2017/06/24"), new Data("2017/06/25"), "Santo Tirso", new Data("2017/06/18"), new exposicao()));
        ce.createEvento(new evento("Cong Medicina", "congresso de medicina e sobre medicina", new Data("2017/07/01"), new Data("2017/07/02"), "Ermisinde", new Data("2017/06/25"), new congresso()));
        ce.createEvento(new evento("Cong Treinadores", "congresso de treinadores e sobre treinadores", new Data("2017/07/08"), new Data("2017/07/09"), "Vila Nova Gaia", new Data("2017/07/02"), new congresso()));     
        
        //mainUI janela = new mainUI(ce);        
        
        List utili = ce.getListaUtilizadores();
        List event = ce.getListaEvento();
        
        for ( int i = 0; i < utili.size(); i++){
            System.out.println(utili.get(i).toString());
        }
        for ( int i = 0; i < event.size(); i++){
            System.out.println(event.get(i).toString());
        }
        
        criarCandidaturaUI_CONSOLA ccUI_CONSOLA = new criarCandidaturaUI_CONSOLA(ce);
        ccUI_CONSOLA.run();
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Main_Class.utilizador;
import Main_Class.evento;
import Main_Class.centroDeEventos;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListModel;

/**
 *
 * @author Marco
 */
public class mainUI extends JFrame{
    
    public mainUI(centroDeEventos ce) {
        super ("Centro de Eventos");
        
        JPanel PainelOeste = criarPainelUtilizadores(ce);
        JPanel PainelEventos = criarPainelEventos(ce);
        
        add(PainelOeste, BorderLayout.WEST);
        add(PainelEventos, BorderLayout.EAST);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        pack();
        setVisible(true); 
    }

    private JPanel criarPainelEventos(centroDeEventos ce) {
        JPanel este = new JPanel(new FlowLayout());
        List<evento> listaEventos = ce.getListaEvento();
        JList printListaEventos = new JList((ListModel) listaEventos);
        este.add(printListaEventos);
        return este;
    }

    private JPanel criarPainelUtilizadores(centroDeEventos ce) {
        JPanel oeste = new JPanel(new FlowLayout());
        List<utilizador> listaUtilizadores = ce.getListaUtilizadores();
        JList printListaUtilizador = new JList((ListModel) listaUtilizadores);
        oeste.add(printListaUtilizador);
        return oeste;
    }
    
   
    
}

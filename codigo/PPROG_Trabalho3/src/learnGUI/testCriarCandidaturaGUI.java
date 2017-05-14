/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnGUI;

import Main_Class.*;
import java.util.List;
import Main_Class.*;
import Controller.*;
import Utils_Consola.*;

/**
 *
 * @author JASM
 */
public class testCriarCandidaturaGUI extends javax.swing.JFrame {

    private final centroDeEventos ce;
    private final criarCandidaturaController criarCandController;
    private List<evento> listaEventosActivos;
    private candidatura candidaturaFeita;

    /**
     * Creates new form testAtribuirCandidaturaGUI
     */
    public testCriarCandidaturaGUI(centroDeEventos ce) {
        this.ce = ce;
        criarCandController = new criarCandidaturaController(ce);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListaEventosActivos = new javax.swing.JList<>();
        nomeEmpresa = new javax.swing.JTextField();
        telefone = new javax.swing.JTextField();
        morada = new javax.swing.JTextField();
        responsavelCandidatura = new javax.swing.JTextField();
        textoExplicativoCandidatura = new javax.swing.JTextField();
        descritivoTitulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        descritivoTexto = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        descritivoLocal = new javax.swing.JLabel();
        dataInicio = new javax.swing.JLabel();
        descritivoDataInicio = new javax.swing.JLabel();
        dataFim = new javax.swing.JLabel();
        descritivoDataFim = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        descritivoDataLimiteSubmissaoCandidaturas = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        butaoSubmeter = new javax.swing.JButton();
        botaoLimparDados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        listaEventosActivos = criarCandController.getListaEventosSubmissaoActiva();
        String[] strings = new String[listaEventosActivos.size()];
        int i=0;
        for (evento e: listaEventosActivos){
            strings[i]=e.getTitulo();
            i++;
        }
        jListaEventosActivos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eventos a que se pode candidatar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        jListaEventosActivos.setModel(new javax.swing.AbstractListModel<String>() {
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListaEventosActivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListaEventosActivosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListaEventosActivos);

        nomeEmpresa.setText("nomeEmpresa");
        nomeEmpresa.setPreferredSize(new java.awt.Dimension(80, 24));

        telefone.setText("telefone");
        telefone.setPreferredSize(new java.awt.Dimension(80, 24));

        morada.setText("morada");
        morada.setPreferredSize(new java.awt.Dimension(80, 24));

        responsavelCandidatura.setText("responsavelCandidatura");
        responsavelCandidatura.setPreferredSize(new java.awt.Dimension(80, 24));

        textoExplicativoCandidatura.setText("textoExplicativoCandidatura");
        textoExplicativoCandidatura.setBorder(javax.swing.BorderFactory.createTitledBorder("Justificativo da Submissao"));
        textoExplicativoCandidatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoExplicativoCandidaturaActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome da Empresa");

        jLabel4.setText("Telefone");

        jLabel5.setText("Morada");

        jLabel6.setText("Responsavel");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Titulo");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Descricao");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Local");

        dataInicio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        dataInicio.setText("Data Inicio");

        dataFim.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        dataFim.setText("Data Fim");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Data final de aceitação de candidaturas");

        separador.setToolTipText("Criacao da Candidatura");

        butaoSubmeter.setText("Submeter");
        butaoSubmeter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaoSubmeterActionPerformed(evt);
            }
        });

        botaoLimparDados.setText("Limpar Dados");
        botaoLimparDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparDadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel8)
                            .addComponent(dataInicio)
                            .addComponent(dataFim))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(descritivoLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(descritivoTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(descritivoTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(descritivoDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(12, 12, 12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(descritivoDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descritivoDataLimiteSubmissaoCandidaturas, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 74, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(separador))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(responsavelCandidatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(morada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(telefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textoExplicativoCandidatura, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoLimparDados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(butaoSubmeter)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descritivoTitulo)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(descritivoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(descritivoLocal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dataInicio)
                            .addComponent(descritivoDataInicio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dataFim)
                            .addComponent(descritivoDataFim))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(descritivoDataLimiteSubmissaoCandidaturas)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(morada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(responsavelCandidatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(textoExplicativoCandidatura, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butaoSubmeter)
                    .addComponent(botaoLimparDados)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jListaEventosActivosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListaEventosActivosMouseClicked
        evento e = listaEventosActivos.get(jListaEventosActivos.getSelectedIndex());
        descritivoTitulo.setText(e.getTitulo());
        descritivoTexto.setText(e.getTextoDescritivo());
        descritivoLocal.setText(e.getLocal());
        descritivoDataInicio.setText(e.getDataInicio().toString());
        descritivoDataFim.setText(e.getDataFim().toString());
        descritivoDataLimiteSubmissaoCandidaturas.setText(e.getDataLimiteSubmissaoCandidaturas().toString());
        
    }//GEN-LAST:event_jListaEventosActivosMouseClicked

    private void botaoLimparDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparDadosActionPerformed
        morada.setText("");
        nomeEmpresa.setText("");
        textoExplicativoCandidatura.setText("");
        telefone.setText("");
        responsavelCandidatura.setText("");
    }//GEN-LAST:event_botaoLimparDadosActionPerformed

    private void butaoSubmeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaoSubmeterActionPerformed
        candidaturaFeita = criarCandController.selecionarEvento(listaEventosActivos.get(jListaEventosActivos.getSelectedIndex()));
        criarCandController.setDadosCandidatura(nomeEmpresa.getText(), responsavelCandidatura.getText(), morada.getText(),
                 Integer.parseInt(telefone.getText()), textoExplicativoCandidatura.getText());
        if (criarCandController.registaCandidatura(candidaturaFeita)){
                    utilitariosConsola.escreverConsola("OPERAÇÃO REALIZADA COM SUCESSO!");
                } else {
                    utilitariosConsola.escreverConsola("OPERAÇÃO FRACASSADA: erro a adicionar ao array!");
                }
    }//GEN-LAST:event_butaoSubmeterActionPerformed

    private void textoExplicativoCandidaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoExplicativoCandidaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoExplicativoCandidaturaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(testCriarCandidaturaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(testCriarCandidaturaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(testCriarCandidaturaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(testCriarCandidaturaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(centroDeEventos ce) {
                new testCriarCandidaturaGUI(ce).setVisible(true);
            }

            @Override
            public void run() {
                System.out.println("t");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoLimparDados;
    private javax.swing.JButton butaoSubmeter;
    private javax.swing.JLabel dataFim;
    private javax.swing.JLabel dataInicio;
    private javax.swing.JLabel descritivoDataFim;
    private javax.swing.JLabel descritivoDataInicio;
    private javax.swing.JLabel descritivoDataLimiteSubmissaoCandidaturas;
    private javax.swing.JLabel descritivoLocal;
    private javax.swing.JLabel descritivoTexto;
    private javax.swing.JLabel descritivoTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListaEventosActivos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField morada;
    private javax.swing.JTextField nomeEmpresa;
    private javax.swing.JTextField responsavelCandidatura;
    private javax.swing.JSeparator separador;
    private javax.swing.JTextField telefone;
    private javax.swing.JTextField textoExplicativoCandidatura;
    // End of variables declaration//GEN-END:variables
}

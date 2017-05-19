/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnGUI;

import Main_Class.centroDeEventos;
import Main_Class.evento;
import Main_Class.utilizador;
import UI.criarCandidaturaUI;
import UI_CONSOLA.decidirCandidaturaUI_CONSOLA;
import UI_CONSOLA.escreverFicheiroUI_CONSOLA;
import UI_CONSOLA.lerFicheiroUI_CONSOLA;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author JASM
 */
public class testGui extends javax.swing.JFrame {

    centroDeEventos ce = new centroDeEventos();

    /**
     * Creates new form testGui
     */
    public testGui() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        botaoCarregarDadosFicheiro = new javax.swing.JButton();
        botaoEscreverDadosFicheiro = new javax.swing.JButton();
        botaoImprimirDados = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botaoCriarCandidatura = new javax.swing.JButton();
        botaoAtribuirCandidatura = new javax.swing.JButton();
        botaoDecidirCandidatura = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Trabalho PPROG IT3");

        botaoCarregarDadosFicheiro.setText("Read");
        botaoCarregarDadosFicheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCarregarDadosFicheiroActionPerformed(evt);
            }
        });

        botaoEscreverDadosFicheiro.setText("Write");
        botaoEscreverDadosFicheiro.setAutoscrolls(true);
        botaoEscreverDadosFicheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEscreverDadosFicheiroActionPerformed(evt);
            }
        });

        botaoImprimirDados.setText("Print");
        botaoImprimirDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoImprimirDadosActionPerformed(evt);
            }
        });

        jLabel5.setText("Carregar Dados Ficheiro");

        jLabel6.setText("Escrever Dados Ficheiro");

        jLabel7.setText("Imprimir Dados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoCarregarDadosFicheiro)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(botaoImprimirDados, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                        .addComponent(botaoEscreverDadosFicheiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botaoCarregarDadosFicheiro, botaoEscreverDadosFicheiro, botaoImprimirDados});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCarregarDadosFicheiro)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoEscreverDadosFicheiro)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoImprimirDados)
                    .addComponent(jLabel7))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        botaoCriarCandidatura.setText("UC5");
        botaoCriarCandidatura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoCriarCandidaturaMouseClicked(evt);
            }
        });
        botaoCriarCandidatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarCandidaturaActionPerformed(evt);
            }
        });

        botaoAtribuirCandidatura.setText("UC3");
        botaoAtribuirCandidatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtribuirCandidaturaActionPerformed(evt);
            }
        });

        botaoDecidirCandidatura.setText("UC4");
        botaoDecidirCandidatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDecidirCandidaturaActionPerformed(evt);
            }
        });

        jLabel8.setText("Criar Candidatura");

        jLabel9.setText("Atribuir Candidatura");

        jLabel10.setText("Decidir Candidatura");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoCriarCandidatura)
                    .addComponent(botaoAtribuirCandidatura)
                    .addComponent(botaoDecidirCandidatura, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botaoAtribuirCandidatura, botaoCriarCandidatura, botaoDecidirCandidatura});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCriarCandidatura)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAtribuirCandidatura)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoDecidirCandidatura)
                    .addComponent(jLabel10))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jLabel2.setText("Turma - 1NA");

        jLabel3.setText("Joao Mouta - 1161313");

        jLabel4.setText("Marco Silva - 1151883");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(242, 242, 242))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCarregarDadosFicheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCarregarDadosFicheiroActionPerformed
        lerFicheiroUI_CONSOLA lfUI_CONSOLA = new lerFicheiroUI_CONSOLA(ce);
        String ficheiro = JOptionPane.showInputDialog("Qual e o ficheiro?");
        if (ficheiro!=null){
            lfUI_CONSOLA.run(ficheiro);
        }
    }//GEN-LAST:event_botaoCarregarDadosFicheiroActionPerformed
    private void botaoAtribuirCandidaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtribuirCandidaturaActionPerformed
        testeAtribuirCandidatura ac = new testeAtribuirCandidatura(ce);
        ac.setVisible(true);
    }//GEN-LAST:event_botaoAtribuirCandidaturaActionPerformed

    private void botaoEscreverDadosFicheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEscreverDadosFicheiroActionPerformed
        escreverFicheiroUI_CONSOLA efUI_CONSOLA = new escreverFicheiroUI_CONSOLA(ce);
        String ficheiro = JOptionPane.showInputDialog("Qual e o ficheiro?");
        if (ficheiro!=null){
            efUI_CONSOLA.run(ficheiro);
        }
    }//GEN-LAST:event_botaoEscreverDadosFicheiroActionPerformed

    private void botaoImprimirDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoImprimirDadosActionPerformed
        testeImpressao ti = new testeImpressao(ce);
        ti.setVisible(true);
    }//GEN-LAST:event_botaoImprimirDadosActionPerformed

    private void botaoCriarCandidaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarCandidaturaActionPerformed
        testCriarCandidaturaGUI cc = new testCriarCandidaturaGUI(ce);
        cc.setVisible(true);
    }//GEN-LAST:event_botaoCriarCandidaturaActionPerformed

    private void botaoDecidirCandidaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDecidirCandidaturaActionPerformed
        testeDecidirCandidatura dc = new testeDecidirCandidatura(ce);
        dc.setVisible(true);
    }//GEN-LAST:event_botaoDecidirCandidaturaActionPerformed

    private void botaoCriarCandidaturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCriarCandidaturaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoCriarCandidaturaMouseClicked

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
            java.util.logging.Logger.getLogger(testGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(testGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(testGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(testGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new testGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAtribuirCandidatura;
    private javax.swing.JButton botaoCarregarDadosFicheiro;
    private javax.swing.JButton botaoCriarCandidatura;
    private javax.swing.JButton botaoDecidirCandidatura;
    private javax.swing.JButton botaoEscreverDadosFicheiro;
    private javax.swing.JButton botaoImprimirDados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

}

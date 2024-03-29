/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnGUI;

import Main_Class.*;
import java.util.List;
import Controller.*;
import javax.swing.JOptionPane;

/**
 *
 * @author JASM
 */
public class testCriarCandidaturaGUI extends javax.swing.JFrame {

    private final centroDeEventos ce;
    private final criarCandidaturaController criarCandController;
    private List<evento> listaEventosActivos;
    private candidatura candidaturaFeita;
    private evento e;
    private String ObjButtons[] = {"Sim","Nao"};
    /**
     * Creates new form testAtribuirCandidaturaGUI
     * São colocados todos os campos como nao editaveis ou nao visiveis de forma a nao propagar erros
     * Apenas a Lista de Eventos e que inicializa como visivel/editavel
     * @param ce - centro de eventos
     */
    public testCriarCandidaturaGUI(centroDeEventos ce) {
        this.ce = ce;
        criarCandController = new criarCandidaturaController(ce);
        initComponents();
        setResizable(false);
        nomeEmpresa.setEditable(false);
        responsavelCandidatura.setEditable(false);
        morada.setEditable(false);
        telefone.setEditable(false);
        textoExplicativoCandidatura.setEditable(false);
        botaoConfirmaEvento.setEnabled(false);
        botaoLimparDados.setEnabled(false);
        botaoSubmeter.setEnabled(false);
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
        labelNomeDaEmpresa = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        labelMorada = new javax.swing.JLabel();
        labelResponsavel = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        labelDescricao = new javax.swing.JLabel();
        descritivoTexto = new javax.swing.JLabel();
        labelLocal = new javax.swing.JLabel();
        descritivoLocal = new javax.swing.JLabel();
        dataInicio = new javax.swing.JLabel();
        descritivoDataInicio = new javax.swing.JLabel();
        dataFim = new javax.swing.JLabel();
        descritivoDataFim = new javax.swing.JLabel();
        labelDatafinalCandidatura = new javax.swing.JLabel();
        descritivoDataLimiteSubmissaoCandidaturas = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        botaoSubmeter = new javax.swing.JButton();
        botaoLimparDados = new javax.swing.JButton();
        botaoConfirmaEvento = new javax.swing.JButton();
        Sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("UC 5 - Criar Candidatura");
        setMinimumSize(new java.awt.Dimension(771, 435));

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

        nomeEmpresa.setPreferredSize(new java.awt.Dimension(80, 24));

        telefone.setPreferredSize(new java.awt.Dimension(80, 24));

        morada.setPreferredSize(new java.awt.Dimension(80, 24));

        responsavelCandidatura.setPreferredSize(new java.awt.Dimension(80, 24));

        textoExplicativoCandidatura.setBorder(javax.swing.BorderFactory.createTitledBorder("Justificativo da Submissao"));

        labelNomeDaEmpresa.setText("Nome da Empresa");

        labelTelefone.setText("Telefone");

        labelMorada.setText("Morada");

        labelResponsavel.setText("Responsavel");

        labelTitulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelTitulo.setText("Titulo");

        labelDescricao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelDescricao.setText("Descricao");

        labelLocal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelLocal.setText("Local");

        dataInicio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        dataInicio.setText("Data Inicio");

        dataFim.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        dataFim.setText("Data Fim");

        labelDatafinalCandidatura.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelDatafinalCandidatura.setText("Data final de aceitação de candidaturas");

        separador.setToolTipText("Criacao da Candidatura");

        botaoSubmeter.setText("Submeter");
        botaoSubmeter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSubmeterActionPerformed(evt);
            }
        });

        botaoLimparDados.setText("Limpar Dados");
        botaoLimparDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparDadosActionPerformed(evt);
            }
        });

        botaoConfirmaEvento.setText("Confirma Evento e Cria Candidatura");
        botaoConfirmaEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoConfirmaEventoMouseClicked(evt);
            }
        });

        Sair.setText("Sair");
        Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(labelDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(labelLocal)
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
                                .addComponent(labelDatafinalCandidatura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(descritivoDataLimiteSubmissaoCandidaturas, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addComponent(separador)))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNomeDaEmpresa)
                                    .addComponent(labelTelefone)
                                    .addComponent(labelMorada)
                                    .addComponent(labelResponsavel)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(botaoLimparDados)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoSubmeter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Sair))
                            .addComponent(responsavelCandidatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(morada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(telefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textoExplicativoCandidatura))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(botaoConfirmaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descritivoTitulo)
                            .addComponent(labelTitulo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDescricao)
                            .addComponent(descritivoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelLocal)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDatafinalCandidatura)
                            .addComponent(descritivoDataLimiteSubmissaoCandidaturas, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoConfirmaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNomeDaEmpresa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTelefone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMorada)
                            .addComponent(morada, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelResponsavel)
                            .addComponent(responsavelCandidatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoLimparDados)
                            .addComponent(botaoSubmeter)
                            .addComponent(Sair)))
                    .addComponent(textoExplicativoCandidatura, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * Ao selecionar um campo na JlistEventosActivos vai criar um evento com comparação na ListaEventos activos.
     * Utiliza o metodo de Jlist (getSelectedIndex) para saber qual é o indice a ser usado na ListEventos activos.
     * Ao selecionar o evento vai preencher as caixas de texto com a sua informação com o metodo .setText.
     * @param evt - on event - on event
     */
    private void jListaEventosActivosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListaEventosActivosMouseClicked
        e = listaEventosActivos.get(jListaEventosActivos.getSelectedIndex());
        descritivoTitulo.setText(e.getTitulo());
        descritivoTexto.setText(e.getTextoDescritivo());
        descritivoLocal.setText(e.getLocal());
        descritivoDataInicio.setText(e.getDataInicio().toString());
        descritivoDataFim.setText(e.getDataFim().toString());
        descritivoDataLimiteSubmissaoCandidaturas.setText(e.getDataLimiteSubmissaoCandidaturas().toString());
        botaoConfirmaEvento.setEnabled(true);

    }//GEN-LAST:event_jListaEventosActivosMouseClicked
    /**
     * Metodo associado ao botao LimparDados para limpar as caixas de texto da candidatura.
     * @param evt - on event - on event 
     */
    private void botaoLimparDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparDadosActionPerformed
        morada.setText(null);
        nomeEmpresa.setText(null);
        textoExplicativoCandidatura.setText(null);
        telefone.setText(null);
        responsavelCandidatura.setText(null);
    }//GEN-LAST:event_botaoLimparDadosActionPerformed
    
    /**
     * Metodo associado ao botao Submeter para a candidatura ao evento.
     * Mostra um painel (JOptionPane) com opção yes/no para que o utilizador confirma se quer ou nao usar os dados.
     * O metodo usa os dados das caixas de texto associados a candidatura com o metodo .get.
     * Faz verificação com um try-catch para ver se o telefone é numerico.
     * Para submeter, utiliza o metodo .setDadosCandidatura da classe criarCandidaturaController.
     * @param evt - on event - on event 
     */
    private void botaoSubmeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSubmeterActionPerformed
        if (morada.getText().equals("") || nomeEmpresa.getText().equals("")
                || telefone.getText().equals("") || responsavelCandidatura.getText().equals("")
                || textoExplicativoCandidatura.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos");

        } else {
            if (JOptionPane.showOptionDialog(null, "Criação de uma Candidatura no Evento" + e.getTitulo() + "\n\n"
                    + "Com os seguintes dados:\n" + "\nEmpresa:" + nomeEmpresa.getText()
                    + "\nMorada:" + morada.getText()
                    + "\nTelefone:" + telefone.getText()
                    + "\nResponsavel da Candidatura:" + responsavelCandidatura.getText()
                    + "\nCom o seguinte texto\n" + textoExplicativoCandidatura.getText()
                    + //candidaturaFeita.toString() + 
                    "\n\nConfirma?", "Confirmação dos dados", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, ObjButtons, ObjButtons[1]) == JOptionPane.YES_OPTION) {
                try {
                    criarCandController.setDadosCandidatura(nomeEmpresa.getText(), responsavelCandidatura.getText(), morada.getText(),
                            Integer.parseInt(telefone.getText()), textoExplicativoCandidatura.getText());
                    if (criarCandController.registaCandidatura(candidaturaFeita)) {
                        this.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "OPERAÇÃO FRACASSADA: erro a adicionar ao array!", "Informacao", JOptionPane.ERROR_MESSAGE);
                        //        utilitariosConsola.escreverConsola("OPERAÇÃO FRACASSADA: erro a adicionar ao array!");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "O Telefone tem que ser um numero");
                    telefone.setEditable(true);
                    botaoSubmeter.setEnabled(true);

                }
            } else {
                botaoConfirmaEvento.setEnabled(true);
                jListaEventosActivos.setEnabled(true);
            }
    }//GEN-LAST:event_botaoSubmeterActionPerformed
    }
    /**
     * Metodo associado ao botao ConfirmaEvento para criar a instancia Candidatura.
     * Ao selecionar o botão coloca a JListaEventosActivos nao selecionavel de forma a nao ser possivel selecionar outro evento.
     * Coloca os campos e os botõeseditaveis da candidatura.
     * @param evt - on event - on event 
     */
    private void botaoConfirmaEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoConfirmaEventoMouseClicked

        jListaEventosActivos.setEnabled(false);
        candidaturaFeita = criarCandController.selecionarEvento(listaEventosActivos.get(jListaEventosActivos.getSelectedIndex()));
        nomeEmpresa.setEditable(true);
        responsavelCandidatura.setEditable(true);
        morada.setEditable(true);
        telefone.setEditable(true);
        textoExplicativoCandidatura.setEditable(true);
        botaoConfirmaEvento.setEnabled(false);
        botaoLimparDados.setEnabled(true);
        botaoSubmeter.setEnabled(true);
    }//GEN-LAST:event_botaoConfirmaEventoMouseClicked
    
    /**
     * Metodo associado ao botao Sair para fechar a janela
     * @param evt - on event 
     */
    private void SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_SairMouseClicked

    /**
     * 
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
    private javax.swing.JButton Sair;
    private javax.swing.JButton botaoConfirmaEvento;
    private javax.swing.JButton botaoLimparDados;
    private javax.swing.JButton botaoSubmeter;
    private javax.swing.JLabel dataFim;
    private javax.swing.JLabel dataInicio;
    private javax.swing.JLabel descritivoDataFim;
    private javax.swing.JLabel descritivoDataInicio;
    private javax.swing.JLabel descritivoDataLimiteSubmissaoCandidaturas;
    private javax.swing.JLabel descritivoLocal;
    private javax.swing.JLabel descritivoTexto;
    private javax.swing.JLabel descritivoTitulo;
    private javax.swing.JList<String> jListaEventosActivos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDatafinalCandidatura;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelLocal;
    private javax.swing.JLabel labelMorada;
    private javax.swing.JLabel labelNomeDaEmpresa;
    private javax.swing.JLabel labelResponsavel;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField morada;
    private javax.swing.JTextField nomeEmpresa;
    private javax.swing.JTextField responsavelCandidatura;
    private javax.swing.JSeparator separador;
    private javax.swing.JTextField telefone;
    private javax.swing.JTextField textoExplicativoCandidatura;
    // End of variables declaration//GEN-END:variables
}

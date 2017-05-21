/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnGUI;

import Controller.criarCandidaturaController;
import Controller.decidirCandidaturaController;
import Main_Class.algoritmoAtribuicao;
import Main_Class.candidatura;
import Main_Class.centroDeEventos;
import Main_Class.decisao;
import Main_Class.evento;
import Main_Class.fae;
import Main_Class.organizador;
import Main_Class.utilizador;
import Utils_Consola.utilitariosConsola;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author JASM
 */
public class testeDecidirCandidatura extends javax.swing.JFrame {

    private final centroDeEventos ce;
    private final decidirCandidaturaController decidirCandController;
    private List<evento> ListaEventosComDataSubmissaoCaducadaEDataFinalNaoCaducada;
    private List<fae> ListFAE;
    private List<candidatura> listaCandidaturas;
    private decisao decisaoFeita;
    private boolean decisaoFavoravel;
    private decisao decisaoCandidatura;
    private organizador org;
    private fae f;
    private candidatura cand;
    private evento e;

    /**
     * Creates new form testeDecidirCandidatura
     */
    public testeDecidirCandidatura(centroDeEventos ce) {
        this.ce = ce;
        decidirCandController = new decidirCandidaturaController(ce);
        initComponents();
        jListaEventosComDataSubmissaoCaducadaEDataFinalNaoCaducada.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoDeBotao = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListaEventosComDataSubmissaoCaducadaEDataFinalNaoCaducada = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        descritivoTitulo = new javax.swing.JLabel();
        descritivoDescricao = new javax.swing.JLabel();
        descritivoLocal = new javax.swing.JLabel();
        descritivoDataInicio = new javax.swing.JLabel();
        descritivoDataFim = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        descritivoNomeDaEmpresa = new javax.swing.JLabel();
        descritivoTelefone = new javax.swing.JLabel();
        descritivoMorada = new javax.swing.JLabel();
        descritivoResponsavel = new javax.swing.JLabel();
        descritivoTextoExplicativoCandidatura = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListCandidaturas = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        bRadioAceite = new javax.swing.JRadioButton();
        bRadioRecusado = new javax.swing.JRadioButton();
        descritivoTextoJustificativoDaDecisao = new javax.swing.JTextField();
        botaoLimparDados = new javax.swing.JButton();
        botaoSubmeter = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        botaoConfirmaEvento = new javax.swing.JButton();
        botaoConfirmaCandidatura = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListFAE = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        descritivoNome = new javax.swing.JLabel();
        descritivoEmail = new javax.swing.JLabel();
        botaoConfirmaFAE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("UC 4 - Decidir Candidatura");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Escolha o Evento"));

        jListaEventosComDataSubmissaoCaducadaEDataFinalNaoCaducada.setFocusable(false);
        jListaEventosComDataSubmissaoCaducadaEDataFinalNaoCaducada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListaEventosComDataSubmissaoCaducadaEDataFinalNaoCaducadaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListaEventosComDataSubmissaoCaducadaEDataFinalNaoCaducada);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Titulo");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Descrição");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Local");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Data Inicio");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Data Final");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel4))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descritivoDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(descritivoTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(descritivoLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(descritivoDataInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(descritivoDataFim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(descritivoTitulo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descritivoDescricao)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(descritivoLocal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(descritivoDataInicio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(descritivoDataFim)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Escolha Candidatura"));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Nome da Empresa");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Telefone");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("Morada");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("Responsavel");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("Texto Explicativo");

        descritivoTextoExplicativoCandidatura.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        descritivoTextoExplicativoCandidatura.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jListCandidaturas.setVisible(false);
        jListCandidaturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListCandidaturasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jListCandidaturas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(descritivoTelefone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(descritivoMorada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(descritivoResponsavel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(descritivoTextoExplicativoCandidatura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addComponent(descritivoNomeDaEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(descritivoNomeDaEmpresa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(descritivoTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(descritivoMorada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(descritivoResponsavel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(descritivoTextoExplicativoCandidatura))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Descreva Decisão sobre a Candidatura"));

        grupoDeBotao.add(bRadioAceite);
        bRadioAceite.setText("Aceite");
        bRadioAceite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bRadioAceiteMouseClicked(evt);
            }
        });

        grupoDeBotao.add(bRadioRecusado);
        bRadioRecusado.setText("Recusado");
        bRadioRecusado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bRadioRecusadoMouseClicked(evt);
            }
        });

        descritivoTextoJustificativoDaDecisao.setBorder(javax.swing.BorderFactory.createTitledBorder("Texto Justificativo da Decisão"));

        botaoLimparDados.setText("Limpar Dados");
        botaoLimparDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparDadosActionPerformed(evt);
            }
        });

        botaoSubmeter.setText("Submeter");
        botaoSubmeter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSubmeterActionPerformed(evt);
            }
        });

        botaoSair.setText("Sair");
        botaoSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bRadioAceite)
                    .addComponent(bRadioRecusado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descritivoTextoJustificativoDaDecisao)
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoLimparDados)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(botaoSubmeter)
                        .addGap(18, 18, 18)
                        .addComponent(botaoSair)))
                .addGap(39, 39, 39))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bRadioAceite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bRadioRecusado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botaoLimparDados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoSubmeter)
                            .addComponent(botaoSair)))
                    .addComponent(descritivoTextoJustificativoDaDecisao, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        botaoConfirmaEvento.setText("Confirma Evento");
        botaoConfirmaEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoConfirmaEventoMouseClicked(evt);
            }
        });

        botaoConfirmaCandidatura.setText("Confirma Candidatura");
        botaoConfirmaCandidatura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoConfirmaCandidaturaMouseClicked(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Escolha FAE"));

        ListFAE = decidirCandController.getListaFAEUnicosDosEventos();
        String[] stringsfae = new String[ListFAE.size()];
        int i=0;
        for (fae f: ListFAE){
            stringsfae[i]=f.getUser().getNome();
            i++;
        }
        jListFAE.setModel(new javax.swing.AbstractListModel<String>() {
            public int getSize() { return stringsfae.length; }
            public String getElementAt(int i) { return stringsfae[i]; }
        });
        jListFAE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListFAEMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jListFAE);

        jLabel6.setText("Nome");

        jLabel7.setText("Email");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descritivoEmail)
                    .addComponent(descritivoNome))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(descritivoNome))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(descritivoEmail))
                .addGap(12, 12, 12))
        );

        botaoConfirmaFAE.setText("Confirma FAE");
        botaoConfirmaFAE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmaFAEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(botaoConfirmaFAE)
                    .addComponent(botaoConfirmaEvento)
                    .addComponent(botaoConfirmaCandidatura))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoConfirmaFAE, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoConfirmaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoConfirmaCandidatura, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSubmeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSubmeterActionPerformed
        System.out.println(cand.getNomeEmpresa());
        decisaoFeita = decidirCandController.selecionarCandidaturaCriaDecisao(cand);
        decidirCandController.setDecisao(decisaoFeita, decisaoFavoravel, descritivoTextoJustificativoDaDecisao.getText());
    }//GEN-LAST:event_botaoSubmeterActionPerformed

    private void jListaEventosComDataSubmissaoCaducadaEDataFinalNaoCaducadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListaEventosComDataSubmissaoCaducadaEDataFinalNaoCaducadaMouseClicked
        e = ListaEventosComDataSubmissaoCaducadaEDataFinalNaoCaducada.get(jListaEventosComDataSubmissaoCaducadaEDataFinalNaoCaducada.getSelectedIndex());
        descritivoTitulo.setText(e.getTitulo());
        descritivoDescricao.setText(e.getTextoDescritivo());
        descritivoLocal.setText(e.getLocal());
        descritivoDataInicio.setText(e.getDataInicio().toString());
        descritivoDataFim.setText(e.getDataFim().toString());
    }//GEN-LAST:event_jListaEventosComDataSubmissaoCaducadaEDataFinalNaoCaducadaMouseClicked

    private void jListCandidaturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListCandidaturasMouseClicked
        cand = listaCandidaturas.get(jListCandidaturas.getSelectedIndex());
        descritivoNomeDaEmpresa.setText(cand.getNomeEmpresa());
        descritivoTelefone.setText(String.valueOf(cand.getTelefone()));
        descritivoMorada.setText(cand.getMorada());
        descritivoResponsavel.setText(cand.getResponsavelCandidatura());
        descritivoTextoExplicativoCandidatura.setText(cand.getTextoExplicativoCandidatura());
        try{
        System.out.println(decidirCandController.selecionarCandidaturaCriaDecisao(cand));
        }catch (NullPointerException ev){
            System.out.println("estaaaaa null");
        }
    }//GEN-LAST:event_jListCandidaturasMouseClicked

    private void botaoLimparDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparDadosActionPerformed
        grupoDeBotao.clearSelection();
        descritivoTextoJustificativoDaDecisao.setText(null);
    }//GEN-LAST:event_botaoLimparDadosActionPerformed

    private void bRadioAceiteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bRadioAceiteMouseClicked
        decisaoFavoravel = true;
    }//GEN-LAST:event_bRadioAceiteMouseClicked

    private void bRadioRecusadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bRadioRecusadoMouseClicked
        decisaoFavoravel = false;
    }//GEN-LAST:event_bRadioRecusadoMouseClicked

    private void botaoConfirmaFAEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmaFAEActionPerformed
        f = ListFAE.get(jListFAE.getSelectedIndex());
        ListaEventosComDataSubmissaoCaducadaEDataFinalNaoCaducada = decidirCandController.getListaEventosFAEDataSubmissaoFinalizada(f);
        if (ListaEventosComDataSubmissaoCaducadaEDataFinalNaoCaducada.size() == 0) {
            JOptionPane.showMessageDialog (null, "O "+f.getUser().getNome()+" nao tem eventos associados", "Informacao", JOptionPane.INFORMATION_MESSAGE);
        } else {
            jListFAE.setEnabled(false);
            DefaultListModel dlmjleventos = new DefaultListModel();
            jListaEventosComDataSubmissaoCaducadaEDataFinalNaoCaducada.setModel(dlmjleventos);
            for (evento e : ListaEventosComDataSubmissaoCaducadaEDataFinalNaoCaducada) {
                dlmjleventos.addElement(e.getTitulo());
                System.out.println(e.getTitulo());
    }//GEN-LAST:event_botaoConfirmaFAEActionPerformed
            jListaEventosComDataSubmissaoCaducadaEDataFinalNaoCaducada.setVisible(true);
        }
    }
    
    private void botaoConfirmaEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoConfirmaEventoMouseClicked
        jListaEventosComDataSubmissaoCaducadaEDataFinalNaoCaducada.setEnabled(false);
        jListCandidaturas.setVisible(true);
        botaoConfirmaEvento.setEnabled(false);
        listaCandidaturas = decidirCandController.getListaCandidatura(e);
        DefaultListModel dlmjlcand = new DefaultListModel();
        jListCandidaturas.setModel(dlmjlcand);
        for (candidatura cand : listaCandidaturas) {
            dlmjlcand.addElement(cand.getNomeEmpresa());
        }
    }//GEN-LAST:event_botaoConfirmaEventoMouseClicked

    private void jListFAEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListFAEMouseClicked
        f = ListFAE.get(jListFAE.getSelectedIndex());
        descritivoNome.setText(f.getUser().getNome());
        descritivoEmail.setText(f.getUser().getEmail());
    }//GEN-LAST:event_jListFAEMouseClicked

    private void botaoConfirmaCandidaturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoConfirmaCandidaturaMouseClicked
        cand = listaCandidaturas.get(jListCandidaturas.getSelectedIndex());
        jListCandidaturas.setEnabled(false);
    }//GEN-LAST:event_botaoConfirmaCandidaturaMouseClicked

    private void botaoSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSairMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_botaoSairMouseClicked

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
            java.util.logging.Logger.getLogger(testeDecidirCandidatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(testeDecidirCandidatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(testeDecidirCandidatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(testeDecidirCandidatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(centroDeEventos ce) {
                new testeDecidirCandidatura(ce).setVisible(true);
            }

            @Override
            public void run() {
                System.out.println("xxx"); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bRadioAceite;
    private javax.swing.JRadioButton bRadioRecusado;
    private javax.swing.JButton botaoConfirmaCandidatura;
    private javax.swing.JButton botaoConfirmaEvento;
    private javax.swing.JButton botaoConfirmaFAE;
    private javax.swing.JButton botaoLimparDados;
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton botaoSubmeter;
    private javax.swing.JLabel descritivoDataFim;
    private javax.swing.JLabel descritivoDataInicio;
    private javax.swing.JLabel descritivoDescricao;
    private javax.swing.JLabel descritivoEmail;
    private javax.swing.JLabel descritivoLocal;
    private javax.swing.JLabel descritivoMorada;
    private javax.swing.JLabel descritivoNome;
    private javax.swing.JLabel descritivoNomeDaEmpresa;
    private javax.swing.JLabel descritivoResponsavel;
    private javax.swing.JLabel descritivoTelefone;
    private javax.swing.JLabel descritivoTextoExplicativoCandidatura;
    private javax.swing.JTextField descritivoTextoJustificativoDaDecisao;
    private javax.swing.JLabel descritivoTitulo;
    private javax.swing.ButtonGroup grupoDeBotao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jListCandidaturas;
    private javax.swing.JList<String> jListFAE;
    private javax.swing.JList<String> jListaEventosComDataSubmissaoCaducadaEDataFinalNaoCaducada;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}

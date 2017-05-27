/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnGUI;


import Controller.decidirCandidaturaController;
import Main_Class.candidatura;
import Main_Class.centroDeEventos;
import Main_Class.decisao;
import Main_Class.evento;
import Main_Class.fae;
import Main_Class.organizador;
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
    private String textoDecisao;

    /**
     * Creates new form testeDecidirCandidatura
     */
    public testeDecidirCandidatura(centroDeEventos ce) {
        this.ce = ce;
        decidirCandController = new decidirCandidaturaController(ce);
        setResizable(false);
        initComponents();
        jListaEventosComDataSubmissaoCaducadaEDataFinalNaoCaducada.setVisible(false);
        botaoConfirmaCandidatura.setEnabled(false);
        botaoConfirmaEvento.setEnabled(false);
        botaoConfirmaFAE.setEnabled(false);
        botaoLimparDados.setEnabled(false);
        botaoSubmeter.setEnabled(false);
        bRadioAceite.setEnabled(false);
        bRadioRecusado.setEnabled(false);
        descritivoTextoJustificativoDaDecisao.setEditable(false);
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
        labelTitulo = new javax.swing.JLabel();
        labelDescricao = new javax.swing.JLabel();
        labelLocal = new javax.swing.JLabel();
        labelDataInicio = new javax.swing.JLabel();
        labelDataFinal = new javax.swing.JLabel();
        descritivoTitulo = new javax.swing.JLabel();
        descritivoDescricao = new javax.swing.JLabel();
        descritivoLocal = new javax.swing.JLabel();
        descritivoDataInicio = new javax.swing.JLabel();
        descritivoDataFim = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelNomeDaEmpresa = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        labelMorada = new javax.swing.JLabel();
        labelResponsavel = new javax.swing.JLabel();
        labelTextoExplicativo = new javax.swing.JLabel();
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
        labelNome = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
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

        labelTitulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTitulo.setText("Titulo");

        labelDescricao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelDescricao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelDescricao.setText("Descrição");

        labelLocal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelLocal.setText("Local");

        labelDataInicio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelDataInicio.setText("Data Inicio");

        labelDataFinal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelDataFinal.setText("Data Final");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelDataFinal)
                    .addComponent(labelLocal)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(labelDescricao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                        .addComponent(labelTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(labelDataInicio))
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
                            .addComponent(labelTitulo)
                            .addComponent(descritivoTitulo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descritivoDescricao)
                            .addComponent(labelDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelLocal)
                            .addComponent(descritivoLocal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDataInicio)
                            .addComponent(descritivoDataInicio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDataFinal)
                            .addComponent(descritivoDataFim)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Escolha Candidatura"));

        labelNomeDaEmpresa.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelNomeDaEmpresa.setText("Nome da Empresa");

        labelTelefone.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelTelefone.setText("Telefone");

        labelMorada.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelMorada.setText("Morada");

        labelResponsavel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelResponsavel.setText("Responsavel");

        labelTextoExplicativo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelTextoExplicativo.setText("Texto Explicativo");

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
                        .addComponent(labelNomeDaEmpresa)
                        .addComponent(labelTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(labelResponsavel, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(labelMorada, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelTextoExplicativo, javax.swing.GroupLayout.Alignment.TRAILING))
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
                    .addComponent(labelNomeDaEmpresa)
                    .addComponent(descritivoNomeDaEmpresa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefone)
                    .addComponent(descritivoTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMorada)
                    .addComponent(descritivoMorada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelResponsavel)
                    .addComponent(descritivoResponsavel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTextoExplicativo)
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

        botaoConfirmaCandidatura.setText("Decisão");
        botaoConfirmaCandidatura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoConfirmaCandidaturaMouseClicked(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Escolha FAE"));

        ListFAE = decidirCandController.getListaFAEUnicosDosEventosComDataSubmissaoCaducadaEAtribuicaoEfectuada();
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

        labelNome.setText("Nome");

        labelEmail.setText("Email");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNome)
                    .addComponent(labelEmail))
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
                    .addComponent(labelNome)
                    .addComponent(descritivoNome))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
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
        if (decisaoFavoravel) {
            textoDecisao = "Aceite";
        } else {
            textoDecisao = "Não Aceite";
        }
        if (JOptionPane.showConfirmDialog(null, "A candidatura feita ao evento "+e.getTitulo() +" por: \n" + cand.getNomeEmpresa() 
                + "\nFoi Considerada:\n" + textoDecisao + "\nCom o seguinte texto Justificado:\n" + descritivoTextoJustificativoDaDecisao.getText()
                + "\n\nConfirma?", "Confirmação dos dados",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            decisaoFeita = decidirCandController.selecionarCandidaturaCriaDecisao(cand);
            decidirCandController.setDecisao(decisaoFeita, decisaoFavoravel, descritivoTextoJustificativoDaDecisao.getText());
            this.setVisible(false);
        } else {
            jListCandidaturas.setEnabled(true);
            jListaEventosComDataSubmissaoCaducadaEDataFinalNaoCaducada.setEnabled(true);
            botaoConfirmaCandidatura.setEnabled(true);
            botaoConfirmaEvento.setEnabled(true);
        }
        
        

    }//GEN-LAST:event_botaoSubmeterActionPerformed

    private void jListaEventosComDataSubmissaoCaducadaEDataFinalNaoCaducadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListaEventosComDataSubmissaoCaducadaEDataFinalNaoCaducadaMouseClicked
        e = ListaEventosComDataSubmissaoCaducadaEDataFinalNaoCaducada.get(jListaEventosComDataSubmissaoCaducadaEDataFinalNaoCaducada.getSelectedIndex());
        descritivoTitulo.setText(e.getTitulo());
        descritivoDescricao.setText(e.getTextoDescritivo());
        descritivoLocal.setText(e.getLocal());
        descritivoDataInicio.setText(e.getDataInicio().toString());
        descritivoDataFim.setText(e.getDataFim().toString());
        botaoConfirmaEvento.setEnabled(true);
    }//GEN-LAST:event_jListaEventosComDataSubmissaoCaducadaEDataFinalNaoCaducadaMouseClicked

    private void jListCandidaturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListCandidaturasMouseClicked
        cand = listaCandidaturas.get(jListCandidaturas.getSelectedIndex());
        descritivoNomeDaEmpresa.setText(cand.getNomeEmpresa());
        descritivoTelefone.setText(String.valueOf(cand.getTelefone()));
        descritivoMorada.setText(cand.getMorada());
        descritivoResponsavel.setText(cand.getResponsavelCandidatura());
        descritivoTextoExplicativoCandidatura.setText(cand.getTextoExplicativoCandidatura());
        descritivoTextoJustificativoDaDecisao.setText(null);
        grupoDeBotao.clearSelection();
        botaoConfirmaCandidatura.setEnabled(true);
        try{
            decisaoCandidatura=cand.getDecisao();
            descritivoTextoJustificativoDaDecisao.setText(decisaoCandidatura.getTextoDecisao());
            if (decisaoCandidatura.isAprovada()){
                bRadioAceite.setSelected(true);
            }else{
                bRadioRecusado.setSelected(true);
            }
            botaoConfirmaCandidatura.setText("Alterar Decisao");
        }catch (NullPointerException ev){
            grupoDeBotao.clearSelection();
            botaoConfirmaCandidatura.setText("Criar Decisao");
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
    }//GEN-LAST:event_botaoConfirmaFAEActionPerformed
            jListaEventosComDataSubmissaoCaducadaEDataFinalNaoCaducada.setVisible(true);
            botaoConfirmaFAE.setEnabled(false);
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
        botaoConfirmaFAE.setEnabled(true);
    }//GEN-LAST:event_jListFAEMouseClicked

    private void botaoConfirmaCandidaturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoConfirmaCandidaturaMouseClicked
        cand = listaCandidaturas.get(jListCandidaturas.getSelectedIndex());
        jListCandidaturas.setEnabled(false);
        botaoConfirmaCandidatura.setEnabled(false);
        bRadioAceite.setEnabled(true);
        bRadioAceite.setEnabled(true);
        bRadioRecusado.setEnabled(true);
        botaoLimparDados.setEnabled(true);
        botaoSubmeter.setEnabled(true);
        descritivoTextoJustificativoDaDecisao.setEditable(true);
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
    private javax.swing.JLabel labelDataFinal;
    private javax.swing.JLabel labelDataInicio;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelLocal;
    private javax.swing.JLabel labelMorada;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNomeDaEmpresa;
    private javax.swing.JLabel labelResponsavel;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTextoExplicativo;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}

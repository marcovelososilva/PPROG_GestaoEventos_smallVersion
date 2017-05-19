/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnGUI;

import Controller.atribuirCandidaturaController;
import Main_Class.algoritmoAtribuicao;
import Main_Class.atribuicao;
import Main_Class.candidatura;
import Main_Class.centroDeEventos;
import Main_Class.evento;
import Main_Class.fae;
import Main_Class.organizador;
import Utils_Consola.utilitariosConsola;
import java.awt.Dimension;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JASM
 */
public class testeAtribuirCandidatura extends javax.swing.JFrame {

    private final centroDeEventos ce;
    private final atribuirCandidaturaController atribuirController;
    private List<evento> ListaEventosDataSubmissaoCaducada;
    private List<fae> listaFAEdoEvento;
    private List<organizador> listaOrganizador;
    private List<candidatura> listaCandidaturasEvento;
    private List<evento> ListaEventosOrganizadorDataSubmissaoFinalizada;
    private List<algoritmoAtribuicao> ListaAlgoritmos;
    private List<atribuicao> atribuicaoTEMP;
    private algoritmoAtribuicao alg;
    private organizador org;
    
    /**
     * Creates new form testeAtribuirCandidatura
     */
    public testeAtribuirCandidatura(centroDeEventos ce) {
        this.ce = ce;
        atribuirController = new atribuirCandidaturaController(ce);
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

        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListaEventosDataSubmissaoCaducada = new javax.swing.JList<>();
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
        botaoConfirmaEvento = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        painelFAE = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListFAEDoEvento = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jListCandidaturasDoEvento = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jListAlgoritmos = new javax.swing.JList<>();
        descritivoAlgoritmos = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        descritivoNome = new javax.swing.JLabel();
        descritivoEmail = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListOrganizador = new javax.swing.JList<>();
        botaoConfirmaOrganizador = new javax.swing.JButton();
        botaoEmparelhar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTableEmparelhamentoFAECandidatura = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jListaEventosDataSubmissaoCaducada.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Escolha o Evento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        jListaEventosDataSubmissaoCaducada.setMaximumSize(new java.awt.Dimension(0, 130));
        jListaEventosDataSubmissaoCaducada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListaEventosDataSubmissaoCaducadaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListaEventosDataSubmissaoCaducada);

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

        descritivoTitulo.setText("descritivoTitulo");

        descritivoDescricao.setText("descritivoDescricao");

        descritivoLocal.setText("descritivoLocal");

        descritivoDataInicio.setText("descritivoDataInicio");

        descritivoDataFim.setText("descritivoDataFim");

        botaoConfirmaEvento.setText("Confirma Evento");
        botaoConfirmaEvento.setMaximumSize(new java.awt.Dimension(123, 10));
        botaoConfirmaEvento.setMinimumSize(new java.awt.Dimension(123, 10));
        botaoConfirmaEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoConfirmaEventoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoConfirmaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(descritivoTitulo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(descritivoDescricao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(descritivoLocal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(descritivoDataInicio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(descritivoDataFim))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoConfirmaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jListFAEDoEvento.setBorder(javax.swing.BorderFactory.createTitledBorder("FAE do Evento"));
        jScrollPane2.setViewportView(jListFAEDoEvento);

        jListCandidaturasDoEvento.setBorder(javax.swing.BorderFactory.createTitledBorder("Candidaturas do Evento"));
        jScrollPane5.setViewportView(jListCandidaturasDoEvento);

        javax.swing.GroupLayout painelFAELayout = new javax.swing.GroupLayout(painelFAE);
        painelFAE.setLayout(painelFAELayout);
        painelFAELayout.setHorizontalGroup(
            painelFAELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFAELayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelFAELayout.setVerticalGroup(
            painelFAELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFAELayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFAELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(painelFAE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(painelFAE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jListAlgoritmos.setEnabled(false);
        jListAlgoritmos.setBorder(javax.swing.BorderFactory.createTitledBorder("Algoritmos"));
        jListAlgoritmos.setToolTipText("");
        jListAlgoritmos.setMaximumSize(new java.awt.Dimension(47, 120));
        jListAlgoritmos.setMinimumSize(new java.awt.Dimension(47, 120));
        jListAlgoritmos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListAlgoritmosMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jListAlgoritmos);

        descritivoAlgoritmos.setBorder(javax.swing.BorderFactory.createTitledBorder("Descricao"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descritivoAlgoritmos, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(descritivoAlgoritmos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Nome");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("E-mail");

        descritivoNome.setText("jLabel8");

        descritivoEmail.setText("jLabel9");

        listaOrganizador = atribuirController.getListaOrganizadorUnicosDosEventos();
        String[] stringsOrganizador = new String[listaOrganizador.size()];
        int i=0;
        for (organizador o: listaOrganizador){
            stringsOrganizador[i]=o.getUser().getNome();
            i++;
        }
        jListOrganizador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Escolha o Organizador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        jListOrganizador.setModel(new javax.swing.AbstractListModel<String>() {

            public int getSize() { return stringsOrganizador.length; }
            public String getElementAt(int i) { return stringsOrganizador[i]; }
        });
        jListOrganizador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListOrganizadorMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jListOrganizador);

        botaoConfirmaOrganizador.setText("Confirma Organizador");
        botaoConfirmaOrganizador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoConfirmaOrganizadorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descritivoEmail)
                            .addComponent(descritivoNome)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoConfirmaOrganizador)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(descritivoNome))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(descritivoEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoConfirmaOrganizador, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        botaoEmparelhar.setText("jButton1");
        botaoEmparelhar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoEmparelharMouseClicked(evt);
            }
        });

        jButton1.setText("jButton1");

        jTableEmparelhamentoFAECandidatura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nome", "teste1"
            }
        ));
        jTableEmparelhamentoFAECandidatura.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(jTableEmparelhamentoFAECandidatura);

        jLabel8.setText("Emparelhamento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(botaoEmparelhar)
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoEmparelhar)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton1)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jListaEventosDataSubmissaoCaducadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListaEventosDataSubmissaoCaducadaMouseClicked
        System.out.println(jListaEventosDataSubmissaoCaducada.getSelectedIndex());
        evento e = ListaEventosOrganizadorDataSubmissaoFinalizada.get(jListaEventosDataSubmissaoCaducada.getSelectedIndex());
        descritivoTitulo.setText(e.getTitulo());
        descritivoDescricao.setText(e.getTextoDescritivo());
        descritivoLocal.setText(e.getLocal());
        descritivoDataInicio.setText(e.getDataInicio().toString());
        descritivoDataFim.setText(e.getDataFim().toString());
        listaFAEdoEvento = atribuirController.getListaFAE(e);
    }//GEN-LAST:event_jListaEventosDataSubmissaoCaducadaMouseClicked

    private void jListOrganizadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListOrganizadorMouseClicked
        organizador o = listaOrganizador.get(jListOrganizador.getSelectedIndex());
        descritivoNome.setText(o.getUser().getNome());
        descritivoEmail.setText(o.getUser().getEmail());
    }//GEN-LAST:event_jListOrganizadorMouseClicked

    private void botaoConfirmaOrganizadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoConfirmaOrganizadorMouseClicked
        jListOrganizador.setEnabled(false);
        organizador o = listaOrganizador.get(jListOrganizador.getSelectedIndex());
        ListaEventosOrganizadorDataSubmissaoFinalizada = atribuirController.getListaEventosOrganizadorDataSubmissaoFinalizada(o);
        DefaultListModel dlmjleventos = new DefaultListModel();
        jListaEventosDataSubmissaoCaducada.setModel(dlmjleventos);
        for (evento e : ListaEventosOrganizadorDataSubmissaoFinalizada) {
            dlmjleventos.addElement(e.getTitulo());
        }
        jListaEventosDataSubmissaoCaducada.setVisible(true);
    }//GEN-LAST:event_botaoConfirmaOrganizadorMouseClicked

    private void botaoConfirmaEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoConfirmaEventoMouseClicked
        jListaEventosDataSubmissaoCaducada.setEnabled(false);
        evento e = ListaEventosOrganizadorDataSubmissaoFinalizada.get(jListaEventosDataSubmissaoCaducada.getSelectedIndex());
        listaFAEdoEvento = atribuirController.getListaFAE(e);
        DefaultListModel dlmJLFAE = new DefaultListModel();
        jListFAEDoEvento.setModel(dlmJLFAE);
        for (fae f : listaFAEdoEvento){
            dlmJLFAE.addElement(f.getUser().getNome());
        }
        listaCandidaturasEvento = atribuirController.getListaCandidatura(e);
        DefaultListModel dlmJLCandidaturasEvento = new DefaultListModel();
        jListCandidaturasDoEvento.setModel(dlmJLCandidaturasEvento);
        for (candidatura c: listaCandidaturasEvento){
            dlmJLCandidaturasEvento.addElement(c.getNomeEmpresa());
        }
        jListFAEDoEvento.setVisible(true);
        jListCandidaturasDoEvento.setVisible(true);
        ce.getAlgoritmosAtribuicao();
        ListaAlgoritmos = atribuirController.getAlgoritmosAtribuicao();
        DefaultListModel dlmJLalgoritmos = new DefaultListModel();
        jListAlgoritmos.setModel(dlmJLalgoritmos);
        for (algoritmoAtribuicao alg: ListaAlgoritmos){
            dlmJLalgoritmos.addElement(alg.getNome());
        }
        jListAlgoritmos.setEnabled(true);
        
    }//GEN-LAST:event_botaoConfirmaEventoMouseClicked

    private void jListAlgoritmosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListAlgoritmosMouseClicked
        algoritmoAtribuicao alg = ListaAlgoritmos.get(jListAlgoritmos.getSelectedIndex());
        descritivoAlgoritmos.setMaximumSize(new Dimension(250,100));
        descritivoAlgoritmos.setText(alg.getDescritivo());

    }//GEN-LAST:event_jListAlgoritmosMouseClicked

    private void botaoEmparelharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoEmparelharMouseClicked
        evento e = ListaEventosOrganizadorDataSubmissaoFinalizada.get(jListaEventosDataSubmissaoCaducada.getSelectedIndex());
        List listaAtribuicoesEvento = atribuirController.getListaAtribuicoes(e);
        algoritmoAtribuicao alg = ListaAlgoritmos.get(jListAlgoritmos.getSelectedIndex());
        List<atribuicao> atribuicaoTEMP = alg.runAlgoritmo(listaFAEdoEvento, listaCandidaturasEvento, listaAtribuicoesEvento);
        System.out.println(alg.getNome());
        for (atribuicao atri : atribuicaoTEMP) {
            utilitariosConsola.escreverConsola(atri.toString());
        }
        DefaultTableModel dtmEmparelhamento = new DefaultTableModel();
        jTableEmparelhamentoFAECandidatura.setModel(dtmEmparelhamento);
        dtmEmparelhamento.addRow(new Object[]{"v1", "v2"});
    }//GEN-LAST:event_botaoEmparelharMouseClicked

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
            java.util.logging.Logger.getLogger(testeAtribuirCandidatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(testeAtribuirCandidatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(testeAtribuirCandidatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(testeAtribuirCandidatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(centroDeEventos ce) {
                new testeAtribuirCandidatura(ce).setVisible(true);
            }

            @Override
            public void run() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoConfirmaEvento;
    private javax.swing.JButton botaoConfirmaOrganizador;
    private javax.swing.JButton botaoEmparelhar;
    private javax.swing.JLabel descritivoAlgoritmos;
    private javax.swing.JLabel descritivoDataFim;
    private javax.swing.JLabel descritivoDataInicio;
    private javax.swing.JLabel descritivoDescricao;
    private javax.swing.JLabel descritivoEmail;
    private javax.swing.JLabel descritivoLocal;
    private javax.swing.JLabel descritivoNome;
    private javax.swing.JLabel descritivoTitulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jListAlgoritmos;
    private javax.swing.JList<String> jListCandidaturasDoEvento;
    private javax.swing.JList<String> jListFAEDoEvento;
    private javax.swing.JList<String> jListOrganizador;
    private javax.swing.JList<String> jListaEventosDataSubmissaoCaducada;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableEmparelhamentoFAECandidatura;
    private javax.swing.JPanel painelFAE;
    // End of variables declaration//GEN-END:variables
}

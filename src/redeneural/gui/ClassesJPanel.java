package redeneural.gui;

import java.awt.Color;
import java.util.List;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import redeneural.classificador.AmostraColetaBuilder;
import redeneural.model.Classe;
import redeneural.model.Projeto;

/**
 *
 * @author Michael Murussi
 */
public class ClassesJPanel extends javax.swing.JPanel implements UpdateContent {

    private List<Classe> classes;
    private Projeto projeto;

    /**
     * Creates new form ClassesPanel
     *
     * @param projeto
     */
    public ClassesJPanel(Projeto projeto) {
        initComponents();

        setProjeto(projeto);
    }

    public final void setProjeto(Projeto projeto) {
        this.projeto = projeto;
        this.classes = projeto.getClasses();
        this.tblClasses.setDefaultRenderer(Color.class, new ColorRenderer());
        this.tblClasses.setDefaultEditor(Color.class, new ColorEditor());
        setVizinhanca(projeto.getVizinhos());
        setCorIndeciso(projeto.getCorIndeciso());
        setCanaisAtivos(projeto.getCanaisAtivos());
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
        tblClasses = new javax.swing.JTable();
        btnAdicionar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        edtVizinhanca = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        lblNeuroniosEntrada = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCorIndeciso = new javax.swing.JButton();
        lblCorIndeciso = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        chkCanalR = new javax.swing.JCheckBox();
        chkCanalG = new javax.swing.JCheckBox();
        chkCanalB = new javax.swing.JCheckBox();

        tblClasses.setModel(tblClassesModel);
        tblClasses.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblClasses);

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        jLabel1.setText("Vizinhança");

        edtVizinhanca.setModel(new javax.swing.SpinnerNumberModel(1, 0, 99, 1));
        edtVizinhanca.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                edtVizinhancaStateChanged(evt);
            }
        });

        jLabel2.setText("Neurônios necessários na entrada:");

        lblNeuroniosEntrada.setText("9");

        jLabel3.setText("Cor indeciso:");

        btnCorIndeciso.setText("...");
        btnCorIndeciso.setToolTipText("Selecionar cor");
        btnCorIndeciso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorIndecisoActionPerformed(evt);
            }
        });

        lblCorIndeciso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCorIndeciso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorIndeciso.setText("jLabel4");
        lblCorIndeciso.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Canais ativos");

        chkCanalR.setText("R");
        chkCanalR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCanalRActionPerformed(evt);
            }
        });

        chkCanalG.setText("G");
        chkCanalG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCanalGActionPerformed(evt);
            }
        });

        chkCanalB.setText("B");
        chkCanalB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCanalBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemover))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtVizinhanca, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNeuroniosEntrada))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCorIndeciso, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCorIndeciso))
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkCanalR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkCanalG)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkCanalB)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnRemover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(edtVizinhanca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblNeuroniosEntrada))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(btnCorIndeciso)
                            .addComponent(lblCorIndeciso))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkCanalR)
                            .addComponent(chkCanalG)
                            .addComponent(chkCanalB))))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCorIndeciso, lblCorIndeciso});

    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        String nome = JOptionPane.showInputDialog(this, "Nova classe");
        if (nome != null && !nome.isEmpty()) {
            Classe c = new Classe(nome);
            c.setNeuronio(classes.size());
            classes.add(c);
            tblClassesModel.fireTableRowsInserted(classes.size(), classes.size());
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        int idx = tblClasses.getSelectedRow();
        if (idx > -1) {
            classes.remove(idx);
            tblClassesModel.fireTableRowsDeleted(idx, idx);
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void edtVizinhancaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_edtVizinhancaStateChanged
        projeto.setVizinhos((Integer)edtVizinhanca.getValue());
        updateNumeroNeuronios();
    }//GEN-LAST:event_edtVizinhancaStateChanged

    private void btnCorIndecisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorIndecisoActionPerformed

        Color c = JColorChooser.showDialog(this, "Selecionar cor", projeto.getCorIndeciso());
        if (c != null) {
            setCorIndeciso(c);
        }

    }//GEN-LAST:event_btnCorIndecisoActionPerformed

    private void chkCanalRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCanalRActionPerformed
        projeto.setCanalAtivo(0, chkCanalR.isSelected());
        updateNumeroNeuronios();
    }//GEN-LAST:event_chkCanalRActionPerformed

    private void chkCanalGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCanalGActionPerformed
        projeto.setCanalAtivo(1, chkCanalG.isSelected());
        updateNumeroNeuronios();
    }//GEN-LAST:event_chkCanalGActionPerformed

    private void chkCanalBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCanalBActionPerformed
        projeto.setCanalAtivo(2, chkCanalB.isSelected());
        updateNumeroNeuronios();
    }//GEN-LAST:event_chkCanalBActionPerformed

    private void updateNumeroNeuronios() {
        int qtd = AmostraColetaBuilder.calculaQtdEntradas(projeto.getVizinhos()) * projeto.getQuantidadeCanaisAtivos();
        lblNeuroniosEntrada.setText(String.valueOf(qtd));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCorIndeciso;
    private javax.swing.JButton btnRemover;
    private javax.swing.JCheckBox chkCanalB;
    private javax.swing.JCheckBox chkCanalG;
    private javax.swing.JCheckBox chkCanalR;
    private javax.swing.JSpinner edtVizinhanca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCorIndeciso;
    private javax.swing.JLabel lblNeuroniosEntrada;
    private javax.swing.JTable tblClasses;
    // End of variables declaration//GEN-END:variables

    public int getVizinhanca() {
        return (Integer)edtVizinhanca.getValue();
    }

    public final void setVizinhanca(int v) {
        edtVizinhanca.setValue(new Integer(v));
        updateNumeroNeuronios();
    }

    private void setCorIndeciso(Color c) {
        lblCorIndeciso.setForeground(Color.white);
        lblCorIndeciso.setBackground(c);
        lblCorIndeciso.setOpaque(true);
        lblCorIndeciso.setText("#" + Integer.toHexString(c.getRGB()));
        if (!projeto.getCorIndeciso().equals(c)) {
            projeto.setCorIndeciso(c);
        }
    }

    private void setCanaisAtivos(boolean[] canaisAtivos) {
        chkCanalR.setSelected(canaisAtivos[0]);
        chkCanalG.setSelected(canaisAtivos[1]);
        chkCanalB.setSelected(canaisAtivos[2]);
    }

    private final AbstractTableModel tblClassesModel = new AbstractTableModel() {

        Class[] types = new Class[]{
            java.lang.String.class, java.lang.Integer.class, java.awt.Color.class
        };
        String[] columnName = new String[]{
            "Nome da Classe", "Neurônio", "Cor"
        };

        @Override
        public Class getColumnClass(int columnIndex) {
            return types[columnIndex];
        }

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return true;
        }

        @Override
        public String getColumnName(int column) {
            return columnName[column];
        }

        @Override
        public int getRowCount() {
            return classes.size();
        }

        @Override
        public int getColumnCount() {
            return 3;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            switch (columnIndex) {
                case 0:
                    return classes.get(rowIndex).getNome();
                case 1:
                    return classes.get(rowIndex).getNeuronio();
                case 2:
                    return classes.get(rowIndex).getCor();
                default:
                    return null;
            }
        }

        @Override
        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
            switch (columnIndex) {
                case 0:
                    if (aValue instanceof String) {
                        classes.get(rowIndex).setNome((String) aValue);
                    }
                    fireTableCellUpdated(rowIndex, columnIndex);
                    break;
                case 1:
                    if (aValue instanceof Integer) {
                        classes.get(rowIndex).setNeuronio((Integer) aValue);
                    }
                    fireTableCellUpdated(rowIndex, columnIndex);
                    break;
                case 2:
                    if (aValue instanceof java.awt.Color) {
                        classes.get(rowIndex).setCor((java.awt.Color) aValue);
                    }
                    fireTableCellUpdated(rowIndex, columnIndex);
                    break;
            }
        }

    };

    @Override
    public void updateContent() {
        setVizinhanca(projeto.getVizinhos());
        tblClassesModel.fireTableDataChanged();
    }

}
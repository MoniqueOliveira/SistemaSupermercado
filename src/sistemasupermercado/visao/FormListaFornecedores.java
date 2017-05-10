/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasupermercado.visao;

import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import sistemasupermercado.dominio.Fornecedor;
import sistemasupermercado.servicos.FornecedorServico;

/**
 *
 * @author Monique
 */
public class FormListaFornecedores extends javax.swing.JDialog {

    Fornecedor fornecedor;
    FornecedorServico fornecedorServico;
    
    AtalhoAction acaoF2 = new AtalhoAction("F2");
    /**
     * Creates new form FormListaFornecedores
     */
    public FormListaFornecedores(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbPesquisarPor = new javax.swing.JComboBox<>();
        txtPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFornecedores = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblF2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fornecedores");
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Fornecedores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(51, 153, 255))); // NOI18N

        jLabel1.setText("Pesquisar por:");

        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });

        tblFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblFornecedores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblFornecedoresKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblFornecedores);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 951, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbPesquisarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisa)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbPesquisarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblF2.setForeground(new java.awt.Color(255, 255, 255));
        lblF2.setText("F2 - Seleciona item");
        jPanel2.add(lblF2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblFornecedoresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblFornecedoresKeyPressed
        // TODO add your handling code here:
        if (KeyStroke.getKeyStrokeForEvent(evt) == KeyStroke.getKeyStroke("F2")) {
            setObjetoSelecionado();
            dispose();
        } else if (KeyStroke.getKeyStrokeForEvent(evt) == KeyStroke.getKeyStroke("TAB")) {
            cmbPesquisarPor.requestFocus();
        }
    }//GEN-LAST:event_tblFornecedoresKeyPressed

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        // TODO add your handling code here:
        preencherTabela(cmbPesquisarPor.getSelectedItem().toString(), txtPesquisa.getText());
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        registrarAcoesDosAtalhos();
        definirModeloDaTabela();
        preencherCmbPesquisaPor();
        preencherTabela("", "");
        
        
    }//GEN-LAST:event_formWindowOpened

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormListaFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormListaFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormListaFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormListaFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormListaFornecedores dialog = new FormListaFornecedores(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbPesquisarPor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblF2;
    private javax.swing.JTable tblFornecedores;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables

    /**
     * Método que retorna o objeto selecionado na tabela para o formulário de cadastro de fornecedores.
     * @return 
     */
    public Fornecedor getObjetoSelecionado() {
        return this.fornecedor;
    }

    private void setObjetoSelecionado() {
        if (tblFornecedores.getSelectedRowCount() == 0) return;
        fornecedor = new Fornecedor();
        int idFornecedor = Integer.parseInt(tblFornecedores.getValueAt(tblFornecedores.getSelectedRow(), 0).toString());
        fornecedor.setIdFornecedor(idFornecedor);
    }
    
    private void definirModeloDaTabela() {
        tblFornecedores.setModel(  
            new DefaultTableModel(  
               new Object[] []{ },  
               new String[]{"ID", "CNPJ", "Nome fantasia", "Razão Social"}
            ) {  

            @Override
            public boolean isCellEditable(int row, int col) {  
                    return false;  
            }  

            }  
         ); 
        
        tblFornecedores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tblFornecedores.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblFornecedores.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblFornecedores.getColumnModel().getColumn(2).setPreferredWidth(300);
        tblFornecedores.getColumnModel().getColumn(3).setPreferredWidth(350);
    }
    
    private void preencherCmbPesquisaPor() {
        cmbPesquisarPor.addItem("ID");
        cmbPesquisarPor.addItem("CNPJ");
        cmbPesquisarPor.addItem("Razão Social");
        cmbPesquisarPor.addItem("Nome Fantasia");
        cmbPesquisarPor.setSelectedIndex(3);
    }
    
    private void preencherTabela(String pesquisarPor, String texto) {
        limparTabela();
        fornecedorServico = new FornecedorServico();
        DefaultTableModel dtm = (DefaultTableModel) tblFornecedores.getModel();
        try {
            List<Fornecedor> fornecedores = fornecedorServico.listar(pesquisarPor, texto);
            for (int i = 0; i < fornecedores.size(); i++) {
                dtm.addRow(new Object[]{"", ""});
                tblFornecedores.setValueAt(fornecedores.get(i).getIdFornecedor(), i, 0);
                tblFornecedores.setValueAt(fornecedores.get(i).getCnpj(), i, 1);
                tblFornecedores.setValueAt(fornecedores.get(i).getNomeFantasia(), i, 2);
                tblFornecedores.setValueAt(fornecedores.get(i).getRazaoSocial(), i, 3);
            }
        } catch(RuntimeException ex) {
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha durante a execução.\n" + ex.getMessage(), 
                        "Não foi possível iniciar o formulario", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void limparTabela() {
        DefaultTableModel dtm = (DefaultTableModel) tblFornecedores.getModel();
        dtm.setRowCount(0);
    }
    
    /**
     * Método que "mapeia" e "captura" os atalhos teclados pelo usuário
     */
    private void registrarAcoesDosAtalhos() {
        ActionMap actionMapForm = this.rootPane.getActionMap();
        actionMapForm.put("acaof2", acaoF2);
        rootPane.setActionMap(actionMapForm);
        
        InputMap imapForm = this.rootPane.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW);
        imapForm.put(KeyStroke.getKeyStroke("F2"), "acaof2");
    }
    
    /**
     * Classe usada para criar as ações dos atalhos do teclado (F1, F2 e F3)
     */
    private class AtalhoAction extends AbstractAction {
	private String atalho;

	public AtalhoAction(String atalho)
	{
		super(atalho);
		this.atalho = atalho;
	}
        
        @Override
        public void actionPerformed(ActionEvent ae) {
            setObjetoSelecionado();
            dispose();
        }
    }
}

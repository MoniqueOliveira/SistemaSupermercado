/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasupermercado.visao;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import sistemasupermercado.dominio.PrecoProduto;
import sistemasupermercado.dominio.Produto;
import sistemasupermercado.dominio.Unidade;
import sistemasupermercado.servicos.PrecoProdutoServico;
import sistemasupermercado.servicos.ProdutoServico;
import sistemasupermercado.visao.tabulacao.IndexedFocusTraversalPolicy;

/**
 *
 * @author Monique
 */
public class FormConsultaProdutos extends javax.swing.JDialog {
    Produto produto;
    PrecoProduto precoProduto;
    
    ProdutoServico produtoServico;
    PrecoProdutoServico precoProdutoServico;
    
    Unidade unidade;
    
    AtalhoAction acaoF2 = new AtalhoAction("F2");
    /**
     * Creates new form FormConsultaProdutos
     */
    private FormConsultaProdutos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public FormConsultaProdutos(java.awt.Frame parent, boolean modal, Unidade unidade) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.unidade = unidade;
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbPesquisarPor = new javax.swing.JComboBox<>();
        txtPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCodigoDeBarras = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtDescricaoReduzida = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtVendaFracionada = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEstocavel = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta de Produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(51, 153, 255))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 51))); // NOI18N

        jLabel1.setText("Pesquisar por:");

        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });

        tblProdutos.setAutoCreateRowSorter(true);
        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblProdutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblProdutosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblProdutos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbPesquisarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisa)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbPesquisarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 51))); // NOI18N

        jLabel11.setText("ID:");

        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        jLabel12.setText("Código de barras:");

        txtCodigoDeBarras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoDeBarrasKeyTyped(evt);
            }
        });

        jLabel14.setText("Descrição:");

        jLabel15.setText("Descrição reduzida:");

        jLabel16.setText("Categoria:");

        jLabel2.setText("Venda fracionada:");

        jLabel3.setText("Estocável:");

        jLabel4.setText("Preço de venda:  R$");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescricao)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVendaFracionada, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstocavel))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtCodigoDeBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCategoria))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtDescricaoReduzida, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPreco)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtVendaFracionada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtEstocavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCodigoDeBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtDescricaoReduzida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(51, 153, 255));
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("F2 - Seleciona item da tabela para consulta");
        jPanel7.add(jLabel13);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        // TODO add your handling code here:
        preencherTabela(cmbPesquisarPor.getSelectedItem().toString(), txtPesquisa.getText());
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void tblProdutosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblProdutosKeyPressed
        // TODO add your handling code here:
        switch(evt.getKeyCode()) {
            case (KeyEvent.VK_TAB):
                cmbPesquisarPor.requestFocus();
                break;
            case (KeyEvent.VK_F2):
                capturarItemSelecionado();
        }
    }//GEN-LAST:event_tblProdutosKeyPressed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtCodigoDeBarrasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoDeBarrasKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoDeBarrasKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        preencherCmbPesquisaPor();
        definirModeloDaTabela();
        preencherTabela("", "");
        definirOrdemDeTabulação();
        registrarAcoesDosAtalhos();
        bloquearEdicao();
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormConsultaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormConsultaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormConsultaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormConsultaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormConsultaProdutos dialog = new FormConsultaProdutos(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCodigoDeBarras;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtDescricaoReduzida;
    private javax.swing.JTextField txtEstocavel;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtVendaFracionada;
    // End of variables declaration//GEN-END:variables

    
    private void definirOrdemDeTabulação() {
        IndexedFocusTraversalPolicy policy = new IndexedFocusTraversalPolicy();
        policy.addIndexedComponent(cmbPesquisarPor);
        policy.addIndexedComponent(txtPesquisa);
        policy.addIndexedComponent(tblProdutos);
        setFocusTraversalPolicy(policy);
    }
    
    private void registrarAcoesDosAtalhos() {
        ActionMap actionMapForm = this.rootPane.getActionMap();
        actionMapForm.put("acaof2", acaoF2);
        rootPane.setActionMap(actionMapForm);
        
        InputMap imapForm = this.rootPane.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW);
        imapForm.put(KeyStroke.getKeyStroke("F2"), "acaof2");
    }

    private void capturarItemSelecionado() {
        if (tblProdutos.getSelectedRowCount() == 0) return;
        
        produto = new Produto();
        produtoServico = new ProdutoServico();
        produto.setIdProduto(Integer.parseInt(tblProdutos.getValueAt(tblProdutos.getSelectedRow(), 0).toString()));
        
        try {
            produto = produtoServico.pesquisar(produto);
            txtId.setText(produto.getIdProduto().toString());
            txtDescricao.setText(produto.getDescricao());
            txtDescricaoReduzida.setText(produto.getDescricaoReduzida());
            txtCodigoDeBarras.setText(produto.getCodigoDeBarras());
            txtCategoria.setText(produto.getCategoria().toString());
            
            if (produto.isEstocavel()) txtEstocavel.setText("Sim");
            else txtEstocavel.setText("Não");
            
            if (produto.isVendaFracionada()) txtVendaFracionada.setText("Sim");
            else txtVendaFracionada.setText("Não");
            
            //Definição do preço do produto
            precoProduto = new PrecoProduto();
            precoProdutoServico = new PrecoProdutoServico();
            precoProduto.setProduto(produto);
            precoProduto.setUnidade(unidade);
            precoProduto = precoProdutoServico.pesquisarPrecoAtual(precoProduto);
            txtPreco.setText(precoProduto.getValor().toString().replaceAll("\\.", ","));
            
        } catch(RuntimeException ex) {
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha durante a execução.\n" + ex.getMessage(), 
                        "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void preencherTabela(String pesquisarPor, String texto) {
        produtoServico = new ProdutoServico();
        DefaultTableModel dtm = (DefaultTableModel) tblProdutos.getModel();
        limparTabela();
        try {
            List<Produto> produtos = produtoServico.listar(pesquisarPor, texto);
            for (int i = 0; i < produtos.size(); i++) {
                dtm.addRow(new Object[]{""});
                tblProdutos.setValueAt(produtos.get(i).getIdProduto().toString(), i, 0);
                tblProdutos.setValueAt(produtos.get(i).getCodigoDeBarras(), i, 1);
                tblProdutos.setValueAt(produtos.get(i).getDescricao(), i, 2);
                tblProdutos.setValueAt(produtos.get(i).getDescricaoReduzida(), i, 3);
                tblProdutos.setValueAt(produtos.get(i).getCategoria().getDescricao(), i, 4);
                
                String vendaFracionada;
                if (produtos.get(i).isVendaFracionada()) vendaFracionada = "Sim";
                else vendaFracionada = "Não";
                tblProdutos.setValueAt(vendaFracionada, i, 5);
                
                String estocavel;
                if (produtos.get(i).isEstocavel()) estocavel = "Sim";
                else estocavel = "Não";
                tblProdutos.setValueAt(estocavel, i, 6);
            }
        } catch(RuntimeException ex) {
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha durante a execução.\n" + ex.getMessage(), 
                        "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void limparTabela() {
        DefaultTableModel dtm = (DefaultTableModel) tblProdutos.getModel();
        dtm.setRowCount(0);
    }

    private void definirModeloDaTabela() {
        tblProdutos.setModel(  
            new DefaultTableModel(
                    new Object[] []{ },
                    new String[]{"ID", "Código de barras", "Descrição", "Descrição reduzida", "Categoria", "Fracionado",
                    "Estocável"}
            ) {
                @Override
                public boolean isCellEditable(int row, int col) {  
                        return false;  
                }
            }
        ); 
        
        tblProdutos.getColumnModel().getColumn(0).setPreferredWidth(60);
        tblProdutos.getColumnModel().getColumn(1).setPreferredWidth(150);
        tblProdutos.getColumnModel().getColumn(2).setPreferredWidth(200);
        tblProdutos.getColumnModel().getColumn(3).setPreferredWidth(150);
        tblProdutos.getColumnModel().getColumn(4).setPreferredWidth(100);
        tblProdutos.getColumnModel().getColumn(5).setPreferredWidth(50);
        tblProdutos.getColumnModel().getColumn(6).setPreferredWidth(50);
        tblProdutos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    private void preencherCmbPesquisaPor() {
        cmbPesquisarPor.addItem("ID");
        cmbPesquisarPor.addItem("Código de barras");
        cmbPesquisarPor.addItem("Descrição");
        cmbPesquisarPor.addItem("Descrição reduzida");
        cmbPesquisarPor.addItem("Categoria");
        
    }

    private void bloquearEdicao() {
        txtCategoria.setEditable(false);
        txtCodigoDeBarras.setEditable(false);
        txtDescricao.setEditable(false);
        txtDescricaoReduzida.setEditable(false);
        txtEstocavel.setEditable(false);
        txtId.setEditable(false);
        txtPreco.setEditable(false);
        txtVendaFracionada.setEditable(false);
    }
    
    /**
     * Classe usada para criar as ações dos atalhos do teclado (F2, F2 e F3)
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
            capturarItemSelecionado();
        }
    }

}

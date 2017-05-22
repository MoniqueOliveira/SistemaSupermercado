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
import sistemasupermercado.dominio.Unidade;
import sistemasupermercado.dominio.Usuario;
import sistemasupermercado.servicos.UsuarioServico;
import sistemasupermercado.visao.tabulacao.IndexedFocusTraversalPolicy;

public class FormConsultaUsuario extends javax.swing.JDialog {

    Usuario usuario;
    
    UsuarioServico usuarioServico;
    
    Unidade unidade;
    
    AtalhoAction acaof2 = new AtalhoAction("F2");
    /**
     * Creates new form FormConsultaUsuario
     */
    private FormConsultaUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public FormConsultaUsuario(java.awt.Frame parent, boolean modal, Unidade unidade) {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtFuncao = new javax.swing.JTextField();
        txtAtivo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbPesquisarPor = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        txtPesquisa = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Usuários");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta de Usuários", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(51, 153, 255))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Usuário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 51))); // NOI18N

        jLabel2.setText("ID:");

        jLabel3.setText("Ativo:");

        jLabel4.setText("Nome:");

        jLabel5.setText("Login:");

        jLabel6.setText("Função:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFuncao))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAtivo, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 51))); // NOI18N

        jLabel1.setText("Pesquisar por:");

        tblUsuarios.setAutoCreateRowSorter(true);
        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblUsuarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblUsuariosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);

        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbPesquisarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisa)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbPesquisarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        preencherCmbPesquisaPor();
        definirModeloDeTabela();
        preencherTabela("", "");
        definirOrdemDeTabulação();
        registrarAcoesDosAtalhos();
        bloquearEdicao();
    }//GEN-LAST:event_formWindowOpened

    private void tblUsuariosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblUsuariosKeyPressed
        // TODO add your handling code here:
        switch(evt.getKeyCode()) {
            case (KeyEvent.VK_TAB):
                cmbPesquisarPor.requestFocus();
                break;
            case (KeyEvent.VK_F2):
                capturarItemSelecionado();
        }
    }//GEN-LAST:event_tblUsuariosKeyPressed

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        // TODO add your handling code here:
        preencherTabela(cmbPesquisarPor.getSelectedItem().toString(), txtPesquisa.getText());
    }//GEN-LAST:event_txtPesquisaKeyReleased

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
            java.util.logging.Logger.getLogger(FormConsultaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormConsultaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormConsultaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormConsultaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormConsultaUsuario dialog = new FormConsultaUsuario(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtAtivo;
    private javax.swing.JTextField txtFuncao;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables

    private void definirModeloDeTabela() {
        tblUsuarios.setModel(  
            new DefaultTableModel(  
               new Object[] []{ },  
               new String[]{"ID", "Nome", "Login", "Função", "Ativo"}
            ) {  

            @Override
            public boolean isCellEditable(int row, int col) {  
                    return false;  
            }  

            }  
         ); 
        
        tblUsuarios.getColumnModel().getColumn(0).setPreferredWidth(60);
        tblUsuarios.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblUsuarios.getColumnModel().getColumn(2).setPreferredWidth(200);
        tblUsuarios.getColumnModel().getColumn(3).setPreferredWidth(200);
        tblUsuarios.getColumnModel().getColumn(4).setPreferredWidth(100);
        tblUsuarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    private void preencherCmbPesquisaPor() {
        cmbPesquisarPor.addItem("ID");
        cmbPesquisarPor.addItem("Nome");
        cmbPesquisarPor.addItem("Login");
    }

    private void definirOrdemDeTabulação() {
        IndexedFocusTraversalPolicy policy = new IndexedFocusTraversalPolicy();
        policy.addIndexedComponent(cmbPesquisarPor);
        policy.addIndexedComponent(txtPesquisa);
        policy.addIndexedComponent(tblUsuarios);
        setFocusTraversalPolicy(policy);
    }

    private void capturarItemSelecionado() {
        if (tblUsuarios.getSelectedRowCount() == 0) return;
        
        usuario = new Usuario();
        usuarioServico = new UsuarioServico();
        usuario.setIdUsuario(Integer.parseInt(tblUsuarios.getValueAt(tblUsuarios.getSelectedRow(), 0).toString()));
        System.out.println(usuario.getIdUsuario());
        
        try {
            usuario = usuarioServico.pesquisar(usuario);
            System.out.println(usuario.getNome());
            txtNome.setText(usuario.getNome());
            txtLogin.setText(usuario.getLogin());
            txtId.setText(usuario.getIdUsuario().toString());
            
            if (usuario.isAtivo()) txtAtivo.setText("Sim");
            else txtAtivo.setText("Não");
            
            txtFuncao.setText(usuario.getFuncaoUsuario().getDescricao());
        } catch(RuntimeException ex) {
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha durante a execução.\n" + ex.getMessage(), 
                        "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void preencherTabela(String pesquisarPor, String texto) {
        usuarioServico = new UsuarioServico();
        DefaultTableModel dtm = (DefaultTableModel) tblUsuarios.getModel();
        limparTabela();
        try {
            List<Usuario> usuarios = usuarioServico.listar(pesquisarPor, texto, unidade.getIdUnidade());
            for (int i = 0; i < usuarios.size(); i++) {
                dtm.addRow(new Object[]{""});
                tblUsuarios.setValueAt(usuarios.get(i).getIdUsuario().toString(), i, 0);
                tblUsuarios.setValueAt(usuarios.get(i).getNome(), i, 1);
                tblUsuarios.setValueAt(usuarios.get(i).getLogin(), i, 2);
                tblUsuarios.setValueAt(usuarios.get(i).getFuncaoUsuario().getDescricao(), i, 3);
                
                String ativo;
                if (usuarios.get(i).isAtivo()) ativo = "Sim";
                else ativo = "Não";
                tblUsuarios.setValueAt(ativo, i, 4);
            }
        } catch(RuntimeException ex) {
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha durante a execução.\n" + ex.getMessage(), 
                        "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void registrarAcoesDosAtalhos() {
        ActionMap actionMapForm = this.rootPane.getActionMap();
        actionMapForm.put("acaof2", acaof2);
        rootPane.setActionMap(actionMapForm);
        
        InputMap imapForm = this.rootPane.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW);
        imapForm.put(KeyStroke.getKeyStroke("F2"), "acaof2");
    }

    private void limparTabela() {
        DefaultTableModel dtm =(DefaultTableModel) tblUsuarios.getModel();
        dtm.setRowCount(0);
    }

    private void bloquearEdicao() {
        txtAtivo.setEditable(false);
        txtFuncao.setEditable(false);
        txtId.setEditable(false);
        txtLogin.setEditable(false);
        txtNome.setEditable(false);
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

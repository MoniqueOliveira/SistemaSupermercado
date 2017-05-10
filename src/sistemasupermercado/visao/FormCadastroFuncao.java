
package sistemasupermercado.visao;

import java.awt.Component;
import java.awt.Container;
import java.awt.FocusTraversalPolicy;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import sistemasupermercado.dominio.FuncaoUsuario;
import sistemasupermercado.servicos.FuncaoUsuarioServico;

public class FormCadastroFuncao extends javax.swing.JDialog {
    FuncaoUsuario funcaoUsuario;
    FuncaoUsuarioServico funcaoUsuarioServico;
    
    AtalhoAction acaoF1 = new AtalhoAction("F1");
    AtalhoAction acaoF2 = new AtalhoAction("F2");
    AtalhoAction acaoF3 = new AtalhoAction("F3");
    AtalhoAction acaoF4 = new AtalhoAction("F4");
    AtalhoAction acaoF5 = new AtalhoAction("F5");
    AtalhoAction acaoF6 = new AtalhoAction("F6");
    /**
     * Creates new form FormCadastroFuncao
     */
    public FormCadastroFuncao(java.awt.Frame parent, boolean modal) {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cmbPesquisarPor = new javax.swing.JComboBox<>();
        txtPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFuncoes = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Funções de Usuários", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(51, 153, 255))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados de Cadastro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 51))); // NOI18N

        jLabel1.setText("ID:");

        jLabel2.setText("Descrição:");

        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemasupermercado/imagens/ÍconePesquisar.png"))); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemasupermercado/imagens/ÍconeNovoMenor.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemasupermercado/imagens/ÍconeInserirMenor.png"))); // NOI18N
        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemasupermercado/imagens/ÍconeEditarMenor.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemasupermercado/imagens/ÍconeExcluirMenor.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescricao))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnNovo)
                    .addComponent(btnIncluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Funções", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 51))); // NOI18N

        jLabel7.setText("Pesquisar por:");

        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyTyped(evt);
            }
        });

        tblFuncoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblFuncoes.setToolTipText("");
        tblFuncoes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblFuncoesKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblFuncoes);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbPesquisarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisa)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbPesquisarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 15, 5));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("F1 - Pesquisa");
        jPanel4.add(jLabel3);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("F2 - Captura item selecionado para alteração");
        jPanel4.add(jLabel4);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("F3 - Novo");
        jPanel4.add(jLabel5);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("F4 - Inclui novo cadastro");
        jPanel4.add(jLabel6);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("F5 - Grava alterações");
        jPanel4.add(jLabel8);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("F6 - Exclui cadastro");
        jPanel4.add(jLabel9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
        if (txtId.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "É necessário inserir o ID para pesquisar.", 
                        "Pesquisa sem resultado", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        funcaoUsuarioServico = new FuncaoUsuarioServico();
        funcaoUsuario = new FuncaoUsuario();
        funcaoUsuario.setIdFuncao(Integer.parseInt(txtId.getText()));
        
        try {
            funcaoUsuario = funcaoUsuarioServico.pesquisar(funcaoUsuario);
            txtDescricao.setText(funcaoUsuario.getDescricao());
            alterarPermissaoDosBotoes();
        } catch(RuntimeException ex) {
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha durante a execução.\n" + ex.getMessage(), 
                        "Atenção", JOptionPane.WARNING_MESSAGE);
        }        
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        redefinir();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        // TODO add your handling code here:
        funcaoUsuario = new FuncaoUsuario();
        funcaoUsuarioServico = new FuncaoUsuarioServico();
        
        if (!txtId.getText().equals("")) funcaoUsuario.setIdFuncao(Integer.parseInt(txtId.getText()));
        funcaoUsuario.setDescricao(txtDescricao.getText());
        
        try {
            funcaoUsuarioServico.inserir(funcaoUsuario);
            
            int resposta = JOptionPane.showConfirmDialog(this, "Função cadastrada com sucesso!\nDeseja continuar no cadastro de funções?", 
                        "Informação", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) { redefinir(); preencherTabela("", "");}
            else dispose();
        } catch(RuntimeException ex) {
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha durante a execução.\n" + ex.getMessage(), 
                        "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        try {
            funcaoUsuario.setDescricao(txtDescricao.getText());
            funcaoUsuarioServico.alterar(funcaoUsuario);
            
            int resposta = JOptionPane.showConfirmDialog(this, "Função alterada com sucesso!\nDeseja continuar no cadastro de funções?", 
                        "Informação", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) { redefinir(); preencherTabela("", ""); }
            else dispose();
        } catch(RuntimeException ex) {
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha durante a execução.\n" + ex.getMessage(), 
                        "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        try {
            funcaoUsuarioServico.excluir(funcaoUsuario);
            
            int resposta = JOptionPane.showConfirmDialog(this, "Função excluída com sucesso!\nDeseja continuar no cadastro de funções?", 
                        "Informação", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) { redefinir(); preencherTabela("", "");}
            else dispose();
        } catch(RuntimeException ex) {
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha durante a execução.\n" + ex.getMessage(), 
                        "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        redefinir();
        definirModeloDaTabela();
        registrarAcoesDosAtalhos();
        definirOrdemDeTabulação();
        preencherTabela("", "");
        preencherComboBox();
    }//GEN-LAST:event_formWindowOpened

    private void tblFuncoesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblFuncoesKeyPressed
        // TODO add your handling code here:
        switch (evt.getKeyCode()){
            case (KeyEvent.VK_TAB):
                txtId.requestFocus();
                break;
            case (KeyEvent.VK_F1):
                if (btnPesquisar.isEnabled()) btnPesquisarActionPerformed(null);
                break;
            case (KeyEvent.VK_F2):
                capturarItemSelecionado();
                break;
            case (KeyEvent.VK_F3):
                btnNovoActionPerformed(null);
                break;
            case (KeyEvent.VK_F4):
                if (btnIncluir.isEnabled()) btnIncluirActionPerformed(null);
                break;
            case (KeyEvent.VK_F5):
                if (btnAlterar.isEnabled()) btnAlterarActionPerformed(null);
                break;
            case (KeyEvent.VK_F6):
                if (btnExcluir.isEnabled()) btnExcluirActionPerformed(null);    
        }
    }//GEN-LAST:event_tblFuncoesKeyPressed

    private void txtPesquisaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaKeyTyped

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        // TODO add your handling code here:
        preencherTabela(cmbPesquisarPor.getSelectedItem().toString(), txtPesquisa.getText());
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        // TODO add your handling code here:
        String caracteres="0987654321";
        if(!caracteres.contains(evt.getKeyChar() + "")){
            evt.consume();
        }
    }//GEN-LAST:event_txtIdKeyTyped

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
            java.util.logging.Logger.getLogger(FormCadastroFuncao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastroFuncao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastroFuncao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastroFuncao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormCadastroFuncao dialog = new FormCadastroFuncao(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cmbPesquisarPor;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFuncoes;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
    private void capturarItemSelecionado() {
        if (tblFuncoes.getSelectedRowCount() == 0) return;
        
        funcaoUsuario = new FuncaoUsuario();
        funcaoUsuario.setIdFuncao(Integer.parseInt(tblFuncoes.getValueAt(tblFuncoes.getSelectedRow(), 0).toString()));
        funcaoUsuario.setDescricao(tblFuncoes.getValueAt(tblFuncoes.getSelectedRow(), 1).toString());
        
        txtId.setText(funcaoUsuario.getIdFuncao().toString());
        txtDescricao.setText(funcaoUsuario.getDescricao());
        alterarPermissaoDosBotoes();
    }
    
    /**
     * Método que "mapeia" e "captura" os atalhos teclados pelo usuário
     */
    private void registrarAcoesDosAtalhos() {
        ActionMap actionMapForm = this.rootPane.getActionMap();
        actionMapForm.put("acaof1", acaoF1);
        actionMapForm.put("acaof2", acaoF2);
        actionMapForm.put("acaof3", acaoF3);
        actionMapForm.put("acaof4", acaoF4);
        actionMapForm.put("acaof5", acaoF5);
        actionMapForm.put("acaof6", acaoF6);
        rootPane.setActionMap(actionMapForm);
        
        InputMap imapForm = this.rootPane.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW);
        imapForm.put(KeyStroke.getKeyStroke("F1"), "acaof1");
        imapForm.put(KeyStroke.getKeyStroke("F2"), "acaof2");
        imapForm.put(KeyStroke.getKeyStroke("F3"), "acaof3");
        imapForm.put(KeyStroke.getKeyStroke("F4"), "acaof4");
        imapForm.put(KeyStroke.getKeyStroke("F5"), "acaof5");
        imapForm.put(KeyStroke.getKeyStroke("F6"), "acaof6");
    }
    
    private void definirOrdemDeTabulação() {
        IndexedFocusTraversalPolicy policy = new IndexedFocusTraversalPolicy();
        policy.addIndexedComponent(txtId);
        policy.addIndexedComponent(txtDescricao);
        policy.addIndexedComponent(cmbPesquisarPor);
        policy.addIndexedComponent(txtPesquisa);
        policy.addIndexedComponent(tblFuncoes);
        setFocusTraversalPolicy(policy);
    }
    
    private void alterarPermissaoDosBotoes() {
        txtId.setEditable(false);
        txtDescricao.requestFocus();
        btnAlterar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnPesquisar.setEnabled(false);
        btnIncluir.setEnabled(false);
    }

    private void preencherTabela(String pesquisarPor, String texto) {
        funcaoUsuarioServico = new FuncaoUsuarioServico();
        DefaultTableModel dtm = (DefaultTableModel) tblFuncoes.getModel();
        limparTabela();
        try {
            List<FuncaoUsuario> funcoes = funcaoUsuarioServico.listar(pesquisarPor, texto);
            for (int i = 0; i < funcoes.size(); i++) {
                dtm.addRow(new Object[]{""});
                tblFuncoes.setValueAt(funcoes.get(i).getIdFuncao().toString(), i, 0);
                tblFuncoes.setValueAt(funcoes.get(i).getDescricao(), i, 1);
            }
        } catch(RuntimeException ex) {
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha durante a execução.\n" + ex.getMessage(), 
                        "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void limparTabela() {
        DefaultTableModel dtm =(DefaultTableModel) tblFuncoes.getModel();
        dtm.setRowCount(0);
    }
    
    private void definirModeloDaTabela() {
        tblFuncoes.setModel(  
            new DefaultTableModel(  
               new Object[] []{ },  
               new String[]{"ID", "Descrição"}
            ) {  

            @Override
            public boolean isCellEditable(int row, int col) {  
                    return false;  
            }  

            }  
         ); 
        
        tblFuncoes.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblFuncoes.getColumnModel().getColumn(1).setPreferredWidth((int) tblFuncoes.getSize().getWidth() - 100);
        tblFuncoes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    private void redefinir() {
        txtId.setText("");
        txtDescricao.setText("");
        txtId.requestFocus();
        txtId.setEditable(true);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnPesquisar.setEnabled(true);
        btnIncluir.setEnabled(true);
    }

    private void preencherComboBox() {
        cmbPesquisarPor.addItem("ID");
        cmbPesquisarPor.addItem("Descrição");
        cmbPesquisarPor.setSelectedIndex(1);
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
            switch(atalho) {
                case ("F1"):
                    if (btnPesquisar.isEnabled()) btnPesquisarActionPerformed(ae);
                    break;
                case ("F2"):
                    capturarItemSelecionado();
                    break;
                case ("F3"):
                    btnNovoActionPerformed(ae);
                    break;
                case ("F4"):
                    if (btnIncluir.isEnabled()) btnIncluirActionPerformed(ae);
                    break;
                case ("F5"):
                    if (btnAlterar.isEnabled()) btnAlterarActionPerformed(ae);
                    break;
                case ("F6"):
                    if (btnExcluir.isEnabled()) btnExcluirActionPerformed(ae);
            }
        }
    }

        
    /*
    * Classe usada para definir a ordem de tabulação entre os componentes
    */
    private class IndexedFocusTraversalPolicy extends FocusTraversalPolicy {

        private ArrayList<Component> components = new ArrayList<>();

        public void addIndexedComponent(Component component) {
             components.add(component);
        }

        //@Override
        @Override
        public Component getComponentAfter(Container aContainer, Component aComponent) {
             int atIndex = components.indexOf(aComponent);
             int nextIndex = (atIndex + 1) % components.size();
             return components.get(nextIndex);
        }

        @Override
        public Component getComponentBefore(Container aContainer, Component aComponent) {
             int atIndex = components.indexOf(aComponent);
             int nextIndex = (atIndex + components.size() - 1) %
                     components.size();
             return components.get(nextIndex);
        }

        @Override
        public Component getFirstComponent(Container aContainer) {
             return components.get(0);
        }

        @Override
        public Component getLastComponent(Container cntnr) {
            return components.get(components.size() - 1);
        }

        @Override
        public Component getDefaultComponent(Container cntnr) {
            return components.get(0);
        }
    }

}

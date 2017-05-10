/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasupermercado.visao;

import java.awt.event.ActionEvent;
import java.math.BigDecimal;
import java.util.Vector;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import sistemasupermercado.dominio.Caixa;
import sistemasupermercado.dominio.Sessao;
import sistemasupermercado.dominio.SessaoCaixa;
import sistemasupermercado.servicos.CaixaServico;
import sistemasupermercado.servicos.SessaoCaixaServico;
import sistemasupermercado.visao.tabulacao.IndexedFocusTraversalPolicy;

/**
 *
 * @author Monique
 */
public class FormAberturaDeCaixa extends javax.swing.JDialog {

    Sessao sessao;
    SessaoCaixa sessaoCaixa;
    
    SessaoCaixaServico sessaoCaixaServico;
    CaixaServico caixaServico;
    
    AtalhoAction acaoF2 = new AtalhoAction("F2");
    /**
     * Creates new form FormIniciarCaixa
     */
    private FormAberturaDeCaixa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public FormAberturaDeCaixa(java.awt.Frame parent, boolean modal, Sessao sessao) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.sessao = sessao;
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
        cmbNumeroCaixa = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        btnAbrirCaixa = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Caixa");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(271, 124));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Abertura de Caixa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(51, 153, 255))); // NOI18N

        jLabel1.setText("Número do caixa:");

        jLabel3.setText("Valor em caixa (R$):");

        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorKeyTyped(evt);
            }
        });

        btnAbrirCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemasupermercado/imagens/ÍconeAbrir.png"))); // NOI18N
        btnAbrirCaixa.setText("Abrir caixa");
        btnAbrirCaixa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAbrirCaixa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAbrirCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirCaixaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbNumeroCaixa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtValor))
                .addGap(18, 18, 18)
                .addComponent(btnAbrirCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAbrirCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cmbNumeroCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 5));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("F2 - Abre caixa");
        jPanel2.add(jLabel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(413, 163));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirCaixaActionPerformed
        // TODO add your handling code here:
        if (txtValor.getText().equals("")){
            int resposta = JOptionPane.showConfirmDialog(this, "Deseja abrir caixa com valor inicial de R$ 0,00?", 
                    "Atenção", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) txtValor.setText("0,00");
            else { txtValor.requestFocus(); return; }
        }
        
        Caixa caixa = (Caixa) cmbNumeroCaixa.getSelectedItem();
        
        sessaoCaixa = new SessaoCaixa();
        sessaoCaixa.setSessao(sessao);
        sessaoCaixa.setCaixa(caixa);
        sessaoCaixa.setValorInicialCaixa(new BigDecimal(txtValor.getText().replaceAll(",", ".")));
        
        try {
            if (!caixaServico.confirmarCaixaFechado(caixa)) {
                JOptionPane.showMessageDialog(this, "O caixa selecionado já foi aberto!", "Atenção", JOptionPane.WARNING_MESSAGE);
                preencherCmbNumeroCaixa();
                cmbNumeroCaixa.requestFocus();
                return;
            }
            
            sessaoCaixaServico = new SessaoCaixaServico();
            sessaoCaixaServico.abrirCaixa(sessaoCaixa);
            JOptionPane.showMessageDialog(this, "Caixa aberto!", "Informação", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            
        } catch (RuntimeException ex) {
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha durante a execução.\n" + ex.getMessage(),
                    "Atenção", JOptionPane.WARNING_MESSAGE);
            sessaoCaixa = null;
            
        }
    }//GEN-LAST:event_btnAbrirCaixaActionPerformed

    private void txtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyTyped
        // TODO add your handling code here:
        String caracteres="0987654321,";
        if(!caracteres.contains(evt.getKeyChar() + "")){
            evt.consume();
        }
    }//GEN-LAST:event_txtValorKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        preencherCmbNumeroCaixa();
        registrarAcoesDosAtalhos();
        definirOrdemDeTabulação();
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
            java.util.logging.Logger.getLogger(FormAberturaDeCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAberturaDeCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAberturaDeCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAberturaDeCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormAberturaDeCaixa dialog = new FormAberturaDeCaixa(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAbrirCaixa;
    private javax.swing.JComboBox cmbNumeroCaixa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
    
    public SessaoCaixa getSessaoCaixa() {
        return sessaoCaixa;
    }
    
    public void preencherCmbNumeroCaixa() {
        caixaServico = new CaixaServico();
        try {
                      
            DefaultComboBoxModel<Caixa> model = new DefaultComboBoxModel<>(new Vector<>(caixaServico.listarCaixasFechados(sessao.getUsuario().getUnidade())));
            cmbNumeroCaixa.setModel(model);
            
        } catch(RuntimeException ex) {
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha durante a execução.\n" + ex.getMessage(),
                    "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void definirOrdemDeTabulação() {
        IndexedFocusTraversalPolicy policy = new IndexedFocusTraversalPolicy();
        policy.addIndexedComponent(cmbNumeroCaixa);
        policy.addIndexedComponent(txtValor);
        policy.addIndexedComponent(btnAbrirCaixa);
        setFocusTraversalPolicy(policy);
    }
    
    private void registrarAcoesDosAtalhos() {
        ActionMap actionMapForm = this.rootPane.getActionMap();
        actionMapForm.put("acaof2", acaoF2);
        rootPane.setActionMap(actionMapForm);
        
        InputMap imapForm = this.rootPane.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW);
        imapForm.put(KeyStroke.getKeyStroke("F2"), "acaof2");
    }
    
    /**
     * Classe usada para criar as ações dos atalhos do teclado.
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
            btnAbrirCaixaActionPerformed(ae);
        }
    }
    
}

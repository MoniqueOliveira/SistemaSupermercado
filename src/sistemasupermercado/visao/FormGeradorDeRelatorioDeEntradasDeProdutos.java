/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasupermercado.visao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import sistemasupermercado.conexao.ConnectionFactory;
import sistemasupermercado.dominio.Sessao;
import sistemasupermercado.relatorios.GeradorDeRelatorioDeEntradaDeProdutos;
import sistemasupermercado.relatorios.GeradorDeRelatorioDeProdutosRetirados;
import sistemasupermercado.relatorios.GeradorDeRelatorioDeUsuarios;


public class FormGeradorDeRelatorioDeEntradasDeProdutos extends javax.swing.JDialog {

    int mesMin, mesMax, tipoPesquisa;
    String ano, usuario, dia, produto, fornecedor;
    Sessao sessao;
    /**
     * Creates new form FormGeradorDeRelatorioDeEntradas
     */
    private FormGeradorDeRelatorioDeEntradasDeProdutos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public FormGeradorDeRelatorioDeEntradasDeProdutos(java.awt.Frame parent, boolean modal, Sessao sessao) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
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
        cmbMesMin = new javax.swing.JComboBox<>();
        btnConfirmar = new javax.swing.JButton();
        lblano = new javax.swing.JLabel();
        cmbAno = new javax.swing.JComboBox<>();
        lblMeses = new javax.swing.JLabel();
        lblMes2 = new javax.swing.JLabel();
        cmbMesMax = new javax.swing.JComboBox<>();
        lbldia = new javax.swing.JLabel();
        cmbDia = new javax.swing.JComboBox<>();
        lblFuncionario = new javax.swing.JLabel();
        txtFuncionario = new javax.swing.JTextField();
        cmbFiltro = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        lblProduto = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        txtFornecedor = new javax.swing.JTextField();
        lblFornecedor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório de Entrada de Produtos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gerar relatório de entradas de produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(51, 153, 255))); // NOI18N

        cmbMesMin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

        btnConfirmar.setText("Gerar Relatório");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        lblano.setText("Selecione o ano:");

        lblMeses.setText("Selecione os meses:");

        lblMes2.setText("a");

        cmbMesMax.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

        lbldia.setText("Selecione o dia:");

        cmbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cmbDia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDiaItemStateChanged(evt);
            }
        });
        cmbDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDiaActionPerformed(evt);
            }
        });

        lblFuncionario.setText("Digite o nome ou ID do funcionário:");

        cmbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não utilizar filtros", "Data", "Período", "Produto", "Produto e data", "Produto e período", "Fornecedor", "Fornecedor e data", "Fornecedor e período", "ID/Nome de usuário", "ID/Nome de usuário e data", "ID/Nome de usuário e período" }));
        cmbFiltro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbFiltroItemStateChanged(evt);
            }
        });
        cmbFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFiltroActionPerformed(evt);
            }
        });

        jLabel1.setText("Selecione o tipo de filtro para o relatório:");

        lblProduto.setText("Digite a descrição ou ID do produto:");

        lblFornecedor.setText("Digite a razão socia ou nome fantasia  do fornecedor:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConfirmar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMeses)
                            .addComponent(lblano)
                            .addComponent(lbldia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(cmbMesMin, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblMes2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cmbMesMax, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(cmbAno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFornecedor)
                            .addComponent(lblProduto)
                            .addComponent(lblFuncionario))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(txtFornecedor)
                            .addComponent(txtProduto))))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirmar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFuncionario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFornecedor)
                    .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProduto)
                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldia)
                    .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMesMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMes2)
                    .addComponent(cmbMesMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMeses))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblano))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
        
        if(tipoPesquisa==12){
            dia="0";
            ano="0";
            mesMin=0;
            mesMax=0;
            usuario="0";
            produto="0";
            fornecedor="0";
        }else {
            switch(cmbMesMin.getSelectedIndex()){
                case (0):
                    mesMin =1;
                    break;
                case (1):
                    mesMin =2;
                    break;
                case (2):
                    mesMin =3;
                    break;
                case (3):
                    mesMin =4;
                    break;
                case (4):
                    mesMin =5;
                    break;
                case (5):
                    mesMin =6;
                    break;
                case (6):
                    mesMin =7;
                    break;
                case (7):
                    mesMin =8;
                    break;
                case (8):
                    mesMin =9;
                    break;
                case (9):
                    mesMin =10;
                    break;
                case (10):
                    mesMin =11;
                    break;
                case (11):
                    mesMin =12;
                    break;
                default:
                    mesMin=0;
            }

            switch(cmbMesMax.getSelectedIndex()){
                case (0):
                    mesMax =1;
                    break;
                case (1):
                    mesMax =2;
                    break;
                case (2):
                    mesMax =3;
                    break;
                case (3):
                    mesMax =4;
                    break;
                case (4):
                    mesMax =5;
                    break;
                case (5):
                    mesMax =6;
                    break;
                case (6):
                    mesMax =7;
                    break;
                case (7):
                    mesMax =8;
                    break;
                case (8):
                    mesMax =9;
                    break;
                case (9):
                    mesMax =10;
                    break;
                case (10):
                    mesMax =11;
                    break;
                case (11):
                    mesMax =12;
                    break;
                default:
                    mesMax = 0;   
            }

            ano = cmbAno.getSelectedItem().toString();

            if(cmbDia.getSelectedIndex() ==0){
                dia = "0";
            }else {
                dia = cmbDia.getSelectedItem().toString();
                mesMax = 0;
                }

            if(txtFuncionario.getText().equals("")){
                usuario = "0";
            }else usuario = txtFuncionario.getText();
            
            if(txtProduto.getText().equals("")){
                produto = "0";
            }else produto = txtProduto.getText();
            
            if(txtFornecedor.getText().equals("")){
                fornecedor = "0";
            }else fornecedor = txtFornecedor.getText();

        }
        dispose();
        
        GeradorDeRelatorioDeEntradaDeProdutos g = new GeradorDeRelatorioDeEntradaDeProdutos();
        try {
            g.abrirRelatorio(sessao.getUsuario().getUnidade().getIdUnidade(), usuario, fornecedor, produto, dia,  mesMin, mesMax, ano, tipoPesquisa).setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(FormGeradorDeRelatorioDeEntradasDeProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        preencherCmbAno();
        tipoPesquisa=12;
        lblProduto.setVisible(false);
        lblFuncionario.setVisible(false);
        lblMes2.setVisible(false);
        lblMeses.setVisible(false);
        lblano.setVisible(false);
        lbldia.setVisible(false);
        txtFuncionario.setVisible(false);
        txtProduto.setVisible(false);
        cmbAno.setVisible(false);
        cmbDia.setVisible(false);
        cmbMesMax.setVisible(false);
        cmbMesMin.setVisible(false);
        txtFornecedor.setVisible(false);
        lblFornecedor.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void cmbDiaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDiaItemStateChanged

    }//GEN-LAST:event_cmbDiaItemStateChanged

    private void cmbDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDiaActionPerformed

    private void cmbFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbFiltroItemStateChanged
        // TODO add your handling code here:

        switch(cmbFiltro.getSelectedIndex()){
            case (0): //nenhum filtro
                tipoPesquisa=12;
                lblFuncionario.setVisible(false);
                lblMes2.setVisible(false);
                lblMeses.setVisible(false);
                lblano.setVisible(false);
                lbldia.setVisible(false);
                txtFuncionario.setVisible(false);
                txtProduto.setVisible(false);
                lblProduto.setVisible(false);
                cmbAno.setVisible(false);
                cmbDia.setVisible(false);
                cmbMesMax.setVisible(false);
                cmbMesMin.setVisible(false);
                txtFornecedor.setVisible(false);
                lblFornecedor.setVisible(false);
                break;
            case (1)://dia
                tipoPesquisa=4;
                lblFuncionario.setVisible(false);
                lblMes2.setVisible(false);
                lblMeses.setVisible(true);
                lblano.setVisible(true);
                lbldia.setVisible(true);
                txtFuncionario.setVisible(false);
                cmbAno.setVisible(true);
                cmbDia.setVisible(true);
                cmbMesMax.setVisible(false);
                cmbMesMin.setVisible(true);
                txtProduto.setVisible(false);
                lblProduto.setVisible(false);
                txtFornecedor.setVisible(false);
                lblFornecedor.setVisible(false);
                break;
            case (2)://periodo
                tipoPesquisa=8;
                lblFuncionario.setVisible(false);
                lblMes2.setVisible(true);
                lblMeses.setVisible(true);
                lblano.setVisible(true);
                lbldia.setVisible(false);
                txtFuncionario.setVisible(false);
                cmbAno.setVisible(true);
                cmbDia.setVisible(false);
                cmbMesMax.setVisible(true);
                cmbMesMin.setVisible(true);
                txtProduto.setVisible(false);
                lblProduto.setVisible(false);
                lblMeses.setText("Selecione os meses:");
                txtFornecedor.setVisible(false);
                lblFornecedor.setVisible(false);
                break;
            case (3)://produto
                tipoPesquisa=11;
                lblFuncionario.setVisible(false);
                lblMes2.setVisible(false);
                lblMeses.setVisible(false);
                lblano.setVisible(false);
                lbldia.setVisible(false);
                txtFuncionario.setVisible(false);
                cmbAno.setVisible(false);
                cmbDia.setVisible(false);
                cmbMesMax.setVisible(false);
                cmbMesMin.setVisible(false);
                txtProduto.setVisible(true);
                lblProduto.setVisible(true);
                txtFornecedor.setVisible(false);
                lblFornecedor.setVisible(false);
                break;
            case (4)://produto e dia
                tipoPesquisa=3;
                lblFuncionario.setVisible(false);
                lblMes2.setVisible(false);
                lblMeses.setVisible(true);
                lblano.setVisible(true);
                lbldia.setVisible(true);
                txtFuncionario.setVisible(false);
                cmbAno.setVisible(true);
                cmbDia.setVisible(true);
                cmbMesMax.setVisible(false);
                cmbMesMin.setVisible(true);
                txtProduto.setVisible(true);
                lblProduto.setVisible(true);
                txtFornecedor.setVisible(false);
                lblFornecedor.setVisible(false);
                lblMeses.setText("Selecione o mês:");
                break;
            case (5)://produto e periodo
                tipoPesquisa=7;
                lblFuncionario.setVisible(false);
                lblMes2.setVisible(true);
                lblMeses.setVisible(true);
                lblano.setVisible(true);
                lbldia.setVisible(false);
                txtFuncionario.setVisible(false);
                cmbAno.setVisible(true);
                cmbDia.setVisible(false);
                cmbMesMax.setVisible(true);
                cmbMesMin.setVisible(true);
                txtProduto.setVisible(true);
                lblProduto.setVisible(true);
                txtFornecedor.setVisible(false);
                lblFornecedor.setVisible(false);
                lblMeses.setText("Selecione os meses:");
                break;                
            case (6): //fornecedor
                tipoPesquisa=10;
                lblFuncionario.setVisible(false);
                lblMes2.setVisible(false);
                lblMeses.setVisible(false);
                lblano.setVisible(false);
                lbldia.setVisible(false);
                txtFuncionario.setVisible(false);
                cmbAno.setVisible(false);
                cmbDia.setVisible(false);
                cmbMesMax.setVisible(false);
                cmbMesMin.setVisible(false);
                txtProduto.setVisible(false);
                lblProduto.setVisible(false);
                txtFornecedor.setVisible(true);
                lblFornecedor.setVisible(true);
                break;
            case (7)://data e fornecedor
                tipoPesquisa=2;
                lblFuncionario.setVisible(false);
                lblMes2.setVisible(false);
                lblMeses.setVisible(true);
                lblano.setVisible(true);
                lbldia.setVisible(true);
                txtFuncionario.setVisible(false);
                cmbAno.setVisible(true);
                cmbDia.setVisible(true);
                cmbMesMax.setVisible(false);
                cmbMesMin.setVisible(true);
                txtProduto.setVisible(false);
                lblProduto.setVisible(false);
                txtFornecedor.setVisible(true);
                lblFornecedor.setVisible(true);
                lblMeses.setText("Selecione o mês:");
                break;
            case (8)://periodo e fornecedor
                tipoPesquisa=6;
                lblFuncionario.setVisible(false);
                lblMes2.setVisible(true);
                lblMeses.setVisible(true);
                lblano.setVisible(true);
                lbldia.setVisible(false);
                txtFuncionario.setVisible(false);
                cmbAno.setVisible(true);
                cmbDia.setVisible(false);
                cmbMesMax.setVisible(true);
                cmbMesMin.setVisible(true);
                txtProduto.setVisible(false);
                lblProduto.setVisible(false);
                txtFornecedor.setVisible(true);
                lblFornecedor.setVisible(true);
                lblMeses.setText("Selecione os meses:");
                break;
            case (9)://funcionario
                tipoPesquisa=9;
                lblFuncionario.setVisible(true);
                lblMes2.setVisible(false);
                lblMeses.setVisible(false);
                lblano.setVisible(false);
                lbldia.setVisible(false);
                txtFuncionario.setVisible(true);
                cmbAno.setVisible(false);
                cmbDia.setVisible(false);
                cmbMesMax.setVisible(false);
                cmbMesMin.setVisible(false);
                txtProduto.setVisible(false);
                lblProduto.setVisible(false);
                txtFornecedor.setVisible(false);
                lblFornecedor.setVisible(false);
                break;        
            case (10)://funcionario e dia
                tipoPesquisa=1;
                lblFuncionario.setVisible(true);
                lblMes2.setVisible(false);
                lblMeses.setVisible(true);
                lblano.setVisible(true);
                lbldia.setVisible(true);
                txtFuncionario.setVisible(true);
                cmbAno.setVisible(true);
                cmbDia.setVisible(true);
                cmbMesMax.setVisible(false);
                cmbMesMin.setVisible(true);
                txtProduto.setVisible(false);
                lblProduto.setVisible(false);
                txtFornecedor.setVisible(false);
                lblFornecedor.setVisible(false);
                lblMeses.setText("Selecione o mês:");
                break;
                case (11)://funcionario e periodo
                tipoPesquisa=5;
                lblFuncionario.setVisible(true);
                lblMes2.setVisible(true);
                lblMeses.setVisible(true);
                lblano.setVisible(true);
                lbldia.setVisible(false);
                txtFuncionario.setVisible(true);
                cmbAno.setVisible(true);
                cmbDia.setVisible(false);
                cmbMesMax.setVisible(true);
                cmbMesMin.setVisible(true);
                txtProduto.setVisible(false);
                lblProduto.setVisible(false);
                txtFornecedor.setVisible(false);
                lblFornecedor.setVisible(false);
                lblMeses.setText("Selecione os meses:");
                break;  
        }
        
        
    }//GEN-LAST:event_cmbFiltroItemStateChanged

    private void cmbFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFiltroActionPerformed

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
            java.util.logging.Logger.getLogger(FormGeradorDeRelatorioDeEntradasDeProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormGeradorDeRelatorioDeEntradasDeProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormGeradorDeRelatorioDeEntradasDeProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormGeradorDeRelatorioDeEntradasDeProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormGeradorDeRelatorioDeEntradasDeProdutos dialog = new FormGeradorDeRelatorioDeEntradasDeProdutos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JComboBox<String> cmbAno;
    private javax.swing.JComboBox<String> cmbDia;
    private javax.swing.JComboBox<String> cmbFiltro;
    private javax.swing.JComboBox<String> cmbMesMax;
    private javax.swing.JComboBox<String> cmbMesMin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFornecedor;
    private javax.swing.JLabel lblFuncionario;
    private javax.swing.JLabel lblMes2;
    private javax.swing.JLabel lblMeses;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblano;
    private javax.swing.JLabel lbldia;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtFuncionario;
    private javax.swing.JTextField txtProduto;
    // End of variables declaration//GEN-END:variables
    public void preencherCmbAno() {
        try {
            //List<String> anos = new ArrayList();
            String sql = "select distinct year(data) from entradas_produtos";
            PreparedStatement pstm = new ConnectionFactory().getConnection().prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next())
                cmbAno.addItem(rs.getString(1));
            
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha durante a execução.\n" + ex.getMessage(),
                    "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesSistema;

import javax.swing.JButton;

/**
 *
 * @author lelim
 */
public class BotoesCadastroCliente extends javax.swing.JPanel {
    private JanelaCadastroCliente janela;
    private TabelaClientesCadastrados tabela;
   
    /**
     * Creates new form botoesCadastro
     */
    public BotoesCadastroCliente() {
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

        btnCadastrarCliente = new javax.swing.JButton();
        btnAtualizarCadastro = new javax.swing.JButton();
        btnExcluirCadastro = new javax.swing.JButton();

        btnCadastrarCliente.setBackground(new java.awt.Color(0, 153, 153));
        btnCadastrarCliente.setText("Cadastrar Cliente");
        btnCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarClienteActionPerformed(evt);
            }
        });

        btnAtualizarCadastro.setBackground(new java.awt.Color(0, 153, 153));
        btnAtualizarCadastro.setText("Atualizar Cadastro");
        btnAtualizarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarCadastroActionPerformed(evt);
            }
        });

        btnExcluirCadastro.setBackground(new java.awt.Color(0, 153, 153));
        btnExcluirCadastro.setText("Excluir Cadastro");
        btnExcluirCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCadastrarCliente)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarCadastro)
                .addGap(18, 18, 18)
                .addComponent(btnExcluirCadastro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarCliente)
                    .addComponent(btnAtualizarCadastro)
                    .addComponent(btnExcluirCadastro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarClienteActionPerformed
        janela.cadastrarCliente();
    }//GEN-LAST:event_btnCadastrarClienteActionPerformed

    private void btnAtualizarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarCadastroActionPerformed
        janela.alterarCadastro();
    }//GEN-LAST:event_btnAtualizarCadastroActionPerformed

    private void btnExcluirCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCadastroActionPerformed
        janela.excluirCadastro();
    }//GEN-LAST:event_btnExcluirCadastroActionPerformed

    public void setJanela(JanelaCadastroCliente janela) {
        this.janela = janela;
    }

    public JButton getBtnCadastrarCliente() {
        return btnCadastrarCliente;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarCadastro;
    private javax.swing.JButton btnCadastrarCliente;
    private javax.swing.JButton btnExcluirCadastro;
    // End of variables declaration//GEN-END:variables
}

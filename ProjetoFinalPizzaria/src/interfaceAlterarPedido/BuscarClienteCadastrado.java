/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceAlterarPedido;

import interfacesSistema.Datastore;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextPane;

/**
 *
 * @author lelim
 */
public class BuscarClienteCadastrado extends javax.swing.JPanel {
    Datastore datastore = Datastore.getInstance();
    /**
     * Creates new form BuscarClienteCadastrado
     */
    public BuscarClienteCadastrado() {
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

        jLabel1 = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTelefone = new javax.swing.JTextPane();
        btnBuscarCliente = new javax.swing.JButton();
        lblMensagemValidacao = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Buscar cliente cadastrado por telefone");

        lblTelefone.setText("Telefone:");

        jScrollPane1.setViewportView(txtTelefone);

        btnBuscarCliente.setBackground(new java.awt.Color(0, 153, 153));
        btnBuscarCliente.setText("Buscar Cliente");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        lblMensagemValidacao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMensagemValidacao.setForeground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(btnBuscarCliente)))
                        .addGap(0, 162, Short.MAX_VALUE))
                    .addComponent(lblMensagemValidacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefone)
                    .addComponent(btnBuscarCliente))
                .addGap(30, 30, 30)
                .addComponent(lblMensagemValidacao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        if (datastore.buscarPorTelefone(getTxtTelefone().getText())) {
            getLblMensagemValidacao().setText("Cliente cadastrado!");
        } else {
            getLblMensagemValidacao().setText("Cliente não cadastrado! Favor realizar o cadastro antes de fazer o pedido.");
        }
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    public JButton getBtnBuscarCliente() {
        return btnBuscarCliente;
    }

    public JLabel getLblMensagemValidacao() {
        return lblMensagemValidacao;
    }

    public void setLblMensagemValidacao(JLabel lblMensagemValidacao) {
        this.lblMensagemValidacao = lblMensagemValidacao;
    }

    public JTextPane getTxtTelefone() {
        return txtTelefone;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMensagemValidacao;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTextPane txtTelefone;
    // End of variables declaration//GEN-END:variables
}

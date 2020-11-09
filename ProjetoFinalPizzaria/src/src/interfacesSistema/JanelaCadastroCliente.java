/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesSistema;

import projetofinalpizzaria.Cliente;

/**
 *
 * @author lelim
 */
public class JanelaCadastroCliente extends javax.swing.JFrame {
    Datastore datastore = Datastore.getInstance();
    private long clienteID;
    
    /**
     * Creates new form JanelaCadastroCliente
     */
    public JanelaCadastroCliente() {
        initComponents();
        botoesCadastroCliente1.setJanela(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabelaClientesCadastrados1 = new interfacesSistema.TabelaClientesCadastrados();
        botoesCadastroCliente1 = new interfacesSistema.BotoesCadastroCliente();
        formularioCadastroCliente1 = new interfacesSistema.FormularioCadastroCliente();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botoesCadastroCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tabelaClientesCadastrados1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(formularioCadastroCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(formularioCadastroCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botoesCadastroCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabelaClientesCadastrados1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void cadastrarCliente() {
        String nome = formularioCadastroCliente1.getTxtNome().getText();
        String sobrenome = formularioCadastroCliente1.getTxtSobrenome().getText();
        String telefone = formularioCadastroCliente1.getTxtTelefone().getText();
        
        Cliente cliente = new Cliente(clienteID++, nome, sobrenome, telefone);
        datastore.getClientes().add(cliente);
        tabelaClientesCadastrados1.getModeloTabela().adicionaContato(cliente);
    }
    
    public void excluirCadastro() {
        int idCliente = Integer.parseInt(formularioCadastroCliente1.getTxtID().getText());
        
        /*tabelaClientesCadastrados1.getModeloTabela().removeContato(datastore.getClientes().get(idCliente));
        datastore.getClientes().remove(datastore.getClientes().get(idCliente));
        clienteID--;*/
        
        int index = -1;
        for(int i =0; i < datastore.getClientes().size(); i++){
            if(datastore.getClientes().get(i).getId() == idCliente)
                index = i;
        }
        /*for (int i = 0; i < datastore.getClientes().size(); i++) {
            try {
                if (idCliente < datastore.getClientes().get(idCliente).getId()) {
                    datastore.getClientes().get(idCliente).setId(datastore.getClientes().get(idCliente).getId() - 1);
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERRO");
            }
        }*/
        if (index < 0){
            return;
        }
        tabelaClientesCadastrados1.getModeloTabela().removeContato(datastore.getClientes().get(index));
        datastore.getClientes().remove(datastore.getClientes().get(index));
    }
    
    public void alterarCadastro() {
        String nome = formularioCadastroCliente1.getTxtNome().getText();
        String sobrenome = formularioCadastroCliente1.getTxtSobrenome().getText();
        String telefone = formularioCadastroCliente1.getTxtTelefone().getText();
        int ID = Integer.parseInt(formularioCadastroCliente1.getTxtID().getText());
        int index = -1;
        for(int i =0; i < datastore.getClientes().size(); i++){
            if(datastore.getClientes().get(i).getId() == ID)
                index = i;
        } 

        if(index < 0){
            return;
        }

        tabelaClientesCadastrados1.getModeloTabela().setValueAt(nome, index, 1);
        tabelaClientesCadastrados1.getModeloTabela().setValueAt(sobrenome, index, 2);
        tabelaClientesCadastrados1.getModeloTabela().setValueAt(telefone, index, 3);
    }
    
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
            java.util.logging.Logger.getLogger(JanelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaCadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private interfacesSistema.BotoesCadastroCliente botoesCadastroCliente1;
    private interfacesSistema.FormularioCadastroCliente formularioCadastroCliente1;
    private interfacesSistema.TabelaClientesCadastrados tabelaClientesCadastrados1;
    // End of variables declaration//GEN-END:variables
}

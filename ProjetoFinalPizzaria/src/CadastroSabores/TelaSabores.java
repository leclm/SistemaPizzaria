/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadastroSabores;

import interfacesSistema.Datastore;
import java.util.ArrayList;
import projetofinalpizzaria.Cliente;
import projetofinalpizzaria.Sabor;

/**
 *
 * @author mathe
 */
public class TelaSabores extends javax.swing.JFrame {
    Datastore datastore = Datastore.getInstance(); // com isso conseguimos usar todas as coisas que tem na classe Datastore, inclusive os arraylists
    
    public void mostrarSabores() {
        System.out.println(datastore.getSabores());
    }
    
    private double simples;
    private double especial;
    private double premium;
    private long idContador = 0;
    /**
     * Creates new form TelaSabores
     */
    public TelaSabores() {
        initComponents();
        botoesSabores.setJanela(this);
        this.simples = 3;
        this.especial = 4;
        this.premium = 5;
    }
      
    public void setValores(double simples, double especial, double premium){
        this.simples = simples;
        this.especial = especial;
        this.premium = premium;
        
        datastore.getSabores().forEach(sabor -> {
            int tipo = sabor.getTipo();
            sabor.setPreco((tipo == 0 ? simples : ( tipo == 1 ? especial : premium )));
        });
        atualizaTabela();
    }

    public ArrayList<Sabor> getSabores() {
        return datastore.getSabores();
    }
    
    public void cadastrar() {
        labelTextError.setText("");
        String nome = inputSabores.getNomeSabor();
        int tipo = inputSabores.getTipo();
        double preco = tipo == 0 ? this.simples : ( tipo == 1 ? this.especial : this.premium );
        
        if( "".equals(nome)){
            labelTextError.setText("Necesário informar o nome do sabor.");
            return;
        }
        if (tipo < 0){
            labelTextError.setText("Necesário informar o tipo de pizza.");
            return;
        }

        Sabor sabor = new Sabor(idContador++, tipo, nome, preco);
        datastore.getSabores().add(sabor);
        atualizaTabela();
    }
    
    public void excluir() {
        labelTextError.setText("");
        long id = inputSabores.getID();
        
        if(id < 0){
            labelTextError.setText("ID inválido.");
            return;
        }
        
        if(datastore.getSabores().isEmpty()){
            labelTextError.setText("Não há sabores cadastrados.");
            return;
        }
        
        int index = -1;
        for(int i =0; i < datastore.getSabores().size(); i++){
            if(datastore.getSabores().get(i).getId() == id)
                index = i;
        } 
        
        if(index < 0){
            labelTextError.setText("ID não encontrado.");
            return;
        }
        
        datastore.getSabores().remove(index);
        atualizaTabela();
    }
    
    public void alterar() {
        labelTextError.setText("");
        String nome = inputSabores.getNomeSabor();
        int tipo = inputSabores.getTipo();
        double preco = tipo == 0 ? this.simples : ( tipo == 1 ? this.especial : this.premium );
        long id = inputSabores.getID();
        
        if(id < 0){
            labelTextError.setText("ID inválido.");
            return;
        }
        
        if(datastore.getSabores().isEmpty()){
            labelTextError.setText("Não há sabores cadastrados.");
            return;
        }
        
        if(tipo < 0) {
            labelTextError.setText("Necesário informar o tipo do sabor.");
            return;
        }
        
        if("".equals(nome)){
            labelTextError.setText("Necesário informar o nome do sabor.");
            return;
        }
        
        Sabor sabor = new Sabor(id, tipo, nome, preco); 
        
        int index = -1;
        
        for(int i =0; i < datastore.getSabores().size(); i++){
            if(datastore.getSabores().get(i).getId() == id)
                index = i;
        }        
        
        if(index < 0){
            labelTextError.setText("ID não encontrado.");
            return;
        }
        
        datastore.getSabores().get(index).setSabor(sabor);
        
        atualizaTabela();
    }
    
    private void atualizaTabela(){
        tabelaSabores.getModeloTabela().setListaSabores(datastore.getSabores());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabelaSabores = new CadastroSabores.TabelaSabores();
        botoesSabores = new CadastroSabores.botoesSabores();
        inputSabores = new CadastroSabores.inputSabores();
        labelTextError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelTextError.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelTextError.setForeground(new java.awt.Color(255, 0, 0));
        labelTextError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTextError.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabelaSabores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botoesSabores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputSabores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelTextError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(inputSabores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTextError, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botoesSabores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(tabelaSabores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaSabores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSabores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSabores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSabores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSabores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private CadastroSabores.botoesSabores botoesSabores;
    private CadastroSabores.inputSabores inputSabores;
    private javax.swing.JLabel labelTextError;
    private CadastroSabores.TabelaSabores tabelaSabores;
    // End of variables declaration//GEN-END:variables
}

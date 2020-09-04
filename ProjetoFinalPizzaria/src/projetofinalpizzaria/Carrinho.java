/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinalpizzaria;
import java.util.ArrayList;
/**
 *
 * @author enzoradel
 */
public class Carrinho extends javax.swing.JFrame {

    private static ArrayList<Pizza> pizzas = new ArrayList<>();
    
    public Carrinho(ArrayList<Pizza> informaPizza) {
        initComponents();
        pizzas = informaPizza;
        //pizzas.add(novaPizza);
        numPizzas.setText("Voce possui "+ pizzas.size() +" pizzas nesse pedido");
        formato.setText("Formato");
        tamanhoCm.setText("TamanhoCm");
        tamanhoCm2.setText("TamanhoCm2");
        numSabores.setText("NumSabores");
        sabor1.setText("Sabor 1");
        sabor2.setText("Sabor 2");
        preco.setText("Preco");
        for (int cont=0;cont<pizzas.size();cont++){
            somaPreco += pizzas.get(cont).getPrecoFinal();
        }
        precoTotal.setText(String.valueOf(somaPreco));
    }
    double somaPreco;
    String status = "aberto";
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        formato = new javax.swing.JLabel();
        tamanhoCm = new javax.swing.JLabel();
        tamanhoCm2 = new javax.swing.JLabel();
        numSabores = new javax.swing.JLabel();
        sabor1 = new javax.swing.JLabel();
        sabor2 = new javax.swing.JLabel();
        preco = new javax.swing.JLabel();
        recebePizza = new javax.swing.JTextField();
        mensagem = new javax.swing.JLabel();
        numPizzas = new javax.swing.JLabel();
        alterarPizza = new javax.swing.JButton();
        addPizza = new javax.swing.JButton();
        mensagemPreco = new javax.swing.JLabel();
        precoTotal = new javax.swing.JLabel();
        botaoACaminho = new javax.swing.JButton();
        botaoEntregue = new javax.swing.JButton();
        mensagemErro = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        formato.setText("Formato");

        tamanhoCm.setText("TamanhoCm");

        tamanhoCm2.setText("TamanhoCm2");

        numSabores.setText("NumSabores");

        sabor1.setText("Sabor1");

        sabor2.setText("Sabor2");

        preco.setText("Preco");

        recebePizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recebePizzaActionPerformed(evt);
            }
        });

        mensagem.setText("Digite o número da pizza que gostaria de checar");

        numPizzas.setText(" ");

        alterarPizza.setText("Alterar pizza");
        alterarPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarPizzaActionPerformed(evt);
            }
        });

        addPizza.setText("Adicionar pizza");
        addPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPizzaActionPerformed(evt);
            }
        });

        mensagemPreco.setText("Preco Total");

        precoTotal.setText(" ");

        botaoACaminho.setText("A caminho");
        botaoACaminho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoACaminhoActionPerformed(evt);
            }
        });

        botaoEntregue.setText("Entregue");
        botaoEntregue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntregueActionPerformed(evt);
            }
        });

        mensagemErro.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mensagem))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(numPizzas, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addPizza)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(alterarPizza)
                                    .addComponent(recebePizza, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(82, 82, 82)
                                .addComponent(mensagemErro, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(preco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sabor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sabor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(numSabores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tamanhoCm2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tamanhoCm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(formato, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mensagemPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(precoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(314, 314, 314))
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(botaoACaminho)
                .addGap(67, 67, 67)
                .addComponent(botaoEntregue)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(formato)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(recebePizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sabor1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sabor2))
                            .addComponent(alterarPizza))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(preco)
                            .addComponent(addPizza)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tamanhoCm)
                            .addComponent(mensagem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tamanhoCm2)
                            .addComponent(numPizzas))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numSabores))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(mensagemErro)))))
                .addGap(30, 30, 30)
                .addComponent(mensagemPreco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precoTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoACaminho)
                    .addComponent(botaoEntregue))
                .addGap(82, 82, 82))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recebePizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recebePizzaActionPerformed
        Pizza pizzaAnalisada = pizzas.get(Integer.parseInt(recebePizza.getText())-1);
        formato.setText(pizzaAnalisada.getFormato());
        tamanhoCm.setText(String.valueOf(pizzaAnalisada.getTamanhoCm()));
        tamanhoCm2.setText(String.valueOf(pizzaAnalisada.getTamanhoCm2()));
        if (pizzaAnalisada.getDoisSabores()){
            numSabores.setText("2 Sabores");
            sabor1.setText(pizzaAnalisada.getSabor(0));
            sabor2.setText(pizzaAnalisada.getSabor(1));
        }
        else{
            numSabores.setText("1 Sabor");
            sabor1.setText(pizzaAnalisada.getSabor(0));
        }
        preco.setText(String.valueOf(pizzaAnalisada.getPrecoFinal()));
    }//GEN-LAST:event_recebePizzaActionPerformed

    private void alterarPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarPizzaActionPerformed
        if ("aberto".equalsIgnoreCase(status)){
            pizzas.remove(Integer.parseInt(recebePizza.getText())-1);
            this.setVisible(false);
            FazerPedido fazerPedido = new FazerPedido(pizzas);
            fazerPedido.setVisible(true);
            fazerPedido.setResizable(false);
        }
        else {
            mensagemErro.setText("O pedido já está a caminho");
        }
    }//GEN-LAST:event_alterarPizzaActionPerformed

    private void addPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPizzaActionPerformed
        if ("aberto".equalsIgnoreCase(status)) {
            this.setVisible(false);
            FazerPedido fazerPedido = new FazerPedido(pizzas);
            fazerPedido.setVisible(true);
            fazerPedido.setResizable(false);
        }
        else {
            mensagemErro.setText("O pedido já está a caminho");
        }
    }//GEN-LAST:event_addPizzaActionPerformed

    private void botaoACaminhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoACaminhoActionPerformed
        status = "A caminho"; 
    }//GEN-LAST:event_botaoACaminhoActionPerformed

    private void botaoEntregueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntregueActionPerformed
        status = "Entregue";
        this.setVisible(false);
        formato.setText("Formato");
        tamanhoCm.setText("TamanhoCm");
        tamanhoCm2.setText("TamanhoCm2");
        numSabores.setText("NumSabores");
        sabor1.setText("Sabor 1");
        sabor2.setText("Sabor 2");
        preco.setText("Preco");
        pizzas.clear();
    }//GEN-LAST:event_botaoEntregueActionPerformed

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
            java.util.logging.Logger.getLogger(Carrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                /*Carrinho carrinho = new Carrinho();
                carrinho.setVisible(true);
                carrinho.setResizable(false);*/
                new Carrinho(pizzas).setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPizza;
    private javax.swing.JButton alterarPizza;
    private javax.swing.JButton botaoACaminho;
    private javax.swing.JButton botaoEntregue;
    private javax.swing.JLabel formato;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel mensagem;
    private javax.swing.JLabel mensagemErro;
    private javax.swing.JLabel mensagemPreco;
    private javax.swing.JLabel numPizzas;
    private javax.swing.JLabel numSabores;
    private javax.swing.JLabel preco;
    private javax.swing.JLabel precoTotal;
    private javax.swing.JTextField recebePizza;
    private javax.swing.JLabel sabor1;
    private javax.swing.JLabel sabor2;
    private javax.swing.JLabel tamanhoCm;
    private javax.swing.JLabel tamanhoCm2;
    // End of variables declaration//GEN-END:variables
}

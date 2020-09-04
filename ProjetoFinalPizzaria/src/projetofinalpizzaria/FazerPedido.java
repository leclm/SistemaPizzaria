/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinalpizzaria;

import CadastroSabores.TelaSabores;
import java.util.ArrayList;

/**
 *
 * @author enzoradel
 */
public class FazerPedido extends javax.swing.JFrame {

    /**
     * Creates new form FazerPedido
     */
    public FazerPedido(ArrayList<Pizza> pizzas) {
        initComponents();
        informaPizza = pizzas;
    }
    
    Quadrado q = new Quadrado();
    Triangulo t = new Triangulo();
    Circulo c = new Circulo();
    Pizza novaPizza = new Pizza();
    
    Sabor s1 = new Sabor(0,0,"Mussarela",0.03);
    Sabor s2 = new Sabor(1,0,"Calabresa",0.03);
    Sabor s3 = new Sabor(2,1,"Marguerita",0.04);
    Sabor s4 = new Sabor(3,1,"Escarola",0.04);
    Sabor s5 = new Sabor(4,2,"Da casa",0.05);
    Sabor s6 = new Sabor(5,2,"Completa",0.05);
    
    private static ArrayList<Pizza> informaPizza = new ArrayList<>();
    
    private ArrayList<Sabor> sabores = new ArrayList<>();
    
    boolean validaSabor;
    
    int sabor1Cont;
    int sabor2Cont;
    double precoFinal;
    boolean tamanhoEmCm;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escolheFormato = new javax.swing.JLabel();
        tipoTamanho = new javax.swing.JLabel();
        digitaTamanho = new javax.swing.JTextField();
        saboresLista = new javax.swing.JScrollPane();
        listaSabores = new javax.swing.JTable();
        botaoQuadrado = new javax.swing.JButton();
        botaoTriangulo = new javax.swing.JButton();
        botaoCirculo = new javax.swing.JButton();
        botaoCm = new javax.swing.JButton();
        botaoCm2 = new javax.swing.JButton();
        defineSabor1 = new javax.swing.JLabel();
        defineSabor2 = new javax.swing.JLabel();
        digitaSabor1 = new javax.swing.JTextField();
        digitaSabor2 = new javax.swing.JTextField();
        calculaPreco = new javax.swing.JButton();
        pizzaEscolhida = new javax.swing.JLabel();
        forma = new javax.swing.JLabel();
        tamanho = new javax.swing.JLabel();
        sabor1 = new javax.swing.JLabel();
        sabor2 = new javax.swing.JLabel();
        preco = new javax.swing.JLabel();
        _1Sabor = new javax.swing.JButton();
        _2Sabores = new javax.swing.JButton();
        addSabores = new javax.swing.JButton();
        confirmaPizza = new javax.swing.JButton();
        numSabores = new javax.swing.JLabel();
        mensagemErro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escolheFormato.setText("Escolher o formato");

        tipoTamanho.setText("Tamanho");

        digitaTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitaTamanhoActionPerformed(evt);
            }
        });

        saboresLista.setViewportView(listaSabores);

        botaoQuadrado.setText("Quadrado");
        botaoQuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoQuadradoActionPerformed(evt);
            }
        });

        botaoTriangulo.setText("Triangulo");
        botaoTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTrianguloActionPerformed(evt);
            }
        });

        botaoCirculo.setText("Círculo");
        botaoCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCirculoActionPerformed(evt);
            }
        });

        botaoCm.setText("Em cm");
        botaoCm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCmActionPerformed(evt);
            }
        });

        botaoCm2.setText("Em cm2");
        botaoCm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCm2ActionPerformed(evt);
            }
        });

        defineSabor1.setText("Sabor 1");

        defineSabor2.setText("Sabor 2");

        digitaSabor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitaSabor1ActionPerformed(evt);
            }
        });

        digitaSabor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitaSabor2ActionPerformed(evt);
            }
        });

        calculaPreco.setText("Calcular preço");
        calculaPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculaPrecoActionPerformed(evt);
            }
        });

        pizzaEscolhida.setText("Dados da pizza");

        forma.setText("Formato");

        tamanho.setText("Tamanho");

        sabor1.setText("Sabor 1");

        sabor2.setText("Sabor 2");

        preco.setText("Preço");

        _1Sabor.setText("1 Sabor");
        _1Sabor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _1SaborActionPerformed(evt);
            }
        });

        _2Sabores.setText("2 Sabores");
        _2Sabores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _2SaboresActionPerformed(evt);
            }
        });

        addSabores.setText("Adicionar Sabores");
        addSabores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSaboresActionPerformed(evt);
            }
        });

        confirmaPizza.setText("Confirmar pizza");
        confirmaPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmaPizzaActionPerformed(evt);
            }
        });

        numSabores.setText("NumSabores");

        mensagemErro.setForeground(new java.awt.Color(255, 0, 0));
        mensagemErro.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_1Sabor)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(saboresLista, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(botaoCm)
                                    .addGap(50, 50, 50)
                                    .addComponent(botaoCm2)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(defineSabor1)
                        .addGap(75, 75, 75)
                        .addComponent(defineSabor2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(digitaTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(escolheFormato)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoQuadrado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoTriangulo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tipoTamanho)
                                .addGap(38, 38, 38)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoCirculo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(mensagemErro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numSabores)
                            .addComponent(tamanho)
                            .addComponent(forma, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sabor1)
                            .addComponent(sabor2)
                            .addComponent(preco))
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(pizzaEscolhida)
                                .addGap(78, 78, 78))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(confirmaPizza)
                                    .addComponent(addSabores))
                                .addGap(178, 178, 178))))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(_2Sabores))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(calculaPreco)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(digitaSabor1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(digitaSabor2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(555, 555, 555))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(escolheFormato)
                    .addComponent(pizzaEscolhida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoQuadrado)
                            .addComponent(botaoTriangulo)
                            .addComponent(botaoCirculo))
                        .addGap(27, 27, 27)
                        .addComponent(tipoTamanho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoCm)
                            .addComponent(botaoCm2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(digitaTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(forma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tamanho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numSabores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sabor1)
                            .addComponent(mensagemErro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sabor2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(preco)
                        .addGap(77, 77, 77)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saboresLista, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(addSabores)
                        .addGap(29, 29, 29)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_1Sabor)
                    .addComponent(_2Sabores))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(defineSabor1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(defineSabor2)
                        .addGap(10, 10, 10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(digitaSabor1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(digitaSabor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(confirmaPizza)))
                .addGap(18, 18, 18)
                .addComponent(calculaPreco)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoQuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoQuadradoActionPerformed
        forma.setText("Quadrado");
        novaPizza.setFormato("Quadrado");
    }//GEN-LAST:event_botaoQuadradoActionPerformed

    private void botaoTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTrianguloActionPerformed
        forma.setText("Triangulo");
        novaPizza.setFormato("Triangulo");
    }//GEN-LAST:event_botaoTrianguloActionPerformed

    private void botaoCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCirculoActionPerformed
        forma.setText("Circulo");
        novaPizza.setFormato("Circulo");
    }//GEN-LAST:event_botaoCirculoActionPerformed

    private void botaoCmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCmActionPerformed
        digitaTamanho.setText("");
        tamanho.setText("Tamanho");
        tamanhoEmCm=true;
        digitaTamanho.setVisible(true);
    }//GEN-LAST:event_botaoCmActionPerformed

    private void botaoCm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCm2ActionPerformed
        digitaTamanho.setText("");
        tamanho.setText("Tamanho");
        tamanhoEmCm=false;
        digitaTamanho.setVisible(true);
    }//GEN-LAST:event_botaoCm2ActionPerformed

    private void digitaTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitaTamanhoActionPerformed
        switch (forma.getText()){
            case ("Quadrado"):
                if (tamanhoEmCm){
                    q.calTamcm2(Double.parseDouble(digitaTamanho.getText()));
                    tamanho.setText(String.valueOf(q.getTamcm2()));
                    novaPizza.setTamanhoCm(Double.parseDouble(digitaTamanho.getText()));
                    novaPizza.setTamanhoCm2(q.getTamcm2());
                }
                else{
                    q.calTamcm(Double.parseDouble(digitaTamanho.getText()));
                    tamanho.setText(String.valueOf(q.getTamcm()));
                    novaPizza.setTamanhoCm2(Double.parseDouble(digitaTamanho.getText()));
                    novaPizza.setTamanhoCm(q.getTamcm());
                }
                break;
            case ("Triangulo"):
                if (tamanhoEmCm){
                    t.calTamcm2(Double.parseDouble(digitaTamanho.getText()));
                    tamanho.setText(String.valueOf(t.getTamcm2()));
                    novaPizza.setTamanhoCm(Double.parseDouble(digitaTamanho.getText()));
                    novaPizza.setTamanhoCm2(t.getTamcm2());
                }
                else{
                    t.calTamcm(Double.parseDouble(digitaTamanho.getText()));
                    tamanho.setText(String.valueOf(t.getTamcm()));
                    novaPizza.setTamanhoCm2(Double.parseDouble(digitaTamanho.getText()));
                    novaPizza.setTamanhoCm(t.getTamcm());
                }
                break;
            case ("Circulo"):
                if (tamanhoEmCm){
                    c.calTamcm2(Double.parseDouble(digitaTamanho.getText()));
                    tamanho.setText(String.valueOf(c.getTamcm2()));
                    novaPizza.setTamanhoCm(Double.parseDouble(digitaTamanho.getText()));
                    novaPizza.setTamanhoCm2(c.getTamcm2());
                }
                else{
                    c.calTamcm(Double.parseDouble(digitaTamanho.getText()));
                    tamanho.setText(String.valueOf(c.getTamcm()));
                    novaPizza.setTamanhoCm2(Double.parseDouble(digitaTamanho.getText()));
                    novaPizza.setTamanhoCm(c.getTamcm());
                }
                break;  
        }
    }//GEN-LAST:event_digitaTamanhoActionPerformed

    private void digitaSabor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitaSabor1ActionPerformed
        for (int cont=0;cont<sabores.size();cont++){
            if (digitaSabor1.getText().equalsIgnoreCase(sabores.get(cont).getNome())){
                validaSabor=true;
                sabor1Cont = cont;
                novaPizza.setSabor(0,sabores.get(cont));
                break;
            }
        }
        if (validaSabor){
            sabor1.setText(digitaSabor1.getText());
            mensagemErro.setText(" ");
        }
        else{
            mensagemErro.setText("O sabor nao existe");
        }
        validaSabor=false;        
    }//GEN-LAST:event_digitaSabor1ActionPerformed

    private void digitaSabor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitaSabor2ActionPerformed
        for (int cont=0;cont<sabores.size();cont++){
            if (digitaSabor2.getText().equalsIgnoreCase(sabores.get(cont).getNome())){
                sabor2Cont = cont;
                validaSabor=true;
                novaPizza.setSabor(1,sabores.get(cont));
                break;
            }    
        }
        if (validaSabor){
            sabor2.setText(digitaSabor2.getText());
            mensagemErro.setText(" ");
        }
        else{
            mensagemErro.setText("O sabor nao existe");
        }
        validaSabor=false;       
    }//GEN-LAST:event_digitaSabor2ActionPerformed

    private void _1SaborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__1SaborActionPerformed
        sabor2.setText("Sabor 2");
        sabor1.setText("Sabor");
        digitaSabor2.setVisible(false);
        defineSabor2.setVisible(false);
        sabor2.setVisible(false);
        defineSabor1.setText("Sabor");
        novaPizza.setDoisSabores(false);
        numSabores.setText("1 sabor");
    }//GEN-LAST:event__1SaborActionPerformed

    private void _2SaboresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__2SaboresActionPerformed
        sabor1.setText("Sabor 1");
        digitaSabor2.setVisible(true);
        defineSabor2.setVisible(true);
        sabor2.setVisible(true);
        defineSabor1.setText("Sabor 1");
        novaPizza.setDoisSabores(true);
        numSabores.setText("2 sabores");
    }//GEN-LAST:event__2SaboresActionPerformed

    private void addSaboresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSaboresActionPerformed
        sabores.add(s1);
        sabores.add(s2);
        sabores.add(s3);
        sabores.add(s4);
        sabores.add(s5);
        sabores.add(s6);
    }//GEN-LAST:event_addSaboresActionPerformed

    private void confirmaPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmaPizzaActionPerformed
        this.setVisible(false);
        informaPizza.add(novaPizza);
        Carrinho carrinho = new Carrinho(informaPizza);
        carrinho.setVisible(true);
        carrinho.setResizable(false);       
    }//GEN-LAST:event_confirmaPizzaActionPerformed

    private void calculaPrecoActionPerformed(java.awt.event.ActionEvent evt) {                                             
        if ((!"".equals(forma.getText())) && (!"".equals(tamanho.getText())) && (!"".equals(sabor1.getText())) && (!"".equals(sabor2.getText()))){
            
            if (tamanhoEmCm){
                
                precoFinal = (Double.parseDouble(tamanho.getText())/2) * sabores.get(sabor1Cont).getPreco();
                precoFinal += (Double.parseDouble(tamanho.getText())/2) * sabores.get(sabor2Cont).getPreco();
            
            }
            else{
                
                precoFinal = (Double.parseDouble(digitaTamanho.getText())/2) * sabores.get(sabor1Cont).getPreco();
                precoFinal += (Double.parseDouble(digitaTamanho.getText())/2) * sabores.get(sabor2Cont).getPreco();
            
            }
        }
        else if ((!"".equals(forma.getText())) && (!"".equals(tamanho.getText())) && ((!"".equals(sabor1.getText())) && ("".equals(sabor2.getText())))){
            if (tamanhoEmCm){
                precoFinal = Double.parseDouble(tamanho.getText())* sabores.get(sabor1Cont).getPreco();
            }
            else{               
                precoFinal = Double.parseDouble(digitaTamanho.getText())* sabores.get(sabor1Cont).getPreco();
            }
        }
        else{
            preco.setText("Algumas das informacoes nao foi preenchida corretamente");
        }
        preco.setText(String.valueOf(precoFinal));
        novaPizza.setPrecoFinal(precoFinal);
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
            java.util.logging.Logger.getLogger(FazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FazerPedido(informaPizza).setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _1Sabor;
    private javax.swing.JButton _2Sabores;
    private javax.swing.JButton addSabores;
    private javax.swing.JButton botaoCirculo;
    private javax.swing.JButton botaoCm;
    private javax.swing.JButton botaoCm2;
    private javax.swing.JButton botaoQuadrado;
    private javax.swing.JButton botaoTriangulo;
    private javax.swing.JButton calculaPreco;
    private javax.swing.JButton confirmaPizza;
    private javax.swing.JLabel defineSabor1;
    private javax.swing.JLabel defineSabor2;
    private javax.swing.JTextField digitaSabor1;
    private javax.swing.JTextField digitaSabor2;
    private javax.swing.JTextField digitaTamanho;
    private javax.swing.JLabel escolheFormato;
    private javax.swing.JLabel forma;
    private javax.swing.JTable listaSabores;
    private javax.swing.JLabel mensagemErro;
    private javax.swing.JLabel numSabores;
    private javax.swing.JLabel pizzaEscolhida;
    private javax.swing.JLabel preco;
    private javax.swing.JLabel sabor1;
    private javax.swing.JLabel sabor2;
    private javax.swing.JScrollPane saboresLista;
    private javax.swing.JLabel tamanho;
    private javax.swing.JLabel tipoTamanho;
    // End of variables declaration//GEN-END:variables

}

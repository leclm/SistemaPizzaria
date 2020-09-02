/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinalpizzaria;

import CadastroSabores.TelaSabores;
//import java.util.ArrayList;

/**
 *
 * @author enzoradel
 */
public class FazerPedido extends javax.swing.JFrame {

    /**
     * Creates new form FazerPedido
     */
    public FazerPedido() {
        initComponents();
    }

    Quadrado q = new Quadrado();
    Triangulo t = new Triangulo();
    Circulo c = new Circulo();
    Forma pizza;
    //TelaSabores s;
    
    Sabor s1 = new Sabor(0,0,"Mussarela",0.03);
    Sabor s2 = new Sabor(1,0,"Calabresa",0.03);
    Sabor s3 = new Sabor(2,1,"Marguerita",0.04);
    Sabor s4 = new Sabor(3,1,"Escarola",0.04);
    Sabor s5 = new Sabor(4,2,"Da casa",0.05);
    Sabor s6 = new Sabor(5,2,"Completa",0.05);
    
    //ArrayList<Sabor> sabores = new ArrayList<>();
    //sabores.add(s1);
    Sabor[] sabores = {s1,s2,s3,s4,s5,s6};
    boolean validaSabor;
    
    int sabor1Cont;
    int sabor2Cont;
    double precoFinal;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escolheFormato = new javax.swing.JLabel();
        tipoTamanho = new javax.swing.JLabel();
        digitaTamanho = new javax.swing.JTextField();
        definirTamanho = new javax.swing.JLabel();
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
        formato = new javax.swing.JLabel();
        tamanho = new javax.swing.JLabel();
        sabor1 = new javax.swing.JLabel();
        sabor2 = new javax.swing.JLabel();
        preco = new javax.swing.JLabel();
        confirmaSabores = new javax.swing.JButton();
        confirmaTamanho = new javax.swing.JButton();
        _1Sabor = new javax.swing.JButton();
        _2Sabores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escolheFormato.setText("Escolher o formato");

        tipoTamanho.setText("Definir tipo de tamanho");

        digitaTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitaTamanhoActionPerformed(evt);
            }
        });

        definirTamanho.setText("Definir tamanho");

        listaSabores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Mussarela", "Marguerita", "Da casa"},
                {"Calabresa", "Escarola", "Completa"}
            },
            new String [] {
                "Simples", "Especiais", "Premium"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        saboresLista.setViewportView(listaSabores);
        if (listaSabores.getColumnModel().getColumnCount() > 0) {
            listaSabores.getColumnModel().getColumn(0).setResizable(false);
            listaSabores.getColumnModel().getColumn(1).setResizable(false);
            listaSabores.getColumnModel().getColumn(2).setResizable(false);
        }

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

        pizzaEscolhida.setText("Pizza escolhida");

        formato.setText("Formato");

        tamanho.setText("Tamanho");

        sabor1.setText("Sabor 1");

        sabor2.setText("Sabor 2");

        preco.setText("Preço");

        confirmaSabores.setText("Confirmar Sabores");
        confirmaSabores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmaSaboresActionPerformed(evt);
            }
        });

        confirmaTamanho.setText("Confirmar Tamanho");
        confirmaTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmaTamanhoActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saboresLista, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(digitaSabor1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(digitaSabor2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(confirmaSabores)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(formato, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pizzaEscolhida))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tipoTamanho)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoQuadrado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoTriangulo)))
                        .addGap(18, 18, 18)
                        .addComponent(botaoCirculo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(escolheFormato))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(digitaTamanho))
                                    .addComponent(definirTamanho)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(_1Sabor)
                                .addGap(29, 29, 29)
                                .addComponent(_2Sabores))
                            .addComponent(botaoCm)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(calculaPreco)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confirmaTamanho)
                            .addComponent(botaoCm2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(defineSabor1)
                        .addGap(120, 120, 120)
                        .addComponent(defineSabor2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tamanho)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sabor2)
                            .addComponent(sabor1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(preco)))
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(escolheFormato)
                    .addComponent(pizzaEscolhida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(formato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoQuadrado)
                    .addComponent(botaoTriangulo)
                    .addComponent(botaoCirculo)
                    .addComponent(tamanho))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoTamanho)
                    .addComponent(sabor1))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCm)
                    .addComponent(sabor2)
                    .addComponent(botaoCm2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(definirTamanho)
                    .addComponent(preco))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(digitaTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmaTamanho))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saboresLista, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_1Sabor)
                    .addComponent(_2Sabores))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(defineSabor1)
                    .addComponent(defineSabor2))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(digitaSabor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(digitaSabor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmaSabores))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(calculaPreco))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoQuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoQuadradoActionPerformed
        formato.setText("Quadrado");
    }//GEN-LAST:event_botaoQuadradoActionPerformed

    private void botaoTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTrianguloActionPerformed
        formato.setText("Triangulo");
    }//GEN-LAST:event_botaoTrianguloActionPerformed

    private void botaoCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCirculoActionPerformed
        formato.setText("Circulo");
    }//GEN-LAST:event_botaoCirculoActionPerformed

    private void botaoCmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCmActionPerformed
        definirTamanho.setText("Tamanho em Cm");
        digitaTamanho.setText("");
        tamanho.setText("Tamanho");
    }//GEN-LAST:event_botaoCmActionPerformed

    private void botaoCm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCm2ActionPerformed
        definirTamanho.setText("Tamanho em Cm2");
        digitaTamanho.setText("");
        tamanho.setText("Tamanho");
    }//GEN-LAST:event_botaoCm2ActionPerformed

    private void digitaTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitaTamanhoActionPerformed

    }//GEN-LAST:event_digitaTamanhoActionPerformed

    private void digitaSabor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitaSabor1ActionPerformed
        
    }//GEN-LAST:event_digitaSabor1ActionPerformed

    private void digitaSabor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitaSabor2ActionPerformed
       
    }//GEN-LAST:event_digitaSabor2ActionPerformed

    private void confirmaSaboresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmaSaboresActionPerformed
        for (int cont=0;cont<6;cont++){
            if (digitaSabor1.getText().equalsIgnoreCase(sabores[cont].getNome())){
                validaSabor=true;
                sabor1Cont = cont;
                break;
            }
        }
        if (validaSabor){
            sabor1.setText(digitaSabor1.getText());
        }
        else{
            sabor1.setText("Digite um sabor existente");
        }
        validaSabor=false;
        for (int cont=0;cont<6;cont++){
            if (digitaSabor2.getText().equalsIgnoreCase(sabores[cont].getNome())){
                sabor2Cont = cont;
                validaSabor=true;
                break;
            }    
        }
        if (validaSabor){
            sabor2.setText(digitaSabor2.getText());
        }
        else{
            sabor2.setText("Digite um sabor existente");
        }
        validaSabor=false;
    }//GEN-LAST:event_confirmaSaboresActionPerformed

    private void confirmaTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmaTamanhoActionPerformed
        switch (formato.getText()){
            case ("Quadrado"):
                if ("Tamanho em Cm".equals(definirTamanho.getText())){
                    q.calTamcm2(Double.parseDouble(digitaTamanho.getText()));
                    tamanho.setText(String.valueOf(q.getTamcm2()));
                }
                else{
                    q.calTamcm(Double.parseDouble(digitaTamanho.getText()));
                    tamanho.setText(String.valueOf(q.getTamcm()));
                }
                break;
            case ("Triangulo"):
                if ("Tamanho em Cm".equals(definirTamanho.getText())){
                    t.calTamcm2(Double.parseDouble(digitaTamanho.getText()));
                    tamanho.setText(String.valueOf(t.getTamcm2()));
                }
                else{
                    t.calTamcm(Double.parseDouble(digitaTamanho.getText()));
                    tamanho.setText(String.valueOf(t.getTamcm()));
                }
                break;
            case ("Circulo"):
                if ("Tamanho em Cm".equals(definirTamanho.getText())){
                    c.calTamcm2(Double.parseDouble(digitaTamanho.getText()));
                    tamanho.setText(String.valueOf(c.getTamcm2()));
                }
                else{
                    c.calTamcm(Double.parseDouble(digitaTamanho.getText()));
                    tamanho.setText(String.valueOf(c.getTamcm()));
                }
                break;  
        }
    }//GEN-LAST:event_confirmaTamanhoActionPerformed

    private void _1SaborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__1SaborActionPerformed
        sabor2.setText("");
        digitaSabor2.setVisible(false);
        defineSabor2.setVisible(false);
        sabor2.setVisible(false);
        defineSabor1.setText("Sabor");        
    }//GEN-LAST:event__1SaborActionPerformed

    private void _2SaboresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__2SaboresActionPerformed
        digitaSabor2.setVisible(true);
        defineSabor2.setVisible(true);
        sabor2.setVisible(true);
        defineSabor1.setText("Sabor 1");
    }//GEN-LAST:event__2SaboresActionPerformed

    private void calculaPrecoActionPerformed(java.awt.event.ActionEvent evt) {                                             
        //System.out.println("Em manutenção...");
        if ((!"".equals(formato.getText())) && (!"".equals(tamanho.getText())) && (!"".equals(sabor1.getText())) && (!"".equals(sabor2.getText()))){
            
            if (definirTamanho.getText().equals("Tamanho em Cm")){
                
                precoFinal = (Double.parseDouble(tamanho.getText())/2) * sabores[sabor1Cont].getPreco();
                precoFinal += (Double.parseDouble(tamanho.getText())/2) * sabores[sabor2Cont].getPreco();
            
            }
            else{
                
                precoFinal = (Double.parseDouble(digitaTamanho.getText())/2) * sabores[sabor1Cont].getPreco();
                precoFinal += (Double.parseDouble(digitaTamanho.getText())/2) * sabores[sabor2Cont].getPreco();
            
            }
        }
        else if ((!"".equals(formato.getText())) && (!"".equals(tamanho.getText())) && ((!"".equals(sabor1.getText())) && ("".equals(sabor2.getText())))){
            if (definirTamanho.getText().equals("Tamanho em Cm")){
                precoFinal = Double.parseDouble(tamanho.getText())* sabores[sabor1Cont].getPreco();
            }
            else{               
                precoFinal = Double.parseDouble(digitaTamanho.getText())* sabores[sabor1Cont].getPreco();
            }
        }
        else{
            preco.setText("Algumas das informacoes nao foi preenchida corretamente");
        }
        preco.setText(String.valueOf(precoFinal));
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
                new FazerPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _1Sabor;
    private javax.swing.JButton _2Sabores;
    private javax.swing.JButton botaoCirculo;
    private javax.swing.JButton botaoCm;
    private javax.swing.JButton botaoCm2;
    private javax.swing.JButton botaoQuadrado;
    private javax.swing.JButton botaoTriangulo;
    private javax.swing.JButton calculaPreco;
    private javax.swing.JButton confirmaSabores;
    private javax.swing.JButton confirmaTamanho;
    private javax.swing.JLabel defineSabor1;
    private javax.swing.JLabel defineSabor2;
    private javax.swing.JLabel definirTamanho;
    private javax.swing.JTextField digitaSabor1;
    private javax.swing.JTextField digitaSabor2;
    private javax.swing.JTextField digitaTamanho;
    private javax.swing.JLabel escolheFormato;
    private javax.swing.JLabel formato;
    private javax.swing.JTable listaSabores;
    private javax.swing.JLabel pizzaEscolhida;
    private javax.swing.JLabel preco;
    private javax.swing.JLabel sabor1;
    private javax.swing.JLabel sabor2;
    private javax.swing.JScrollPane saboresLista;
    private javax.swing.JLabel tamanho;
    private javax.swing.JLabel tipoTamanho;
    // End of variables declaration//GEN-END:variables

}

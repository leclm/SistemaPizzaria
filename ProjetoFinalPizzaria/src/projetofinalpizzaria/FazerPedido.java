/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinalpizzaria;

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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escolheFormato = new javax.swing.JLabel();
        tipoTamanho = new javax.swing.JLabel();
        digitaTamanho = new javax.swing.JTextField();
        definirTamanho = new javax.swing.JLabel();
        sabores = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        listaSabores = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escolheFormato.setText("Escolher o formato");

        tipoTamanho.setText("Definir tipo de tamanho");

        digitaTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitaTamanhoActionPerformed(evt);
            }
        });

        definirTamanho.setText("Definir tamanho");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        sabores.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        listaSabores.setText("Lista de sabores");

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

        botaoCirculo.setText("Circulo");
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

        calculaPreco.setText("Calcular preco");
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

        preco.setText("Preco");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(defineSabor1)
                        .addGap(82, 82, 82)
                        .addComponent(defineSabor2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(calculaPreco)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoCm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoCm2))
                            .addComponent(sabores, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(digitaSabor1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(digitaSabor2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(listaSabores)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(digitaTamanho))
                                .addComponent(definirTamanho))))
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
                        .addComponent(escolheFormato)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(formato, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pizzaEscolhida)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(sabor1)
                        .addComponent(tamanho)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(preco)
                            .addComponent(sabor2))))
                .addGap(203, 203, 203))
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
                    .addComponent(botaoCm2)
                    .addComponent(sabor2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(definirTamanho)
                    .addComponent(preco))
                .addGap(21, 21, 21)
                .addComponent(digitaTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(listaSabores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sabores, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(defineSabor1)
                    .addComponent(defineSabor2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(digitaSabor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(digitaSabor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(calculaPreco)
                .addContainerGap(23, Short.MAX_VALUE))
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
    }//GEN-LAST:event_botaoCmActionPerformed

    private void botaoCm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCm2ActionPerformed
        definirTamanho.setText("Tamanho em Cm2");
    }//GEN-LAST:event_botaoCm2ActionPerformed

    private void digitaTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitaTamanhoActionPerformed
        switch (formato.getText()){
            case ("Quadrado"):
                if (definirTamanho.getText() == "Tamanho em Cm"){
                    q.calTamcm2(Double.parseDouble(digitaTamanho.getText()));
                    tamanho.setText(String.valueOf(q.getTamcm2()));
                }
                else{
                    q.calTamcm(Double.parseDouble(digitaTamanho.getText()));
                    tamanho.setText(String.valueOf(q.getTamcm()));
                }
                break;
            case ("Triângulo"):
                if (definirTamanho.getText() == "Tamanho em Cm"){
                    t.calTamcm2(Double.parseDouble(digitaTamanho.getText()));
                    tamanho.setText(String.valueOf(t.getTamcm2()));
                }
                else{
                    t.calTamcm(Double.parseDouble(digitaTamanho.getText()));
                    tamanho.setText(String.valueOf(t.getTamcm()));
                }
                break;
            case ("Círculo"):
                if (definirTamanho.getText() == "Tamanho em Cm"){
                    c.calTamcm2(Double.parseDouble(digitaTamanho.getText()));
                    tamanho.setText(String.valueOf(c.getTamcm2()));
                }
                else{
                    c.calTamcm(Double.parseDouble(digitaTamanho.getText()));
                    tamanho.setText(String.valueOf(c.getTamcm()));
                }
                break;  
        }
    }//GEN-LAST:event_digitaTamanhoActionPerformed

    private void digitaSabor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitaSabor1ActionPerformed
        sabor1.setText(digitaSabor1.getText());
    }//GEN-LAST:event_digitaSabor1ActionPerformed

    private void digitaSabor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitaSabor2ActionPerformed
        sabor2.setText(digitaSabor2.getText());
    }//GEN-LAST:event_digitaSabor2ActionPerformed

    private void calculaPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculaPreçoActionPerformed
        
    }//GEN-LAST:event_calculaPrecoActionPerformed

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
    private javax.swing.JButton botaoCirculo;
    private javax.swing.JButton botaoCm;
    private javax.swing.JButton botaoCm2;
    private javax.swing.JButton botaoQuadrado;
    private javax.swing.JButton botaoTriangulo;
    private javax.swing.JButton calculaPreco;
    private javax.swing.JLabel defineSabor1;
    private javax.swing.JLabel defineSabor2;
    private javax.swing.JLabel definirTamanho;
    private javax.swing.JTextField digitaSabor1;
    private javax.swing.JTextField digitaSabor2;
    private javax.swing.JTextField digitaTamanho;
    private javax.swing.JLabel escolheFormato;
    private javax.swing.JLabel formato;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel listaSabores;
    private javax.swing.JLabel pizzaEscolhida;
    private javax.swing.JLabel preco;
    private javax.swing.JLabel sabor1;
    private javax.swing.JLabel sabor2;
    private javax.swing.JScrollPane sabores;
    private javax.swing.JLabel tamanho;
    private javax.swing.JLabel tipoTamanho;
    // End of variables declaration//GEN-END:variables
}

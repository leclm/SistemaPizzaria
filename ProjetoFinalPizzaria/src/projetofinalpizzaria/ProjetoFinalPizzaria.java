/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinalpizzaria;

import CadastroSabores.TelaSabores;
import java.util.ArrayList;
import interfaceAlterarPedido.JanelaAlterarPedidoAntigo;
import interfacesSistema.JanelaCadastroCliente;

/**
 *
 * @author lelim
 */
public class ProjetoFinalPizzaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TelaSabores sabores = new TelaSabores();
        sabores.setVisible(true);
        
        JanelaCadastroCliente cadastro = new JanelaCadastroCliente();
        cadastro.setVisible(true);
        
        JanelaAlterarPedidoAntigo alterar = new JanelaAlterarPedidoAntigo();
        alterar.setVisible(true);
        
        
       
        //Pizza p = new Pizza(q, "premium");
        //p.setArea(q.getArea());
        //System.out.println("A area da pizza escolhida é: " + p.getArea());
        
    }
    
}

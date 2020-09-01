/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinalpizzaria;

import java.util.ArrayList;

/**
 *
 * @author lelim
 */
public class ProjetoFinalPizzaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quadrado q = new Quadrado();
        ArrayList<Sabor> sabores = new ArrayList();
        
        q.setPizza(sabores, 0);
        
        System.out.print(q.getTamcm2());
        
        //Pizza p = new Pizza(q, "premium");
        //p.setArea(q.getArea());
        //System.out.println("A area da pizza escolhida é: " + p.getArea());
        
    }
    
}

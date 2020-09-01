/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinalpizzaria;

/**
 *
 * @author lelim
 */
public class Quadrado extends Forma {
    
    public Quadrado() {
        super();
    }

    @Override
    public void calTamcm(double tamcm2) {
        double tamcm = (Math.sqrt(tamcm2));
        validaTamcm(tamcm);
    }

    @Override
    public void calTamcm2(double tamcm) {
        double tamcm2 = (Math.pow(tamcm, 2));
        validaTamcm2(tamcm2);
    }

    @Override
    public void validaTamcm(double tamcm) {
       if(tamcm >= 10 && tamcm <= 40)
           super.setTamcm(tamcm);
       else
           throw new IllegalArgumentException("Tamanho invalido para este formato!");
    }

    @Override
    public void validaTamcm2(double tamcm2) {
       if(tamcm2 >= 100 && tamcm2 <= 1600)
           super.setTamcm2(tamcm2);
       else
           throw new IllegalArgumentException("Tamanho invalido para este formato!");
    }
}

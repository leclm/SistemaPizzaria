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
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
        
    }
    
    public Quadrado() {
    }
    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado < 10 || lado > 40) {
            throw new IllegalArgumentException("Tamanho invalido para este formato!");
        }
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (lado*lado);
    }
}

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
public class Triangulo extends Forma{
    protected double lado;

    public Triangulo(double lado) {
        this.lado = lado;
    }

    public Triangulo() {
    }
    
    public double getLado() {
        return lado;
    }
    
    public void setLado(double lado) {
        if (lado < 20 || lado > 40) {
            throw new IllegalArgumentException("Tamanho invalido para este formato!");
        }
        this.lado = lado;
    }


    @Override
    public double calcularArea() {
        return ((Math.pow(lado, 2)*Math.sqrt(3))/4);
    }
}

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
public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public Circulo() {
    }
    
    public double getRaio() {
        return raio;
    }

    public void setLado(double raio) {
        if (raio < 7 || raio > 23) {
            throw new IllegalArgumentException("Tamanho invalido para este formato!");
        }
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return (Math.pow(raio, 2) * Math.PI);
    }    
}

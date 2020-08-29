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
public class Pedido {
    // atributos
    private Forma forma;
    private String sabor;
    private double dimensao;
    private double area;
    private double preco;

    // construtor que solicita a dimencao da forma. Ex. Cliente pede uma pizza quadrada de lado 20cm, sabor simples
    public Pedido(Forma forma, double dimensao, String sabor) {
        this.forma = forma;
        this.dimensao = dimensao;
        this.sabor = sabor;
    }
    
    // construtor que solicita a area desejada. Ex. Cliente pede uma pizza quadrada de 400cm², sabor simples
    public Pedido(Forma forma, String sabor, double area) {
        this.forma = forma;
        this.sabor = sabor;
        this.area = area;
    }

    public Forma getForma() {
        return forma;
    }

    public void setForma(Forma forma) {
        this.forma = forma;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

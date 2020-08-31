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

public abstract class Forma {
    private boolean doisSabores;
    private double precocm;
    private double precoTotal;
    private double tamcm;
    private double tamcm2;
    private ArrayList<Sabor> sabor;

    public Forma(double precocm) {
        this.precocm = precocm;
    }
    
    public void setPizza(ArrayList<Sabor> sabor, double tamcm, double tamcm2){
        this.sabor = sabor;
        setTamcm(tamcm2);
        this.tamcm2 = tamcm2;
        doisSabores = sabor.size() == 2;
        setPrecoTotal();
    }
    
    public void setPizza(ArrayList<Sabor> sabor, double tamcm){
        this.sabor = sabor;
        this.tamcm = tamcm;
        setTamcm2(tamcm);
        doisSabores = sabor.size() == 2;
        setPrecoTotal();
    }
    
    public abstract void setTamcm(double tamcm2);
    public abstract void setTamcm2(double tamcm);    
    public abstract void setPrecoTotal();


    public ArrayList<Sabor> getSabor() {
        return sabor;
    }

    public double getPrecocm() {
        return precocm;
    }

    public double getTamcm() {
        return tamcm;
    }

    public double getTamcm2() {
        return tamcm2;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }
}

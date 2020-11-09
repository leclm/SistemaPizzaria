package projetofinalpizzaria;

import java.util.ArrayList;

public abstract class Forma {
    private boolean doisSabores;
    private double precoTotal;
    private double tamcm;
    private double tamcm2;
    private ArrayList<Sabor> sabor;
    private String formato;
    
    public Forma() {
        this.sabor = new ArrayList();
    }
    
    public void definePizza(Forma novaPizza){
        this.doisSabores = novaPizza.doisSabores;
        this.precoTotal = novaPizza.precoTotal;
        this.tamcm = novaPizza.tamcm;
        this.tamcm2 = novaPizza.tamcm2;
        this.sabor = novaPizza.sabor;
        this.formato = novaPizza.formato;
    }
    
    public void setPizza(ArrayList<Sabor> sabor){
        this.sabor.clear();
        sabor.forEach(sabor1 -> {
            this.sabor.add(sabor1);
        });
        //calTamcm(tamcm2);
        //this.tamcm2 = tamcm2;
        doisSabores = sabor.size() == 2;
        setPrecoTotal();
    }
    
    public void setPizza(ArrayList<Sabor> sabor, double tamcm){
        this.sabor = sabor;
        this.tamcm = tamcm;
        calTamcm2(tamcm);
        doisSabores = sabor.size() == 2;
        setPrecoTotal();
    }
  
    public abstract void validaTamcm(double tamcm);
    public abstract void validaTamcm2(double tamcm2);
    public abstract void calTamcm(double tamcm2);
    public abstract void calTamcm2(double tamcm);

    public void setTamcm(double tamcm) {
        this.tamcm = tamcm;
    }

    public void setTamcm2(double tamcm2) {
        this.tamcm2 = tamcm2;
    }
    
    public void setPrecoTotal(){
        precoTotal = 0;
        sabor.forEach(sa -> {
            precoTotal+= (sa.getPreco() * tamcm2);
        });
        if(doisSabores)
            precoTotal = precoTotal/2;
    }

    public ArrayList<Sabor> getSabor() {
        return sabor;
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
    
    public void setFormato(String formato){
        this.formato=formato;
    }
    
    public String getFormato(){
        return formato;
    }
    
    public void setDoisSabores(boolean doisSabores){
        this.doisSabores=doisSabores;
    }
    
    public boolean getDoisSabores(){
        return doisSabores;
    }
}

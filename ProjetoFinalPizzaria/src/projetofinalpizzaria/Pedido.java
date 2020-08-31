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
public class Pedido {
    private long id;
    private String status;
    private double preco;
    private ArrayList<Forma> pizzas;

    public Pedido(long id) {
        this.id = id;
        this.status = "aberto";
        pizzas = new ArrayList();
    }

    public long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public double getPreco() {
        return preco;
    }

    public ArrayList<Forma> getPizzas() {
        return pizzas;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void addPizza(Forma pizza) {
        this.pizzas.add(pizza);
    }
    
    public void setPizza(Forma pizza, int index){
        pizzas.set(index, pizza);
    }
    
    public void removePizza(int index){
        pizzas.remove(index);
    }
    
    private void setPreco(){
        preco = 0;
        pizzas.forEach(pizza -> {
            preco+= pizza.getPrecoTotal();
        });
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinalpizzaria;

import java.util.ArrayList;

/**
 *
 * @author mathe
 */
public class TestePedido {
    
    private long id;
    private String status;
    private double preco;
    private ArrayList<TesteForma> pizzas;

    public TestePedido(long id) {
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

    public ArrayList<TesteForma> getPizzas() {
        return pizzas;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void addPizza(TesteForma pizza) {
        this.pizzas.add(pizza);
    }
    
    public void setPizza(TesteForma pizza, int index){
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

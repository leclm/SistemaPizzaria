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
public class Sabor {
    private long id;
    private int tipo; //0 = simples; 1 = especial; 2 = premium
    private String nome;

    public Sabor(long id, int tipo, String nome) {
        this.id = id;
        this.tipo = tipo;
        this.nome = nome;
    }
    
    public void setSabor(Sabor sabor){
        tipo = sabor.tipo;
        nome = sabor.nome;
    }

    public long getId() {
        return id;
    }

    public int getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinalpizzaria;

/**
 *
 * @author mathe
 */
public class TesteSabor {
    private long id;
    private int tipo; //0 = simples; 1 = especial; 2 = premium
    private String nome;
    private int formato; //0 = circular; 1 = quadrado; 2 = triangulo

    public TesteSabor(long id, int tipo, String nome, int formato) {
        this.id = id;
        this.tipo = tipo;
        this.nome = nome;
        this.formato = formato;
    }
    
    public void setSabor(TesteSabor sabor){
        tipo = sabor.tipo;
        nome = sabor.nome;
        formato = sabor.formato;
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

    public int getFormato() {
        return formato;
    }
}

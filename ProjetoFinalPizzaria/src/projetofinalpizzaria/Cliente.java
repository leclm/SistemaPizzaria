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

public class Cliente {
    // atributos
    private long id;
    private String nome;
    private String sobrenome;
    private String telefone;
    private ArrayList<Pedido> pedidos;
    
    // construtor
    public Cliente(long id, String nome, String sobrenome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        pedidos = new ArrayList();
    }
    
    // métodos  
    public boolean temPedidoAberto() {
        int size = pedidos.size();
        if(size > 0 && "aberto".equals(pedidos.get(size-1).getStatus()))
            return true;
        return false;
    }

    public void setPedidos(Pedido pedido) {
        this.pedidos.add(pedido);
    }
    
    public void setCliente(Cliente cliente){
        nome = cliente.nome;
        sobrenome = cliente.sobrenome;
        telefone = cliente.telefone;
    }
    
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
    
    public Pedido getPedidoAberto() {
       return pedidos.get(pedidos.size()-1);
    }
    
    public long getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
    
    public String getTelefone() {
        return telefone;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
 
}

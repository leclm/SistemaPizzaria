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
public class TesteCliente {
    private long id;
    private String nome;
    private String sobrenome;
    private String telefone;
    private ArrayList<TestePedido> pedidos;

    public TesteCliente(long id, String nome, String sobrenome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;  
        pedidos = new ArrayList();
    }
    
    public void setCliente(TesteCliente cliente){
        nome = cliente.nome;
        sobrenome = cliente.sobrenome;
        telefone = cliente.telefone;
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

    public ArrayList<TestePedido> getPedidos() {
        return pedidos;
    }
    
    public boolean temPedidoAberto() {
        int size = pedidos.size();
        if(size > 0 && "aberto".equals(pedidos.get(size-1).getStatus()))
            return true;
        return false;
    }
    
    public TestePedido getPedidoAberto() {
       return pedidos.get(pedidos.size()-1);
    }

    public void setPedidos(TestePedido pedido) {
        this.pedidos.add(pedido);
    }
    
    
}

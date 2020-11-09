/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinalpizzaria;

/**
 *
 * @author enzoradel
 */
public class ListaPedidos {

    private long id;
    private String nome;
    private long idPedido;
    private String status;

    public ListaPedidos(int id, String nome, int idPedido, String status) {
        this.id = id;
        this.nome = nome;
        this.idPedido = idPedido;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public long getIdPedido() {
        return idPedido;
    }

    public String getStatus() {
        return status;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdPedido(long idPedido) {
        this.idPedido = idPedido;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}

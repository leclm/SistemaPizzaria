/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesSistema;

import java.util.ArrayList;
import projetofinalpizzaria.Cliente;
import projetofinalpizzaria.Pizza;
import projetofinalpizzaria.Sabor;

/**
 *
 * @author lelim
 */
public final class Datastore {
    private static final Datastore DATA = new Datastore();
    
    private ArrayList<Cliente> clientes = new ArrayList<>();
       
    private ArrayList<Sabor> sabores = new ArrayList<>(); // criando o arraylist sabores aqui e tirando do TelaSabores
    
    public static Datastore getInstance() {
        return DATA;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
    public ArrayList<Sabor> getSabores() { // metodo pra pegar os sabores do arraylist sabores
        return sabores;
    }
    
    public int buscarPorTelefone(String tel) {
        
        for (int i = 0; i < clientes.size(); i++){
            
            if (tel.equals(clientes.get(i).getTelefone())) {
               return i; 
            } 
        }
        return -1;
    }
    
    public boolean pedidoAberto(String tel) {
        for (int i = 0; i < clientes.size(); i++){
            if (tel.equals(clientes.get(i).getTelefone())) {
               return clientes.get(i).temPedidoAberto();
            } 
        }
        return false;
    }
}

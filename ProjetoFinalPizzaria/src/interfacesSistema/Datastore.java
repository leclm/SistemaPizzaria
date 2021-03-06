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
    
    public boolean buscarPorTelefone(String tel) {
        
        for (int i = 0; i < clientes.size(); i++){
            System.out.println(clientes.get(i).getTelefone());
            
            if (tel.equals(clientes.get(i).getTelefone())) {
               return true; 
            } 
        }
        return false;
    }
    
    public boolean pedidoAberto(String tel) {
        for (int i = 0; i < clientes.size(); i++){
            if (tel.equals(clientes.get(i).getTelefone())) {
               System.out.println(i);
               return clientes.get(i).temPedidoAberto();
            } 
        }
        return false;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesSistema;

import java.util.ArrayList;
import projetofinalpizzaria.Cliente;

/**
 *
 * @author lelim
 */
public final class Datastore {
    private static final Datastore DATA = new Datastore();
    private ArrayList<Cliente> clientes = new ArrayList<>();
    
    public static Datastore getInstance() {
        return DATA;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
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
}

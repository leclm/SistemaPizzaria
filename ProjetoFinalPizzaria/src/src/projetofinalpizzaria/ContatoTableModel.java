package projetofinalpizzaria;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ContatoTableModel extends AbstractTableModel{
    private String[] colunas=new String[]{"id","Nome", "Sobrenome", "Telefone", "Pedidos"};

    private List<Cliente> lista=new ArrayList();

    
    public ContatoTableModel(List<Cliente> lista){
        this.lista=lista;
    }

    public ContatoTableModel(){
    }


    @Override
    public int getRowCount() {
        return this.lista.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public String getColumnName(int index) {
        return this.colunas[index];
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
        //if(column==0)
        //    return false;
        //return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente customer = lista.get(rowIndex);
        switch (columnIndex) {
            case 0: return customer.getId();//if column 0 (code)
            case 1: return customer.getNome();//if column 1 (name)
            case 2: return customer.getSobrenome();//if column 2 (birthday)
            case 3: return customer.getTelefone();
            case 4: return customer.getPedidos();
            default : return null;
        }
    }

    @Override
    public void setValueAt(Object value, int row, int col) {
        Cliente customer = lista.get(row);
        switch (col) {
            case 0:
                customer.setId((Long) value); //if column 0 (code)
                break;
            case 1:
                customer.setNome((String) value);
                break;
            case 2:
                customer.setSobrenome((String) value);
                break;
            case 3:
                customer.setTelefone((String) value);
                break;
            case 4:
                customer.setPedidos((ArrayList<Pedido>) value);
                break;
            default:
        }
        this.fireTableCellUpdated(row, col);
    }

    public boolean removeContato(Cliente customer) {
        int linha = this.lista.indexOf(customer);
        boolean result = this.lista.remove(customer);
        this.fireTableRowsDeleted(linha,linha);//update JTable
        return result;
    }

    public void adicionaContato(Cliente customer) {
        this.lista.add(customer);
        //this.fireTableDataChanged();
        this.fireTableRowsInserted(lista.size()-1,lista.size()-1);//update JTable
    }

    public void setListaContatos(List<Cliente> contatos) {
        this.lista = contatos;
        this.fireTableDataChanged();
        //this.fireTableRowsInserted(0,contatos.size()-1);//update JTable
    }

    public void limpaTabela() {
        int indice = lista.size()-1;
        if(indice<0)
            indice=0;
        this.lista = new ArrayList();
        this.fireTableRowsDeleted(0,indice);//update JTable
    }

    public Cliente getContato(int linha){
        return lista.get(linha);
    }

    void removeContatos(List<Cliente> listaParaExcluir) {
        listaParaExcluir.forEach((contato) -> {
            removeContato(contato);
        });
    }
    
}

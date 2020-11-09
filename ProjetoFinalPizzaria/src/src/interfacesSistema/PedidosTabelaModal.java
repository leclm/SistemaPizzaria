package interfacesSistema;

import CadastroSabores.*;
import projetofinalpizzaria.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class PedidosTabelaModal extends AbstractTableModel{
    private String[] colunas=new String[]{"id","Nome", "Pedido", "Status"};

    private List<ListaPedidos> lista=new ArrayList();

    
    public PedidosTabelaModal(List<ListaPedidos> lista){
        this.lista=lista;
    }

    public PedidosTabelaModal(){
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
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ListaPedidos customer = lista.get(rowIndex);
        switch (columnIndex) {
            case 0: return customer.getId();//if column 0 (code)
            case 1: return customer.getNome();//if column 1 (name)
            case 2: return customer.getIdPedido();
            case 3: return customer.getStatus();
            default : return null;
        }
    }

    @Override
     public void setValueAt(Object value, int row, int col) {
        ListaPedidos customer = lista.get(row);
        switch (col) {
            case 0:
                customer.setId((long) value); //if column 0 (code)
                break;
            case 1:
                customer.setNome((String) value);
                break;
            case 2:
                customer.setIdPedido((long) value);
                break;
            case 3:
                customer.setStatus((String) value);
            default:
        }
        this.fireTableCellUpdated(row, col);
    }

    public void setListaSabores(List<ListaPedidos> listaPedidos) {
        this.lista = listaPedidos;
        this.fireTableDataChanged();
        //this.fireTableRowsInserted(0,contatos.size()-1);//update JTable
    }    
}

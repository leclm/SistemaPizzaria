package CadastroSabores;

import projetofinalpizzaria.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class saboresTabelaModal extends AbstractTableModel{
    private String[] colunas=new String[]{"id","Nome", "Tipo", "Preço"};

    private List<Sabor> lista=new ArrayList();

    
    public saboresTabelaModal(List<Sabor> lista){
        this.lista=lista;
    }

    public saboresTabelaModal(){
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
        Sabor customer = lista.get(rowIndex);
        switch (columnIndex) {
            case 0: return customer.getId();//if column 0 (code)
            case 1: return customer.getNome();//if column 1 (name)
            case 2: return customer.getTipo() == 0 ? "Simples" : (customer.getTipo() == 1 ? "Especial" : "Premium");
            case 3: return customer.getPreco();
            default : return null;
        }
    }

    @Override
     public void setValueAt(Object value, int row, int col) {
        Sabor customer = lista.get(row);
        switch (col) {
            case 0:
                customer.setId((Long) value); //if column 0 (code)
                break;
            case 1:
                customer.setNome((String) value);
                break;
            case 2:
                customer.setTipo((int) value);
                break;
            case 3:
                customer.setPreco((double) value);
                break;
            default:
        }
        this.fireTableCellUpdated(row, col);
    }

    public boolean removeSabor(Sabor customer) {
        int linha = this.lista.indexOf(customer);
        boolean result = this.lista.remove(customer);
        this.fireTableRowsDeleted(linha,linha);//update JTable
        return result;
    }

    public void adicionaSabor(Sabor customer) {
        this.lista.add(customer);
        //this.fireTableDataChanged();
        this.fireTableRowsInserted(lista.size()-1,lista.size()-1);//update JTable
    }

    public void setListaSabores(List<Sabor> sabores) {
        this.lista = sabores;
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

    public Sabor getSabor(int linha){
        return lista.get(linha);
    }

    void removeSabores(List<Sabor> listaParaExcluir) {
        listaParaExcluir.forEach((sabor) -> {
            removeSabor(sabor);
        });
    }
    
}

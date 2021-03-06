package projetofinalpizzaria;

public class Sabor {
    private long id;
    private int tipo; //0 = simples; 1 = especial; 2 = premium
    private double preco;
    private String nome;

    public Sabor(long id, int tipo, String nome, double preco) {
        this.id = id;
        this.tipo = tipo;
        this.nome = nome;
        this.preco = preco;
    }
    
    public void setSabor(Sabor sabor){
        tipo = sabor.getTipo();
        nome = sabor.getNome();
        preco = sabor.getPreco();
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

    public double getPreco() {
        return preco;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

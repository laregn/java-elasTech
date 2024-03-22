package aulinha;
public class Suprimentos {
    private int numeroItem;
    private String descricaoItem;
    private int quantidade;
    private double precoUnitario;

    public Suprimentos(int numeroItem, String descricaoItem, int quantidade, double precoUnitario) {
        this.numeroItem = numeroItem;
        this.descricaoItem = descricaoItem;
        this.quantidade = (quantidade > 0) ? quantidade : 0;
        this.precoUnitario = (precoUnitario > 0.0) ? precoUnitario : 0.0;
    }
    public int getNumeroItem() {
        return numeroItem;
    }
    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }
    public String getDescricaoItem() {
        return descricaoItem;
    }
    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = (quantidade > 0) ? quantidade : 0;
    }
    public double getPrecoUnitario() {
        return precoUnitario;
    }
    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = (precoUnitario > 0.0) ? precoUnitario : 0.0;
    }
    public double getInvoiceAmount() {
        return quantidade * precoUnitario;
    }
}




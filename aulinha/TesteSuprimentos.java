package aulinha;

public class TesteSuprimentos {
    public static void main(String[] args) {

        Suprimentos item1 = new Suprimentos(1, "MousePad do league of legends", 19, 100.0);


        System.out.println("Número do item: " + item1.getNumeroItem());
        System.out.println("Descrição do item: " + item1.getDescricaoItem());
        System.out.println("Quantidade: " + item1.getQuantidade());
        System.out.println("Preço unitário: " + item1.getPrecoUnitario());
        System.out.println("Valor da fatura: " + item1.getInvoiceAmount());
    }
}

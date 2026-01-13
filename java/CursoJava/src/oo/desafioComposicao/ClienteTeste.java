package oo.desafioComposicao;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Pedro");

        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta",5.0,10);
        compra1.adicionarItem("Caderno",25.0,4);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Copo",13.25,10);
        compra2.adicionarItem("Celular",1450.5,1);

        cliente1.compras.add(compra1);
        cliente1.compras.add(compra2);

        System.out.println(cliente1.getValorTotalPagamento());
    }
}

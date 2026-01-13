package oo.desafioComposicao;

import java.util.ArrayList;

public class Compra {

   final ArrayList<Item> itens = new ArrayList<>();

    public void adicionarItem(Produto p, int quantidade){
        this.itens.add(new Item(p, quantidade));
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        this.itens.add(new Item(new Produto(nome, preco), quantidade));
    }

    public double getValorTotal(){
        double valorTotal = 0;
        for(Item item : itens){
            valorTotal += item.quantidade * item.produto.preco;
        }
        return valorTotal;
    }
}

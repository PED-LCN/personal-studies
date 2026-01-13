package oo.desafioComposicao;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    final String nome;
    final List<Compra> compras = new ArrayList<>();

    Cliente(String nome){
        this.nome = nome;
    }

    public double getValorTotalPagamento(){
        double pagamento = 0;
        for(Compra compra : compras){
            pagamento += compra.getValorTotal();
        }
        return pagamento;
    }
}

package oo.heranca.desafio;

public class Ferrari extends Carro {

    Ferrari(){
        super(320);
    }

    @Override
    void Acelerar() {
        velocidadeAtual += 15;
    }
}

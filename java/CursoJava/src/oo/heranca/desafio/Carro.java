package oo.heranca.desafio;

public class Carro {

    int velocidadeAtual;

    void Acelerar(){
        velocidadeAtual += 5;
    }

    void Freiar(){
        if (velocidadeAtual >=5){
            velocidadeAtual -= 5;
        }else {velocidadeAtual = 0;}

    }

    int getVelocidadeAtual(){
        return  velocidadeAtual;
    }
}

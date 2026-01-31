package oo.heranca.desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual;
    int delta= 5;

    Carro(int VELOCIDADE_MAXIMA) {
        this.VELOCIDADE_MAXIMA = VELOCIDADE_MAXIMA;
    }

    void Acelerar(){
        if (velocidadeAtual + delta > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }
        else velocidadeAtual += delta;
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

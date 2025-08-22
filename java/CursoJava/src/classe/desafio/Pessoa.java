package classe.desafio;

public class Pessoa {
    String nome;
    double peso;

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida Comida){
        if (Comida != null) {
            this.peso += Comida.pesoComida;
        }
    }

    String apresentar(){
        return "Eu sou " + nome + " e tenho " + peso + " kgs.";
    }
}

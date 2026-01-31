package oo.heranca.desafio;

public class DesafioTeste {
    public static void main(String[] args) {

    Ferrari ferrari = new Ferrari();
        Civic civic = new Civic();

        System.out.println("Velocidade: civic -> " + civic.getVelocidadeAtual()+" Km/h");
        System.out.println("Velocidade: ferrari -> " + ferrari.getVelocidadeAtual()+" Km/h");

        ferrari.Acelerar();
        ferrari.Acelerar();
        ferrari.Acelerar();

        civic.Acelerar();
        civic.Acelerar();
        civic.Acelerar();

        System.out.println("Velocidade: civic -> " + civic.getVelocidadeAtual()+" Km/h");
        System.out.println("Velocidade: ferrari -> " + ferrari.getVelocidadeAtual()+" Km/h");

        ferrari.Freiar();
        ferrari.Freiar();

        civic.Freiar();
        civic.Freiar();

        System.out.println("Velocidade: civic ->" + civic.getVelocidadeAtual()+" Km/h");
        System.out.println("Velocidade: ferrari -> " + ferrari.getVelocidadeAtual()+" Km/h");


    }
}

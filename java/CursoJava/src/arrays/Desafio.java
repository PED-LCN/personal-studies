package arrays;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantas notas você quer colocar? ");
        int tam = input.nextInt();

        double[] notas = new double[tam];

        for (int i = 0; i < tam; i++){
            System.out.print("Digite a nota ["+ (i+1) +"] :");
            notas[i] = input.nextDouble();
        }
        input.close();

        double total = 0;
        for (double nota : notas){
            total += nota;
        }

        double media = total / tam;

        System.out.printf("Sua média é de : %.2f", media);


    }
}

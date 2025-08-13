package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        System.out.println("CALCULADORA");
        System.out.println("------------");

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        double V1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        double V2 = sc.nextInt();
        System.out.println("Digite qual operação deseja fazer:\n"
         + "[1]Soma(+)\n" + "[2]Subtração(-)\n"+ "[3]Multiplicação(*)\n"+"[4]Divisão(/)\n"+"[5]Resto(%)");
        int op = sc.nextInt();
        sc.close();

        double soma  = V1 + V2;
        double subtracao = V1 - V2;
        double multiplicacao = V1 * V2;
        double divisao = V1 / V2;
        double resto = V1 % V2;

        double resultado =
                (op == 1) ? soma :
                        (op == 2) ? subtracao :
                                (op == 3) ? multiplicacao:
                                        (op == 4) ? divisao:
                                                (op == 5) ? resto : 0;

        System.out.println(resultado);
    }
}

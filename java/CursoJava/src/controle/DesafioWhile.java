package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        double total = 0;
        int cont = 0;
        String validador = "";
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Digite uma nota: ");
            double N1 = sc.nextDouble();
            sc.nextLine();
            if (N1 <= 0 || N1 > 10) {
                System.out.println("Nota inválida!");
            } else {
                cont++;
                total += N1;
                System.out.println("Quer adicionar mais notas?[S/N]");
                validador = sc.nextLine();
            }
        }while (validador.equalsIgnoreCase("s"));

        double media = total / cont;

        sc.close();
        System.out.println("A media das notas foram: "+ media);
    }
}

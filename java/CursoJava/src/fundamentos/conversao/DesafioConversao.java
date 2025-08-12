package fundamentos.conversao;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner salario = new Scanner(System.in);

        System.out.println("Digite o seu ultimo salário: ");
        String s1 = salario.nextLine();
        System.out.println("Digite seu penúltimo salário: ");
        String s2 = salario.nextLine();
        System.out.println("Digite seu antepenúltimo salário");
        String s3 = salario.nextLine();

        salario.close();
        double n1 = Double.parseDouble(s1.replace(",", "."));
        double n2 = Double.parseDouble(s2.replace(",", "."));
        double n3 = Double.parseDouble(s3.replace(",", "."));
        System.out.println("A média do seus 3 últimos salário é: " + (n1+n2+n3)/3 );

    }
}

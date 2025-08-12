package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //Informações de um funcionario "hipotetico"

        //tipos inteiros
        byte anosDeEmpresa = 23;
        short numerosDeVoos = 5042;
        int id = 56789;
        long pontosAcumulados = 3_234_845_233L;

        //tipos numéricos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        //Tipo booleanos
        boolean estaDeFerias = false; //true

        //Tipo caractere
        char status = 'A'; //ativo

        //Dias de empresa
        System.out.println("Dias de Empresa : " + anosDeEmpresa * 365);

        //Números de viagens
        System.out.println("Números de viagens:"+numerosDeVoos / 2 );

        //Pontos por real
        System.out.println("Pontos por real"+ pontosAcumulados / vendasAcumuladas);

        //Salário
        System.out.println(id +":Este usuário ganha ->"+salario );

        //Ferias
        System.out.println("Feria?"+estaDeFerias);

        //Status
        System.out.println("Status: "+status);
    }
}

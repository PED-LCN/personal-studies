package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data hoje = new Data(21,8,2025);

        Data d2 = new Data();
        d2.dia = 25;
        d2.mes = 9;
        d2.ano = 2023;

        String dataFormatadaHoje = hoje.obterDataFormatada();

        System.out.println(dataFormatadaHoje);
        System.out.println(d2.obterDataFormatada());

        hoje.imprimirDataFormatada();
    }
}

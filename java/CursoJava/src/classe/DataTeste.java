package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data hoje = new Data();
        hoje.dia = 21;
        hoje.mes = 8;
        hoje.ano = 2025;

        Data d2 = new Data();
        d2.dia = 25;
        d2.mes = 9;
        d2.ano = 2023;

        System.out.printf(hoje.obterDataFormatada());
        System.out.printf(d2.obterDataFormatada());


    }
}

package classe;

public class Data {
    int dia;
    int mes;
    int ano;

    Data(){
        dia = 1;
        mes = 1;
        ano = 197;
    }

    Data(int diaNew, int mesNew, int anoNew){
        dia = diaNew;
        mes = mesNew;
        ano = anoNew;
    }

    String obterDataFormatada(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }

    void imprimirDataFormatada(){
        System.out.println(obterDataFormatada());
    }
}

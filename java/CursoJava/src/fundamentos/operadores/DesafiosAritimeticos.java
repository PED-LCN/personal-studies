package fundamentos.operadores;

public class DesafiosAritimeticos {
    public static void main(String[] args) {
        int a = 6 * (3+2);
        int a2 = (int) Math.pow(a,2);
        int a3 = a2 / (3*2);

        int b1 = ((1-5) * (2-7)) / 2;
        int b2 = (int) Math.pow(b1,2);

        int c1 = (int) Math.pow((a3-b2),3);
        int c2 = (int) (c1 / Math.pow(10,3));

        System.out.println(c2);
    }
}

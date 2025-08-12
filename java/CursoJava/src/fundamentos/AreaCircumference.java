package fundamentos;

public class AreaCircumference {
    public static void main(String[] args) {
        double RAIO = 3.4;
        final double PI = 3.14159;
        double AREA = PI * RAIO * RAIO;

        System.out.println(AREA);

        RAIO = 10;
        AREA = PI * RAIO * RAIO;

        System.out.println("Area = "+ AREA+"M²");


    }
}

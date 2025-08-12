package fundamentos;

public class Temperature {
    public static void main(String[] args) {
        //°C = (°F-32) * 5/9
        final double AJUSTE = 32;
        final double FATOR = 5.0/9.0;
        double F = 86 ;

        double C = (F - AJUSTE) * FATOR;
        System.out.println("Se a temperatura em fahrenheit for "+F+"°F");
        System.out.println("A temperatura será de "+C+"°C");
         F = 150 ;

         C = (F - AJUSTE) * FATOR;
        System.out.println("Se a temperatura em fahrenheit for "+F+"°F");
        System.out.println("A temperatura será de "+C+"°C");
    }
}

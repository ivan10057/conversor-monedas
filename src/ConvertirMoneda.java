import java.util.Scanner;

public class ConvertirMoneda {
    public static void conversion(String monedaBase, String monedaDestino, ConsultarMoneda consulta, Scanner lectura){
        double cantidad;
        double cantidadConvertida;

        Moneda moneda = consulta.buscaMoneda(monedaBase, monedaDestino);
        System.out.println("El valor de la moneda consultada el día de hoy es\n1" +
                monedaBase+ "= "+moneda.conversion_rate()+ " " + monedaDestino);
        System.out.println("Ingrese la cantidad de "+monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * moneda.conversion_rate();
        System.out.println(cantidad+ " "+ monedaBase+ " = "+cantidadConvertida+ " "+monedaDestino);

    }
    public static void conversionMoneda (ConsultarMoneda consulta, Scanner lectura){
        System.out.println("Ingrese la moneda que desea convertir");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese la moneda objetivo");
        String monedaDestino = lectura.nextLine().toUpperCase();
        conversion(monedaBase, monedaDestino, consulta,lectura);
    }
}


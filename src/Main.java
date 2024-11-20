import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int opcionUsuario = 0;
        while (opcionUsuario!=13){
            System.out.println("*******************************************************");
            System.out.println("Bienvenidos al conversor de monedas");
            System.out.println("Ingresa la conversión de moneda que deseas efectuar");
            System.out.println("1. Dollar a Peso Colombiano");
            System.out.println("2. Peso Colombiano a Dollar");
            System.out.println("3. Dollar a Peso Argentino");
            System.out.println("4. Peso Argentino a Dollar");
            System.out.println("5. Dollar a Real Brasileño");
            System.out.println("6. Real brasileño a Dollar");
            System.out.println("7. Dollar a Peso Mexicano");
            System.out.println("8. Peso Mexicano a Dollar");
            System.out.println("9. Dollar a Cordoba nicaragüense");
            System.out.println("10. Cordoba nicaragüense a Dollar");
            System.out.println("11  Dollar a Colon Costarricense");
            System.out.println("12. Colon Costarricense a Dollar");
            System.out.println("13. Salir");


            opcionUsuario = lectura.nextInt();
            lectura.nextLine();
            switch (opcionUsuario){
                case 1:
                    ConvertirMoneda.conversion("USD", "COP", consulta, lectura);
                    break;

                case 2:
                    ConvertirMoneda.conversion("COP", "USD",consulta,lectura);
                    break;

                case 3:
                    ConvertirMoneda.conversion("USD", "ARS", consulta, lectura);
                    break;

                case 4:
                    ConvertirMoneda.conversion("ARS","USD", consulta, lectura);
                    break;
                case 5:
                    ConvertirMoneda.conversion("USD","BRL", consulta,lectura);
                    break;

                case 6:
                    ConvertirMoneda.conversion("BRL", "USD", consulta,lectura);
                    break;
                case 7:
                    ConvertirMoneda.conversion("USD", "MXN", consulta,lectura);
                    break;
                case 8:
                    ConvertirMoneda.conversion("MXN", "USD", consulta,lectura);
                    break;
                case 9:
                    ConvertirMoneda.conversion("USD", "NIO", consulta,lectura);
                    break;
                case 10:
                    ConvertirMoneda.conversion("NIO", "USD", consulta,lectura);
                    break;
                case 11:
                    ConvertirMoneda.conversion("USD", "CRC", consulta,lectura);
                    break;

                case 12:
                    ConvertirMoneda.conversion("CRC", "USD", consulta,lectura);
                    break;

                case 13:
                    System.out.println("Saliendo del conversor de monedas");
                    break;

                default:
                    System.out.println("Opción invalida, por favor selecciona una opción que se encuentre dentro del menú");
                    break;


            }
        }


    }
}
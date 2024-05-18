package EjerciciosLogica;

import java.util.Scanner;

public class Ejercicio02Exportacion {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        //definimos las variables
        int exportacionAsia, exportacionEuropa, exportacionAmerica, exportacionAfrica;
        int totalProduccion;

        //pedimos al usuario la producción total de lácteos
        System.out.print("Ingrese la produccion total de lácteos: ");
        totalProduccion = leer.nextInt();

        //hacemos las operaciones para cada contienente
        exportacionAsia = (totalProduccion / 100) * 35;
        exportacionEuropa = (totalProduccion / 100) * 27;
        exportacionAmerica = (totalProduccion / 100) * 19;
        exportacionAfrica = (totalProduccion / 100) * 19;

        //mostramos los resultados
        System.out.println("Exportanción para Asia (35%): " + exportacionAsia);
        System.out.println("Exportación para Europa (27%): " + exportacionEuropa);
        System.out.println("Exportación para Ámerica Latina (19%): " + exportacionAmerica);
        System.out.println("Exportación para África (19%): " + exportacionAfrica);
    }
}

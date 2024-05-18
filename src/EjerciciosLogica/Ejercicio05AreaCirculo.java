package EjerciciosLogica;

import java.util.Scanner;

public class Ejercicio05AreaCirculo {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        /*
         * Elaborar un algoritmo que calcule
         * el área y perímetro de un circulo,
         * dado por teclado su radio.
         */

        // definimos nuestras variables
        double radio, area, perimetro;

        // pedimos los datos
        System.out.print("Ingresa el radio del círculo: ");
        radio = leer.nextDouble();

        // hacemos las operaciones
        area = 3.14 * (radio * radio);
        perimetro = 2 * 3.14 * radio;

        // mostramos los resultados
        System.out.println("El área del círculo es: " + area + " cm.");
        System.out.println("Perímetro del circulo es: " + perimetro + " cm.");
    }
}

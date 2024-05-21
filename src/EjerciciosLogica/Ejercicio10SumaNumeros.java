package EjerciciosLogica;

import java.util.Scanner;

public class Ejercicio10SumaNumeros {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        //definimos todas nuestras variables
        int numero, sumNumeros = 0, conNegativos = 0, conPositivos = 0,
                conPares = 0, conImpares = 0, cantidadNumeros = 0;

        // con un ciclo do while: pedimos los numeros hasta se escriba un 0 
        do {
            System.out.print("Ingresa un número (0 para finalizar): ");
            numero = leer.nextInt();
            if (numero != 0) {
                sumNumeros += numero;
                cantidadNumeros++;
                if (numero > 0) {
                    conPositivos++;
                } else {
                    conNegativos++;
                }

                if ((numero % 2) == 0) {
                    conPares++;
                } else {
                    conImpares++;
                }
            }
        } while (numero != 0);

        //mostramos los resultados
        System.out.println("");
        System.out.println("Cantidad de números pares ingresados: " + conPares);
        System.out.println("Cantidad de números impares ingresados: " + conImpares);
        System.out.println("Contador de números negativos ingresados: " + conNegativos);
        System.out.println("Contador de numeros positivos ingresados: " + conPositivos);
        System.out.println("Suma de todos los números: " + sumNumeros);
        System.out.println("Cantidad de números: " + cantidadNumeros);
    }
}

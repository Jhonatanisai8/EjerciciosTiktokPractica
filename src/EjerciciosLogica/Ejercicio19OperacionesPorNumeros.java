package EjerciciosLogica;

import java.util.Scanner;
public class Ejercicio19OperacionesPorNumeros {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        // definimos las variables
        int numeroA, numeroB, suma, resta, multiplicacion;
        String opcion;

        // proceso repetitivo
        do {
            // pedimos los números
            System.out.print("Ingrese el primer número: ");
            numeroA = leer.nextInt();
            System.out.print("Ingrese el segundo número: ");
            numeroB = leer.nextInt();

            // si ambos son pares
            if ((((numeroA % 2) == 0) && ((numeroB % 2) == 0))) {
                suma = numeroA + numeroB;
                System.out.println("La suma es: " + suma);
            }
            // si ambos son impares
            else if (((numeroA % 2) != 0) && ((numeroB % 2) != 0)) {
                resta = numeroA - numeroB;
                System.out.println("La resta es: " + resta);
            }
            // si uno es par y el otro es impar
            else if (((numeroA % 2) == 0) && ((numeroB % 2) != 0)) {
                multiplicacion = numeroA * numeroB;
                System.out.println("La multiplicación es: " + multiplicacion);
            }
            // preguntamos si desea seguir en el programa
            System.out.println("Desea continuar Y/N");
            opcion = leer.next();
            // mientras la opcion sea Y
        } while (opcion.equalsIgnoreCase("Y"));
    }
}
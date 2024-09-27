package EjerciciosLogica;

import java.util.Scanner;

public class Ejercicio52DivisorOtro {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        /* variables a utilizar */
        int a, b;
        String opcion;

        do {

            /* pedimos los números al usuario */
            System.out.println("Ingrese por favor el número A: ");
            a = leer.nextInt();
            System.out.println("Ingrese por favor el número B: ");
            b = leer.nextInt();

            /* mostramos el resultado */
            System.out.println(esDivisor(a, b));
            /* preguntamos si desea continuar */
            System.out.print("¿Desea continuar? s(SI) || n(NO): ");
            opcion = leer.next();
        } while (!opcion.equalsIgnoreCase("n"));
    }

    /*
     * Función retorna true (verdadero) si es el número A es divisor
     * del número B. Si no lo es, retorna False.
     */
    public static String esDivisor(int numeroA, int numeroB) {
        String mensaje = "";
        if (numeroA < numeroB) {
            mensaje = "¿" + numeroA + " es divisor de " + numeroB + "?: " + ((numeroA % numeroB) == 0);
        } else {
            mensaje = "¿" + numeroB + " es divisor de " + numeroA + "?: " + ((numeroB % numeroA) == 0);
        }
        return mensaje;
    }
}

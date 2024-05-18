package EjerciciosLogica;

import java.util.Scanner;

public class Ejercicio01Aumento {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        /*
         * Ejercicio:
         * Un empleado tiene un sueldo fijo, y va a recibir un aumento del 15% de su
         * sueldo.
         * Se necesita saber cúanto de dinero representa ese 15%
         */

        /*
         * Definimos un objeto de tipo Scanner para asi
         * poder ingresar datos por consola.
         */

        /* Definimos las variables a utilizar */
        float sueldoFijo, aumento = 0.15f, montoAumento;

        /* Pedimos por consola el sueldo del empleado */
        System.out.print("Ingrese el sueldo del empleado: ");
        sueldoFijo = leer.nextFloat();

        /* Hacemos el cálculo del 15% sobre el sueldo */
        montoAumento = (sueldoFijo * aumento);

        /* Imprimimos los resultados */
        System.out.println("Sueldo Fijo: " + sueldoFijo);
        System.out.println("Aumento del 15% sobre su sueldo: " + montoAumento);
        System.out.println("Sueldo total: " + (sueldoFijo + montoAumento));
    }

}

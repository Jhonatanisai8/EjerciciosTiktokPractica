package EjerciciosLogica;
/*
ESCRIBE UN PROGRAMA QUE SOLICITE AL USUARIO UNA CANTIDAD 
Y LUEGO ITERE LA CANTIDAD DE VECES DADA.
EN CADA ITERACION, SOLICITAR AL USUARIO QUE INGRESE UN NUMERO . 
AL FINALIZAR, MOSTRAR LA SUMA DE TODOS LOS NUMEROS INGRESADOS.
 */

import java.util.Scanner;

public class Ejercicio68PedirNumeros {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        int cantidadNumeros, numero, suma = 0;
        // pedimos la cantidad de numeros
        System.out.print("Ingrese la cantidad de numeros: ");
        cantidadNumeros = leer.nextInt();

        /*
         * con un bucle for
         * iteramos desde 1 hasta el numero que veces que el
         * usuario ingreso
         */
        for (int i = 1; i <= cantidadNumeros; i++) {
            // pedimos los numeros
            System.out.print("INGREA UN NUMERO: ");
            numero = leer.nextInt();
            // vamos sumando los numeros en la variable suma
            suma += numero;
        }
        // mostramos la suma
        System.out.println("LA SUMA TOTAL DE LOS NUMEROS INGRESADOS ES: " + suma);
    }
}

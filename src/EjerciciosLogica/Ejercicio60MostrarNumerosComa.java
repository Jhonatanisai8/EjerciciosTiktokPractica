package EjerciciosLogica;

/*
EJERCICIO DE LOGICA DE PROGRAMACION:
Escribir un programa que pida al usuario 
un número entero positivo y muestre por
pantalla todos los números impares desde 
1 hasta ese número separados por comas.*/

import java.util.Scanner;
public class Ejercicio60MostrarNumerosComa {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        /*definimos la variables */
        int numero;
        /*pedimos al usuario el número */
        System.out.print("Por favor ingrese el número: ");
        numero = leer.nextInt();

        /*llamamos a la función y le pasamos como 
         parametro el número ingresado.*/
        System.out.println(mostrarNumeros(numero));
    }

    public static String mostrarNumeros(int numero) {
    
        /*variable que servira como un acumulador. */
        String mensaje = "";
        
        /*si el numero es menor o igual a 0 
        le retornamos el siguiente mensaje.*/
    
        if (numero <= 0) {
            mensaje = "Por favor el número debe ser positivo.";
        }

        /*recorremos con un bucle for 
         * desde el 1 hasta el numero pasado como parametro
         * y vamos acumulando los numeros impares separandolos 
         * por una coma.*/
        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                mensaje += +i + ", ";
            }
        }

        /*retornamos la variable */
        return mensaje;
    }
}

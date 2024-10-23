package EjerciciosLogica;

import java.util.Arrays;

/*EJERCICIO DE LOGICA DE PROGRAMACION: 
Has un función que dado un numero devuela si es capicúa:
DATO:
Un número capicúa es aquel que se lee igual de izquierda
a derecha que de derecha a izquierda. Es decir, los dígitos
 que lo componen son simétricos.
Ejemplo:
121: Si lo lees de izquierda a derecha o de derecha a 
izquierda, siempre será "ciento veintiuno".*/

/*SOLUCION EN JAVA */
public class Ejercicio65NumeroCapicua {
    public static void main(String[] args) {

        /*NUMERO A PROBAR */
        int numero = 1234321;

        /*LLAMAMOS A LA FUNCIÓN */
        System.out.println("ES CAPICUA EL NUMERO: " + numero + "? : " + esCapicua(numero));
    }

    public static boolean esCapicua(int numero) {
        // convertimos a String el numero
        String n = String.valueOf(numero);

        /*invertimos el numero ya convertido a String con ayuda de 
         StringBuilder */
        StringBuilder st = new StringBuilder(n);
        st.reverse();

        //retornamos si los array son iguales
        return Arrays.equals(n.toCharArray(), st.toString().toCharArray());

    }
}

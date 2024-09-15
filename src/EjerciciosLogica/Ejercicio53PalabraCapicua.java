package EjerciciosLogica;
// EJERCICIO DE LÓGICA DE PROGRAMACIÓN:

/*Has un programa que muestre al usuario
si una palabra ingresada es capicua.
(SE LEE IGUAL AL REVES).*/

/*SOLUCIÓN EN JAVA */
import java.util.Arrays;
public class Ejercicio53PalabraCapicua {
    public static void main(String[] args) {
        /*llamamos a la función
         * y se pasamos una palabra como argumento.*/
        boolean esCapicua02 = esCapicua02("asaaa");

        /* mostramos el resultado */
        System.out.println("ES CAPICUA: " + esCapicua02);
    }

    public static boolean esCapicua02(String palabra) {

        // creamos un arreglo de tamaño de la palabra
        char arreglo[] = new char[palabra.length()];
        //guardamos la palabra invertida en el arreglo
        for (int i = 0; i < palabra.length(); i++) {
            arreglo[i] = palabra.charAt(arreglo.length - 1 - i);
        }

        //verificamos si son iguales
        return Arrays.equals(arreglo, palabra.toCharArray());
    }
}

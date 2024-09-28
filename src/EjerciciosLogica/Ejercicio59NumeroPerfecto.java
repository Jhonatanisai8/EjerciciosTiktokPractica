package EjerciciosLogica;
/*EJERCICIO DE LOGICA DE PROGRAMACION:

Has una función que dado un 
número esta devuelva si es perfecto 
o no.*/

public class Ejercicio59NumeroPerfecto {
    public static void main(String[] args) {
        /*llamamos a la funcion y le pasamoa como parametro 
        el numero 6 ya es numero es perfecto                 */
        System.out.println("ES PERFECTO: " + esNumeroPerfecto(6));
    }

    public static boolean esNumeroPerfecto(int numero) {

        /* variable auxiliar para acu */
        int suma = 0;
        /* recorremos hasta el numero - 1 */
        for (int i = 1; i <= numero - 1; i++) {
            /* si i es divisor sumamos. */
            if (numero % i == 0) {
                suma += i;
            }
        }

        /* si la suma de los divisores es igual al numero */
        return suma == numero;
    }
}

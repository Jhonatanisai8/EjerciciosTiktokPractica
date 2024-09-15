package EjerciciosLogica;
/*EJERCICIO DE LOGICA DE PROGRAMACIÓN:
HACER UN PROGRAMA QUE MUESTRE AL USUARIO
SI UNA LETRA ES VOCAL O NO:*/
/*SOLUCIÓN EN JAVA */
import java.util.Arrays;
import java.util.List;
public class Ejercicio54VocalOno {
    public static void main(String[] args) {

        /*para el ejemplo la vocal 'a' */
        String palabra = "b";

        /*llamamos a la función y mostramos el resultado */
        System.out.println("Es vocal la palabra"+palabra+" : "+esVocal(palabra));
    }

    public static boolean esVocal(String vocal) {

        /*creamos una lista con todas las vocales */
        List<String> vocales = Arrays.asList("a", "e", "i", "o", "u");

        /*con el método contains: verificamos
        si la lista contiene dicha vocal*/
        return vocales.contains(vocal.toLowerCase());
    }
}

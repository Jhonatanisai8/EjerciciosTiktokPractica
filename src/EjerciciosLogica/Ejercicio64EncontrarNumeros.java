package EjerciciosLogica;

import java.util.Arrays;
import java.util.List;


/*EJERCICIO DE PROGRAMACIÓN:
Has una función que devuelva
el número contenido dentro de
una frase.*/


public class Ejercicio64EncontrarNumeros {
    public static void main(String[] args) {

        /*ejemplo */
        String frase = "Java 8 es divertido!!...";

        /*llamamos a la función */
        System.out.println(encontrarNumero(frase));

    }

    public static String encontrarNumero(String frase) {
        String m = "";
        /*Lista de números */
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

        /*recorremos la frase y comparamos 
        cada caracter con los datos de la lista de números.. */
        for (int i = 0; i < frase.length(); i++) {
            for (int j = 0; j < listaNumeros.size(); j++) {
                if (String.valueOf(frase.charAt(i))
                .equals(String.valueOf(listaNumeros.get(j)))) {
                    /*cada vez que encuentre un numero se guardara en 
                     esta variable*/
                    m = m + frase.charAt(i) + "|";
                }
            }
        }
        /*retornamos la variable donde se guardaran los números */
        return m;
    }

}

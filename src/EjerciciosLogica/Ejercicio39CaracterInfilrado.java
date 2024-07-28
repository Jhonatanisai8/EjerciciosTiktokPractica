package EjerciciosLogica;

import java.util.ArrayList;
import java.util.List;

/*
 * Crea una función que reciba dos cadenas de texto casi iguales,
 * a excepción de uno o varios caracteres.
 * La función debe encontrarlos y retornarlos en formato lista/array.
 * - Ambas cadenas de texto deben ser iguales en longitud.
 * - Las cadenas de texto son iguales elemento a elemento.
 * - No se pueden utilizar operaciones propias del lenguaje
 *   que lo resuelvan directamente.
 *
 * Ejemplos:
 * - Me llamo mouredev / Me llemo mouredov -> ["e", "o"]
 * - Me llamo.Brais Moure / Me llamo brais moure -> [" ", "b", "m"]
 */
public class Ejercicio39CaracterInfilrado {
    public static void main(String[] args) {
        String palabra1 = "Me llamo.Brais Moure";
        String palabra2 = "Me llamo brais moure ";

        List<String> lista = caracteres(palabra1, palabra2);
        System.out.println(lista);
    }

    public static List<String>caracteres(String palabra1, String palabra2) {
        List<String> listaCaracteres = new ArrayList<>();

        if (palabra1.length() == palabra2.length()) {

            for (int i = 0; i < palabra1.length(); i++) {
                if (palabra1.charAt(i) != palabra2.charAt(i)) {
                    listaCaracteres.add(palabra2.charAt(i) + "");
                }
            }
        }
        return listaCaracteres;
    }
}

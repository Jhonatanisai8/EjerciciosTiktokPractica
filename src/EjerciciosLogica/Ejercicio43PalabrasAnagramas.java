package EjerciciosLogica;

/*
EJERCICIO:
Desarrolla un programa que determine si dos palabras proporcionadas 
son anagramas. Dos palabras son anagramas si ambas contienen exactamente las
mismas letras en la misma cantidad, aunque en diferente orden.

Requisitos:
El programa debe verificar si ambas palabras son anagramas.
El programa debe imprimir true si las palabras son anagramas y false
en caso contrario.*/
import java.util.Arrays;
public class Ejercicio43PalabrasAnagramas {
    public static void main(String[] args) {
        String palabra1 = "listen";
        String palabra2 = "silent";

        /*llamamos al método */
        boolean esAnagrama = sonAnagramas(palabra1, palabra2);
        System.out.println("¿SON ANAGRAMAS?");
        System.out.println(esAnagrama);
    }

    public static boolean sonAnagramas(String palabra1, String palabra2) {
        /* comprobamos las longitudes */
        if (palabra1.length() != palabra2.length()) {
            return false;
        }
        /* convertimos las palabras en arreglos y los ordenamos */
        char[] array1 = palabra1.toCharArray();
        char[] array2 = palabra2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        /* retornamos si los arreglos son iguales */
        return Arrays.equals(array1, array2);
    }
}

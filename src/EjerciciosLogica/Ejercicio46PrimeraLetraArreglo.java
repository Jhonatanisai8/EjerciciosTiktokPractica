package EjerciciosLogica;

import java.util.ArrayList;
import java.util.List;
/*EJERCICIO:
Hasta un función que dada una arreglo de palabras 
imprima  la primera letra de cada una.*/
public class Ejercicio46PrimeraLetraArreglo {
    public static void main(String[] args) {
        String arregloPalabras[] = { "Hola", "Que tal", "Mundo", "Casa", "Sueldo" };

        /*llamamos a la función */
        System.out.println(primerletra(arregloPalabras));
    }

    public static List<String> primerletra(String[] arreglo) {
        /*
         * creamos una lista para guardar el
         * primer caracter de cada letra.
         */
        List<String> listaPrimeraLetra = new ArrayList<>();
        /*recorremos el arreglo y guardamos en la lista 
         * el primer caracter de cada palabra
         */
        for (int i = 0; i < arreglo.length; i++) {
            listaPrimeraLetra.add(String.valueOf(arreglo[i].charAt(0)));
        }
        return listaPrimeraLetra;
    }
}

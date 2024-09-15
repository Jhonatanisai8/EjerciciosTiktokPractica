package EjerciciosLogica;
/*EJERCCIO DE LOGICA DE PROGRAMACION:
Hacer un programa que muestre una lista 
de n números enteros entre 'A' u 'B';*/
/*SOLUCION EN JAVA */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ejercicio55ListaNumeros {

    public static void main(String[] args) {

        /* llamamos a la función y le pasamos los parametros */
        int inicio = 3;
        int fin = 23;

        /*función 01 */
        System.out.println(listaNumeros01(inicio, fin));
        System.out.println();
        /*función 02 */
        System.out.println(listaNumeros02(inicio, fin));
    }

    public static List<Integer> listaNumeros01(int inicio, int fin) {
        //creamos  una lista con los números entre a y b (incluyendo a y b)
        List<Integer> listaNumeros = IntStream.rangeClosed(inicio, fin)
                // Convertir de int a Integer
                .boxed()
                .collect(Collectors.toList());
        /*retornamos la lista */
        return listaNumeros;
    }

    public static List<Integer> listaNumeros02(int inicio, int fin) {
        //creamos la lista
        List<Integer> listaNumeros = new ArrayList<>();

        /*con un bucle for, iteramos y guardamos los numeros entre A y B */
        for (int i = inicio; i <= fin; i++) {
            listaNumeros.add(i);
        }

        /*retornamos la lista */
        return listaNumeros;
    }

}

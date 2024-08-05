package EjerciciosLogica;
    /*
     * EJERCICIO:
     * Has una función que dada un arreglo de números,
     * devuelva la suma mas grande de 2 elementos convecutivos;
     */
public class Ejercicio48SumaMasGrande {

    public static void main(String[] args) {
        int listaNumeros[] = { 1, 2, 3, 10, 12, 5, 6, 7, 8, 9, 5, 9 };

        /*llamamos a la función y mostramos el resultado */
        System.out.println(suma(listaNumeros));
    }

    public static int suma(int[] lista) {
        int suma = 0;
        int maximaSuma = 0;
        /*recorremos el arreglo */
        for (int i = 0; i < lista.length - 1; i++) {
            suma = lista[i] + lista[i + 1];
            /*si la suma es mayor a la
             * variable maximaSuma  esta 
             * es toma el valor de suma.
             */
            if (suma > maximaSuma) {
                maximaSuma = suma;
            }
        }

        return maximaSuma;
    }
}

/*
EJERCICIO DE LOGICA DE
PROGRAMACION:

Calcular 
1-2+3-4+5-6+7-8+9-10.....
*/
package EjerciciosLogica;
public class Ejercicio58SumaResta {
    public static void main(String[] args) {
        /*llamamos a la funcion y le pasamos de parametro el numero 51 */
        System.out.println("SUMA: " + sumaResta(51));
    }

    /* funcion el cual se encarga la suma */
    public static int sumaResta(int numero) {

        /* variable auxiliar para ir sumando */
        int suma = 0;
        /* recorremos los numeros hasta 'n'
         * y si es numero par restamos a la variable suma
         * de lo contrario sumamos.*/
        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                suma -= i;
            } else {
                suma += i;
            }
        }
        /* retornamos la variable */
        return suma;
    }
}

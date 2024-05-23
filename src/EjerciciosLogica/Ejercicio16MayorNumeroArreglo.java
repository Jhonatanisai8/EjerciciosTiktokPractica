package EjerciciosLogica;

import java.util.Scanner;
public class Ejercicio16MayorNumeroArreglo {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        int totalElementos = 10, mayor,posicion;
        int arreglo[] = new int[10];

        // medimos los elementos para llenar el arreglo
        for (int i = 0; i < totalElementos; i++) {
            System.out.print("Ingresa un número: ");
            arreglo[i] = leer.nextInt();
        }

        // procedemos a encontrar el numero mayor
        /*
         * Supingamos que el numero mayor esta en la posicion 0
         */
        mayor = arreglo[0];
        posicion = 0;

        //recorremos el arreglo desde la posicion 1
        for (int i = 1; i < totalElementos; i++) {
            //evaluamos
            if (arreglo[i] > mayor) {
                //la variable mayor toma el valor del arreglo en la pos i
                mayor = arreglo[i];
                posicion = i;
            }
        }

        //mostramos los resultados
        System.out.println("Número mayor del arreglo: "+mayor+" en la posición "+posicion);
    }
}

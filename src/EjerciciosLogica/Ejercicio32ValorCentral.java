package EjerciciosLogica;

/*EJERCICIO:
Diseñar un Algoritmo que me permita ingresar 
un valor inicial y luego un valor final,
para luego calcular el valor central de 
dichos números.*/
import java.util.*;
public class Ejercicio32ValorCentral {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        int valorInicial,valorFinal,contador = 0;
        //pedimos los datos
        System.out.print("Ingrese el valor inicial: ");
        valorInicial = leer.nextInt();
        System.out.print("Ingrese el valor final : ");
        valorFinal = leer.nextInt();
        int i = valorInicial;
        /* contamos cuantos números hay entre el
         * valor inicial y valor final*/
        while (i <= valorFinal) {
            i++;
            contador++;
        }

        //le asignamos la cantidad al arreglo
        int arreglo[] = new int[contador];

        /*en el arreglo guardamos todos los numeros que hay
         * entre el valor inicial y final.*/
        int k;
        for (int j = 0; j < arreglo.length; j++) {
            for (k = valorInicial; k <= valorFinal; k++) {
                arreglo[j++] = k;
            }
        }
        // mostramos los numeros(opcional)
        for (int j = 0; j < arreglo.length; j++) {
            System.out.println(arreglo[j]);
        }
        
        //el valor central lo calculamos
        int valorCentral = arreglo.length / 2;

        System.out.println("Valor Inicial: " + valorInicial);
        System.out.println("Valor Final: " + valorFinal);

        /*
         * si el tamaño del arreglo es par tendra 
         * 2 elementos centrales
         */
        if (arreglo.length % 2 == 0) {
            System.out.println("Valores Centrales entre los números " + valorInicial + "-"
                    + valorFinal + " es " + arreglo[valorCentral - 1] + " y " + arreglo[valorCentral]);
        } else {
            System.out.println("Valor central entre los números " + valorInicial + "-"
                    + valorFinal + " es " + arreglo[valorCentral]);
        }
    }
}

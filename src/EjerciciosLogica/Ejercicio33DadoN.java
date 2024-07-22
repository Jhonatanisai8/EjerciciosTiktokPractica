package EjerciciosLogica;

/*EJERCICIO:
 ¿Dado N calcular:(1¹)+(2²)+(3³)+......+(N*N)?
*/
import java.util.Scanner;
import static EjerciciosLogica.codigo.*;

public class Ejercicio33DadoN {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        /* Definimos variables */
        int numero, suma = 0;

        /* Pedimos el número */
        print("Ingrese un número: ");
        numero = leer.nextInt();

        /* Con un bucle for hacemos las iteraciones */
        for (int i = 1; i <= numero; i++) {
            suma += (int) Math.pow(i, i);
        }

        /* Mostramos el resultado */
        println("Resultado : " + suma);
    }

}

/*
 * Algoritmo Ejercicio38DadoN
 * Definir n,suma Como Entero;
 * suma = 0;
 * Escribir "Ingrese un número: ";
 * leer n;
 * 
 * Para i = 1 Hasta n Con Paso 1 Hacer
 * suma = suma + (i^i);
 * Fin Para
 * 
 * Escribir "El resultado es: ",suma;
 * FinAlgoritmo
 */

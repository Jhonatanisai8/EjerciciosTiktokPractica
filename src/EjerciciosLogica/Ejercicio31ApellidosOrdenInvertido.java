package EjerciciosLogica;
/*EJERCICIO:
Hacer un programa que registre 10 apellidos y 
que los muestre en forma inversa al orden con 
el que fueron ingresados.*/
import java.util.*;
public class Ejercicio31ApellidosOrdenInvertido {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {

        // capacidad para nuestro arreglo
        int cantidad = 10;

        /*
         * declaramos el arreglo y le asiganamos
         * la cantidad de posiciones
         */
        String arreglo[] = new String[cantidad];
        // pedimos los datos
        System.out.println("Ingrese los apellidos al arreglo");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print((i + 1) + ". Ingrese un Apellido: ");
            arreglo[i] = leer.next();
        }

        // mostramos el orden invertido
        for (int i = arreglo.length-1; i >= 0; i--) {
            System.out.println((i+1)+". [" + arreglo[i] + "]");
        }
    }
}
/*Algoritmo EjercicioApellidosReversa
	
	DEFINIR cantidad,i Como Entero;
    //cantidad de posiciones para nuestro arreglo
	cantidad = 10;
	
	DIMENSION arregloApellidos[cantidad];
	Para i = 0 Hasta cantidad -1  Con Paso 1 Hacer
		ESCRIBIR (i+1),". Ingrese un apellido: ";
		LEER arregloApellidos[i];
	Fin Para
	
	ESCRIBIR "Orden Invertido";
	//mostramos en orden invertido osea del 9 al 0
	Para j = (cantidad - 1) Hasta 0 Con Paso -1 Hacer
		ESCRIBIR (j+1),". [",arregloApellidos[j],"]";
	Fin Para
	
FinAlgoritmo*/

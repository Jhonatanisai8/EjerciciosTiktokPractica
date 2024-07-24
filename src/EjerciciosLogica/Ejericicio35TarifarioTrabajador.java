package EjerciciosLogica;
/*EJERCICIO:
¿DADA LAS HORAS TRABAJADAS DE 20 PERSONAS Y LA TARIFA DE PAGO 
CALCULAR SU SALARIO?*/

import java.util.Scanner;

public class Ejericicio35TarifarioTrabajador {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        /*variables */
        float salario;
        final float precioHora = 40;
        /*arreglo en donde guardaremos las horas trabajadas */
        int arregloTrabajadores[] = new int[20];

        System.out.println("Programa para calcular el salario de Trabajadores");
        System.out.println("Tarifa por hora: S/." + precioHora);
        
        /*se piden las horas y a la vez les muestra 
         * su sueldo
         */
        for (int i = 0; i < arregloTrabajadores.length; i++) {
            System.out.print("Ingrese las horas trabajadas del trabajador " + (i + 1) + ": ");
            arregloTrabajadores[i] = leer.nextInt();
            salario = arregloTrabajadores[i] * precioHora;
            System.out.println("Salario: S/." + salario);
        }
    }
}
/*Algoritmo ejercicio42SalarioPersona
	//variables
	Definir  salario Como Real;
	definir precioHora Como Entero;
	//precio fijo por hora
	precioHora = 40;
	
	//definimos el arreglo para las horas
	Dimension  arregloHoras[20];
	
	//pedimos las horas y a la vez calculamos el salario
	Para i = 0 Hasta 20-1 Con Paso 1 Hacer
		Escribir  Sin Saltar "Ingrese el salario del Trabajador ",(i+1),": ";
		leer arregloHoras[i];
		salario = arregloHoras[i]*precioHora;
		Escribir "Salario: S/.",salario;
	Fin Para
	
FinAlgoritmo*/

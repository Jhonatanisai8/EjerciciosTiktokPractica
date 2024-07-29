package EjerciciosLogica;
/*EJERCICIO:
Dada dos variables de tipo entero
intercambiar su valor.*/

public class Ejercicio42IntercambiarVariable {
    public static void main(String[] args) {
        int a,b,c;
        a = 12;
        b = 4;

        c = a;
        a = b;
        b = c;

        System.out.println("Nuevo valor de A: "+a);
        System.out.println("Numero valor de B: "+b);
    
        
    }
}
/*
Algoritmo Ejercicio43
	
	//definicion de variables
	Definir  a,b,c Como Entero;
	
	//pedimoslos datos al usuario
	Escribir  "Ingresa el valor de A: ";
	leer a;
	Escribir  "Ingrese el valor de B";
	leer b;
	
	//intercambio de valores
	c = a;
	a = b;
	b = c;
	
	//mostramos su nuevo valor de las variables
	Escribir "Nuevo valor de A: ",a;
	Escribir "Nuevo valor de B: ",b;
FinAlgoritmo*/

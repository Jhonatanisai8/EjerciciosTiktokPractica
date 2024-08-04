package EjerciciosLogica;
/*
 * EJERCICIO: 

DESAROLLAR UNA FUNCION QUE DADO UN NÚMERO ENTERO ESTA 
INVIERTA EL NÚMERO DADO.

Ejemplo: 
EL USUAIO DA EL NÚMERO 123 EL PROGRAMA LE DEBE 
MOSTRAR 321.
 */
public class Ejercicio44InveritrNumero {
    public static void main(String[] args) {
        int numero = 123;

        /* llamamos a la función y mostramos el resultado */
        System.out.println("Numero Invertido: " + invertirNumero(numero));
    }

    public static int invertirNumero(int numero) {
        /* variables necesarias */
        int digitos = 0, i = 0;

        /*
         * en cada iteracion separados los digitos
         * hasta que el numero ya no mayor que 0
         */
        while (numero > 0) {
            digitos = numero % 10;
            numero = numero / 10;
            /*sumamos los digitos */
            i = i * 10 + digitos;
        }

        return i;
    }
}

/*Algoritmo ejercicio46_invertirNumero
	Definir n,i Como Entero;
	Definir d Como Real;
	
	
	n = 123566;
	i = 0;
	
	Mientras n > 0 Hacer
		d = trunc(n % 10);
		n = trunc(n/10);
		i = i * 10 + d;
	Fin Mientras
	
	Escribir  "Resultado: ",i;
	
FinAlgoritmo*/

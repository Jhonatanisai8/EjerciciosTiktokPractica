package EjerciciosLogica;

/*
EJERCICIO:
 * De una lista de 10 números calcular la media y determinar
 * cuantos nÚmeros son mayores que 10.5, cuantos son iguales
 * y cuantos son menores.
*/
import java.util.Scanner;

public class Ejercicio30NumerosIgualesMenoresMayoresA10 {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        // variablesF
        int contadorMayores = 0, contadorMenores = 0, contadorIguales = 0;
        double suma = 0;
        // nuestro arreglo para almacenar los números
        double arregloNumero[] = new double[10];
        final double valor = 10.5;

        System.out.println("=Ingrese números al arreglo=");
        for (int i = 0; i < arregloNumero.length; i++) {
            System.out.print((i + 1) + ". Ingresa un número: ");
            arregloNumero[i] = leer.nextDouble();

            // evaluamos segun las condiciones
            if (arregloNumero[i] > valor) {
                // aumentamos los contadores
                contadorMayores++;
            } else if (arregloNumero[i] < valor) {
                contadorMenores++;
            } else {
                contadorIguales++;
            }
            suma += arregloNumero[i];
        }

        // mostramos la cantidad
        System.out.println("Números mayores a 10.5: " + contadorMayores);
        System.out.println("Números menores a 10.5: " + contadorMenores);
        System.out.println("Números iguales a 10.5: " + contadorIguales);
        // mostramos la media
        System.out.println("Media de la lista: " + (suma / arregloNumero.length));
    }
}
/*
 * Algoritmo Ejercicio35NumerosMenoresIguales
 * 
 * //contadores para las condiciones
 * DEFINIR contMayores,contMenores,contIguales,suma Como Entero;
 * 
 * //nuestro arreglo de 10 números
 * DIMENSION arregloNumeros[10];
 * ESCRIBIR "=INGRESO DE DATOS=";
 * Para i=0 Hasta 10-1 Con Paso 1 Hacer
 * ESCRIBIR (i+1),".INGRESE UN NÚMERO: ";
 * LEER arregloNumeros[i];
 * 
 * //evaluamos el los números segun las condiciones
 * Si arregloNumeros[i] > 10.5 Entonces
 * contMayores = contMayores + 1;
 * SiNo SI (arregloNumeros[i] < 10.5)
 * contMenores = contMenores +1;
 * SiNo
 * contIguales = contIguales + 1;
 * FinSi
 * Fin Si
 * suma = suma + arregloNumeros[i];
 * Fin Para
 * 
 * //mostramos los resultados
 * ESCRIBIR "NÚMEROS MAYORES A 10.5: ",contMayores;
 * ESCRIBIR "NÚMEROS MENORES A 10.5: ",contMenores;
 * ESCRIBIR "NÚMEROS IGUALES A 10.5: ",contIguales;
 * 
 * //calculamos la media y la mostramos
 * ESCRIBIR "LA MEDIA DE LA LISTA ES: ",(suma / 10);
 * 
 * 
 * FinAlgoritmo
 */
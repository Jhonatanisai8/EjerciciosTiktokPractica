package EjerciciosLogica;

/*
EJERCICIO:
 * Dada N notas calcular el promedio de las 
 * notas y el promedio de las notas desaprovadas
*/
import java.util.Scanner;

public class Ejercicio29NotasAprovadasDesaprovadas {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        // variables
        int cantidadNotas, contadorNotasAprovadas = 0, contadorNotasDesaprovadas = 0;
        double promedioNotasAprovadas, promedioNotasDesaprovadas;
        double sumaNotasAprovadas = 0, sumaNotasDesaprovadas = 0;
        double arregloNotas[], nota;
        do {
            // pedimos la cantidad de notas
            System.out.print("Ingrese la cantidad de notas: ");
            cantidadNotas = leer.nextInt();
        } while (cantidadNotas < 0);
        // validamos que la cantidad de notas sea positivo
        if (cantidadNotas < 0) {
            System.out.println("Ingrese un número positivo");
        } else {
            arregloNotas = new double[cantidadNotas];
            // pedimos las notas y las guardamos en un arreglo
            for (int i = 0; i < arregloNotas.length; i++) {
                do {
                    System.out.print((i + 1) + ". Ingrese la Nota: ");
                    nota = leer.nextDouble();
                    // validamos que la nota sea valida
                    if (nota < 0 || nota > 20) {
                        System.out.println("Ingrese una nota entre 0 y 20");
                    } else {
                        arregloNotas[i] = nota;
                        // evaluamos si es nota es aprovatoria o no
                        if (arregloNotas[i] >= 11) {
                            // sumamos para despues sacar el promedio
                            sumaNotasAprovadas += arregloNotas[i];
                            contadorNotasAprovadas++;
                        } else {
                            sumaNotasDesaprovadas += arregloNotas[i];
                            contadorNotasDesaprovadas++;
                        }
                    }
                } while (nota < 0 || nota > 20);
            }
        }
        // calculamos el promedio
        promedioNotasAprovadas = sumaNotasAprovadas / contadorNotasAprovadas;
        promedioNotasDesaprovadas = sumaNotasDesaprovadas / contadorNotasDesaprovadas;
        // mostramos
        System.out.println("Promedio de notas Aprovadas: " + promedioNotasAprovadas);
        System.out.println("Promedio de notas Desaprovadas: " + promedioNotasDesaprovadas);
    }
}
/*
 * Proceso EjercicioNotasAprobadasDesaprobadas
 * Definir cantidadNotas, contadorNotasAprobadas, contadorNotasDesaprobadas Como
 * Entero;
 * Definir promedioNotasAprobadas, promedioNotasDesaprobadas Como Real;
 * Definir sumaNotasAprobadas, sumaNotasDesaprobadas Como Real;
 * Definir arregloNotas Como Real;
 * Definir nota Como Real;
 * 
 * contadorNotasAprobadas <- 0;
 * contadorNotasDesaprobadas <- 0;
 * sumaNotasAprobadas <- 0;
 * sumaNotasDesaprobadas <- 0;
 * 
 * Repetir
 * Escribir "Ingrese la cantidad de notas: ";
 * Leer cantidadNotas;
 * 
 * Si cantidadNotas < 0 Entonces
 * Escribir "Ingrese un número positivo";
 * FinSi;
 * Hasta Que cantidadNotas > 0;
 * 
 * Dimension arregloNotas[cantidadNotas];
 * 
 * Para i <- 0 Hasta cantidadNotas-1 Con Paso 1 Hacer
 * Repetir
 * Escribir (i+1), ". Ingrese la Nota: ";
 * Leer nota;
 * 
 * Si nota < 0 o nota > 20 Entonces
 * Escribir "Ingrese una nota entre 0 y 20";
 * FinSi;
 * Hasta Que nota >= 0 y nota <= 20;
 * 
 * arregloNotas[i] <- nota;
 * 
 * Si nota >= 11 Entonces
 * sumaNotasAprobadas <- sumaNotasAprobadas + nota;
 * contadorNotasAprobadas <- contadorNotasAprobadas + 1;
 * Sino
 * sumaNotasDesaprobadas <- sumaNotasDesaprobadas + nota;
 * contadorNotasDesaprobadas <- contadorNotasDesaprobadas + 1;
 * FinSi;
 * FinPara;
 * 
 * Si contadorNotasAprobadas > 0 Entonces
 * promedioNotasAprobadas <- sumaNotasAprobadas / contadorNotasAprobadas;
 * Sino
 * promedioNotasAprobadas <- 0;
 * FinSi;
 * 
 * Si contadorNotasDesaprobadas > 0 Entonces
 * promedioNotasDesaprobadas <- sumaNotasDesaprobadas /
 * contadorNotasDesaprobadas;
 * Sino
 * promedioNotasDesaprobadas <- 0;
 * FinSi;
 * 
 * Escribir "Promedio de notas Aprobadas: ", promedioNotasAprobadas;
 * Escribir "Promedio de notas Desaprobadas: ", promedioNotasDesaprobadas;
 * FinProceso
 */
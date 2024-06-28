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
        } while (cantidadNotas < 0);

        // calculamos el promedio
        promedioNotasAprovadas = sumaNotasAprovadas / contadorNotasAprovadas;
        promedioNotasDesaprovadas = sumaNotasDesaprovadas / contadorNotasDesaprovadas;

        // mostramos
        System.out.println("Promedio de notas Aprovadas: " + promedioNotasAprovadas);
        System.out.println("Promedio de notas Desaprovadas: " + promedioNotasDesaprovadas);

    }
}

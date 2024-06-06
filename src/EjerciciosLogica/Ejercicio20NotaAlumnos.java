package EjerciciosLogica;

import java.util.Scanner;

public class Ejercicio20NotaAlumnos {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        // variables
        float nota;
        int contadorDesaprovados, contadorAprovados;
        int contadorSuficiente, contadorBien, contadorNotable,
                contadorSobresaliente, alumnos;
        contadorDesaprovados = 0;
        contadorAprovados = 0;
        contadorSuficiente = 0;
        contadorBien = 0;
        contadorNotable = 0;
        contadorSobresaliente = 0;
        alumnos = 1;

        System.out.println("Ingrese las notas de los alumnos (-1 para finalizar) ");
        do {
            System.out.print("Nota del alumno Nº " + alumnos + " : ");
            nota = leer.nextFloat();
            if ((nota > -1 && nota <= 10)) {// validamos que la nota sea valida
                System.out.println("La nota es: " + nota);
                if (nota <= 4) {
                    System.out.println("Alumno con condicion Baja");
                    // aumentamos los contadores de alumnos desaprovados
                    contadorDesaprovados++;
                } else {
                    // aumentamos los contadores de alumnos desaprovados
                    contadorAprovados++;
                    if (nota == 5) {
                        System.out.println("Alumno con condicion Suficiente");
                        contadorSuficiente++;
                    } else if (nota == 6) {
                        System.out.println("Alumno con condicion Bien");
                        contadorBien++;
                    } else if (nota >= 7 && nota <= 8) {
                        System.out.println("Alumno con condicion Notable");
                        contadorNotable++;
                    } else if (nota >= 9 && nota <= 10) {
                        System.out.println("Alumno con condicion Superior");
                        contadorSobresaliente++;
                    }

                }
                // el contador de alumnos solo aumento dentro la condición dada
                alumnos++;
            } else {
                System.out.println("Nota no valida!");
            }
            // salto de linea
            System.out.println();
        } while (nota != -1);

        // mostramos los resultados
        System.out.println("Nº de alumnos aprovados es: " + contadorAprovados);
        System.out.println("Nº de alumnos desaprovados es: " + contadorDesaprovados);
        System.out.println("Nº de alumnos con condición baja: " + contadorDesaprovados);
        System.out.println("Nº de alumnos con condición Suficiente: " + contadorSuficiente);
        System.out.println("Nº de alumnos con condición Bien: " + contadorBien);
        System.out.println("Nº de alumnos con condición  Notable: " + contadorNotable);
        System.out.println("Nº de alumnos con condición Sobresaliente: " + contadorSobresaliente);
    }
}

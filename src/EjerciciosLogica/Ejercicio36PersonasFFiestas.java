package EjerciciosLogica;

/*EJERCICIO:
¿A una fiesta asistieron personas de diferentes edades y sexos.
Construir un algoritmos dadas las edades y sexos de las personas? 
Calcular :
Cuantas personas asistieron a la fiesta
Cuantos hombres y cuantas mujeres
Promedio de edades por sexo
La edad de la persona más joven que asistió
No se permiten menores de edad a la fiesta
Ingresar datos hasta que se ingrese una edad a cero.*/

import java.util.Scanner;
public class Ejercicio36PersonasFFiestas {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        /*variables */
        int edad, cantidadPersonas = 0, cantidadMujeres = 0, cantidadHombres = 0;
        int sumaEdadesHombres = 0, sumaEdadesMujeres = 0, edadMenor = Integer.MAX_VALUE;
        System.out.println("La programacion es arte cuanto más practiques, mejor te vuelves.");
        /*con un bucle pedimos tanto la edad como el género */
        while (true) {
            System.out.print("Ingrese la edad de la persona (0 para terminar): ");
            edad = leer.nextInt();

            if (edad == 0) break;
            /*validamos la edad */
            if (edad < 0) {
                System.out.println("Por favor ingrese un número positivo.");
                continue;
            } else if (edad < 18) {
                System.out.println("No se permiten menores de edad.");
                continue;
            }

            System.out.print("Ingrese el género de la persona (M/F): ");
            char genero = leer.next().toUpperCase().charAt(0);

            if (genero == 'M') {
                cantidadHombres++;
                sumaEdadesHombres += edad;
            } else if (genero == 'F') {
                cantidadMujeres++;
                sumaEdadesMujeres += edad;
            } else {
                System.out.println("Género no válido.");
                continue;
            }
            /*calculamos la edad menor */
            edadMenor = Math.min(edadMenor, edad);
            cantidadPersonas++;
        }
        /*si no hay personas en la fiesta la edad menor pasa a ser 0 */
        if (cantidadPersonas == 0) edadMenor = 0;

        mostrarResultados(cantidadPersonas, cantidadHombres, sumaEdadesHombres,
         cantidadMujeres, sumaEdadesMujeres, edadMenor);
    }

    /*método para calcucular el promedio de edad em ambos géneros */
    public static void mostrarResultados(int cantidadPersonas, int cantidadHombres, int sumaEdadesHombres,
                                         int cantidadMujeres, int sumaEdadesMujeres, int edadMenor) {
        System.out.println("Cantidad total: " + cantidadPersonas);
        System.out.println("La edad de la persona más joven es: " + edadMenor);

        if (cantidadHombres > 0) {
            System.out.println("La edad promedio en Hombres es: "
             + (float) sumaEdadesHombres / cantidadHombres + " años.");
        } else {
            System.out.println("No han asistido hombres a la fiesta.");
        }

        if (cantidadMujeres > 0) {
            System.out.println("La edad promedio en Mujeres es: " 
            + (float) sumaEdadesMujeres / cantidadMujeres + " años.");
        } else {
            System.out.println("No han asistido mujeres a la fiesta.");
        }

        System.out.println("Cantidad de hombres: " + cantidadHombres);
        System.out.println("Cantidad de mujeres: " + cantidadMujeres);
    }
}

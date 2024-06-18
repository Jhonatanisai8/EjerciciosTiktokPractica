package EjerciciosLogica;

import java.util.Scanner;

public class Ejercicio24NumerosDecrecienteCreciente {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        // variables
        int numero1, numero2;
        String opcion;
        do {
            // petición de datos
            System.out.print("Ingrese un número: ");
            numero1 = leer.nextInt();
            System.out.print("Ingrese un número: ");
            numero2 = leer.nextInt();

            // evaluamos si estan el forma creciente o decreciente
            if (numero1 > numero2) {
                System.out.println("Los números están en forma decreciente");
            } else {
                System.out.println("Los números están en forma creciente");
            }

            // preguntamos al usuario si desea continuar
            System.out.print("¿Desea continuar y/n?");
            opcion = leer.next();

            // el proceso se repetira mientras la opción sea diferente de n
        } while (!opcion.equalsIgnoreCase("n"));

    }

}

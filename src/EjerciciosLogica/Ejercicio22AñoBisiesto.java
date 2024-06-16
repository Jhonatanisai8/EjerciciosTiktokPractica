package EjerciciosLogica;

import java.util.Scanner;

public class Ejercicio22AñoBisiesto {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int año;

        do {
            System.out.print("Ingrese un año: ");
            año = leer.nextInt();
            if (año != 0) {
                if ((año % 400 == 0) || ((año % 4 == 0) && !(año % 100 == 0))) {
                    System.out.println("El año " + año + " es bisisto");
                } else {
                    System.out.println("El año " + año + " no es bisisto");
                }
            } else {
                System.out.println("Gracias por participar");
            }
        } while (año != 0);

    }
}

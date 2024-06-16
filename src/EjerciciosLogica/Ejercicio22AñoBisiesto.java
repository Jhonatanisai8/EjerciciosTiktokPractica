package EjerciciosLogica;

import java.util.Scanner;
public class Ejercicio22AñoBisiesto {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int año;

        //con un ciclo do-while se iran pidiendo los años
        do {
            System.out.print("Ingrese un año: ");
            año = leer.nextInt();
            //si el año es diferente de 0 se ejecuta la verificacion
            if (año != 0) {
                //verificamos que el año sea bisiesto 
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
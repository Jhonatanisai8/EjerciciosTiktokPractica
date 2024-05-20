package EjerciciosLogica;

import java.util.Scanner;

public class Ejercicio08Multiplosde2y3 {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        //definimos la variable
        int numero;
        
        //pedimos el número
        System.out.print("Ingresa un número: ");
        numero = leer.nextInt();

        //evaluamos mediante condiones
        if (((numero % 2) == 0) && ((numero % 3) == 0)) {
            System.out.println("El número " + numero + " es multiplo de 2 y 3.");
        } else {
            System.out.println("El número " + numero + " no es multiplo de 2 y 3.");
        }
    }
}

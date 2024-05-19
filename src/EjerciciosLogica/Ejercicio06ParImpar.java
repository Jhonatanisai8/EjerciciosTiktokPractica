package EjerciciosLogica;

import java.util.Scanner;

public class Ejercicio06ParImpar {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        //definimos variables
        int numero;

        //pedimos el número
        System.out.print("Ingresa un número: ");
        numero = leer.nextInt();

        /*hacemos uso de condicionales para ver 
        si el número es par o impar.*/
        if ((numero % 2) == 0) {
            System.out.println("El número " + numero + " es Par");
        } else {
            System.out.println("El número " + numero + " es Impar");
        }
    }
}

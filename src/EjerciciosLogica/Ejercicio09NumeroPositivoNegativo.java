package EjerciciosLogica;

import java.util.Scanner;

public class Ejercicio09NumeroPositivoNegativo {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        //definimos nuestra variable
        int numero;

        //pedimos el número a evaluar
        System.out.print("Ingresa el número a evaluar: ");
        numero = leer.nextInt();

        //evaluamos mediante condicionales
        if (numero < 0) {
            System.out.println("El número " + numero + " es negativo");
        } else {
            System.out.println("El número " + numero + " es positivo");
        }
    }
}

package EjerciciosLogica;

import java.util.Scanner;

public class Ejercicio07TablaMultiplicar {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        
        //nuestra variables
        int numero;
        
        //pedimos el número
        System.out.print("Ingresa un número: ");
        numero = leer.nextInt();

        //hacemos las multiplicaciones con un ciclo for
        for (int i = 0; i <= 12; i++) {
            System.out.println(numero+" X "+i+" = "+(numero * i));
        }
    }
}

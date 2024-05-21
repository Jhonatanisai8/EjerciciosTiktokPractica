package EjerciciosLogica;

import java.util.Scanner;
public class Ejercicio13Calculadora {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        double n1, n2, suma, resta, multiplicacion, division;
        int opcion;
        System.out.print("Ingresa el primer número: ");
        n1 = leer.nextDouble();
        System.out.print("Ingresa el segundo númro: ");
        n2 = leer.nextDouble();
        System.out.println("Opciones: " +
                "\n1. Sumar" +
                "\n2. Restar" +
                "\n3. Multiplicar" +
                "\n4. Dividir");
        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                suma = n1 + n2;
                System.out.println("Suma entre " + n1 + "+" + n2 + " es: " + suma);
                break;
            case 2:
                resta = n1 - n2;
                System.out.println("Resta entre " + n1 + "-" + n2 + " es: " + resta);
                break;
            case 3:
                multiplicacion = n1 * n2;
                System.out.println("Multiplicación entre " + n1 + "*" + n2 + " es: " + multiplicacion);
                break;
            case 4:

                if (n2 == 0) {
                    System.out.println("Error el divisor no puede ser 0");
                } else {
                    division = n1 / n2;
                    System.out.println("División entre " + n1 + "/" + n2 + " es: " + division);
                }
                break;
            default:
                System.out.println("Ingrese una opcion valida.");
                break;
        }
    }
}

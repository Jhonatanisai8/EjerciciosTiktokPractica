package EjerciciosLogica;

/*EJERCICIO:
 * Diseñar un algoritmo que permita ingresar cualquier 
 * número mayor que cero y menor que diez, y luego el 
 * algoritmo deberá calcular los múltiplos menores que 
 * 100 del número ingresado.*/
import java.util.Scanner;

public class Ejercicio27MultiplosDeUnNumero {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int numero;

        do {
            System.out.print("Ingrese un numero: ");
            numero = leer.nextInt();
            if (numero > 0 && numero < 10) {
                for (int i = 1; i <= 100; i++) {
                    if (i % numero == 0) {
                        System.out.println("Multiplo: " + i);
                    }
                }
            } else {
                System.out.println("Ingrese un número mayor que o y menor que 10");
            }
        } while (numero > 0 || numero < 10);
    }
}

package EjerciciosLogica;

import java.util.Scanner;

public class Ejercicio03DivicionesSucesivas {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        /*
         * Ejercicio:
         * Hacer un algoritmo que permita leer dos números N1,N2 y
         * divida N1/N2 sin usar uso del "/"
         */

        // definimos las variables
        int n1, n2, cociente, residuo;

        // pedimos ambos numeros
        System.out.print("Ingrese el primer número: ");
        n1 = leer.nextInt();
        System.out.print("Ingrese el segundo número: ");
        n2 = leer.nextInt();

        System.out.println(n1 + " / " + n2);

        cociente = 0;
        residuo = 0;

        //calculamos el cociente y el residuo
        while (n1 >= n2) {
            cociente++;
            residuo = n1 - n2;
            n1 = n1 - n2;
        }

        // imprimimos los resultados
        System.out.println("Cociente: " + cociente);
        System.out.println("Residuo: " + residuo);

    }
}

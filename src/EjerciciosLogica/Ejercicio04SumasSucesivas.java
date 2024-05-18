package EjerciciosLogica;

import java.util.Scanner;

public class Ejercicio04SumasSucesivas {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
   
        int n1, n2, producto;

        //pedimos los datos
        System.out.print("Ingrese el primer número: ");
        n1 = leer.nextInt();
        System.out.print("Ingresa el segundo número: ");
        n2 = leer.nextInt();
        System.out.println(n1 + "x" + n2);

        //procedemos a sacar el producto de ambos números
        producto = 0;
        int i = 0;
        while (i < n2) {
            producto += n1;
            i++;
        }

        //mostramos los resultados
        System.out.println("TOTAL: " + producto);
    }
}

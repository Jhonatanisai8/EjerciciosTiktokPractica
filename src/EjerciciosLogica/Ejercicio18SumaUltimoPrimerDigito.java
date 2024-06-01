package EjerciciosLogica;

import java.util.Scanner;
public class Ejercicio18SumaUltimoPrimerDigito {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        
        // definimos nuestras variables
        int numero, ultimoDigito, primerDigito, sumaDigitos;

        /* con un ciclo do while iremos pidiendo el números y a la ves
         * mostrando la suma de su primera y última cifra.*/
        do {
            System.out.print("Ingrese un número de cuatro cifras: ");
            numero = leer.nextInt();

            /*Evaluamos que sea de 4 cifras y diferente de 0*/
            if ((numero < 9999) && (numero > 999)&& (numero != 0)) {
                // sacamos el primer digito
                primerDigito = (numero / 1000);
                ultimoDigito = (numero % 10);
                sumaDigitos = ultimoDigito + primerDigito;
                System.out.println("Primer digito: " + primerDigito);
                System.out.println("Última cifra: " + ultimoDigito);
                System.out.println("Suma de la primera y útima cifra es: " + sumaDigitos);
            } 
            /*el proceso se repetira mientras el número ingresado sea diferente de cero
             * cuando sea 0 finaliza.*/
        } while ((numero != 0));
    }
}

package EjerciciosLogica;

import java.util.Scanner;

public class Ejericicio15SerirFibonaci {
    static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        long i,n1,n2,n3;

        //limite de 30 números
        long limite = 30;
        n1 = 0;
        n2 = 1;

        /*mediante un ciclo for imprimimos los
         30 primeros números de la serie de fibonaci
        */
        for (  i = 1;  i <= limite ;  i++) {
            System.out.println(i+": "+n1);
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}




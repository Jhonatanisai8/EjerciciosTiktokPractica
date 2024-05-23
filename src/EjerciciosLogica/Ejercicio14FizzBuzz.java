package EjerciciosLogica;

import java.util.*;
public class Ejercicio14FizzBuzz {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int i;

        for (i = 1; i <= 100; i++) {
            // multiplos de 3 y 5 imprimimos FizzBuzz
            if (((i % 3) == 0) && ((i % 5) == 0)) {
                System.out.println(i + ": FizzBuzz");
            } 
            // multiplos de 3 imprimimos Fizz
            else if ((i % 3) == 0) {
                System.out.println(i + ": Fizz");
            } 
            // multiplos de 5 imprimimos Buzz
            else if ((i % 5) == 0) {
                System.out.println(i + ": Buzz");
            }
        }
    }
}

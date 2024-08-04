package EjerciciosLogica;
/*EJERCICIO:
Un número a es factor Por Digito de b si todos los digitos de a son divisores de b.
Ejemplo:
123 es factor por digito de 6.
Hcaer un funcion que reciba son números enteros y devuelva TRUE en caso
de que el primero sea factor digito del segundo y FALSE en caso contrario.*/

public class Ejercicio45FactorDigito {
    public static void main(String[] args) {
        int a = 1423;
        int b = 6;
        System.out.println(esFactor(a, b));
    }

    public static boolean esFactor(int n, int b) {
        /* convertimos a String el número */
        String numero = String.valueOf(n);

        /* convertimos el número a un arreglo */
        char arreglo[] = numero.toCharArray();
        int d;

        /*
         * recorremos el arreglo y verificamos
         * si los digitos del número son
         * divisores de b
         */
        for (int i = 0; i < arreglo.length; i++) {
            d = Integer.parseInt(String.valueOf(arreglo[i]));
            if (b % d != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean esFactor2(int a, int b) {
        int digitos;

        /* hasta que el numero sea menor que 0 */
        while (a > 0) {
            digitos = a % 10;
            a = a / 10;
            /*
             * verificamos digito por digito y verifimos
             * si es divisible
             */
            if (b % digitos != 0) {
                return false;
            }
        }

        return true;
    }

}

package EjerciciosLogica;

/*EJERCICIO DE PROGRAMACION:
Crea un juego donde la computadora genera un
número aleatorio entre 1 y 100, y el usuario
debe adivinarlo. El programa da pistas si 
el número es mayor o menor hasta que el 
usuario acierte.*/

import java.util.Scanner;
public class Ejercicio61 {
    static final Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {

        /*VARIABLES */
        int numeroDado;
        String resultado;
        /*NUMERO ALEATORIO*/
        final int numeroAleatorio = numeroAleatorio(100);
        System.out.println("juego de la adivinar un número".toUpperCase());

        /*LA COMPUTADORA PIDE EL NUMERO MIENTRAS QUE LA FRASE DE LA FUNCION
         NO SEA IGUAL A LA ESTABLECIDA*/
        do {
            /*PEDIMOS EL NUMERO AL USUARIO*/
            System.out.print("Ingresa el número: ");
            numeroDado = leer.nextInt();
            resultado = adivinarNumero(numeroDado, numeroAleatorio);
            /*MOSTRAMOS LAS PISTAS */
            System.out.println(resultado.toUpperCase());
        } while (!resultado.equalsIgnoreCase("Felicidades has adivinado el numero"));

    }

    /* FUNCION PARA GENERAR EL NUMERO ALEATORIO ENTRE 1 Y 100*/
    public static int numeroAleatorio(int limite) {
        return (int) ((Math.random() * 100) + 1);
    }

    /*FUNCION QUE SE ENCARGA DE MOSTRAR LAS PISTAS O SI EL 
     USUARIO ADIVINO EL NUMERO.*/
    public static String adivinarNumero(int numeroDado, int numeroAleatorio) {
        String mensaje = "";
        if (numeroAleatorio < numeroDado) {
            mensaje = "El número ingresado debe ser menor ";
        } else if (numeroAleatorio > numeroDado) {
            mensaje = "El número ingresado debe ser mayor ";
        } else {
            mensaje = "Felicidades has adivinado el numero";
        }
        return mensaje;
    }

}
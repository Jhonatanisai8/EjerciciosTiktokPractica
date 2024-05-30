package EjerciciosLogica;

import java.util.Scanner;
public class Ejercicicio17PedirContrasenia {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        // definimos las variables
        int intentos = 3;
        
        final String contrasenia = "admin123";
        String contr;
        // con un ciclo do while pedimos la contraseña
        do {
            System.out.print("Ingresa la contraseña por favor: ");
            contr = leer.next();
            /*
             * cada ves que la contraseña sea diferente
             * se resta un intento
             */
            if (!contr.equals(contrasenia) ) {
                intentos = intentos - 1;
            } else {
                System.out.println("En hora buena!");
            }
        } while ((!contr.equals(contrasenia)) && (intentos != 0));
    }
}

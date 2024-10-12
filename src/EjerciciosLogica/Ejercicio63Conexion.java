package EjerciciosLogica;

import java.util.concurrent.TimeUnit;

/**
 * Ejercicio63Conexion
 */
public class Ejercicio63Conexion {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println("Error de conexión....");
            TimeUnit.MILLISECONDS.sleep(1000);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Conectando...........");
            TimeUnit.SECONDS.sleep(1);
        }

        System.out.println("Conexion Exitosa............");
        System.out.println("Presiones una tecla para continuar............".toUpperCase());

    }
}
/*EJERCICIO DE LOGICA DE PROGRAMACION:
Katy organiza un fiesta en la cual 
una computadora controla el ingreso mediante 
5 claves. Si se ingresa al menos una clave
incorrecta esta imprimira
"TE EQUIVOCASTE DE FIESTA" y no permitira el ingreso.
Si las 5 claves son correctas imprimira
"BIENVENIDO A LA FIESTA":
Las claves con:
1. "TIENES"
2. "QUE SER"
3. "INVITADO"
4. "PARA"
5. "INGRESAR"
*/
package EjerciciosLogica;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio57Fiesta {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(validarEntrada());
    }

    public static String validarEntrada() {
        String clave;
        boolean validado = true;
        List<String> listaClave = Arrays.asList(
                "TIENES",
                "QUE SER",
                "INVITADO",
                "PARA",
                "INGRESAR");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingrese la clave " + i + " : ");
            clave = leer.nextLine();
            if (!listaClave.contains(clave)) {
                validado = false;
                break;
            }
        }

        if (validado) {
            return "BIENVENIDO A LA FIESTA";
        } else {
            return "TE EQUIVOCASTE DE FIESTA";
        }
    }

}

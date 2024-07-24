package EjerciciosLogica;

EJERCICIO: ¿Dado el monto de una compra calcular el descuento y mostrar el monto final
a pagar considerado:
descuento es 10% si el monto es mayor a 100 soles
descuento es 20% si el monto es mayor a 50 soles y menor o igual a 100 soles
no hay descuento si el monto es menor o igual a 50 soles.

import java.util.Scanner;

public class Ejercicio35DescuentoCompra {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        /* Variables */
        double montoCompra, descuento = 0;

        /* Pedimos el monto de la compra */
        System.out.print("Ingre el monto de la compra: ");
        montoCompra = leer.nextDouble();

        /* Evaluamos según las condiciones planteadas */
        if (montoCompra > 100) {
            descuento = (montoCompra * 0.10d);
        } else if (montoCompra > 50 && montoCompra <= 100) {
            descuento = (montoCompra * 0.20d);
        }

        /* Mostramos si hay descuento o no */
        if (descuento > 0) {
            System.out.println("Su descuento es: S/." + descuento);
        } else {
            System.out.println("No hay descuento");
        }

        /* Mostramos el monto final */
        System.out.println("Monto final a Pagar: " + (montoCompra - descuento));
    }
}

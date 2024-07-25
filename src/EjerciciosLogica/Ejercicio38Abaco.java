package EjerciciosLogica;

import java.text.NumberFormat;

/*
 * Crea una función que sea capaz de leer el número representado por el ábaco.
 * - El ábaco se representa por un array con 7 elementos.
 * - Cada elemento tendrá 9 "O" (aunque habitualmente tiene 10 para realizar
 *   operaciones) para las cuentas y una secuencia de "---" para el alambre.
 * - El primer elemento del array representa los millones, y el último las unidades.
 * - El número en cada elemento se representa por las cuentas que están a
 *   la izquierda del alambre.
 *
 * Ejemplo de array y resultado:
 * ["O---OOOOOOOO",
 "OOO---OOOOOO",
 "---OOOOOOOOO",
 "OO---OOOOOOO",
 "OOOOOOO---OO",
 "OOOOOOOOO---",
 "---OOOOOOOOO"]
 *
 *  Resultado: 1.302.790
 */
public class Ejercicio38Abaco {
    public static void main(String[] args) {
        String[] abaco = { "O---OOOOOOOO",
                "OOO---OOOOOO",
                "---OOOOOOOOO",
                "OO---OOOOOOO",
                "OOOOOOO---OO",
                "OOOOOOOOO---",
                "---OOOOOOOOO" };
        System.out.println(adivinarNumero(abaco));
    }

    public static String adivinarNumero(String arregloAbaco[]) {
        StringBuilder builder = new StringBuilder();
        for (String string : arregloAbaco) {
            builder.append(string.split("---")[0].length());
        }

        NumberFormat format = NumberFormat.getInstance();

        return format.format(Long.valueOf(builder.toString()));
    }

}

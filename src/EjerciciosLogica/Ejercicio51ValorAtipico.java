package EjerciciosLogica;

public class Ejercicio51ValorAtipico {
    public static void main(String[] args) {
        /* definimos la matriz en este caso de 3 filas por 4 columnas */
        int arregloa[] = { 2, 4, 0, 100, 4, 11, 2602, 36 };
        int arreglob[] = { 160, 3, 1719, 19, 11, 13, -21 };
        int valorAtipicoA = valorAtipicoB(arregloa);
        int valorAtipicoB = valorAtipicoB(arreglob);

        System.out.println("Valores atipicos de cada lista");
        System.out.println(" { 160, 3, 1719, 19, 11, 13, -21 } => " + valorAtipicoA);
        System.out.println(" { 160, 3, 1719, 19, 11, 13, -21 } =>" + valorAtipicoB);
    }

    public static int valorAtipicoB(int lista[]) {
        // Inicializar contadores para números pares e impares
        int contadora = 0;
        int contadorB = 0;

        // Contar cuántos números pares e impares hay en la lista
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 2 == 0) {
                // Incrementar el contador de pares
                contadora++;
            } else {
                // Incrementar el contador de impares
                contadorB++;
            }
        }

        // Determinar el tipo de número menos común y encontrar el valor atípico en un
        // solo bucle
        // Si hay menos o igual número de pares, buscar un par
        boolean buscarPar = contadora <= contadorB;
        for (int i = 0; i < lista.length; i++) {
            if ((buscarPar && lista[i] % 2 == 0) || (!buscarPar && lista[i] % 2 != 0)) {
                return lista[i]; // Devolver el valor atípico encontrado
            }
        }

        // Este punto nunca debería alcanzarse si la lista contiene al menos un número
        return -1;
    }

    public static int valorAtipicoA(int lista[]) {
        // Inicializar contadores para números pares e impares
        int contadora = 0;
        int contadorB = 0;
        int valorAtipico = 0;

        // Contar cuántos números pares e impares hay en la lista
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 2 == 0) {
                // Incrementar el contador de pares
                contadora++;
            } else {
                // Incrementar el contador de impares
                contadorB++;
            }
        }

        // Determinar qué tipo de número (par o impar) es el menos común (valor atípico)
        if (contadora > contadorB) {
            // Si hay más números pares, buscar el primer número impar (valor atípico)
            for (int i = 0; i < lista.length; i++) {
                if (lista[i] % 2 != 0) {
                    // Encontrar el valor atípico
                    valorAtipico = lista[i];
                    break; // Salir del bucle una vez encontrado
                }
            }
        } else {
            // Si hay más números impares o iguales, buscar el primer número par (valor
            // atípico)
            for (int i = 0; i < lista.length; i++) {
                if (lista[i] % 2 == 0) {
                    // Encontrar el valor atípico
                    valorAtipico = lista[i];
                    break; // Salir del bucle una vez encontrado
                }
            }
        }

        // Devolver el valor atípico encontrado
        return valorAtipico;
    }

    public static int valorAtipico(int lista[]) {
        int contadora = 0;
        int contadorB = 0;
        int valorAtipico = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 2 == 0) {
                contadora++;
            } else {
                contadorB++;
            }
        }

        if (contadora > contadorB) {
            for (int i = 0; i < lista.length; i++) {
                if (lista[i] % 2 != 0) {
                    valorAtipico = lista[i];
                }
            }
        } else {
            for (int i = 0; i < lista.length; i++) {
                if (lista[i] % 2 == 0) {
                    valorAtipico = lista[i];
                }
            }
        }
        return valorAtipico;
    }
}

/*
 * RETO DE PROGRAMACIÓN;
 * Se le proporciona un array (que tendrá una longitud de al menos 3,
 * pero podría ser muy grande) que contiene números enteros. El array
 * está compuesta en su totalidad por números enteros impares o en su
 * totalidad por números enteros pares, excepto un único número entero N.
 * Escriba un método que tome la matriz como argumento y devuelva
 * este "valor atípico" N.
 * 
 * Ejemplos
 * [2, 4, 0, 100, 4, 11, 2602, 36] --> 11 (unico valor impar)
 * 
 * [160, 3, 1719, 19, 11, 13, -21] --> 160 (unico valor par)
 */

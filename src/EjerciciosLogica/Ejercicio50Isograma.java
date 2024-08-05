package EjerciciosLogica;

/*RETO DE PROGRAMACIÓN:
Un isograma es una palabra que no tiene letras repetidas, consecutivas o no 
consecutivas. Implemente una función que determine si una cadena que contiene 
solo letras es un isograma. Suponga que la cadena vacía es un isograma. Ignore
las mayúsculas y minúsculas.

Ejemplo: (Entrada --> Salida)

"Dermatoglyphics" --> true
"aba" --> false
"moOse" --> false (ignore letter case) */
public class Ejercicio50Isograma {
    public static void main(String[] args) {
        String a = "Dermatoglyphics";
        String b = "aba";
        String c = "moOse";
        /*llamamos a la función y comprobamos */
        System.out.println(a + " => " + esIsograma(a));
        System.out.println(b + " => " + esIsograma(b));
        System.out.println(c + " => " + esIsograma(c));
    }

    public static boolean esIsograma(String palabra) {
        // Convertimos la palabra a minúsculas para evitar errores de comparación
        palabra = palabra.toLowerCase();
        char[] palabraA = palabra.toCharArray();
        for (int i = 0; i < palabraA.length; i++) {
            for (int j = i + 1; j < palabraA.length; j++) {
                if (palabraA[i] == palabraA[j]) {
                    // Si encontramos dos letras iguales, no es un isograma
                    return false;
                }
            }
        }
        // Si no encontramos letras repetidas, es un isograma
        return true;
    }
}

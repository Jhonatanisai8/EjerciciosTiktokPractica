package EjerciciosLogica;

import java.util.Arrays;
import java.util.List;

public class Ejercicio56EliminarVocales {
    public static void main(String[] args) {
        eliminarVocales("la vida es bella.");
    }

    public static void eliminarVocales(String cadena) {
        // Convertir la cadena a un arreglo de caracteres
        Character[] charArray = new Character[cadena.length()];
        for (int i = 0; i < cadena.length(); i++) {
            charArray[i] = cadena.charAt(i); // Convertir cada char en un Character
        }
        
        // Convertir el arreglo de Character a una lista
        List<Character> charList = Arrays.asList(charArray);
        
        // Imprimir la lista para verificar
        System.out.println(charList);
    }
}

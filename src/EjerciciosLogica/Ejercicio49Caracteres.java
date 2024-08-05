package EjerciciosLogica;
public class Ejercicio49Caracteres {

    /*Ejercicio:
    Hacer una función que devuelva cuantas veces aparece
    una letra en una cadena de caracteres.*/
    public static void main(String[] args) {
        /*llamamos a la función */
        System.out.println(cantidadCaracteres("Hola que tal aa", 'a'));
    }

    public static int cantidadCaracteres(String palabra,char letra){
        /*convertimos la palabra en un arreglo
         y luegp comparamos cada caracter del arreglo
         con la letra dada tambien por parametro.
         */
        char cadena[] =palabra.toCharArray();
        int cantidad = 0;
        for (char c : cadena) {
            String a = String.valueOf(c);
            /*si son iguales aumentamos el contador */
            if (a.equals(String.valueOf(letra))) {
                cantidad++;
            }
        }return cantidad;
    }
}

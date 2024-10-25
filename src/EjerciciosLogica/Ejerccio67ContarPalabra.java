package EjerciciosLogica;


public class Ejerccio67ContarPalabra {
    public static void main(String[] args) {
        String frase = "JAVA ES HERMOSO Y PRECIOSO";
        char letra = 'o';
        System.out.println("LA CANTIDAD DE VECES QUE APARECE LA LETRA " + letra
                + " EN LA FRASE ES DE: " + contarLetra(frase, letra) + " VECES.");
    }

    public static int contarLetra(String frase, char letra) {
        int cantidad = 0;

        /* RECORREMOS LA FRASE CON UN CICLO FOR */
        for (int i = 0; i < frase.length(); i++) {
            /*
             * CONVERTIMOS A STRING EL CARACTER Y LO COMPARAMOS
             * CARACTER POR CARACTER DE LA FRASE
             */
            if (String.valueOf(letra).equalsIgnoreCase(String.valueOf(frase.charAt(i)))) {

                /* SUMAMOS AL CONTADOR */
                cantidad++;
            }
        }

        /* RETORNAMOS LA CANTIDAD */
        return cantidad;
    }
}

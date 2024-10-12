package EjerciciosLogica;

public class Ejercicio62Ultimas4Letras {
    public static void main(String[] args) {
        String numeroTarjeta = "4556364607935616";
        String caracteres = numeroTarjeta.subSequence(0, 4).toString();
        System.out.println(caracteres);
        System.out.println("cantidad de caracteres: " + numeroTarjeta.length());

        char arreglo[] = numeroTarjeta.toCharArray();
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }

    }

}

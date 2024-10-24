package EjerciciosLogica;

/*EJERCICIO DE LOGICA DE PROGRAMACION:
CREAR UN MATRIZ BIDIMENCIONAL, 
Y SUMAR LA DIAGONAL;*/

public class Ejercicio66SumarDiagonalMatriz {
    public static void main(String[] args) {
        /* definimos la matriz en este caso de 3 filas por 3 columnas */
        int numerosMatriz[][] = {
                { 12, 33, 44 },
                { 12, 15, 45 },
                { 23, 34, 10 } };
        /* llamamos ala funcion y le pasamos la matriz como parametro */
        System.out.println("SUMA DE LA DIAGONAL ES: " + sumarDiagonal(numerosMatriz));
    }

    public static int sumarDiagonal(int numerosMatriz[][]) {
        /* recorremos la matriz y sumamos la diagonal */
        int sumaDiagonal = 0;
        for (int i = 0; i < numerosMatriz.length; i++) {
            for (int j = 0; j < numerosMatriz[i].length; j++) {
                if (numerosMatriz[i] == numerosMatriz[j]) {
                    sumaDiagonal += numerosMatriz[i][j];
                }
            }
        }
        // retornamos la suma
        return sumaDiagonal;
    }
}

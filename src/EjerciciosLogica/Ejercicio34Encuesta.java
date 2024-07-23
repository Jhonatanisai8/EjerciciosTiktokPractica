package EjerciciosLogica;

/*EJERCICIO:
En una encuesta cuyas alternativas son "si" y "no"
participaron 30 personas. Se quiere saber cuantas 
personas votaron por la primera opción.
*/
public class Ejercicio34Encuesta {
    public static void main(String[] args) {
        int contadorSI = 0;
        /*
         * Arreglo en donde estan los votos de las 30 personas
         * TRUE hara de SI.
         * FALSE hara de NO
         */

        boolean arregoVotos[] = {
                true, true, true, true, false, true,
                false, true, false, true, false, false,
                true, false, false, true, false, false,
                false, false, true, true, false, true,
                true, false, true, false, false, false, };

        /*
         * recorremos el arreglo y contamos
         * las personas que votaron por SI
         */
        for (boolean b : arregoVotos) {
            if (b == true) {
                contadorSI++;
            }
        }
        System.out.println("Cantidad de personas que votaron " +
                "\npor la  Opcion 'SI'  = " + contadorSI);
    }
}

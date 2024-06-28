package EjerciciosLogica;

/*
  EJERCICIO:
  Mostrar las 10 primeras potencias de 3
  y la suma de ellos.
 */
public class Ejercicio26Potenciade3 {
    public static void main(String[] args) {
        int suma = 0;
        double potencia;
        for (int i = 1; i <= 10; i++) {
            potencia = Math.pow(3, i);
            System.out.println("3^"+i+" = " +potencia);
            suma += potencia;
                        suma += potencia;

        }
        System.out.println("Suma: " + suma);
    }
}

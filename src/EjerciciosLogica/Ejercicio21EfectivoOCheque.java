package EjerciciosLogica;

import java.util.Scanner;

public class Ejercicio21EfectivoOCheque {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        String nombre;
        float saldoInicial;
        int opcion;
        int contadorEfectivos, contadorCheque;
        contadorCheque = 0;
        contadorEfectivos = 0;
        float cantidadIngresada;
        float retiroMaximoRetirado = 0;
        float retiroMininoDepositado = 0;
        float cantidadRetiro;
        float sumaRetiros = 0;
        float promedioRetiros;
        int contadorRetiros = 0;
        int opcionN2;

        String mensaje = "\t====Opciones====" +
                "\n\t1. Deposito" +
                "\n\t2. Retiro " +
                "\n\t3. Fin" +
                "\n\t4. Salir";
        String mensaje2 = "\t==Opciones==" +
                "\n\t1. Efectivo" +
                "\n\t2. Cheque.";
        System.out.print("Ingrese su nombre: ");
        nombre = leer.nextLine();
        System.out.print("Hola! " + nombre + " Ingrese su saldo inicial por favor: S/.");
        saldoInicial = leer.nextFloat();
        do {
            System.out.println(mensaje);
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:// deposito
                    System.out.println(mensaje2);
                    opcionN2 = leer.nextInt();
                    System.out.print("Ingrese la cantidad a Ingresar a su saldo Inicial: ");
                    cantidadIngresada = leer.nextFloat();
                    if (opcionN2 == 1) {
                        saldoInicial += cantidadIngresada;
                        System.out.println("Saldo actualizado: S/." + saldoInicial);
                        contadorEfectivos++;
                    } else {
                        float comision01;
                        // descuento del 1% de la cantidad ingresada
                        comision01 = cantidadIngresada * 0.01f;
                        saldoInicial = saldoInicial + cantidadIngresada - comision01;
                        System.out.println("Saldo actualizado: S/." + saldoInicial);
                        contadorCheque++;
                    }
                    retiroMininoDepositado = saldoInicial;
                    if (retiroMininoDepositado > cantidadIngresada) {
                        retiroMininoDepositado = cantidadIngresada;
                    }
                    break;
                case 2:// retiro
                    System.out.println("Sueldo actual: S/:" + saldoInicial);
                    System.out.print("Ingrese la cantidad a Retirar: S/. ");
                    cantidadRetiro = leer.nextFloat();
                    if (cantidadRetiro >= saldoInicial) {
                        System.out.println("Lo sentimos solo puede Retirar: S/." + saldoInicial);
                    } else {
                        saldoInicial -= cantidadRetiro;
                        System.out.println("Saldo actualizado: S/." + saldoInicial);
                    }
                    sumaRetiros += cantidadRetiro;
                    contadorRetiros++;
                    retiroMaximoRetirado = saldoInicial;

                    if (retiroMaximoRetirado > cantidadRetiro) {
                        retiroMaximoRetirado = cantidadRetiro;
                    }
                    break;
                case 3:
                    // procedemos a sacar el promedio de retiros
                    promedioRetiros = sumaRetiros / contadorRetiros;
                    String mensajeUltimo = "\n\tDATOS: " +
                            "\n\tNombre: " + nombre +
                            "\n\tSaldo: S/." + saldoInicial +
                            "\n\tNº de depósitos en Efectivo: " + contadorEfectivos +
                            "\n\tNº de depósitos con Cheque: " + contadorCheque +
                            "\n\tMonto promedio de retiros: " + promedioRetiros +
                            "\n\tMonto Màximo Retirado: " + retiroMaximoRetirado +
                            "\n\tCantidad Mínima Depositada: " + retiroMininoDepositado + "\n";
                    System.out.println(mensajeUltimo);
                    break;
                case 4:
                    System.out.println("Gracias por participar");
                    break;
                default:
                    System.out.println("==Selecione una opción Valida==");
                    break;
            }
        } while (opcion != 4);
    }
}

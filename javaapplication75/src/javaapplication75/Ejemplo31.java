/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo31 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Random aleatorios = new Random();
        // declaracion de variables e inicializacion de las mismas
        boolean bandera = true;
        String opcion;
        double cantidad;
        // declaracion de arreglos y se pone el tamaño del mismo
        int[] datos = new int[6];
        String[] rangos = {"0-8", "8.1-12", "12.1-16", "16.1-19", "19.1-20",
            "20.1-Adelante"};
        while (bandera == true) {
            // ingreso de nota por teclado
            System.out.println("Ingrese la nota:");
            cantidad = entrada.nextDouble();
            // estos ciclos se los va a usar para saber en que posicion del 
            // arreglo datos[] se aumenta en uno su valor dependiendo
            // de la nota ingresada por el usuario
            if (cantidad <= 8) {
                datos[0] = datos[0] + 1;
            } else {
                if (cantidad >= 8.1 && cantidad <= 12) {
                    datos[1] = datos[1] + 1;
                } else {
                    if (cantidad >= 12.1 && cantidad <= 16) {
                        datos[2] = datos[2] + 1;
                    } else {
                        if (cantidad >= 16.1 && cantidad <= 19) {
                            datos[3] = datos[3] + 1;
                        } else {
                            if (cantidad >= 19.1 && cantidad <= 20) {
                                datos[4] = datos[4] + 1;
                            } else {
                                datos[5] = datos[5] + 1;
                            }
                        }
                    }
                }
            }

            // se limpia el buffer
            entrada.nextLine();
            // se pide al usuario si quiere seguir ingresando notas
            System.out.println("Desea seguir ingresando notas\nEscriba 's'"
                    + "para seguir ingresando y 'n' para dejar de ingresar");
            opcion = entrada.nextLine();

            // para que el ciclo while siga recorriendo
            if (opcion.equals("s")) {
                bandera = true;
            } else {
                if (opcion.equals("n")) { // se cierra el ciclo while
                    bandera = false; // se declara bandera como falsa
                }
            }
        }

        // se imprime un titulo
        System.out.println("Notas Ingresadas");
        // se imprime la cantidad de notas guardadas en cada rango
        for (int i = 0; i < datos.length; i++) {
            System.out.printf("Rangos:\n%s = %d\n", rangos[i], datos[i]);
        }
    }
}

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
public class Ejemplo2 {

    public static void main(String[] args) {
        // para el ingreso de datos
        Scanner entrada = new Scanner(System.in);
        // para que escoga valores aleatorios 
        Random aleatorios = new Random();
        // se declara el arreglo y se pone el tamaño del mismo
        int[] datos = new int[5];
        // se recorre el contador, guardando valores en v e imprimiendolos,
        // ademas en el arreglo a su valor se le suma uno
        for(int i = 0; i<=1000; i++){
            // la variable toma un valor aleatorio entre 1 y 4
            int v = aleatorios.nextInt(5);
            // se imprime el valor de v
            System.out.println(v);
            // se suma uno al valor guardado en esa posicion del arreglo datos
            datos[v] = datos[v]+1;
        }
        // se imprime un titulo de tipo cadena
        System.out.println("Resultados");
        // se recorre el contador hasta que sea menor al tamaño del arreglo
        for (int i = 0; i < datos.length; i++) {
            // se imprime valores
            System.out.printf("posición: %d - %d\n", i, datos[i]);
        }
                
        

    }
}

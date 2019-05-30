/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

/**
 *
 * @author reroes
 */
public class ArregloSeis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] c = new int[10]; // declaramos la variable
        System.out.println("-----------------------------------------------");
        // se recorre el contador hasta llegar a ser menor que el tamaño del
        // arreglo
        for (int contador = 0; contador < c.length; contador++) {
            // se imprime el contador y el valor guardado en la posicion del
            // valor del contador en el arreglo
            System.out.printf("%d\t\t%d\n", contador, c[contador]);
        }
        // se recorre el contador hasta llegar a ser menor que el tamaño del
        // arreglo
        for (int contador = 0; contador < c.length; contador++) {
            // se guarda un valor en las posiciones del arreglo
            c[contador] = 100+contador;
        }
        
        System.out.println("-----------------------------------------------");
        // se recorre el contador hasta llegar a ser menor que el tamaño del
        // arreglo
        for (int contador = 0; contador < c.length; contador++) {
            // se imprime el contador y los valores guardado en las posiciones
            // del arreglo
            System.out.printf("%d\t\t%d\n", contador, c[contador]);
        }
        
    }

}

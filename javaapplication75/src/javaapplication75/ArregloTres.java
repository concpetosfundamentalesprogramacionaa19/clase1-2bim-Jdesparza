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
public class ArregloTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] c; // declaramos la variable
        c = new int[12];

        System.out.printf("%s\t\t%s\n", "Indice", "Valor");
        // se recorre el contador hasta llegar a ser menor que el tamaño del
        // arreglo
        for (int contador = 0; contador < c.length; contador++) {
            // se imprime el contador y el valor guardado en la posicion del
            // valor del contador en el arreglo
            System.out.printf("%d\t\t%d\n", contador, c[contador]);
        }
    }

}

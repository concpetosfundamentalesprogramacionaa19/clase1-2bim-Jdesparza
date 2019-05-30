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
public class ArregloCinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaracion de variables

        int[] c = {10, 20, 30, 40}; // declaramos la variable
        double operacion;
        
        System.out.printf("%s\t\t%s\t\t%s\n", "Indice", "Valor", "Resultado");
        
        // se recorre el contador hasta llegar a ser menor que el tamaño del
        // arreglo
        for (int contador = 0; contador < c.length; contador++) {
            operacion = Math.pow(c[contador], 2);
            
            // se imprime el contador y el valor guardado en la posicion del
            // valor del contador en el arreglo, ademas se imprime el valor
            // guardado en operacion
            System.out.printf("%d\t\t%d\t\t%.0f\n", contador, c[contador],
                    operacion);
        }
    }

}

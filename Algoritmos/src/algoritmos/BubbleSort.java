/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

/**
 *
 * @author Jhonny Picado, codigo provisto en https://devs4j.com/2018/12/19/algoritmo-de-la-burbuja-en-java-bubble-sort/
 */
public class BubbleSort {
   
    
    public void sortArray(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d \t", array[i]);
        }
        System.out.println();
    }

    public void swap(int[] array, int a, int b) {
        int value = array[b];
        array[b] = array[a];
        array[a] = value;
    }
}

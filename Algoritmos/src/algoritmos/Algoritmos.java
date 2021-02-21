/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Jhonny Picado Vega
 */
public class Algoritmos {
    
    
    //Funcion que imprime el arreglo utilizado, lo recibe de parametro
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    //Metodo que captura la hora del sistema
    public static void CapturarHora(){
        Calendar calendario2 = new GregorianCalendar();
        System.out.println("\nHora : ");
        System.out.println(calendario2.get(Calendar.HOUR_OF_DAY) + ":" + calendario2.get(Calendar.MINUTE) + ":" + calendario2.get(Calendar.SECOND)+":"+calendario2.get(Calendar.MILLISECOND));
    }
    
    
    public static void main(String args[])
    {
        
        //Declaro e inicializo el arreglo a utilizar con numeros aleatorios
        int arr[] = new int[100000];
        for(int i=0; i<100000; i++){
            arr[i]=(int)(Math.random()*1000000+1);
        }
        
        int arr2[]= new int[100000];
        System.arraycopy(arr, 0, arr2, 0, 100000);
        
        int arr3[]= new int[100000];
        System.arraycopy(arr, 0, arr3, 0, 100000);
        
        //MergeSort
        Merge(arr);

        //BubbleSort
        Bubble(arr2);
        
        //QuickSort
        Quick(arr3);
    }
    
    //BubbleSort
    public static void Bubble(int []arr){
        
        System.out.println("\n\nBubble Sort\n");
        BubbleSort bubbleSort = new BubbleSort();
	System.out.println("Arreglo sin ordenar");
        printArray(arr);
        
        CapturarHora();
        bubbleSort.sortArray(arr);
        CapturarHora();
        
        System.out.println("\n\nArreglo ordenado");      
        printArray(arr);
    }
    
    //Merge Sort
    public static void Merge(int []arr){
        
        System.out.println("\n\nMerge Sort\n");
        MergeSort merge = new MergeSort();
        
        System.out.println("Arreglo sin ordenar");
        printArray(arr);
        
        CapturarHora();
        merge.sort(arr, 0, arr.length - 1);
        CapturarHora();
        
        System.out.println("\n\nArreglo ordenado");      
        printArray(arr);
    }
    
    //QuickSort
    public static void Quick(int []arr){
        System.out.println("\n\nQuick Sort\n");
        QuickSort quick = new QuickSort();
        
        System.out.println("Arreglo sin orddenar");
        printArray(arr);
        
        CapturarHora();
        quick.quicksort(arr, 0, arr.length-1);
        CapturarHora();
        
        System.out.println("\n\nArreglo ordenado");      
        printArray(arr);
    }
}

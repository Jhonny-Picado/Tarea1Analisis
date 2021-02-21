/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

/**
 *
 * @author Jhonny Picado Vega, codigo y algortimo provisto en https://platzi.com/tutoriales/1469-algoritmos/4260-merge-sort-en-java/
 */
public class MergeSort {
    
    //Constructor de la clase
    public MergeSort(){
    }
    
    
    //Metodo que realiza el ordenamiento en base a las mitades de los arreglos
    public static void merge(int arr[], int left, int middle, int right)
    {
        //Encuentra las mitades de la mitad del arreglo
        int n1 = middle - left + 1;
        int n2 = right - middle;

        //Arreglos temporales
        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];

        //Copia los datos a los arrays temporales.
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[middle + j + 1];
        }
        /* Une los vectorestemporales. */

        //Índices inicial del primer y segundo sub-vector.
        int i = 0, j = 0;

        //Índice inicial del sub-vector arr[].
        int k = left;

        //Ordenamiento. Va verificando si los elementos en posicion izquierda no sean mayores a su par en la otra mitad
        //Si lo es coloca el de la derecha sino el de la izquierda
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        /* Si quedan elementos por ordenar */
        //Copiar los elementos restantes de leftArray[].
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        //Copiar los elementos restantes de rightArray[].
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
 
    
    //Es la funcion principal va encontrando la mitad del arreglo recursivamente para despues llamar al merge que los acomoda
    public static void sort(int arr[], int left, int right)
    {
        //Compara si 
        if (left < right) {
            
            //Captura el punto medio del arreglo
            int middle = (left + right) / 2;
      
            //Divide la primera y segunda mitad, lo realiza recursivamente
            sort(arr, left, middle);
            sort(arr, middle+1, right);

            //Une las mitades.
            merge(arr, left, middle, right);
        }
    }
}

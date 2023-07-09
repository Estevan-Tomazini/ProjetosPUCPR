/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atp2;

import java.util.Arrays;

/**
 *
 * @author Leonardo, Estevan e Melissa
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] vetor = {3,6,8,1,4,9,0};
        
        System.out.println("A Lista Ordenada em SelectionSort é " + Arrays.toString(selectionSort(vetor)));
    }
        
    
    // Método selectionSort
    public static int[] selectionSort(int[] lista){
        
        int n = lista.length;
        
        // um por um com sub array
        for(int i = 0; i < n-1; i++){
            
            // encontra o max
            int menorIndex = i;
            for(int j = i+1; j < n; j++){
                if(lista[j] < lista[menorIndex]){
                    menorIndex = j;
            }
        }
        
         // troca max por min
            // element
            int temp = lista[menorIndex];
            lista[menorIndex] = lista[i];
            lista[i] = temp;
        }
        return lista;
    }
    
}

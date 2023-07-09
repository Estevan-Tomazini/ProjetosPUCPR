/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atp2;

/**
 *
 * @author Leonardo, Estevan e Melissa
 */

// Bubble Sort
class BubbleSort
{
    void bubbleSort(int [] vetor)
    {
        int n = vetor.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (vetor[j] > vetor[j+1])
                {
                    // swa and vetor[i]
                    int temp = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = temp;
                }
    }
 
//printa
    void printVetor(int [] vetor)
    {
        int n = vetor.length;
        for (int i=0; i<n; ++i)
            System.out.print(vetor[i] + " ");
        System.out.println();
    }
 
    // método main para testar classe bubblesort
    public static void main(String args[])
    {
        BubbleSort bs = new BubbleSort();
        int [] vetor = {3, 6, 8, 1, 4, 9, 0};
        bs.bubbleSort(vetor);
        System.out.println("Lista Organizada em BubbleSort: ");
        bs.printVetor(vetor);
    }
}




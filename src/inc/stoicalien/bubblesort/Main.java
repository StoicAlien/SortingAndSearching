package inc.stoicalien.bubblesort;

public class Main {

    public static void main(String[] args) {        
        int[] arr = new int[]{4, 12, 6, 9, 21, 39, 25};        
        
        System.out.println("==============before sorting===============");
        for (int element : arr) {
            System.out.println(element);
        }
        System.out.println("===========================================");
        
        bubbleSort(arr);                       
        System.out.println("==============after sorting================");
        for (int element : arr) {
            System.out.println(element);
        }
        System.out.println("===========================================");
        
        int[] arr2 = new int[]{6, 1, -5, -9, -6, 4, 0};
        System.out.println("==============before sorting===============");
        for (int element : arr2) {
            System.out.println(element);
        }
        System.out.println("===========================================");
        
        bubbleSort(arr2);                       
        System.out.println("==============after sorting================");
        for (int element : arr2) {
            System.out.println(element);
        }
        System.out.println("===========================================");
        
        int[] arr3= new int[]{-4, 66, 2, 21, 35, 5, 24};
        System.out.println("==============before sorting===============");
        for (int element : arr3) {
            System.out.println(element);
        }
        System.out.println("===========================================");
        
        bubbleSort(arr3);                       
        System.out.println("==============after sorting================");
        for (int element : arr3) {
            System.out.println(element);
        }
        System.out.println("===========================================");
    }
            
    // Bubble Sort ou Ordenação por flutuação é a forma mais simples de algoritmo
    // de ordenação. O array é percorrido do primeiro ao último elemento.
    // O atual elemento é comparado com o próximo elemento; Caso o
    // atual elemento seja maior do que o próximo, eles são trocados de posição
    private static void bubbleSort(int arr[]) {
        int size = arr.length, temp = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < (size - i); j++) {
                if (arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

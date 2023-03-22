package inc.stoicalien.binarysearch;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 6, 9, 14, 21, 26};
        binarySearch(arr, 7);
        binarySearch(arr, 6);
        binarySearch(arr, 21);
        
        int[] arr2 = new int[]{9, 2, 18, 4, 32, 29, 27};               
        bubbleSort(arr2);
        binarySearch(arr2, 7);
        binarySearch(arr2, 5);
        binarySearch(arr2, 29);
    }
    
    private static int binarySearch(int[] arr, int target) {
        int lowestIndex = 1, highestIndex = arr.length;
//        System.out.println("lowestIndex= " + lowestIndex);
//        System.out.println("highestIndex= " + highestIndex);
        System.out.println("==============================");
        // Se o menor índice (lowestIndex) tiver um valor maior do que
        // o do maior índice (highestIndex) o loop termina
        while (lowestIndex <= highestIndex) {
            // a variável midIndex representa a posição atual do índice
//            System.out.println("midIndex= " + lowestIndex + " + " + "(" + highestIndex +
//                    " - " + lowestIndex + ") / 2");
            int midIndex = lowestIndex + (highestIndex - lowestIndex) / 2;
//            System.out.println("midIndex= " + midIndex);
//            System.out.println("arr[midIndex]= " + arr[midIndex]);
            if (arr[midIndex] == target) {
                System.out.println("Target successfully found");
                System.out.println("==============================");
                return midIndex;
            } else if (arr[midIndex] < target) {
                lowestIndex = midIndex + 1;
//                System.out.println("lowestIndex= " + lowestIndex);
            } else if (arr[midIndex] > target) {
                highestIndex = midIndex - 1;
//                System.out.println("highestIndex= " + highestIndex);
            }            
        }
        System.out.println("==============================");
        System.out.println("Target not found");
        System.out.println("==============================");
        return -1;
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

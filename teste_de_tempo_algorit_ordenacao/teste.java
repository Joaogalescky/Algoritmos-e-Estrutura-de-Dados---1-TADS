import java.util.Arrays;
import java.util.Random;

public class teste {
    public static void main(String[] args) {
        int[] arraySizes = {100, 1000, 10000, 100000, 1000000, 10000000};

        for (int size : arraySizes) {
            // Gerar conjuntos de dados
            int[] randomArray = generateRandomArray(size, 0, 10000);
            int[] largeRandomArray = generateRandomArray(size, 0, Integer.MAX_VALUE);

            // Medir o tempo para ordenação usando diferentes algoritmos
            measureTime("Bubble Sort", Arrays.copyOf(randomArray, size));
            measureTime("Insertion Sort", Arrays.copyOf(randomArray, size));
            measureTime("Selection Sort", Arrays.copyOf(randomArray, size));
            measureTime("Merge Sort", Arrays.copyOf(randomArray, size));
            measureTime("Counting Sort", Arrays.copyOf(randomArray, size));
            measureTime("Radix Sort", Arrays.copyOf(randomArray, size));
            measureTime("Quick Sort", Arrays.copyOf(randomArray, size));

            measureTime("Bubble Sort (Large)", Arrays.copyOf(largeRandomArray, size));
            measureTime("Insertion Sort (Large)", Arrays.copyOf(largeRandomArray, size));
            measureTime("Selection Sort (Large)", Arrays.copyOf(largeRandomArray, size));
            measureTime("Merge Sort (Large)", Arrays.copyOf(largeRandomArray, size));
            measureTime("Counting Sort (Large)", Arrays.copyOf(largeRandomArray, size));
            measureTime("Radix Sort (Large)", Arrays.copyOf(largeRandomArray, size));
            measureTime("Quick Sort (Large)", Arrays.copyOf(largeRandomArray, size));

            System.out.println(); // Adicionar uma linha em branco entre diferentes tamanhos de conjunto
        }
    }

    private static void measureTime(String algorithm, int[] array) {
        long startTime = System.currentTimeMillis();

        // Escolher o algoritmo de ordenação apropriado
        switch (algorithm) {
            case "Bubble Sort":
                bubbleSort(array);
                break;
            case "Insertion Sort":
                insertionSort(array);
                break;
            case "Selection Sort":
                selectionSort(array);
                break;
            case "Merge Sort":
                mergeSort(array);
                break;
            case "Counting Sort":
                countingSort(array);
                break;
            case "Radix Sort":
                radixSort(array);
                break;
            case "Quick Sort":
                quickSort(array);
                break;
            default:
                System.out.println("Algoritmo desconhecido");
        }

        long endTime = System.currentTimeMillis();
        double elapsedTime = (endTime - startTime) / 1000.0;

        System.out.println(algorithm + " - Tamanho: " + array.length + " - Tempo: " + elapsedTime + " segundos");
    }

    // Implementações dos algoritmos de ordenação

    private static void bubbleSort(int[] array) {
        // Implementação do Bubble Sort
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j] > array[j+1]) {
                    // Trocar os elementos se estiverem fora de ordem
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }


    private static void insertionSort(int[] array) {
        // Implementação do Insertion Sort
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            // Mover os elementos do array[0..i-1] que são maiores que key para uma posição à frente de sua posição atual
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    private static void selectionSort(int[] array) {
        // Implementação do Selection Sort
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Trocar o elemento mínimo encontrado com o primeiro elemento
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    private static void mergeSort(int[] array) {
        // Implementação do Merge Sort
        if (array.length > 1) {
            int mid = array.length / 2;
            int[] left = Arrays.copyOfRange(array, 0, mid);
            int[] right = Arrays.copyOfRange(array, mid, array.length);

            mergeSort(left);
            mergeSort(right);

            merge(array, left, right);
        }
    }

    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < left.length) {
            array[k++] = left[i++];
        }

        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    private static void countingSort(int[] array) {
        // Implementação do Counting Sort
    }

    private static void radixSort(int[] array) {
        // Implementação do Radix Sort
    }

    private static void quickSort(int[] array) {
        // Implementação do Quick Sort
    }

    private static int[] generateRandomArray(int size, int minValue, int maxValue) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(maxValue - minValue + 1) + minValue;
        }

        return array;
    }
}

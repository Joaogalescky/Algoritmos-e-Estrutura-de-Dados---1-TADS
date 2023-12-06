//Trabalho 4º Bimestre - Tempo de Execução dos Algoritmos de Ordenação

/* Explicação:

 O trabalho deste bimestre consiste na execução e medição do tempo necessário para ordenação utilizando os algoritmos estudados.
 
 O trabalho consiste em:
 - Gerar conjuntos de dados com as seguintes características:
 - conjunto de 100, 1000, 10000, 100000, 1000000 e 10000000 elementos, com valores aleatórios entre 0 e 10000 (zero e dez mil)
 -   - conjunto de 100, 1000, 10000, 100000, 1000000 e 10000000 elementos, com valores aleatórios entre 0 o maior valor de int (Integer.MAX_VALUE)
 - Abrir esses conjuntos de dados e ordená-los, utilizando os algoritmos de ordenação estudados em aula (Bubble Sort, Insertion Sort, Selection Sort, Merge Sort, Counting Sort, Radix Sort e Quick Sort)
 - Medir o tempo (em segundos) necessário para ordenação utilizando cada algoritmo, e anotar o tempo na planilha.
 
 Anexo está a planilha a ser preenchida com os tempos de cada algoritmo. Fazer uma cópia da planilha, preencher os dados e enviar, em conjunto com os algoritmos utilizados para ordenação.
 
 O prazo máximo para entrega do trabalho está no dia 08/12/2023 às 07:00 horas da manhã. Após este horário, não serão aceitas submissões.
 
 O que deve ser entregue:
 - planilha 1: com os tempos de ordenação com valores de 0 a 10000 (zero a dez mil)
 - planilha 2: com os tempos de ordenação com valores de 0 ao maior valor de int (Integer.MAX_VALUE)
 - código gerador dos dados de entrada a serem ordenados
 - código com os algoritmos de ordenação e a medição de tempo
*/

package teste_de_tempo_algorit_ordenacao;
import java.util.Arrays;
import java.util.Random;

public class Algoritmo_Ordenacao {
    public static void main(String[] args) {
        int[] vetorTamanho = {100, 1000, 10000, 100000, 1000000, 10000000};

        for (int tamanho : vetorTamanho) {
            // Gerar conjuntos de dados
            int[] vetorRandomico = geradorRandomVetor(tamanho, 0, 10000);
            int[] vetorRandomicoGrande = geradorRandomVetor(tamanho, 0, Integer.MAX_VALUE);

            // Medir o tempo para ordenação usando diferentes algoritmos
            calcTemp("Bubble Sort", Arrays.copyOf(vetorRandomico, tamanho));
            calcTemp("Insertion Sort", Arrays.copyOf(vetorRandomico, tamanho));
            calcTemp("Selection Sort", Arrays.copyOf(vetorRandomico, tamanho));
            calcTemp("Merge Sort", Arrays.copyOf(vetorRandomico, tamanho));
            calcTemp("Counting Sort", Arrays.copyOf(vetorRandomico, tamanho));
            calcTemp("Radix Sort", Arrays.copyOf(vetorRandomico, tamanho));
            calcTemp("Quick Sort", Arrays.copyOf(vetorRandomico, tamanho));

            calcTemp("Bubble Sort (Large)", Arrays.copyOf(vetorRandomico, tamanho));
            calcTemp("Insertion Sort (Large)", Arrays.copyOf(vetorRandomico, tamanho));
            calcTemp("Selection Sort (Large)", Arrays.copyOf(vetorRandomico, tamanho));
            calcTemp("Merge Sort (Large)", Arrays.copyOf(vetorRandomico, tamanho));
            calcTemp("Counting Sort (Large)", Arrays.copyOf(vetorRandomico, tamanho));
            calcTemp("Radix Sort (Large)", Arrays.copyOf(vetorRandomico, tamanho));
            calcTemp("Quick Sort (Large)", Arrays.copyOf(vetorRandomico, tamanho));

            System.out.println(); // Adicionar uma linha em branco entre diferentes tamanhos de conjunto
        }
    }

    private static void calcTemp(String algoritmo, int[] vetor) {
        long tempoInicio = System.currentTimeMillis();

        // Escolher o algoritmo de ordenação apropriado
        switch (algoritmo) {
            case "Bubble Sort":
                bubbleSort(vetor);
                break;
            case "Insertion Sort":
                insertionSort(vetor);
                break;
            case "Selection Sort":
                selectionSort(vetor);
                break;
            case "Merge Sort":
                mergeSort(vetor);
                break;
            case "Counting Sort":
                countingSort(vetor);
                break;
            case "Radix Sort":
                radixSort(vetor);
                break;
            case "Quick Sort":
                quickSort(vetor);
                break;
            default:
                System.out.println("Algoritmo desconhecido");
        }

        long tempoFim = System.currentTimeMillis();
        double tempoDecorrido = (tempoFim - tempoInicio) / 1000.0;

        System.out.println(algoritmo + " - Tamanho: " + vetor.length + " - Tempo: " + tempoDecorrido + " segundos");
    }

    // Implementações dos algoritmos de ordenação

    private static void bubbleSort(int[] vetor) {
        // Implementação do Bubble Sort
    }

    private static void insertionSort(int[] vetor) {
        // Implementação do Insertion Sort
    }

    private static void selectionSort(int[] vetor) {
        // Implementação do Selection Sort
    }

    private static void mergeSort(int[] vetor) {
        // Implementação do Merge Sort
    }

    private static void countingSort(int[] vetor) {
        // Implementação do Counting Sort
    }

    private static void radixSort(int[] vetor) {
        // Implementação do Radix Sort
    }

    private static void quickSort(int[] vetor) {
        // Implementação do Quick Sort
    }

    private static int[] geradorRandomVetor(int tamanho, int valorMinimo, int valorMaximo) {
        int[] vetor = new int[tamanho];
        Random aleatorio = new Random();

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = aleatorio.nextInt(valorMaximo - valorMinimo + 1) + valorMinimo;
        }

        return vetor;
    }
}

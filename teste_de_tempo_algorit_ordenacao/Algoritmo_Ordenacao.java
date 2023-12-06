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

    public static void calcTemp(String algoritmo, int[] vetor) {
        long tempoInicio = System.currentTimeMillis();

        // Escolher o algoritmo de ordenação apropriado
        switch (algoritmo) {
            case "BubbleSort":
                bubbleSort(vetor);
                break;
            case "InsertionSort":
                insertionSort(vetor);
                break;
            case "SelectionSort":
                selectionSort(vetor);
                break;
            case "MergeSort":
                mergeSort(vetor);
                break;
            case "CountingSort":
                countingSort(vetor);
                break;
            case "RadixSort":
                radixSort(vetor);
                break;
            case "QuickSort":
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

    public static void troca(int []vetor, int pos_a, int pos_b){
        int aux = vetor[pos_b];
        vetor[pos_b] = vetor[pos_a];
        vetor[pos_a] = aux;
    }

    public static void bubbleSort(int[] vetor) {
        // Implementação do Bubble Sort

        //entrada
        int[] valores = new int[]{94, 27, 32, 46, 8, 0};
        int[] resultados = new int[valores.length];
        int i, j, aux;
    
        //processamento
        for(i = 0; i < valores.length - 1; i++){
            for(j = 0; j < valores.length - 1 - i; j++){
                if(valores[j] > valores[j + 1]){
                    troca(valores, j, j + 1);
                }
            }
        }
    }

    public static void insertionSort(int[] vetor) {
        // Implementação do Insertion Sort
    }

    public static void selectionSort(int[] vetor) {
        // Implementação do Selection Sort
    }

    public static void mergeSort(int[] vetor) {
        // Implementação do Merge Sort
    }

    public static void countingSort(int[] vetor) {
        // Implementação do Counting Sort
    }

    public static void radixSort(int[] vetor) {
        // Implementação do Radix Sort
    }

    public static void quickSort(int[] vetor) {
        // Implementação do Quick Sort
    }

    public static int[] geradorRandomVetor(int tamanho, int valorMinimo, int valorMaximo) {
        int[] vetor = new int[tamanho];
        Random aleatorio = new Random();

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = aleatorio.nextInt(valorMaximo - valorMinimo + 1) + valorMinimo;
        }

        return vetor;
    }
}

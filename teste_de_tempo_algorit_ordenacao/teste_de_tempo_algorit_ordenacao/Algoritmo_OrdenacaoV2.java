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
import java.util.Scanner;

enum AlgoritmoOrdenacao {
    BUBBLE_SORT,
    INSERTION_SORT,
    SELECTION_SORT,
    MERGE_SORT,
    COUNTING_SORT,
    RADIX_SORT,
    QUICK_SORT
}

public class Algoritmo_OrdenacaoV2 {

    public static void main(String[] args) {
        int[] vetorTamanho = {100, 1000, 10000, 100000, 1000000, 10000000};

        for (int tamanho : vetorTamanho) {
            int[] vetorRandomico = geradorRandomVetor(tamanho, 0, 100);

            executaAlgoritmos(Arrays.copyOf(vetorRandomico, tamanho));
            executaAlgoritmos(Arrays.copyOf(vetorRandomico, tamanho));
            executaAlgoritmos(Arrays.copyOf(vetorRandomico, tamanho));
            executaAlgoritmos(Arrays.copyOf(vetorRandomico, tamanho));
            executaAlgoritmos(Arrays.copyOf(vetorRandomico, tamanho));
            executaAlgoritmos(Arrays.copyOf(vetorRandomico, tamanho));
            executaAlgoritmos(Arrays.copyOf(vetorRandomico, tamanho));

            executaAlgoritmos(Arrays.copyOf(vetorRandomico, tamanho));
            executaAlgoritmos(Arrays.copyOf(vetorRandomico, tamanho));
            executaAlgoritmos(Arrays.copyOf(vetorRandomico, tamanho));
            executaAlgoritmos(Arrays.copyOf(vetorRandomico, tamanho));
            executaAlgoritmos(Arrays.copyOf(vetorRandomico, tamanho));
            executaAlgoritmos(Arrays.copyOf(vetorRandomico, tamanho));
            executaAlgoritmos(Arrays.copyOf(vetorRandomico, tamanho));

            System.out.println();
        }
    }

    public static void executaAlgoritmos(int[] vetor) {
        for (AlgoritmoOrdenacao algoritmo : AlgoritmoOrdenacao.values()) {
            long tempoInicio = System.nanoTime();
            executaAlgoritmo(algoritmo, vetor);
            long tempoFim = System.nanoTime();

            double tempoDecorrido = (tempoFim - tempoInicio) / 1e9; // Convertendo para segundos

            System.out.println(algoritmo + " - Tamanho: " + vetor.length + " - Tempo: " + tempoDecorrido + " segundos");
        }
    }

    public static void executaAlgoritmo(AlgoritmoOrdenacao algoritmo, int[] vetor) {
        switch (algoritmo) {
            case BUBBLE_SORT:
                bubbleSort(vetor);
                break;
            case INSERTION_SORT:
                insertionSort(vetor);
                break;
            case SELECTION_SORT:
                selectionSort(vetor);
                break;
            case MERGE_SORT:
                mergeSort(vetor);
                break;
            case COUNTING_SORT:
                countingSort(vetor);
                break;
            case RADIX_SORT:
                radixSort(vetor);
                break;
            case QUICK_SORT:
                quickSort(vetor);
                break;
            default:
                System.out.println("Algoritmo desconhecido");
        }
    }

    //Implementações dos algoritmos de ordenação

    public static void bubbleSort(int[] vetor) {
        //Implementação do Bubble Sort

        //Variaveis
        int i, j, valores, temp;

        //Entrada
        valores = vetor.length;
        temp = 0;
    
        //Processamento
        for(i = 0; i < valores - 1; i++){
            for(j = 0; j < valores - 1 - i; j++){
                if(vetor[j] > vetor[j + 1]){
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] vetor) {
        //Implementação do Insertion Sort

        //Variaveis
        int valores;
        int i, j, chave;

        //Entrada
        valores = vetor.length;
        
        //Processamento
        for(i = 1; i < valores; ++i){
            chave = vetor[i];
            j = i - 1;

            //Mover os elementos do array[0..i-1] que são maiores que key para uma posição à frente de sua posição atual
            while(j >= 0 && vetor[j] > chave){
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = chave;
        }

    }

    public static void selectionSort(int[] vetor) {
        //Implementação do Selection Sort

        //Variaveis
        int i, j, menorP, temp, valores;

        //Entrada
        valores = vetor.length;

        //Processamento
        for(i = 0; i < valores - 1; i++){
            menorP = i;
            for(j = i + 1; j < valores; j++){
                if(vetor[j] < vetor[menorP]){
                    menorP = j;
                }
            }

            //Trocar o elemento mínimo encontrado com o primeiro elemento
            temp = vetor[menorP];
            vetor[menorP] = vetor[i];
            vetor[i] = temp;
        }
    }

    public static void mergeSort(int[] vetor) {
        //Implementação do Merge Sort
    
        if(vetor.length > 1){
            int meio = vetor.length / 2;
            int[] esquerda = Arrays.copyOfRange(vetor, 0, meio);
            int[] direita = Arrays.copyOfRange(vetor, meio, vetor.length);

            //Processamento
            mergeSort(esquerda);
            mergeSort(direita);
            merge(vetor, esquerda, direita);
        }
    }

    public static void merge(int[] vetor, int[] esquerda, int[] direita) {
        
        //Variaveis
        int i, j, k;

        //Entrada
        i = 0;
        j = 0;
        k = 0;

        //Processamento
        while(i < esquerda.length && j < direita.length){
            if(esquerda[i] <= direita[j]){
                vetor[k++] = esquerda[i++];
            } else{
                vetor[k++] = direita[j++];
            }
        }

        while(i < esquerda.length){
            vetor[k++] = esquerda[i++];
        }

        while(j < direita.length){
            vetor[k++] = direita[j++];
        }
    }

    public static void countingSort(int[] vetor) {
        //Implementação do Counting Sort
    }

    public static void radixSort(int[] vetor) {
        //Implementação do Radix Sort
    }

    public static void quickSort(int[] vetor) {
        //Implementação do Quick Sort
    }

    public static int[] geradorRandomVetor(int tamanho, int valorMinimo, int valorMaximo) {
        if(valorMinimo >= valorMaximo){
            throw new IllegalArgumentException("valorMinimo deve ser menor que valorMaximo");
        }

        int[] vetor = new int[tamanho];
        Random aleatorio = new Random();

        for(int i = 0; i < tamanho; i++){
            vetor[i] = aleatorio.nextInt(valorMaximo - valorMinimo + 1) + valorMinimo;
        }
        return vetor;
    }
}
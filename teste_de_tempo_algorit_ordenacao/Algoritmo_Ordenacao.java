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
            //Gerar conjuntos de dados
            int[] vetorRandomico = geradorRandomVetor(tamanho, 0, 10000);
            int[] vetorRandomicoGrande = geradorRandomVetor(tamanho, 0, Integer.MAX_VALUE);

            //Medir o tempo para ordenação usando diferentes algoritmos
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

            System.out.println();
        }
    }

    public static void calcTemp(String algoritmo, int[] vetor) {
        long tempoInicio = System.currentTimeMillis();

        System.out.println("\nTeste de tempo de resposta dos algoritmos de ordenação");
        System.out.println("Escolha uma opção:");
        System.out.println("1. bubbleSort");
        System.out.println("2. insertionSort");
        System.out.println("3. selectionSort");
        System.out.println("4. mergeSort");
        System.out.println("5. countingSort");
        System.out.println("6. radixSort");

        algoritmo = entrada.nextInt();
        
        //Menu para escolher o algoritmo de ordenação
        switch (algoritmo) {
            case 1: //"BubbleSort"
                bubbleSort(vetor);
                break;
            case 2: //"InsertionSort"
                insertionSort(vetor);
                break;
            case 3: //"SelectionSort"
                selectionSort(vetor);
                break;
            case 4: //"MergeSort"
                mergeSort(vetor);
                break;
            case 5: //"CountingSort"
                countingSort(vetor);
                break;
            case 6: //"RadixSort"
                radixSort(vetor);
                break;
            case 7: //"QuickSort"
                quickSort(vetor);
                break;
            default:
            System.out.println("Algoritmo desconhecido");
        }

        long tempoFim = System.currentTimeMillis();
        double tempoDecorrido = (tempoFim - tempoInicio) / 1000.0;

        System.out.println(algoritmo + " - Tamanho: " + vetor.length + " - Tempo: " + tempoDecorrido + " segundos");
    }

    //Implementações dos algoritmos de ordenação

    public static void bubbleSort(int[] vetor) {
        //Implementação do Bubble Sort

        //Variaveis
        int i, j, valores;

        //Entrada
        valores = vetor.length;
    
        //Processamento
        for(i = 0; i < valores - 1; i++){
            for(j = 0; j < valores - 1 - i; j++){
                if(vetor[j] > vetor[j + 1]){
                    int aux = vetor[j];
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
            int meio;
            int[] esquerda = Vetor.copiaAlcance(vetor, 0, meio);
            int[] direita = Vetor.copiaAlcance(vetor, meio, vetor.length);

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
        i = 0;
        k = 0;

        //Processamento
        while(i < esquerda.length && j < direita.length){
            if(esquerda[i] <= direita[j]){
                vetor[k++] = esquerda[i++];
            } else{
                vetor[k++] = direita[j++];
            }
        }

        while(i < esquerda.left){
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
        int[] vetor = new int[tamanho];
        Random aleatorio = new Random();

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = aleatorio.nextInt(valorMaximo - valorMinimo + 1) + valorMinimo;
        }

        return vetor;
    }
}
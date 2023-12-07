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

//Pacote
package teste_de_tempo_algorit_ordenacao;

//Bibliotecas importadas
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Algoritmo_Ordenacao {

    public static void main(String[] args){
        //Vetor de teste de tempo de resposta
        int[] vetorTamanho = {100};

        /* for(int tamanho : vetorTamanho){
         O ':' é o operador usado para separar a variável de iteração do array que está sendo percorrido
         Neste contexto, foi utilizado um repetidor para iterar sobre os tamanhos dos vetores que se deseja testar
        */
        for (int i = 0; i < vetorTamanho.length; i++) { 
            int tamanho = vetorTamanho[i];

            int[] vetorRandomico = geradorRandomVetor(tamanho, 0, 100);//Para Testes, alterar o valorMaximo pelo valor do tamanho do vetorTamanho

            calcTemp(Arrays.copyOf(vetorRandomico, tamanho));
            /* Arrays.copyOf:
             Esse método pertence a classe 'java.util.Arrays', sendo usado para copiar um array e retornar outro. Esse que ele retorna é uma cópia do primeiro
             Util para criar uma cópia de uma matriz com um tamanho específico sem alterar a matriz original
             Neste contexto, está sendo usado para criar cópias dos vetores aleatórios gerados para garantir que cada algoritmo de ordenação receba um vetor não ordenado idêntico
            */
            calcTemp(Arrays.copyOf(vetorRandomico, tamanho));
            calcTemp(Arrays.copyOf(vetorRandomico, tamanho));
            calcTemp(Arrays.copyOf(vetorRandomico, tamanho));
            calcTemp(Arrays.copyOf(vetorRandomico, tamanho));
            calcTemp(Arrays.copyOf(vetorRandomico, tamanho));
            calcTemp(Arrays.copyOf(vetorRandomico, tamanho));

            calcTemp(Arrays.copyOf(vetorRandomico, tamanho));
            calcTemp(Arrays.copyOf(vetorRandomico, tamanho));
            calcTemp(Arrays.copyOf(vetorRandomico, tamanho));
            calcTemp(Arrays.copyOf(vetorRandomico, tamanho));
            calcTemp(Arrays.copyOf(vetorRandomico, tamanho));
            calcTemp(Arrays.copyOf(vetorRandomico, tamanho));
            calcTemp(Arrays.copyOf(vetorRandomico, tamanho));

            System.out.println();
        }
    }

    public static void calcTemp(int[] vetor){
        long tempoInicio = System.nanoTime();
        //Da para substituir para nanoTime();
        /*CurrentTimeMillis:
         É um metodo que retorna a hora atual em millissegundos, um número (long) que representa a quantidade de milissegundos que se passou desde tal instante.
        */
        Scanner entrada = new Scanner(System.in);

        //Menu de seleção
        System.out.println("\nTeste de tempo de resposta dos algoritmos de ordenação");
        System.out.println("Escolha uma opção:");
        System.out.println("1. bubbleSort");
        System.out.println("2. insertionSort");
        System.out.println("3. selectionSort");
        System.out.println("4. mergeSort");
        System.out.println("5. countingSort");
        System.out.println("6. radixSort");
        System.out.println("7. quickSort");

        int algoritmo = entrada.nextInt();

        switch (algoritmo){
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
        long tempoFim = System.nanoTime();
        double tempoDecorrido = (tempoFim - tempoInicio) / 1000.0;

        System.out.println(algoritmo + " - Tamanho: " + vetor.length + " - Tempo: " + tempoDecorrido + " segundos");
    }

    //------------------------------------------
    //Implementações dos algoritmos de ordenação:
    //------------------------------------------

    public static int particao(int[] vetor, int inicio, int fim){

        //Variaveis
        int pivo;
        int i, j;

        //Entrada
        pivo = vetor[fim];
        i = inicio - 1;
        
        //Processamento
        for (j = inicio; j < fim; j++){
            if (vetor[j] <= pivo){
                i++;
                trocar(vetor, i, j);
            }
        }
        trocar(vetor, i + 1, fim);
        return i + 1;
    }

    public static void trocar(int[] vetor, int i, int j){

        //Variaveis
        int temp;
        
        //Processamento
        temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }

    public static void bubbleSort(int[] vetor){

        //Variaveis
        int i, j, valores, temp;

        //Entrada
        valores = vetor.length;
        temp = 0;
    
        //Processamento
        for(i = 0; i < valores - 1; i++){
            for(j = 0; j < valores - 1 - i; j++){
                if(vetor[j] > vetor[j + 1]){
                    trocar(vetor, i, j);
                }
            }
        }
    }

    public static void insertionSort(int[] vetor){

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

    public static void selectionSort(int[] vetor){

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

    public static void mergeSort(int[] vetor){
        
        //Variaveis
        int meio;
        int[] esquerda;
        int[] direita;

        //Processamento
        if(vetor.length > 1){
            meio = vetor.length / 2;
            esquerda = Arrays.copyOfRange(vetor, 0, meio);
            direita = Arrays.copyOfRange(vetor, meio, vetor.length);

            //Processamento
            mergeSort(esquerda);
            mergeSort(direita);
            merge(vetor, esquerda, direita);
        }
    }

    public static void merge(int[] vetor, int[] esquerda, int[] direita){
        
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

    public static void countingSort(int[] vetor){

        //Variaveis
        int maximo, aux = 0, i;
        int[] contadorVetor;

        //Processamento
        if (vetor == null || vetor.length <= 1) {
            return; //Se o vetor for nulo ou tiver 1 elemento apenas, não a nada ser ordenado
        }
    
        maximo = Arrays.stream(vetor).max().orElse(0);
        contadorVetor = new int[maximo + 1];
    
        //Contagem das ocorrências de cada elemento no vetor
        for(int j = 0; j < vetor.length; j++){ //ou (int j : vetor)
            int tamanho = vetor[j];
            contadorVetor[j]++;
        }
    
        //Reconstrução do vetor já ordenado
        for (i = 0; i < contadorVetor.length; i++) {
            while (contadorVetor[i] > 0) {
                vetor[aux++] = i;
                contadorVetor[i]--;
            }
        }

        /*Outro código
         //Variaveis
         int maximo, minimo, alcance;
         int[] contador;
         int[] saida;

         //Processamento
         maximo = Arrays.stream(vetor).max().orElse(0);
         minimo = Arrays.stream(vetor).min().orElse(0);
         //É usado aqui para obter o valor máximo em um vetor usando '.max()' e '.min:'. Em Arrays.stream(vetor).max().orElse(0), .min() é usado para obter o valor mínimo no vetor.

         alcance = maximo - minimo + 1;
         contador = new int[alcance];
         saida = new int[vetor.length];

         for (int i : vetor){
            contador[i - minimo]++;
         }

         for (int i = 1; i < alcance; i++){
            contador[i] += contador[i - 1];
         }

         for (int i = vetor.length - 1; i >= 0; i--){
            saida[contador[vetor[i] - minimo] - 1] = vetor[i];
            contador[vetor[i] - minimo]--;
         }

         //Saida
         System.arraycopy(saida, 0, vetor, 0, vetor.length);
        */

        /* Arrays.stream:
         É um metodo que pertence à classe 'java.util.Arrays' também. Utilizado para converter um array em um fluxo(stream).
         Permite utilizar para operações de fluxo para processar os elementos da matriz de maneira mais concisa e funcional.
        */
        /* Como funciona esse trecho de código:
         Portanto, .max() ou .min() são operações de fluxo que retornam um Optional<T> representando o valor máximo ou mínimo no fluxo, respectivamente. O método .orElse(defaultValue) é usado para fornecer um valor padrão caso o valor não esteja presente. 
        */
        /* O'que é um Optional<T>:
         É uma classe que permite que um objeto possa ou não ter um valor. Usado para evitar exceções de ponteiro nulo e tornar o código mais seguro e legível.
        */
    }

    public static void radixSort(int[] vetor){
        
        //Variaveis
        int maximo;
        int exp;

        //Processamento
        maximo = Arrays.stream(vetor).max().orElse(0);
        for (exp = 1; maximo / exp > 0; exp *= 10){
            countingSortRadix(vetor, exp);
        }
    }
    
    private static void countingSortRadix(int[] vetor, int exp){

        //Variaveis
        int n, i;
        int[] saida; //Usado para armazenar os elementos ordenados
        int[] contador;

        //Entrada
        n = vetor.length;
        saida = new int[n];
        contador = new int[10];
        Arrays.fill(contador, 0);

        //Processamento
        //O algoritmo conta o número de ocorrências de cada dígito nas posições atuais. 'exp' é um fator de exponenciação usado para selecionar o dígito relevante na iteração atual
        for (i = 0; i < n; i++){
            contador[(vetor[i] / exp) % 10]++;
        }

        //Ajustar os contadores para indicar a posição de cada dígito no array de saída
        for (i = 1; i < 10; i++){
            contador[i] += contador[i - 1];
        }

        //Coloca os elementos em suas posições no array de saída pela ordenação do digito atual
        for (i = n - 1; i >= 0; i--){
            saida[contador[(vetor[i] / exp) % 10] - 1] = vetor[i];
            contador[(vetor[i] / exp) % 10]--;
        }
        System.arraycopy(saida, 0, vetor, 0, n);
    }

    public static void quickSort(int[] vetor){
        quickSortRecursivo(vetor, 0, vetor.length - 1);
    }
    
    public static void quickSortRecursivo(int[] vetor, int inicio, int fim){

        //Variaveis
        int indiceParticao;

        //Processamento
        if(inicio < fim){
            //Encontrar o indice de partição para divisão do array
            indiceParticao = particao(vetor, inicio, fim);
            //Chamada recursiva para a ordenação apenas da parte esquerda do array
            quickSortRecursivo(vetor, inicio, indiceParticao - 1);
            //Chamada recursiva para a ordenação apenas da parte direita do array
            quickSortRecursivo(vetor, indiceParticao + 1, fim);
        }
    }
    
    public static int[] geradorRandomVetor(int tamanho, int valorMinimo, int valorMaximo){
       
        //Condição de funcionamento
        if(valorMinimo >= valorMaximo){
            throw new IllegalArgumentException("valorMinimo deve ser menor que valorMaximo");
            //Caso não atendida, lançar uma exceção indicando que há um argumento que não está dentro do intervalo válido esperado. 
        }

        //Variaveis
        int[] vetor;
        Random aleatorio;

        //Entrada
        vetor = new int[tamanho];
        aleatorio = new Random(); //Gerador de números aleatórios

        //Processamento - Preencher o vetor com os números aleatórios
        //Sistema de repetição com incrementação do 'i'
        for(int i = 0; i < tamanho; i++){
            //Gera um número aleatório dentro do intervalo do 'valorMaximo' e do 'valorMínimo', atribuindo a posição 'i'
            vetor[i] = aleatorio.nextInt(valorMaximo - valorMinimo + 1) + valorMinimo;
        }
        return vetor;
    }
}

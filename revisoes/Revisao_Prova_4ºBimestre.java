package revisoes;
//Arquivo de revisão de conteúdo para a prova do 4º Bimestre - 1ºTADSS - 2023

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class Revisao_Prova_4ºBimestre {

    public static void Pilha() {
        /* Oque é uma Pilha?
         * É uma estrutura de dados que segue a ordem LIFO (Last In, First Out), traduzindo, significa que o último elemento adicionado é o primeiro a ser removido.
        */

        Stack<Integer> pilha = new Stack<>();
        /* Oque é a classe Stack?
         * A classe Stack é uma estrutura de dados que segue a política da LIFO, estando contida no pacote 'java.util'.
         * Tendo os métodos principais:
         * * push(element): adiciona um elemento ao topo da pilha.
         * * pop(): remove e retorna o elemento no topó da pilha.
         * * peek(): retorna o elemento no topo da pilha sem removê-lo.
         * * isEmpty(): verifica se a pilha está vazia.
        */

        /* Qual é o motivo de se utilizar?
         * As pilhas são frequentemente usadas em situações em que a ordem de processamento é importante, como na avaliação de expressões matemáticas, rastreamento de chamadas de função (pilha de chamadas), e em algoritmos de retrocesso (backtracking) etc.
        */

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);

        System.out.println("Topo da pilha: " + pilha.peek());

        while(!pilha.isEmpty()){
            System.out.println("Desempilhado:" + pilha.pop());
        }
    }

    public static void pilhaLinkedList() {
        /* Qual é a sua vantagem?
         * O LinkedList é mais eficiente em termos de inserção/remoção no meio, sendo menos propenso a realocações de memória durante essa atividade.
         *
        */
        /* Qual é a sua desvantagem?
         * O acesso sequencial pode ser mais lento e o consumo de memória ligeiramente maior devido aos nós adicionais.
         */
        LinkedList<String> pilha = new LinkedList<>();

        pilha.push("Elemento 1");
        pilha.push("Elemento 2");
        pilha.push("Elemento 3");

        System.out.println("Topo da Pilha: " + pilha.peek());

        System.out.println("Removido: " + pilha.pop());
        System.out.println("Removido: " + pilha.pop());

        System.out.println("A pilha está vazia? " + pilha.isEmpty());
    }

    public static void pilhaArrayList() {
        /* Qual é a sua vantagem?
         * O ArrayList é mais eficiente em termos de acesso direto aos elementos, pois utiliza índices, tornando mais competente em operações de leitura, além do consumo de memória mais eficiente em alguns casos.
        */
        /* Qual é a sua desvantagem?
         * A inserção/remoção no meio pode ser mais lenta, pois requer realocações de elementos.
         */
        ArrayList<String> pilha = new ArrayList<>();

        pilha.add("Elemento 1");
        pilha.add("Elemento 2");
        pilha.add("Elemento 3");

        System.out.println("Topo da Pilha: " + pilha.get(pilha.size() - 1));

        System.out.println("Removido: " + pilha.remove(pilha.size() - 1));
        System.out.println("Removido: " + pilha.remove(pilha.size() - 1));

        System.out.println("A pilha está vazia? " + pilha.isEmpty());
    }

    /* Conclusão
     * Para pilhas onde as operações frequentes são inserções e remoções no topo (push e pop), LinkedList é a opção.
     * Para pilhas onde o acesso aleatório aos elementos é mais comum e é predominantemente usada como uma estrutura de dados para armazenamento temporário, ArrayList é a opção.
    */

    public static int buscaLinear(int[] vetor, int alvo) {
        /* Oque é?
         * É uma técnica de busca onde um algoritmo de repetição percorre os elementos sequencialmente.
         * -------------------
         Vantagens:
         * Simples de entender e implementar.
         * Funciona em qualquer conjunto de dados, independentemente da ordenação.
         * -------------------
         Desvantagens:
         * Desempenho é proporcional ao tamanho do conjunto de dados, o que pode ser lento para conjuntos grandes.
         * Menos eficiente em conjuntos de dados ordenados quando comparada à busca binária.
        */
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == alvo){
                return i; //Retorna o índice caso encontrado
            }
        }
        return -1; //Retorna -1 caso não seja encontrado
    }

    public static int buscaBinaria(int[] vetor, int alvo) {
        /* Oque é?
         * É uma técnica de busca eficiente em conjuntos ordenados, dividindo o conjunto pela metada a cada iteração.
         * -------------------
         Vantagens:
         * Eficiente para conjuntos de dados ordenados, pois reduz pela metade o espaço de busca a cada iteração.
         * Desempenho médio O(log n), onde n é o tamanho do conjunto de dados.
         * --------------------
         Desvantagens:
         * Requer um conjunto de dados ordenado.
         * A implementação é mais complexa em comparação com a busca linear.
         * Não é adequada para conjuntos de dados que frequentemente mudam, pois a ordenação precisa ser mantida.
        */
        Arrays.sort(vetor); //Certifica se está ordenado

        int esquerda = 0;
        int direita = vetor.length - 1;
        int meio;

        while(esquerda <= direita){
            meio = esquerda + (direita - esquerda) / 2;

            if(vetor[meio] == alvo){
                return meio; //Retorna o índice caso encontrado
            }

            if(vetor[meio] < alvo){
                esquerda = meio + 1;
            }else{
                direita = meio - 1;
            }
        }
        return -1; //Retorna -1 caso não seja encontrado
    }

    //Hashmap --> Revisao_Hashmap_4ºBimestre.java

    //Algoritmos de Ordenação:
    
    //BubbleSort
    /* Oque é?
     * O Bubble Sort é um algoritmo de ordenação simples que percorre repetidamente a lista, compara elementos adjacentes e os troca se estiverem na ordem errada. O processo é repetido até que nenhuma troca seja necessária, indicando que a lista está ordenada.
     * O Bubble Sort é geralmente menos eficiente em termos de desempenho do que algoritmos mais avançados, como o Merge Sort ou o Quick Sort, especialmente para conjuntos de dados grandes. No entanto, é fácil de entender e implementar, sendo útil em situações em que a simplicidade é mais importante do que a eficiência.
     * ----------------
     Vantagens:
     * Simples de entender e implementar.
     * ----------------
     Desvantagens:
     * Desempenho pobre para conjuntos de dados grandes, devido à sua complexidade quadrática.
     * Não eficiente para conjuntos de dados quase ordenados.
     */
    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (vetor[j] > vetor[j+1]) {
                    //troca os elementos se estiverem na ordem errada
                    int temp = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = temp;
                }
            }
        }
    }

    //InsertionSort
    /* Oque é?
     * O Insertion Sort é um algoritmo de ordenação que constrói a sequência ordenada um elemento de cada vez, percorrendo a lista e inserindo cada elemento na posição correta.
     * ----------------
     Vantagens:
     * Simples de implementar.
     * Eficiente para pequenos conjuntos de dados ou listas quase ordenadas.
     * ----------------
     Desvantagens:
     * Desempenho pobre para conjuntos de dados grandes, devido à sua complexidade quadrática.
    */
    public static void insertionSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 1; i < n; ++i) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = chave;
        }
    }

    //SelectionSort
    /* Oque é?
     * O Selection Sort é um algoritmo de ordenação que divide a lista em duas partes: a parte ordenada e a parte não ordenada. Ele encontra o menor elemento na parte não ordenada e o move para a parte ordenada.
     * ----------------
     Vantagens:
     * Simples de entender e implementar.
     * Requer menos trocas em comparação com o Bubble Sort.
     * ----------------
     Desvantagens:
     * Desempenho pobre para conjuntos de dados grandes, devido à sua complexidade quadrática.
     */
    public static void selectionSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = vetor[minIndex];
            vetor[minIndex] = vetor[i];
            vetor[i] = temp;
        }
    }

    //QuickSort
    /* Oque é?
     * O Quick Sort é um algoritmo de ordenação baseado na técnica de divisão e conquista. Ele escolhe um elemento como pivô e particiona a lista ao redor do pivô, colocando os elementos menores à esquerda e os maiores à direita.
     * ----------------
     Vantagens:
     * Eficiente para conjuntos de dados grandes.
     * Abordagem de divisão e conquista.
     * Boa performance média.
     * ----------------
     Desvantagens:
     * Desempenho pode degradar para conjuntos de dados quase ordenados.
     * Não é estável.
    */

    /* Como escolher o pivô?
     * 
     Pivô no meio:
     * Escolhe o elemento do meio do array como pivô;
     * Implementação:
     - 'int pivot = array[(low + high) / 2];'
     * ----------------
     Pivô aleatório:
     * Escolhe um elemento aleatório do array como pivô;
     * Implementação:
     - 'int randomIndex = low + new Random().nextInt(high - low + 1)'
     - 'int pivot = array[randomIndex]';
     * ----------------
     Pivô do primeiro, do meio e do último:
     * Escolhe o elemento do meio entre o primeiro, o do meio e o último como pivô.
     * Implementação:
     - int middleIndex = low + (high - low) / 2;
     - int[] candidates = {array[low], array[middleIndex], array[high]};
     - Arrays.sort(candidates);
     - int pivot = candidates[1]; // Elemento do meio após ordenação
     * ----------------
     Pivô de valor fixo (Fixed Pivot):
     * Escolhe um valor fixo como pivô (por exemplo, o primeiro ou o último elemento).
     * Implementação:
     - int pivot = array[low]; ou int pivot = array[high];
    */

    /* Melhores e Piores Cenários para a Escolha do Pivô:
     Melhores Cenários:
     * Quando o pivô escolhido divide o array aproximadamente ao meio em cada chamada recursiva.
     * Isso ocorre, por exemplo, no caso do pivô aleatório ou do pivô do meio.
     * ----------------
     Piores Cenários:
     * Quando o pivô escolhido resulta em divisões desequilibradas, levando a muitas chamadas recursivas.
     * No pior caso, a escolha de um pivô fixo em um array ordenado ou quase ordenado pode resultar em um desempenho quadrático.
     * ----------------
     Dicas:
     Randomização:
     * A escolha do pivô aleatório ajuda a evitar casos extremos e torna o QuickSort mais robusto contra dados de entrada específicos.
     * ----------------
     Median of Three:
     * A estratégia de escolher o pivô como o elemento do meio entre o primeiro, o do meio e o último é uma tentativa de balancear o particionamento.
     * ----------------
     Implementação Híbrida:
     * Alguns algoritmos de ordenação, como o introsort, usam uma estratégia híbrida que muda para um algoritmo diferente (por exemplo, HeapSort) quando o QuickSort atinge um nível de recursão máximo.
    */

    /*Passos do Quicksort:
     Escolha do Pivô:
     * Um elemento é escolhido como pivô. Existem várias estratégias para a escolha do pivô, como pegar o primeiro, o último, o do meio ou usar uma abordagem mais sofisticada.
     * ----------------
     Particionamento:
     * Reorganize os elementos de modo que os elementos menores que o pivô estejam à esquerda e os elementos maiores estejam à direita. O pivô está agora na posição correta.
     * ----------------
     Recursão:
     * Aplique recursivamente o Quicksort às sublistas à esquerda e à direita do pivô até que toda a lista esteja ordenada.
    */

    public static void quickSort(int[] vetor, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(vetor, low, high);
            quickSort(vetor, low, pivotIndex - 1);
            quickSort(vetor, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] vetor, int low, int high) {
        int pivot = vetor[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (vetor[j] < pivot) {
                i++;
                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }
        int temp = vetor[i + 1];
        vetor[i + 1] = vetor[high];
        vetor[high] = temp;
        return i + 1;
    }

    //MergeSort
    /* Oque é? 
     * O Merge Sort é um algoritmo de ordenação que divide a lista ao meio, ordena cada metade e, em seguida, mescla as duas metades ordenadas para obter a lista final ordenada.
     * ----------------
     Vantagens:
     * Eficiente para conjuntos de dados grandes.
     * Abordagem de divisão e conquista.
     * Estável.
     * ----------------
     Desvantagens:
     * Requer espaço adicional para o processo de mesclagem.
     * ----------------
     * Passos do Merge Sort:
     * Divisão:
     * A lista não ordenada é dividida pela metade recursivamente até que sub-listas de tamanho 1 sejam alcançadas.
     * ----------------
     * Ordenação:
     * As sub-listas são ordenadas de maneira recursiva usando o mesmo algoritmo de Merge Sort.
     * ----------------
     * Mesclagem:
     * As sub-listas ordenadas são mescladas para criar uma lista única e ordenada. A mesclagem é realizada comparando os elementos das sub-listas e organizando-os em ordem crescente.
    */
    public static void mergeSort(int[] vetor, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(vetor, l, m);
            mergeSort(vetor, m + 1, r);
            merge(vetor, l, m, r);
        }
    }

    public static void merge(int[] vetor, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] esquerda = new int[n1];
        int[] direita = new int[n2];
        for (int i = 0; i < n1; ++i)
        esquerda[i] = vetor[l + i];
        for (int j = 0; j < n2; ++j)
        direita[j] = vetor[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (esquerda[i] <= direita[j]) {
                vetor[k] = esquerda[i];
                i++;
            } else {
                vetor[k] = direita[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            vetor[k] = esquerda[i];
            i++;
            k++;
        }
        while (j < n2) {
            vetor[k] = direita[j];
            j++;
            k++;
        }
    }

    //CountingSort
    /* Oque é?
     * O Counting Sort é um algoritmo de ordenação eficiente para classificar elementos cujo intervalo é conhecido. Ele conta o número de elementos de cada valor e usa essa informação para reconstruir a lista ordenada.
     * ----------------
     Vantagens:
     * Eficiente para conjuntos de dados com um intervalo pequeno e conhecido.
     * Linear, o que significa que mantém o mesmo desempenho para conjuntos de dados grandes.
     * Estável.
     * ----------------
     Desvantagens:
     * Não eficiente para conjuntos de dados com intervalos grandes.
    */
    public static int[] countingSort(int[] vetor) {
        int maxVal = getMaxValue(vetor);
        int[] count = new int[maxVal + 1];
        for (int num : vetor) {
            count[num]++;
        }
        int[] result = new int[vetor.length];
        int index = 0;
        for (int i = 0; i <= maxVal; i++) {
            while (count[i] > 0) {
                result[index] = i;
                index++;
                count[i]--;
            }
        }
        return result;
    }

    public static int getMaxValue(int[] vetor) {
        int max = vetor[0];
        for (int num : vetor) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    //RadixSort
    /* O Radix Sort é um algoritmo de ordenação que funciona classificando os elementos com base em suas representações digitais. Ele é especialmente útil para ordenar inteiros ou strings de tamanho fixo. O algoritmo funciona ordenando os elementos primeiro pelo dígito menos significativo e depois para os dígitos mais significativos.
     * ----------------
     Passos do Radix Sort:
     Identificação do Número Máximo de Dígitos:
     * Determine o número máximo de dígitos nos elementos a serem ordenados. Isso ajuda a determinar quantas vezes o processo de ordenação deve ser repetido.
     * ----------------
     Iterações para Cada Dígito:
     * Para cada dígito, do menos significativo para o mais significativo, execute uma etapa de ordenação. Pode-se usar um algoritmo de ordenação estável, como o Counting Sort, para essa etapa.
     * ----------------
     Ordenação por Dígito:
     * Organize os elementos com base no dígito atual durante cada iteração. Isso cria uma ordenação parcial, que é estável.
     * ----------------
     Recombinação dos Elementos:
     * Recomponha os elementos na ordem em que foram classificados nas iterações anteriores.
     * ----------------
     Complexidade:
     * A complexidade de tempo do Radix Sort é O(nk), onde n é o número de elementos e k é o número de dígitos.
     * O Radix Sort é eficiente para ordenar grandes quantidades de dados, especialmente quando o número de dígitos é pequeno em comparação com o número total de elementos.
     * ----------------
     Observações:
     * O Radix Sort pode ser aplicado tanto a inteiros quanto a strings, desde que o tamanho das strings seja fixo.
     * A escolha do algoritmo de ordenação usado para cada passo depende do contexto. O Counting Sort é comumente usado devido à sua eficiência em ordenar números em um intervalo pequeno.
    */

    public static void radixSort(int[] arr) {
        // Encontrar o número máximo para determinar o número de dígitos
        int max = Arrays.stream(arr).max().getAsInt();
        
        // Fazendo a ordenação por dígito
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort_Radix(arr, exp);
        }
    }

    private static void countingSort_Radix(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        // Inicializando o array de contagem
        Arrays.fill(count, 0);

        // Contagem de ocorrências de cada dígito em count[]
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        // Atualização de count[i] para armazenar a posição atual do dígito no output[]
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Construção do array de saída
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // Copiando o array de saída para arr[] para refletir a ordenação
        System.arraycopy(output, 0, arr, 0, n);
    }

    public static void main(String[] args) {

        System.out.println("Revisão para a Prova do 4º Bimestre - 1º TADSS - 2023");

        // Seção sobre Pilhas
        System.out.println("\n----- Seção sobre Pilhas -----");
        Pilha();
        pilhaLinkedList();
        pilhaArrayList();
    
        // Seção sobre Busca Linear e Binária
        System.out.println("\n----- Seção sobre Busca Linear e Binária -----");
        int[] vetor = {2, 5, 8, 12, 16, 23, 38, 42, 51};
        int alvo = 16;
        int resultadoLinear = buscaLinear(vetor, alvo);
        int resultadoBinaria = buscaBinaria(vetor, alvo);
    
        if (resultadoLinear != -1) {
            System.out.println("Busca Linear: Elemento encontrado no índice " + resultadoLinear);
        } else {
            System.out.println("Busca Linear: Elemento não encontrado no vetor.");
        }
    
        if (resultadoBinaria != -1) {
            System.out.println("Busca Binária: Elemento encontrado no índice " + resultadoBinaria);
        } else {
            System.out.println("Busca Binária: Elemento não encontrado no vetor.");
        }
    
        // Seção sobre Algoritmos de Ordenação
        System.out.println("\n----- Seção sobre Algoritmos de Ordenação -----");
        int[] vetorOrdenacao = {5, 2, 8, 12, 1, 16, 7};
        System.out.println("Vetor antes da ordenação: " + Arrays.toString(vetorOrdenacao));
    
        // Exemplo de ordenação usando Quick Sort
        quickSort(vetorOrdenacao, 0, vetorOrdenacao.length - 1);
        System.out.println("Vetor após Quick Sort: " + Arrays.toString(vetorOrdenacao));
    
        // Exemplo de ordenação usando Merge Sort
        mergeSort(vetorOrdenacao, 0, vetorOrdenacao.length - 1);
        System.out.println("Vetor após Merge Sort: " + Arrays.toString(vetorOrdenacao));
    
        // Exemplo de ordenação usando Counting Sort
        int[] vetorCountingSort = {5, 2, 8, 5, 12, 1, 16, 7, 16};
        System.out.println("Vetor antes do Counting Sort: " + Arrays.toString(vetorCountingSort));
        int[] vetorCountingSorted = countingSort(vetorCountingSort);
        System.out.println("Vetor após Counting Sort: " + Arrays.toString(vetorCountingSorted));

        // Exemplo de ordenação usando Radix Sort
        System.out.println("Array antes do Radix Sort: " + Arrays.toString(vetor));
        radixSort(vetor);
        System.out.println("Array após o Radix Sort: " + Arrays.toString(vetor));
    }
}
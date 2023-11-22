//Aula de Ordenação - Quick Sort - Particionamento

/* O'que é?
 * Quick Sort é um algoritmo eficiente de ordenação por divisão e conquista. Apesar de ser da mesma classe de complexidade do Merge Sort e do Heap Sort, o Quick Sort é na prática o mais veloz deles, pois suas constantes são menores. Contudo, é importante destacar de antemão que, em seu pior caso, o Quick Sort é O(n2), enquanto que o Merge Sort e o Heap Sort garantem n∗logn para todos os casos. A boa notícia é que há estratégias simples com as quais podemos minimizar as chances de ocorrência do pior caso. O funcionamento do Quick Sort baseia-se em uma rotina fundamental cujo nome é particionamento.
 * Particionar significa escolher um número qualquer presente no array, chamado de pivot, e colocá-lo em uma posição tal que todos os elementos à esquerda são menores ou iguais e todos os elementos à direita são maiores. 
*/

/** Links:
 * https://joaoarthurbm.github.io/eda/posts/quick-sort/
*/

public class aula22112023 {

    public static void quick_sort(int[] V){
        quick_sort(V, 0, V.length - 1);
    }

    public static void quick_sort(int[] V, int INI, int FIM){
        if(INI < FIM){
            int pos_pivot = particionamento(V, INI, FIM);
            quick_sort(V, INI, pos_pivot - 1);
            quick_sort(V, pos_pivot + 1, FIM);
        }
    }

    public static int particionamento(int[] V, int INI, int FIM){
        int i, j = INI + 1;
        int k = 0, pivot = INI;

        for(i = INI; i < FIM; i ++){
            k ++;
        }
        return k;
    }

    public static void main(String[] args) {
        
    }
}
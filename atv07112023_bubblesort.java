/* Atividade em sala de aula - Bubble Sort ------------------------------------------------------------------------------------------------------------------
    O'que é Bubble Sort?
    É um algoritmo de ordenação que pode ser aplicado em Arrays e Listas dinâmicas.
    Se o objetivo é ordenar os valores em forma decrescente, então, a posição atual é comparada com a próxima posição e, se a posição atual for maior que a posição posterior, é realizada a troca dos valores nessa posição.

    Princípio?
    A idéia da ordenação por bolhas é flutuar o maior elemento para o fim. Repita n vezes a flutuação.

    Para que serve?
    O Bubble Sort baseia-se na ideia de comparar repetidamente pares de elementos adjacentes e, em seguida, trocar as suas posições se existirem na ordem errada. Algoritmo de classificação de bolhas: Em uma matriz não classificada de 5 elementos, comece com os dois primeiros elementos e classifique-os em ordem crescente.

    Links:
    https://ww2.inf.ufg.br/~hebert/disc/aed1/AED1_04_ordenacao1.pdf
    https://embarcados.com.br/algoritmos-de-ordenacao-bubble-sort/#:~:text=Bubble%20Sort%20%C3%A9%20um%20algoritmo,troca%20dos%20valores%20nessa%20posi%C3%A7%C3%A3o.
    https://blog.betrybe.com/tecnologia/bubble-sort-tudo-sobre/#:~:text=O%20Bubble%20Sort%20baseia%2Dse,classifique%2Dos%20em%20ordem%20crescente.
------------------------------------------------------------------------------------------------------------------------------------------------------------*/ 

import java.util.Scanner;

class atv07112023{

    public static void troca(int []vetor, int pos_a, int pos_b){
        int aux = vetor[pos_b];
        vetor[pos_b] = vetor[pos_a];
        vetor[pos_a] = aux;
    }

    public static void main(String[] args){
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
        //saída
        for(i = 0; i < valores.length; i++){
        System.out.printf("%d ", valores[i]);
        }
        System.out.println("\n");
    }
}

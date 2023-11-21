//Aula de Ordenação - MergeSort
/* O'que é MergeSort?
 * Merge Sort é um algoritmo eficiente de ordenação por divisão e conquista. Se nossa missão é ordenar um array comparando seus elementos, do ponto de vista assintótico, n∗logn é o nosso limite inferior. Ou seja, nenhum algoritmo de ordenação por comparação é mais veloz do que n∗logn
 * Formalmente, todos são Ω(n∗logn)
 * No caso do Merge Sort, uma característica importante é que sua eficiência é n∗logn para o melhor, pior e para o caso médio. Ou seja, ele não é somente Ω(n∗logn) mas é Θ(n∗logn). Isso nos dá uma garantia de que, independente da disposição dos dados em um array, a ordenação será eficiente.
*/

/* O'que é Merge?
 * Merge é a rotina que combina dois arrays (vetores) ordenados em um outro também ordenado.
 * Vídeo --> https://youtu.be/7fb8H-MCQ7c
 * Na prática, não queremos ficar criando arrays separados para uni-los. Isso custa memória e processamento, pois a cada array criado temos que transferir os elementos do array original para ele. O que fazemos então é organizar os dados no array a ser ordenado de forma que uma parte dele esteja ordenada e outra também. Assim, no Merge Sort não fazemos o merge de dois arrays, mas fazemos o merge de duas partes ordenadas de um mesmo array. Veja o vídeo abaixo com essa explicação bem detalhada.
 * Vídeo --> https://youtu.be/sXddmV3sfjA
*/

/* Links:
 * https://joaoarthurbm.github.io/eda/posts/merge-sort/
 * https://www.blogcyberini.com/2018/07/merge-sort.html
*/

public class aula21112023 {
    public static int[] merge(int[] VA, int[] VB){
        //Variáveis
        int[] VC;
        int i = 0, j = 0, k = 0, tam;
        tam = VA.length + VB.length;

        //Entrada
        VC = new int[tam];
        if(VA.length == 0) return VB;
        if(VA.length == 0) return VA;

        //Processamento
        while(k < tam){
            if( i < VA.length && j < VB.length){
                if(VA[i] <= VB[j]){
                    VC[k] = VA[i];
                    i ++;
                } else{
                    VC[k] = VB[j];
                    j ++;
                }
            } else{
                if(j >= VA.length){
                    VC[k] = VB[j];
                    j ++;
                } else{
                    VC[k] = VA[i];
                    i ++;
                }
            }
            k ++;
        }
        return VC;
    }

    public int[] mergeSort(int[] V){
        int[] VR, VE, VD;
        int MEIO;

        if(< 1){

        }

        MEIO = V.length / 2;
        VE = vetor_sub(V, 0, MEIO);
        VD = vetor_sub(V, MEIO, V.length);

        VR = merge(mergeSort(VE), mergeSort(VD));

        return VR;
    }


    public static int[] vetor_sub(int[] V, int INI, int FIM) {
        int[] VR = new int[FIM - INI];
        int i, k = 0;

        for(i = INI; i < FIM; i ++){
            VR[k] = V[i];
            k ++;
        }
        return VR;
    }

    public static void main(String[] args) {
        // int[] V1 = {5, 7 , 9, 11};
        // int[] V2 = {6, 10, 12, 15};
        // int[] VV;
        // int[] res = merge(V1, V2);

        // for(int i = 0; i < res.length; i ++){
        //     System.out.printf("%d ", res[i]);
        //     System.out.println();
        // }

        int i;
        int[] V1 = {42, 13, 27, 9, 2, 55, 22, 94, 1, 200, 0, 300};
        int[] VR = mergeSort();

        VV = mergeSort(V1);
        
    }
}

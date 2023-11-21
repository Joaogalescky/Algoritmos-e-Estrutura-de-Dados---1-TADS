/* Select Sort
Oque é?
A ordenação por seleção ou selection sort consiste em selecionar o menor item e colocar na primeira posição, selecionar o segundo menor item e colocar na segunda posição, segue estes passos até que reste um único elemento.

Princípio?
A ordenação por seleção consiste, em cada etapa, em selecionar o maior (ou o menor) elemento e colocá-lo em sua posição correta dentro da futura lista ordenada. duas sub listas, uma contendo os itens já ordenados e a outra com os restantes ainda não ordenados.

Links:
https://www.treinaweb.com.br/blog/conheca-os-principais-algoritmos-de-ordenacao#:~:text=A%20ordena%C3%A7%C3%A3o%20por%20sele%C3%A7%C3%A3o%20ou,que%20reste%20um%20%C3%BAnico%20elemento.
http://www.univasf.edu.br/~marcelo.linder/arquivos_aed2/aulas/aula13.pdf
*/


public class aula08112023_select_sort {
   
    public static void troca(int []vetor, int pos_a, int pos_b){
        int aux = vetor[pos_b];
        vetor[pos_b] = vetor[pos_a];
        vetor[pos_a] = aux;
    }

    public static void selection_sort(int[] valores) {
        int i, j, menor_val, menor_pos;

        for(i = 0; i < valores.length - 1; i++){
            menor_pos = i;
            menor_val = valores[i];

            for(j = i + 1; j < valores.length; j++){
                if(valores[j] < menor_val){
                    menor_val = valores[j];
                    menor_pos = j;
                }
            }
            troca(valores, i, menor_pos);
        }

        for(i = 0; i < valores.length; i++){
            System.out.printf("%d ", valores[i]);
        }
        System.out.println("\n");
    }
    
    public static void main(String[] args) {
        int[] x = new int []{0, 77, 25, 66, 13, 4};
        selection_sort(x);
    }
}
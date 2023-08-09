package vetores_vetor;

import java.util.Scanner;

public class atv_08_08_2023{

    public static void beecrowd_1174() {

        //beecrowd 1174 - Seleção em Vetor I
        /*Faça um programa que leia um vetor A[100]. No final, mostre todas as posições do vetor que armazenam um valor menor ou igual a 10 e o valor armazenado em cada uma das posições. */
        
        //variaveis
        Scanner entrada = new Scanner (System.in);
        int n = 4;
        float[] A = new float[n];
        
        //processamento
        for(int i = 0; i < n; i++){
            A[i] = entrada.nextFloat();
        }
        entrada.close();

        for(int i = 0; i < n; i++){
            if(A[i] <= 10){
                System.out.printf("A[%d] = %.1f\n", i, A[i]);
            }
        }
    }

    public static void beecrowd_1180() {
        
        //beecrowd 1180 - Menor e Posição
        /*Faça um programa que leia um valor N. Este N será o tamanho de um vetor X[N]. A seguir, leia cada um dos valores de X, encontre o menor elemento deste vetor e a sua posição dentro do vetor, mostrando esta informação.*/

        //variaveis

        int N, i, menor_valor = 0, posicao = 0;
        int[] X;

        //entrada
        Scanner entrada = new Scanner (System.in);
        N = entrada.nextInt();
        X = new int [N];

        //processamento
        for(i = 0; i < N; i++){ //Pode ser "N" ou "X.length"
            X[i] = entrada.nextInt();
        }
        menor_valor = X[0];
        
        for(i = 1; i < X.length; i++){
            if(X[i] < menor_valor) {
            menor_valor = X[i];
            posicao = i;
            }
        }  
        System.out.printf("Menor valor: %d\n", menor_valor);
        System.out.printf("Posicao: %d\n", posicao);
    }

    // public static void beecrowd_1175() {

        //beecrowd 1175 - Troca em Vetor I
        /*Faça um programa que leia um vetor N[20]. Troque a seguir, o primeiro elemento com o último, o segundo elemento com o penúltimo, etc., até trocaro 10º com o 11º. Mostre o vetor modificado. */

        //Vetor = Vetor posicao [0] Vetor posicao [1] ...[2] [3] [4] [5] [6] [7] [8] [9] [10] [11] [12] [13] [14] [15] [16] [17] [18] [19] [20]

        int x, y, aux, t = 10;
        int [] N;

        Scanner entrada = new Scanner (System.in);
        N = new int [t];

        for(int i = 0; i < N.length; i++){
            N[i] = entrada.nextInt();
        }
        while(x < y){
            aux = N[x];
            N[x] = N[y];
            N[y] = aux;
            x = x + 1;
            y = y - 1;
        }
    //     System.out.printf("N[%d] = %d\n", i, N[] );

        
    // }
    
    public static void main(String[] args) {
        //beecrowd_1174();
        //beecrowd_1180();
    }
}
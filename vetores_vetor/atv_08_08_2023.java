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
        Scanner entrada = new Scanner (System.in);
        int N, i, menor_valor = 0, posicao = 0;
        int[] X;

        //entrada
        N = entrada.nextInt();
        X = new int [N];

        //processamento
        if(N > 1 && N < 1000){
            for(i = 0; i < N; i++){ //Pode ser "N" ou "X.length"
                X[i] = entrada.nextInt();
            }
            entrada.close();
            for(i = 0; i < X.length; i++){
                if(X[i] < menor_valor){
                    menor_valor = X[i];
                    posicao = i;
                }
            }
            System.out.printf("Menor valor: %d\n", menor_valor);
            System.out.printf("Posicao: %d\n", posicao);
        }else{
            System.out.println("Operação inválida, tente N entre 1 a 1000\n");
        }
    }

    public static void main(String[] args) {
        //beecrowd_1174();
        beecrowd_1180();
    }
}



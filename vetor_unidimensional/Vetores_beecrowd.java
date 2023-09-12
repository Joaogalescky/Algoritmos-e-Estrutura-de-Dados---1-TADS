package vetor_unidimensional;

import java.util.Scanner;

public class Vetores_beecrowd{

    /*Arquivo de atividades do beecrowd sobre Vetores*/

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

    // }

    public static void beecrowd_1177() {

        //beecrowd 1177 - Preenchimento de Vetor I
        /*Faça um programa que leia um valor T e preencha um vetor N[1000] com a sequência de valores de 0 até T-1 repetidas vezes, conforme exemplo abaixo. Imprima o vetor N. */
    
        //variáveis
        int T;
        int[] N;
        
        //entrada
        Scanner entrada = new Scanner (System.in);
        T = entrada.nextInt();
        N = new int [1000]; //Vetor vai ter memória para 1000 valores
                    
        //processamento
        if(T >= 2 && T <= 50){ //If de enquadramento das condições
            for(int i = 0; i < 1000; i ++){ //Sistema de repetição
                N[i] = i % T; //Calculo para preencher o vetor "N" com a sequência de 0 até T-1
            }
            for(int i = 0; i < 1000; i ++){  //Sistema de repetição para imprimir "N"
                System.out.printf("N[%d] = %d\n", i, N[i]);
            }
        } else{
            System.out.println("Operação inválida, tente com um entrada entre 2 e 50\n");
        }
    }

    public static void beecrowd_1175(){

        //beecrowd_1175 - Troca em Vetor I.
        /*Faça um programa que leia um vetor N[20]. Troque a seguir, o primeiro elemento com o último, o segundo elemento com o penúltimo, etc., até trocar o 10º com o 11º. Mostre o vetor modificado. */

        //variáveis.
        int[] N = new int [20];
        int aux;
        
        //entrada.
        Scanner entrada = new Scanner (System.in);
        
        //processamento.
        //System.out.println("Digite 20 valores para o vetor 'N'\n");
        for(int i = 0; i < N.length; i ++){ //Sistema de repetição para entrada dos valores do vetor (Pode sere 'N.length' ou '20').
            N[i] = entrada.nextInt();
        }
        //Trocar as posições dos 10 primeiros valores pelos 10 últimos.
        for(int i = 0; i < 10; i++){ //Sistema de repetição para troca das posições dos ultimos valores para os primeiros valores.
            aux = N[i]; //armz valor do elemento atual.
            N[i] = N[19 - i]; //trocando o valor atual pelo ultimo valor.
            N[19 - i] = aux; //armz ultimo valor do elemento na posicao atual.
            //Por quê 19? Pois os 20 valores na memória começam de 0 a 19.
        }
        entrada.close();

        for(int i = 0; i < 20; i ++){ //Sistema de repetição para saída do resultado.
            System.out.printf("N[%d] = %d\n", i, N[i]);
        }
    }

    public static void beecrowd_2310(){

        //beecrowd_2310 - 
        /*Explicação
        Um treinador de voleibol gostaria de manter estatísticas sobre sua equipe. A cada jogo, seu auxiliar anota quantas tentativas de saques, bloqueios e ataques cada um de seus jogadores fez, bem como quantos desses saques, bloqueios e ataques tiveram sucesso (resultaram em pontos). Seu programa deve mostrar qual o percentual de saques, bloqueios e ataques do time todo tiveram sucesso. 
        */

        /*Entrada
        A entrada é dada pelo número de jogadores N (1 ≤ N ≤ 100), seguido pelo nome de cada um dos jogadores. Abaixo do nome de cada jogador, seguem duas linhas com três inteiros cada. Na primeira linha S, B e A (0 ≤ S,B,A ≤ 10000) representam a quantidade de tentativas de saques, bloqueios e ataques e na segunda linha, S1, B1 e A1 (0 ≤ S1 ≤ S; 0 ≤ B1 ≤ B; 0 ≤ A1 ≤ A) com o número de saques, bloqueios e ataques deste jogador que tiveram sucesso.
        */

        /*Saída
        A saída deve conter o percentual total de saques, bloqueios e ataques do time todo que resultaram em pontos, conforme mostrado no exemplo.
        */

        /*Exemplo
        Entrada	
        3
        Renan
        10 20 12
        1 10 9
        Jonas
        8 7 1
        2 7 0
        Edson
        3 3 3
        1 2 3

        Exemplo de Saída
        Pontos de Saque: 19.05 %.
        Pontos de Bloqueio: 63.33 %.
        Pontos de Ataque: 75.00 %.
        */
            
        //variáveis
        Scanner entrada = new Scanner(System.in);
        String nome;
        int N;

        double total_de_saques = 0, total_saques_sucesso = 0;
        double total_de_bloqueios = 0, total_bloqueios_sucesso = 0;
        double total_de_ataques = 0, total_ataques_sucesso = 0;

        double percentual_sucesso_saques;
        double percentual_sucesso_bloqueios;
        double percentual_sucesso_ataques;

        //entrada
        N = entrada.nextInt();

        //processamento
        for (int i = 0; i < N; i++) {
            nome = entrada.next();
            int[] tentativas = new int[3];
            int[] sucessos = new int[3];

            for (int i2 = 0; i2 < 3; i2++) {
                tentativas[i2] = entrada.nextInt();
            }
            for (int i2 = 0; i2 < 3; i2++) {
                sucessos[i2] = entrada.nextInt();
            }

            total_de_saques += tentativas[0];
            total_saques_sucesso += sucessos[0];
            total_de_bloqueios += tentativas[1];
            total_bloqueios_sucesso += sucessos[1];
            total_de_ataques += tentativas[2];
            total_ataques_sucesso += sucessos[2];
        }
        entrada.close();

        //saida
        percentual_sucesso_saques = calculo_Percentual((int) total_de_saques, (int) total_saques_sucesso);
        percentual_sucesso_bloqueios = calculo_Percentual((int) total_de_bloqueios, (int) total_bloqueios_sucesso);
        percentual_sucesso_ataques = calculo_Percentual((int) total_de_ataques, (int) total_ataques_sucesso);

        System.out.printf("Pontos de Saque: %.2f %%.\n", percentual_sucesso_saques);
        System.out.printf("Pontos de Bloqueio: %.2f %%.\n", percentual_sucesso_bloqueios);
        System.out.printf("Pontos de Ataque: %.2f %%.\n", percentual_sucesso_ataques);
    }

    public static double calculo_Percentual(int total_tentativas, int total_sucessos) {
        if(total_tentativas == 0){
            return 0;
        }
        return ((double) total_sucessos / total_tentativas) * 100;
    }

    public static void main(String[] args) {
        //beecrowd_1174();
        //beecrowd_1180();
        //beecrowd_1177();
        //beecrowd_1175();
        //beecrowd_2310();
    }
}

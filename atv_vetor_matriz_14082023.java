import java.util.Scanner;

class atv_vetor_matriz_14082023{

    public static void atv_EX(){

        //variáveis e entrada
        int[][] matriz = {
            {10,20,30,40},
            {50,60,70,80},
            {90,100,110,120},
            {130, 140, 150, 160}};
        
        int n_linhas = 4, n_colunas = 4;

        //processamento
        for(int i = 0; i < n_linhas; i ++){
            for(int j = 0; j < n_colunas; j ++){
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static void atv_1EAD(){

        //variáveis
        int[][] matriz;
        int i, j;
        int n_linhas = 7, n_colunas = 7;

        matriz = new int [n_linhas][n_colunas];

        //processamento
        for(i = 0; i < n_linhas; i ++){
            for(j = 0; j < n_colunas; j ++){
                if(i == 0 || i == n_linhas - 1 || j == 0 || j == n_colunas-1){
                    matriz[i][j] = 1;
                }else{
                    matriz[i][j] = 9;
                }
            }
        }

        for(i = 0; i < n_linhas; i ++){
            for(j = 0; j < n_colunas; j ++){
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static void atv_7EAD() {
        
        /*Leia uma matriz 4x4. Em seguida, mostre a quantidade de valores menores que 10 existentes na matriz.*/

        //variáveis
        Scanner entrada = new Scanner (System.in);
        int[][] matriz;
        int i, j, n_linhas = 4, n_colunas = 4, aux;

        matriz = new int [n_linhas][n_colunas];

        //processamento
        for(i = 0; i < n_linhas; i ++){
            for(j = 0; j < n_colunas; j ++){
                matriz[i][j] = entrada.nextInt();
                if(matriz[i][j] < 10){
                    System.out.printf("Esses são os valores menores que 10: %d", matriz[i][j]);
                }
            }
        }

        for(i = 0; i < n_linhas; i ++){
            for(j = 0; j < n_colunas; j ++){
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //atv_EX();
        //atv_1EAD();
        //atv_2EAD();
    }
}

import java.util.Scanner;

class atv_vetor_matriz_16082023{

    public static int[][] matrizNovaInt(int numero_linhas, int numero_colunas){
        int[][] matriz;
        matriz = new int [numero_linhas][numero_colunas];
        return matriz;
    }

    public static String[][] matrizNovaString (int numero_linhas, int numero_colunas){
        String[][] matriz;
        matriz = new String [numero_linhas][numero_colunas];
        return matriz;
    }

    public static void matrizPrintInt (int [][] matriz){
        int i, j;
        for(i = 0; i < matriz.length; i ++){
            for( j = 0; j < matriz[0].length; j++){
                System.out.printf("%d ", matriz[i][j]);
            }
        }
    }

    public static void matrizPrintString (String [][] matriz){
        int i, j;
        for(i = 0; i < matriz.length; i ++){
            for( j = 0; j < matriz[0].length; j++){
                System.out.printf("%d ", matriz[i][j]);
            }
        }
    }

    public static int[][] matrizPreencherInt (int[][] matriz, int valor){
        int i, j;
        for(i = 0; i < matriz.length; i ++){
            for( j = 0; j < matriz[0].length; j++){
                matriz[i][j] = valor;
            }
        }
        return matriz;
    }

    public static String[][] matrizPreencherString (String [][] matriz, String valor){
        int i, j;
        for(i = 0; i < matriz.length; i ++){
            for( j = 0; j < matriz[0].length; j++){
                matriz[i][j] = valor;
            }
        }
        return matriz;
    }

    public static void main (String [] args){
        int[][] n;
        int n_linhas = 4, n_colunas = 6;
        int valor = 5;

        n = matrizNovaInt(n_linhas, n_colunas);
    }
}
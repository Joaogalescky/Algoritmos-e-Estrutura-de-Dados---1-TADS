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
            for(j = 0; j < matriz[0].length; j++){
                System.out.printf("%d ", matriz[i][j]);
            }
        }
    }

    public static void matrizPrintString (String [][] matriz){
        int i, j;
        for(i = 0; i < matriz.length; i ++){
            for(j = 0; j < matriz[0].length; j++){
                System.out.printf("%d ", matriz[i][j]);
            }
        }
    }

    public static int[][] matrizPreencherInt (int[][] matriz, int valor){
        int i, j;
        for(i = 0; i < matriz.length; i ++){
            for(j = 0; j < matriz[0].length; j++){
                matriz[i][j] = valor;
            }
        }
        return matriz;
    }

    public static String[][] matrizPreencherString (String [][] matriz, String valor){
        int i, j;
        for(i = 0; i < matriz.length; i ++){
            for(j = 0; j < matriz[0].length; j++){
                matriz[i][j] = valor;
            }
        }
        return matriz;
    }

    public static int[][] matrizGetLinhaInt (int[][] matriz, int l){
        int [] linha;
        int j;

        linha = new int[matriz[0].length];

        for(j = 0; j < matriz[0].length; j ++){
            linha[j] = matriz[l][j];
        }
        return linha;
    }

    public static int[][] matrizGetColunaInt (int[][] matriz, int c){
        int [] coluna;
        int j;

        coluna = new int[matriz[0].length];

        for(j = 0; j < matriz[0].length; j ++){
            coluna[j] = matriz[j][c];
        }
        return coluna;
    }

    public static void vetorPrintInt (int [] vetor){
        int i;
        for(i = 0; i < matriz.length; i ++){
            System.out.printf("%d ", vetor[i]);
        }
        System.out.println();
    }

    public static boolean vetorValoresIguaisInt(int[] vetor){
        int i, v;
        v = vetor[0];
        for(i = 1; i < vetor.length; i++){
            if(vetor[i] != v){
                return false;
            }
        }
        return true;
    }

    public static void main (String [] args){

        int[][] m;
        int [] l;
        int n_linhas = 4, n_colunas = 6;
        int valor = 5;
        int linha = 1;

        m = matrizNovaInt(n_linhas, n_colunas);
        m = matrizPreencherInt(m, valor);
        matrizPrintInt(m);
        m = matrizGetLinhaInt(m, linha);
        l = matrizGetColunaInt(m, 1);
        System.out.println("=====");
        vetorPrintInt(l);
        m[1][3] = 0;
        System.out.println("=====");
        vetorPrintInt(l);
    }
}
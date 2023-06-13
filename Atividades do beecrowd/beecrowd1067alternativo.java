import java.util.Scanner;

//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.
//Entrada
//O arquivo de entrada contém 1 valor inteiro qualquer.
//Saída
//Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.

public class beecrowd1067alternativo {
    public static void main(String [] args) {

        //variaveis
        Scanner entrada;
        int X, i;

        //entrada
        entrada = new Scanner(System.in);
        X = entrada.nextInt();
        entrada.close();
        i = 1;

        //processamento e saida
            while(i<=X){
                if(i%2!=0){
                    System.out.printf("%d\n", i);
            }
            i++;
        }
    }
}

//Utilizei o vídeo abaixo como interpretação e adaptei para Java.
//https://www.youtube.com/watch?v=W81_pmtaKgM
import java.util.Scanner;

//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.
//Entrada
//O arquivo de entrada contém 1 valor inteiro qualquer.
//Saída
//Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.

public class beecrowd1067 {
    public static void main(String [] args) {

        //variaveis
        Scanner entrada;
        int X, i;

        //entrada
        entrada = new Scanner(System.in);
        X = entrada.nextInt();
        entrada.close();

        //processamento e saida
        //"i" assume valor de "X", caso "i" for diferente de 0, então "i" sera subtraido por -1;
        //"i" atua como repetidor até que chegue em 0
            for(i=X;i!=0;i--){
                //se o resto da divisão de "i" por 2 for diferente de 0, então ele vai dar a saída "System.out.printf"
                if(i%2!=0){
                    System.out.printf("%d\n", i);
            }
        }
    }
}

//Utilizei o vídeo abaixo como interpretação e adaptei para Java.
//https://www.youtube.com/watch?v=-Eew_qkGdJ0
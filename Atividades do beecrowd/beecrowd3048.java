import java.util.Scanner;

public class beecrowd3048{
    public static void main(String [] args) {

        //variaveis
        int N, Ni, i;

        //entrada
        Scanner entrada = new Scanner (System.in);
        N = entrada.nextInt();
        Ni = 1;
        entrada.close();

        //processamento e saida

        for(i=0;i>N;i++){
            System.out.printf("%d ", Ni);
        }
    }
}
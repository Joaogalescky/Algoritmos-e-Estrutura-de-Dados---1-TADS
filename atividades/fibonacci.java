package atividades;
import java.util.Scanner;

public class fibonacci {
 //Sequência lógica de fibonatti

    public static void main(String[] args) {
        int n, i, v1, v2,fibonacci;
        Scanner entrada;

        entrada = new Scanner(System.in);
        n = entrada.nextInt();
        fibonacci = 1;
        v1 = 1;
        v2 = 1;

        for (i=3;i<=n;i++) {
            fibonacci = v1 + v2;
            v1 = v2;
            v2 = fibonacci;
            entrada.close();
        }
        System.out.printf("%d", fibonacci);
    }
}
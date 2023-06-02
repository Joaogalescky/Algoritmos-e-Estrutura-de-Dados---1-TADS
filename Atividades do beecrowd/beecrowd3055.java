import java.util.Scanner;

public class beecrowd3055 {
 
    public static void main(String[] args) {
 
    //variaveis
    int A, B, M;
    Scanner entrada;
 
    //entrada
    entrada = new Scanner(System.in);
    A = entrada.nextInt();
    M = entrada.nextInt();
    entrada.close();
    
    //processamento e saida
    //Se a média é NOTA A + NOTA B dividido por 2, para descobrir um valor perdido, é só fazer MÉDIA vezes 2 - A
        B = 2*M - A;
        System.out.printf("%d\n", B);
        }
     }
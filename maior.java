import java.util.Scanner;

public class maior {
    public static void main(String [] args){
        //variáveis
        int A, B, C;
        Scanner entrada;

        //entrada
        entrada = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        A = entrada.nextInt();
        System.out.println("Digite o valor de B: ");
        B = entrada.nextInt();
        System.out.println("Digite o valor de C: ");
        C = entrada. nextInt();
        entrada.close();

        //processamento e saída
        if(A>B && A>C)
            System.out.printf("O maior número é: %d", A);
        if(B>A && B>C)
            System.out.printf("O maior número é: %d", B);
        if(C>A && C>B)
            System.out.printf("O maior número é: %d", C);
    }
}
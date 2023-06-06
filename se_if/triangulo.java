import java.util.Scanner;

class triangulo {
    public static void main(String[] args){
        //variáveis
        float A, B, C;
        Scanner entrada;

        //entrada
        entrada = new Scanner(System.in);
        System.out.println("Digete o valor de A: ");
        A = entrada.nextFloat();
        System.out.println("Digete o valor de B: ");
        B = entrada.nextFloat();
        System.out.println("Digete o valor de C: ");
        C = entrada.nextFloat();
        entrada.close();

        //processamento e saida
        if(A>=B+C || B>=A+C || C>=A+B){
            System.out.println("Não é possível formar um triângulo.");
        }else
        {
            System.out.println("É possível formar um triângulo.");
        }
    }
}
package se;
import java.util.Scanner;

class calculadora2 {

    public static void main(String[] args) {
    
        //variáveis
        String operador;
        float A, B;
        Scanner entrada;
    
        //entrada
        entrada = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        A = entrada.nextFloat();
        System.out.println("Digite um operador (+), (-), (*) ou (/): ");
        operador = entrada.next();
        System.out.println("Digite o valor de B: ");
        B = entrada.nextFloat();
        entrada.close();
    
        //processamento e saida
        if (operador.equals("+") ){
            System.out.printf("Seu resultado é: %.2f+%.2f=%.2f\n", A, B, A+B);
        }
        if (operador.equals("-") ){
            System.out.printf("Seu resultado é: %.2f-%.2f=%.2f\n", A, B, A-B);
        }
        if (operador.equals("*") ){
            System.out.printf("Seu resultado é: %.2f*%.2f=%.2f\n", A, B, A*B);
        }
        if (operador.equals("/") ){
            System.out.printf("Seu resultado é: %.2f/%.2f=%.2f\n", A, B, A/B);
        }
    
        if(!operador.equals("+") && operador.equals("-") && operador.equals("+") && operador.equals("/")){
            System.out.printf("Operador invalido.");
        }
    }  
}

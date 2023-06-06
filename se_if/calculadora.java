import java.util.Scanner;

class calculadora {
    public static void main(String[] args) {
    
    //variáveis
    String operador;
    float A, B, result;
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
        result = A+B;
        System.out.printf("Seu resultado é: %.2f", result);
    }
    if (operador.equals("-") ){
        result = A-B;
        System.out.printf("Seu resultado é: %.2f", result);
    }
    if (operador.equals("*") ){
        result = A*B;
        System.out.printf("Seu resultado é: %.2f", result);
    }
    if (operador.equals("/") ){
        result = A/B;
        System.out.printf("Seu resultado é: %.2f", result);
    }
    }
}

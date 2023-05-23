package atividades;
import java.util.Scanner;

class soma{
    public static void main (String[] args) {
    //variaveis
    int A, B, soma;
    Scanner entrada;

    //entrada
    entrada = new Scanner(System.in);
    A = entrada.nextInt();
    B = entrada.nextInt();
    entrada.close();

    //processamento
    soma = A + B;

    //saida
    System.out.printf("SOMA = %d", soma);

    }

}


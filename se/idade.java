package se;
import java.util.Scanner;

class idade{
    public static void main(String[] args){
        //variáveis
        int idade;
        Scanner entrada;
        
        //entrada
        entrada = new Scanner(System.in);
        System.out.println("Digite sua idade");
        idade = entrada.nextInt();
        entrada.close();

        //processamento e saída
        System.out.printf("Parabéns! você tem %d anos.\n", idade);

        if(idade >= 18)
        {
            System.out.println ("Você é maior de idade");
        }
    }
}
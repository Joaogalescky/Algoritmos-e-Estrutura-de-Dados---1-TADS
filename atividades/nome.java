package atividades;
import java.util.Scanner;

public class nome{
    public static void main(String[] args){
        //variáveis
        String nome;
        Scanner entrada;

        //entrada
        entrada = new Scanner(System.in);
        System.out.println("Seu nome: ");
        nome = entrada.next();
        entrada.close();

        //Saída
        System.out.printf("Boa noite, %s.\n", nome);
    }
}
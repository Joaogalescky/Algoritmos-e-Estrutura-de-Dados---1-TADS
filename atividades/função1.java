package atividades;
//Atividade de desenvolvimento de um código com funções para fatorial

import java.util.Scanner;

public class função1{

    public static int fatorial (int X){
        int i, f =1;

        for(i=1;i<=X;i++){
            f = f*i;
        }
        return f;
    }

    public static void main(String [] args){

        //variaveis
        int X;
        int retorno;

        //entrada
        Scanner entrada = new Scanner (System.in);
        System.out.println("Entre com um valor");
        X = entrada.nextInt();
        retorno = fatorial(X);
        System.out.printf("%d! = %d\n", X, retorno);
        entrada.close();

        //processamento e saida
    }
}


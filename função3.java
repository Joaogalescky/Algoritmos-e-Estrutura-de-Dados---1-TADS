//Atividade de desenvolvimento de um código com funções para um numero perfeito

import java.util.Scanner;

public class função3{

    public static boolean perfeito(int valor){
        int i, calc=0;
        
        for(i=1;i<valor;i++){
            if(valor%i==0){
                calc = calc + i;
            }
        }

        if(calc==valor){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String []args ){

        //variaveis
        int X;
        Boolean perf;

        //entrada
        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite um valor para descobrir se é perfeito:");
        X = entrada.nextInt();
        entrada.close();
        perf = perfeito(X);

        //processamento e saida
        if(perf){
            System.out.println("É perfeito");
        } else{
            System.out.println("Não é perfeito");
        }
        
    }
}


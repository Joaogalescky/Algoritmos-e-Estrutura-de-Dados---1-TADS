//Elabore um código em Portugol ou em Java para a seguinte pergunta.
//Desenvolva um código que leia de 1 a 99 os números por extenso.

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args){

    //variáveis
    int X;
    Scanner entrada;

    //entrada
    entrada = new Scanner(System.in);
    X = entrada.nextInt();
    entrada.close();

    //processamento e saida
        if (X==1){
            System.out.println("primeiro");
        }
        else if (X==2){
            System.out.println("segundo");
        }
        else if (X==3){
            System.out.println("terceiro");
        }
        else if (X==4){
            System.out.println("quarto");
        }
        else if (X==5){
            System.out.println("quinto");
        }
        else if (X==6){
            System.out.println("sexto");
        }
        else if (X==7){
            System.out.println("setimo");
        }
        else if (X==8){
            System.out.println("oitavo");
        }
        else if (X==9){
            System.out.println("nono");
        }

        //procurar como simplificaro codigo, usando uma representação.
    }
}
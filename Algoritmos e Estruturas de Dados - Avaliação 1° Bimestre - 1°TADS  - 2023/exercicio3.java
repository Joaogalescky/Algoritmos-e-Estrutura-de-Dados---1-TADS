//Elabore um código em Portugol ou em Java para a seguinte pergunta
//Desenvolva um código que identifique o resultado da operação de Baskára, sendo X = (-b+-raiz.Delta)/2*a e Delta = b^2 - 4*a*c

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args){
    
    //variáveis
    int A, B, C, Delta;    
    Scanner entrada;

    //entrada
    entrada = new Scanner(System.in);
    System.out.println("Digite os valores de A, B e C para cálcular o Delta");
    A = entrada.nextInt();
    B = entrada.nextInt();
    C = entrada.nextInt();
    entrada.close();

    //processamento e saida
    Delta = (B*B + 4*A*C)/2;
    if(Delta==0){
        System.out.println("Possui um valor real ou dois valores iguais");
    }
    if(Delta>0){
        System.out.println("Possui dois valores reais distintos");
    }
    else {
        System.out.println("Não possui valores reais");
    }
    }
}
import java.util.Scanner;

public class funções{
    //As funções retornam um valor, ou seja, trazem um valor que foi calculado ou obtido dentro delas para dedntro do algoritmo

    //Exemplo
    //Considere um algoritmo que pergunta a três pessoas sua idade, que calcule e retorne a idade média entre essas pessoas:

    // public static void linhas(){
    //     System.out.println("------------------");
    // }

    // public static void main (String [] args){

    //     //variaveis
        
    //     Float idade1, idade2, idade3, media;
    //     Scanner entrada = new Scanner (System.in);

    //     //entrada
    //     linhas();
    //     System.out.println("Digite a idade de três pessoas:");
    //     idade1 = entrada.nextFloat();
    //     idade2 = entrada.nextFloat();
    //     idade3 = entrada.nextFloat();
    //     linhas();
    //     entrada.close();

    //     //processamento e saida
    //     media = ( idade1 + idade2 + idade3)/3;
    //     System.out.printf("A media das tres idades somadas é: %.2f", media);

    // }
    
    public static float media(){
        float idade1, idade2, idade3;
        float media;


        System.out.println("Digite três idades:");
        Scanner entrada = new Scanner (System.in);
        idade1 = entrada.nextFloat();
        idade2 = entrada.nextFloat();
        idade3 = entrada.nextFloat();
        entrada.close();

        media = (idade1 + idade2 + idade3)/3;
        return (media);
    }   

    public static void main(String [] args){
        System.out.printf("A idade media é %.2f", media());
    }

    // Pseudocodigo
    //     inicio
    //         módulo media
    //             real idade1, idade2, idade3, media;
    //             escreva("Digite três idade:");
    //             leia idade1;
    //             leia idade2;
    //             leia idade3;
    //             media <= (idade1 + idade2 + idade3)/3;
    //             retorne media;
    //         fim modulo.

    //         escreva("A idade media é ", media);
    //     fim.
}
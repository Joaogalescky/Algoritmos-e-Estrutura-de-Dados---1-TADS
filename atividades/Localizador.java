package atividades;
import java.util.Scanner;

class Localizador{

    //modulo - função
    public static boolean stringIguais(String str1, String str2) {
        if(str1.length() != str2.length()){
            return false;
        }
        return true;
    }


    public static void main(String [] args) {

    //variaveis
    String palavra;
    int posicao;
    

    //entrada
    Scanner entrada = new Scanner (System.in);
    System.out.println("Digite a sua primeira entrada:");
    palavra = entrada.next();
    System.out.println("Digite a posição da letra");
    posicao = entrada.nextInt();
    entrada.close();

    //processamento e saida
    System.out.println(palavra.length()); //length = contador do comprimento da string
    System.out.println(palavra.charAt(posicao)); //charAt = retorno da posicao da char (letra) da string
    }
}
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
    if(System.out.printl(palavra.charAt(posicao))==){ //RETORNAR O PRINT CASO OCORRA UM ERRO DA POSICAO DA LETRA DA PALAVRA
        System.out.println("Letra da palavra não encontrada, tente novamente\n");
    }
    }
}
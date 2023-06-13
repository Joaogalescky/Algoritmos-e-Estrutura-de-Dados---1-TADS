import java.util.Scanner;

public class Modularização2{

    static Scanner entrada = new Scanner (System.in);

    public static void cabecalho() { //Em portugal, é uma modalização
        System.out.println("+=+=+=+=+=+=+=+=+="); //Metodo
    }

    public static String getString() { //No public static, o retorno será em "String" (Texto), diferente de "void"
        String st;                     // Função, pois deve retornar algo (return)
        st = entrada.next();

        return st;
    }

    public static void main (String [] args){
        //variaveis
        String nome, sobrenome;

        //entrada e saida
        cabecalho(); //Procedimento
        System.out.println("Digite seu nome: ");
        nome = getString();
        System.out.println("Digite seu sobrenome: ");
        sobrenome = getString();
        System.out.printf("Boa noite, %s %s\n", nome, sobrenome);
        cabecalho(); //Procedimento
    }
}
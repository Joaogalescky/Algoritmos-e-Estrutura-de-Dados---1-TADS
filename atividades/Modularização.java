package atividades;

import java.util.Scanner;

public class Modularização{
    public static void cabecalho() { //Em portugal, é uma modalização
        System.out.println("+=+=+=+=+=+=+=+=+="); //Modulo
    }
    public static void main (String [] args){

        //variaveis
        String name;
        Scanner entrada = new Scanner (System.in); //Novo metódo de entrada Scanner

        //entrada e saida
        cabecalho(); //Procedimento
        System.out.println("Digite seu nome: ");
        name = entrada.next();
        entrada.close();
        System.out.printf("Boa noite, %s\n", name);
        cabecalho(); //Procedimento

    }
}
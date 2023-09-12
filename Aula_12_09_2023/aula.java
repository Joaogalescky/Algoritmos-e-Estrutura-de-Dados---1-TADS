package Aula_12_09_2023;

import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.util.Scanner;

/* Atividade:
    Desenvolva um programa que abre um arquivo chamado texto.txt. Seu algoritmo deve informar quantas vezes cada letra (a-z) aparece no texto
*/

/* Links de estudo:
https://pt.linkedin.com/pulse/leitura-e-escrita-de-arquivos-em-java-olival-paulino#:~:text=Para%20ler%20este%20arquivo%20em,%22Olival%2FDesktop%2Fcadastros.
https://receitasdecodigo.com.br/java/como-ler-arquivo-texto-em-java
*/

class aula{
     public static void teste(String[] args) {
        
        FileReader ler_arquivo;
        File arquivo;
        Scanner entrada;
        int caracter_lido, i;
        char c;

        try{
            arquivo = new File("texto.txt");
            entrada = new Scanner (arquivo);

            ler_arquivo = new FileReader("/home/aluno/Área de Trabalho/Aula_12_09_2023/texto.txt");
            caracter_lido = ler_arquivo.read();

            while(caracter_lido != -1){
                c = (char) caracter_lido;
                //Fazer um contador (i) de caracter (tenho que ter uma string para utilizar em uma repetição, e depois, converter para char para checar as letras dentro do for)
                //for (int j = 0; j < )
                caracter_lido = ler_arquivo.read();
            }
            ler_arquivo.close();

            System.out.println("A letra 'a' apareceu: %d\n", i);

        } catch (Exception e){
            System.out.println(e);
        }
    }



    //public static void main(String args[]) throws FileNotFoundException {
    //     Scanner scanner = new Scanner(new FileReader("/home/aluno/Área de Trabalho/Aula_12_09_2023/texto.txt")).useDelimiter("\\n");
    //     System.out.println("----------------------------------------------------------------------");
    //     while (scanner.hasNext()) {
    //         System.out.println( scanner.next() );
    //     }
    // }
}


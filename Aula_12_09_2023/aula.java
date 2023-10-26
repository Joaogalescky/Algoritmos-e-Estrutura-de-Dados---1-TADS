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
     public static void main(String[] args) {
        
        FileReader ler_arquivo;
        File arquivo;
        Scanner entrada;
        int caracter_lido, i = 0;
        char c;

        try{
            arquivo = new File("C:\\Users\\Skyfall_jack\\Desktop\\Algoritmos-e-Estrutura-de-Dados---1-TADS-2023\\Aula_12_09_2023\\texto.txt");
            entrada = new Scanner (arquivo);

            ler_arquivo = new FileReader("C:\\Users\\Skyfall_jack\\Desktop\\Algoritmos-e-Estrutura-de-Dados---1-TADS-2023\\Aula_12_09_2023\\texto.txt");
            caracter_lido = ler_arquivo.read();

            while(caracter_lido != -1){
                c = (char) caracter_lido;
                if(c == 'a' || c == 'A'){
                    i ++;
                }
                caracter_lido = ler_arquivo.read();
            }
            ler_arquivo.close();

            System.out.printf("A letra 'a' apareceu: %d\n", i);

        } catch (Exception e){
            System.out.println(e);
        }
    }
}


package atividades;
import java.util.Scanner;

public class prova_do_darlon{

    /*2° Questão da prova
    Desenvolva um método Java que recebe como entrada uma cadeia de caracteres (String) e retorna verdadeiro (true) caso a entrada seja um palíndromo, e falso (false) caso não seja. Um palíndromo é uma frase que permanece idêntica se lida de trás para frente. Considere que a entrada terá apenas letras e números, ou seja, não possui espaços, caracteres acentuados nem sinais de pontuação. */

    /*
        public static boolean Palindromo(String input) {

            //Transformar caracteres especiais em vazio e passando maiúsculos para minúsculo
            //String limpar_entrada = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();


            //Comparar os caracteres da string
            //int esquerda = 0, direita = limpar_entrada.length() - 1;
            int esquerda = 0, direita = input.length() - 1;
    
            //Verificar se é palíndromo
            while (esquerda < direita) {
                if (input.charAt(esquerda) != input.charAt(direita)) { //No lugar input, pode-se colocar "limpar_entrada"
                    return false; //Se diferente, não é palíndromo
                }
                esquerda++;
                direita--;
            }
            return true;
        }
    */
        
    /*3° Questão da prova
    Desenvolva uma função/método que calcula e retorna o máximo divisor comum (mdc) de dois números inteiros x e y */

    /*
        public static int MDC(int x, int y) {
            
            int mem = 0, i;

            //Caso "Y" seja menor que "X"
            if (y < x) {
                mem = y;
                y = x;
                x = mem;
            }
    
            //Algoritmo de Euclides
            while (x != 0) { //Quando "x" for 0, o loop termina, encontrando o valor do MDC
                i = y % x;
                y = x;
                x = i;
            }
    
            return y; // O MDC é armazenado em x após o loop
        }
    */
        
    /*4° Questão da prova
    O que será mostrado na tela ao executar o código Java apresentado abaixo? */

    /*
        static int x, y;

        public static int metodoA(int m, int n){
            int a = 2*m, b = 2*n;
            return 3*a + b;
        }

        public static int metodoB(int a, int b){
            x = a + 2 * b;
            return y;
        }
    */

    /*5° Questão da prova
    O trecho código Java abaixo apresenta na saída padrão os números perfeitos no intervalo definido pelo usuário (variáveis "ini" e "fim"). Reorganize o código utilizando outros métodos (funções e procedimentos). Organize utilizando pelo meenos outros dois módulos. */

    /* Código para modular

        public class main{
            public static void main (String [] args){
        
            int i, j, soma, ini, fim;
            Scanner entrada = new Scanner (System.in);
            System.out.println("Informe o intervalo a ser testado: ");
            ini = entrada.nextInt();
            fim = entrada.nextInt();
            entrada.close();
            for(i = ini; i <= fim; i++){
                soma = 0;
                for(j = 1; j < i; j++){
                    if(i % j == 0){
                        soma += j;
                    }
                }
                if (soma == i){
                    System.out.println(j);
                }
            }
        }
    */

    /*
        public static void linha(){
            System.out.println("----------------------------");
        }

        public static void encontrarNumerosPerfeitos(int x, int y) {

            for (int i = x; i <= y; i++) {
                if (eh_Perfeito(i)) {
                    System.out.println(i);
                }
            }
        }
    
        public static boolean eh_Perfeito(int i_rep) {

            int soma = 0;

            for (int i2 = 1; i2 < i_rep; i2++) {
                if (i_rep % i2 == 0) {
                    soma = soma + i2;
                }
            }
            return soma == i2;
        }
    */

    public static void main (String[] args){
        
        //2°
        /*
            String input = "abacate";
            String input = "amalanadanalama";
            String input = "123454321";
            String input = "x";
            String input = "xy";
            boolean result = Palindromo(input);
            System.out.println("É um palíndromo?\n" + result);
        */

        //3°
        /*
            Scanner entrada = new Scanner (System.in);
            int x = entrada.nextInt();
            int y = entrada.nextInt();
            
            int mdc = MDC(x, y);
            System.out.printf("MDC de %d e %d é: %d\n", x, y, mdc);
        */        

        //4°
        /*
            int a = 0, b = 3;
            x = 10;
            y = metodoA(b, a);
            System.out.printf("%d\n", a + b + y);
            y = metodoB(x, a);
            System.out.printf("%d\n", x + y);
        */

        //5°
        /*
            int x, y;
            Scanner entrada = new Scanner(System.in);
            linha();
            System.out.println("Informe o intervalo a ser testado: ");
            linha();

            x = entrada.nextInt();
            y = entrada.nextInt();
            entrada.close();
            
            encontrarNumerosPerfeitos(x, y);
            linha();
        */
  
    }
}
import java.util.Scanner;

public class prova_do_darlon{

    //2° Questão da prova
    /*Desenvolva um método Java que recebe como entrada uma cadeia de caracteres (String) e retorna verdadeiro (true) caso a entrada seja um palíndromo, e falso (false) caso não seja. Um palíndromo é uma frase que permanece idêntica se lida de trás para frente. Considere que a entrada terá apenas letras e números, ou seja, não possui espaços, caracteres acentuados nem sinais de pontuação. */

        public static boolean Palindromo(String input) {
            //Remover caracteres não alfanuméricos e converter para minúsculo
            String limpar_entrada = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); //Para transformar acentos e maiúsculos alfanúmericos

            //Inicializar os índices para comparar os caracteres da string
            int esquerda = 0, direita = limpar_entrada.length() - 1;
    
            //Verificar se é palíndromo
            while (esquerda < direita) {
                if (limpar_entrada.charAt(esquerda) != limpar_entrada.charAt(direita)) { //Se diferente, não é palíndromo
                    return false; 
                }
                esquerda++;
                direita--;
            }
            return true; //Se terminar, é palíndromo
        }
        


    //3° Questão da prova
    /*Desenvolva uma função/método que calcula e retorna o máximo divisor comum (mdc) de dois números inteiros x e y */

        //public static int calcularMDC(int x, int y) {
            // Certificar-se de que x é maior ou igual a y
            //if (x < y) {
            //    int temp = x;
            //    x = y;
            //    y = temp;
            //}
    
            // Calcular o MDC usando o algoritmo de Euclides
            //while (y != 0) {
            //    int resto = x % y;
            //    x = y;
            //    y = resto;
            //}
    
            //return x; // O MDC é armazenado em x após o loop
        //}
    
    //4° Questão da prova
    /*O que será mostrado na tela ao executar o código Java apresentado abaixo? */

        //static int x, y;

        //public static int metodoA(int m, int n){
        //    int a = 2*m, b = 2*n;
        //    return 3*a + b;
        //}

        //public static int metodoB(int a, int b){
        //    x = a + 2 * b;
        //    return y;
        //}

    //5° Questão da prova
    // public class main{
    //     public static void main (String [] args){
    
    //     int i, j, soma, ini, fim;
    //     Scanner entrada = new Scanner (System.in);
    //     System.out.println("Informe o intervalo a ser testado: ");
    //     ini = entrada.nextInt();
    //     fim = entrada.nextInt();
    //     entrada.close();
    //     for(i = ini; i <= fim; i++){
    //         soma = 0;
    //         for(j = 1; j < i; j++){
    //             if(i % j == 0){
    //                 soma += j;
    //             }
    //         }
    //         if (soma == i){
    //             System.out.println(j);
    //         }
    //     }
    // }  

    public static void main (String[] args){
        
        //2°
        //String input = "abacate";
        //String input = "amalanadanalama";
        //String input = "123454321";
        //String input = "x";
        //String input = "xy";
        //boolean result = Palindromo(input);
        //System.out.println("É um palíndromo?\n" + result);

        //3°
        //int x = 12;
        //int y = 18;
        //int mdc = calcularMDC(x, y);
        //System.out.println("MDC de %d e %d é: %d\n", ); // Deve imprimir "MDC de 12 e 18 é: 6"

        //4°
        //int a = 0, b = 3;
        //x = 10;
        //y = metodoA(b, a);
        //System.out.printf("%d\n", a + b + y);
        //y = metodoB(x, a);
        //System.out.printf("%d\n", x + y);

        //5°
        

    }
}
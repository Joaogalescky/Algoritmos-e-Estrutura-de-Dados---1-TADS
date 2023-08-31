import java.util.Scanner;

public class exercicios_funcoes_EAD{

    /*Exercicios
        13. Faça uma função chamada pot2 que retorna verdadeiro caso o parâmetro passado seja uma potência de 2.

        14. Desenvolva uma função chamada potN, que possui dois parâmetros x e n. A função deve retornar verdadeiro caso x seja uma potência de n.

        15. Implemente uma função chamada distanciaCartesiana que recebe dois pares de números, que correspondem a pontos em um plano cartesiano com coordenadas x, y. A função deve retornar a distância entre esses dois pontos. Não é necessário arredondar valores.
    */

    public static void linha() {
        System.out.println("-------------------");
    }

    public static boolean pot2(int x){

        //variaveis
        int aux = 1;

        //processamento e saida
        if(x <= 0){ //"x" não pode ser menor ou igual a 0
            return false;
        }
    
        //return (x & (x - 1)) == 0; //Operação bitwise AND (&) --> (Verificador de potências de 2) 
        //As potências de 2 têm apenas um bit 1 em sua representação binária, enquanto "x - 1" terá todos os bits à direita do bit 1 igual a 1. Fazer uma operação bitwise AND entre "x e x - 1" resulta em zero somente para números que são potências de 2. Ocorre pois o único bit 1 em "x" é cancelado pela operação AND com os bits 1 em "x - 1", deixando todos os bits como zero.
        //https://www.w3schools.com/go/go_bitwise_operators.php

        while(aux < x){
            aux = aux * 2; //Aux^aux*2
            if(aux == x){
                return true;
            }
        }
        System.out.printf("%d <-> %d\n", x, aux);
        return false;
    }

    public static void eh_pot2(int x){
        
        //processamento
        if(pot2(x)){
            System.out.printf("%d é uma potência de 2.\n", x);
        }else{
            System.out.printf("%d não é uma potência de 2.\n", x);
        }
    }

    public static void potN(int x, int n){

        //Potência- propriedades
        //potência: 5² = 25
        //5 = base; ² = expoente; 25 = potência

        //saida
        if(eh_potN(x, n)){
            System.out.printf("%d é uma potência de %d", x, n);
        }else{
            System.out.printf("%d não é uma potência de %d", x, n);
        }
    }
                
    public static boolean eh_potN(int x, int n){
        
        //variaveis
        int resultado;
        
        //processamento e saida
        if(x == 1){ //Qualquer número expoente de 1 é igual a 1.
            return true;  
        }
                
        for (int i = 1; i <= x; i++){ //Sistema de repetição
            resultado = (int) Math.pow(n, i);
            //A variável "resultado" vai calcular a base "n" com o expoente "i" e guardar o resultado para comparação até "i" ser maior ou igual a "x" no sistema de repetição.
            
            if(resultado == x){ //Se o resultado da potência for igual a "x", retorne true.
                return true;
            }else if(resultado > x){
                break;  // Se o resultado da potência exceder "x", retorne false.
            }
        }  
        return false;
    }

    public static void distancia_Cartesiana() {

        //variaveis
        double distancia, x1, y1, x2, y2;

        //entrada
        Scanner entrada = new Scanner (System.in);
        x1 = entrada.nextDouble();
        y1 = entrada.nextDouble();
        x2 = entrada.nextDouble();
        y2 = entrada.nextDouble();
        entrada.close();

        //saida
        distancia = calculo_Cartesiano(x1, y1, x2, y2);
        System.out.printf("Distância entre os pontos: %d\n", distancia);
    }

    public static double calculo_Cartesiano(double x1, double y1, double x2, double y2) {

        double ponto_X, ponto_Y, distancia;

        ponto_X = x2 - x1; //Os pontos de "X" e "Y" são iguais a diferença dos dois pontos "x1 e x2" e "y1 e y2"
        ponto_Y = y2 - y1;

        distancia = Math.sqrt(ponto_X * ponto_Y + ponto_Y * ponto_Y);
        //ou
        //distancia = Math.sqrt(x2 - x1) + Math.sqrt(y2 - y1);
        //Teorema de pitágoras --> dAB² = (xB - xA)² + (yB - yA)².

        return distancia;
    }

    public static int fatorial(int z) {
        if (z == 0 || z == 1){
            return 1;
        } else{
            return z * fatorial(z - 1);
        }
    }

    public static String combinacao_Saida(int x, int fat_x, int y, int fat_y, int Combinacao, int fat_menos) {
    //alterado de "int" para "String" para utilizar o output
    
    //output = saída de um processo

    /*Explicação
        O output é uma variável do tipó Stringbuilder, sendo usado para construir uma string que representa a saída formatada desejada.
        
        StringBuilder output = new Stringbuilder();
        StringBuilder é uma classe em Java que permite construir strings de forma eficiente (ex: concatenar pedaços de textos).

        Quando é chamado os "append", estará acrescentando diferentes partes da saída formatada à string em construção.
        Quando for finalizar, chamar o metódo "toString()" na variável "output", convertendo o conteúdo no "StringBuilder" em uma string regular.

        StringBuilder é +eficiente em desempenho especialmente em loops ou em concatenações.
    */

        //saida
        StringBuilder output = new StringBuilder();
        output.append(String.format("%d! = %d\n", x, fat_x));
        output.append(String.format("%d! = %d\n", y, fat_y));
        output.append(String.format("(%d - %d)! = %d\n", x, y, fat_menos));
        output.append(String.format("%d + %d = %d\n", x, y, Combinacao));
        linha();
        output.append(String.format("C^" + x + "^" + y + " = " + x + "!/" + y + "!(" + x + " - " + y + ")! = " + Combinacao));
        return output.toString();
    }

    public static void combinacao() {
        //8. Desenvolva uma função que calcula o número de combinações simples "C" de "n" elementos tomados "p" a "p".

        /* Explicação
            A combinação simples é um tipo de agrupamento de análise combinátoria. Esta consiste em todas as variações possíveis de elementos de dado conjunto, desde que a ordem não seja importante.

            Para calcular o número de combinações simples "C" de "n" elementos tomados "p" a "p" utilizamos a seguinte equação:

            C^n^p = n!/p!(n-p)!

            Exemplo:

            • Combinação de 10 elementos tomados de 4 a 4:

            C^10^4 = 10!/4!(10 - 4)! = 10x9x8x7x6!/4x3x2x1x6! = 10x9x8x7/4x3x2x1 = 5040/24 = 210
        */

        //variaveis
        int x, fat_x; 
        int y, fat_y;
        int Combinacao, fat_menos;

        //entrada
        Scanner entrada = new Scanner (System.in);
        x = entrada.nextInt();
        y = entrada.nextInt();
        entrada.close();

        //processamento
        fat_x = fatorial(x);
        fat_y = fatorial(y);
        fat_menos = fatorial(x - y);

        Combinacao = fat_x / (fat_y * fat_menos);

        //Fazer uma funcao saida
        String output = combinacao_Saida(x, fat_x, y, fat_y, Combinacao, fat_menos);
        System.out.println(output);
    }

    public static void main(String[] args) {
        
        int x, y;

        //Scanner entrada = new Scanner (System.in);
        //x = entrada.nextInt();
        //y = entrada.nextInt();
        //entrada.close();

        //eh_pot2(x);
        //eh_potN(x, y);
        //distancia_Cartesiana();
        combinacao();
    }
}

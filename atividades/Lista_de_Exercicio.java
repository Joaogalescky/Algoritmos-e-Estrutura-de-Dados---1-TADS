package atividades;

// Algoritmos e Estruturas de Dados
// Trabalho 2º Bimestre


import java.util.Scanner;

public class Lista_de_Exercicio{

    //Primos Intervalo

    public static int Eh_primo (int x, int y){

        int aux, aux2, primo=0;

        if(y<x){ //Se "y" for menor que "x"
            aux = x; //"aux" recebe o maior valor
            x = y; //"x" recebe o menor valor
            y = aux; //"y" recebe o maior valor
        }
        for(int i=x; i<=y; i++){ //Sistema de repetição: "i" = "x" (menor valor), se "i" <= "y", "i" recebe + 1
            aux2=1; //Aux2 é a variável que vai receber o número de divisores de "i"
            for(int i2=2; i2<=i/2; i2++){
                //Sistema de repetição: "i2" = 2, pois um número primo é divisivel por 1 e ele mesmo, se "i2" <= i/2, (i/2 é para não verificar divisores maiores do que a metade de "i"), "i2" recebe + 1
                if(i%i2==0){
                    aux2++; 
                }
            }
            if(aux2==1){
                primo++;
            }
        }
        return primo;
    }

    public static void Primo(int x, int y){

        int menor=x, maior=y; //Por definição, menor é o "x" e o maior é o "y" 

        if(x>y){ //Se "x" for maior que "y"
            maior = x; //maior assume o valor de "x"
            menor = y; //menor assume o valor de "y"
        }

        System.out.printf("No intervalo [%d, %d] há %d números primos", menor, maior, Eh_primo(x, y));
    }

    //Ordenados
   
    public static void Ordenados(){

        int n, valor_atual, valor_anterior;
        boolean crescente=false, decrescente=false, igual=false, desordenado=false; //O código vai funcionar por meio de condições

        Scanner entrada = new Scanner (System.in);
        n = entrada.nextInt(); //Quantidade de valores que vão ser digitados

        if(n>=3){
            valor_anterior=entrada.nextInt(); //Essa variável vai servir de base comparatoria para a ativação das condições

            for(int i=1; i<n; i++){ //Sistema de repetição: subtraindo 1 da quantidade de vezes a digitar
                valor_atual = entrada.nextInt(); //Essa variavel vai comparar com o "valor_anterior" e ativar caso entre nas condições
                
                if(valor_atual<valor_anterior){ //Condição de decrescente
                    decrescente = true;
                }
                if(valor_atual>valor_anterior){ //Condição de crescente
                    crescente = true;
                }
                if(valor_atual == valor_anterior){ //Condição de igual
                    igual = true;
                }
                if(decrescente && crescente || igual){ //Condição de desordenado
                    desordenado = true;
                }
                valor_anterior = valor_atual; //A variável anterior vai assumir o valor da atual a cada fim de comparação na repeticação
            }
            entrada.close();
            if(igual && !crescente && !decrescente){ //Para serem iguais,  não pode ter ativo a condição de crescente ou decrescente
                System.out.println("Os valores são iguais");
            }
            else if(crescente && !decrescente){ //Para ser crescente, não pode ter ativo a condição de decrescente
                System.out.println("Os valores estão ordenados numericamente de maneira crescente");
            }
            else if(decrescente && !crescente){ //Para ser decrescente, não pode ter ativo a condição de crescente
                System.out.println("Os valores estão ordenados numericamente de maneira decrescente");
            }
            else if(desordenado){ //Para ser desordenado, pode ter ativo qualquer condição de crescente e crescente ou igual
                System.out.println("Os valores estão desordenados numericamente");
            }
        }
    }

    //Perfeitos

    public static boolean Eh_numero_perfeito(int n){

        int soma=0;

        for(int i2=1; i2<n; i2++){ //Sistema de repetição
            if(n%i2==0){  //Se o resto da divisão de "n" por "i2" for = 0, pois um numero perfeito é divisivel por 1 e por ele mesmo.
                soma=soma+i2; //A variável "soma" vai guardar o valor de "i2"
            }
        }
        return soma==n; //Se a variável "soma" for igual a "n" (logo abaixo será i), significa que é verdade
    }

    public static void Perfeito(int x, int y){

        int maior, menor;

        if(x>y){ //Caso "x" for maior que "y"
            maior = x;
            menor = y;
        } else{ 
            maior = y;
            menor = x;
        }

        int totalPerfeitos=0;
        System.out.printf("Os números perfeitos no intervalo [%d, %d] são:\n", menor, maior);
        for(int i=menor; i<=maior; i++){ //Sistema de repetição
            if(Eh_numero_perfeito(i)){ //Para cada "i" chamado, vai ser verificado se "i" é um número perfeito
                System.out.printf("%d\n", i);
                totalPerfeitos++; //Se "i" for um número perfeito, a variável "totalPerfeitos" vai receber + 1
            }
        }
        System.out.printf("Total: %d número(s).\n", totalPerfeitos);
    }

    //Piramide

    public static void Piramide(int numero){

        if(numero>=1){
                String linha = repetidor_String("_", numero); //Para imprimir a primeira linha, conforme o numero
                System.out.printf("+ %s_%s +\n", linha, linha);
            for(int i = 1; i <= numero; i++){ //Para imprimir a ordem dos numeros em piramide
                String espacos = repetidor_String("_", numero - i);
                String numeros = gerador_Numeros(i);
                System.out.printf("+ %s_%s_%s +\n", espacos, numeros, espacos);
            }
        }
    }

    public static String repetidor_String(String caractere, int tempo){
        StringBuilder resultado = new StringBuilder();
        for (int i2 = 0; i2 < tempo; i2++){
            resultado.append(caractere);
        }
        return resultado.toString();
    }

    public static String gerador_Numeros(int x){
        StringBuilder resultado2 = new StringBuilder();
        for (int i3 = 1; i3 <= x; i3++){ //Começa com 1 e recebe 1+ até chegar ao numero digitado
            resultado2.append(i3);
            if(i3 < x){ //Se for menor que "X", o valor digitado
                resultado2.append(" "); //Vai inserir um "espaço"
            }
        }
        return resultado2.toString();
    }

    /*O método append() da Interface FormData adiciona um novo valor dentro de uma chave existente dentro do objeto FormData ou adiciona a chave caso ainda não exista.*/
    /*StringBuilder pode ser usada quando você deseja modificar uma cadeia de caracteres sem criar um novo objeto.
    Por exemplo, o uso da classe StringBuilder pode melhorar o desempenho ao concatenar várias cadeias de caracteres em um loop.*/
    /*O método ToString() tem o objetivo de trazer uma representação textual de uma instância de um objeto. Essa representação textual de um objeto vem a ser muito útil principalmente em situações de debugging e de logging. */

    //Primos perfeitos

    
    public static void main (String [] args){

        int x, y;

        Scanner entrada = new Scanner (System.in);
        x = entrada.nextInt();
        y = entrada.nextInt();
        entrada.close();

        //**Primos no Intervalo**
        Primo(x, y);

        //**Ordenados**
        Ordenados();

        //**Perfeitos**
        Perfeito(x, y);

        //**Piramide**
        Piramide(x);

        //**Primos perfeitos**
    }
}
import java.util.Scanner;

public class beecrowd1099copy{
    public static void main(String []args) {

        //Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir. Cada caso de teste consiste de dois inteiros X e Y. Você deve apresentar a soma de todos os ímpares existentes entre X e Y.

        //variaveis
        int N, X, Y, rep, aux, result;
        Scanner entrada;

        //entrada
        entrada = new Scanner(System.in);
        N = entrada.nextInt();

        //processamento e saida
        for (rep=1; rep<=N; rep++){ //Sistema de repetição crescente
            
            result = 0;
            X = entrada.nextInt();
            Y = entrada.nextInt();

            if (X>Y) { //Se X maior que Y
                for (aux=X-1; aux>Y; aux--){ //aux é a subtração de X por -1, se aux maior que Y, aux recebe -1
                    if (aux%2!=0){ //Se resto da divisão de aux por 2 diferente de 0
                        result+=aux; //result recebe result + aux
                    }
                }
            }
            else if(X<Y){ //Se Y maior que X 
                for (aux=X+1; aux<Y; aux++){ //aux é a soma de X por +1, se aux menor que Y, aux recebe +1
                    if (aux%2!=0) { //Se resto da divisão de aux por 2 diferente de 0
                        result+=aux; //result recebe result + aux
                    }
                }
                }
            else { //Senão
                result = 0; //result igual a 0 
            }
            System.out.printf(result+"\n"); //Saida de texto (dentro do "Para")
        }
    }
}

//Código re-adaptado do link abaixo
//https://urisolve.blogspot.com/2016/05/uri-online-judge-solution-1099-sum-of.html
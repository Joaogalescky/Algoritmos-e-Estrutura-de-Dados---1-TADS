import java.util.Scanner;

public class beecrowd1099{
    public static void main(String []args) {

        //Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir. Cada caso de teste consiste de dois inteiros X e Y. Você deve apresentar a soma de todos os ímpares existentes entre X e Y.

        //entrada
        int N,X,Y,rep,aux,result;
        Scanner entrada;
    
        //variáveis
        entrada = new Scanner(System.in);
        result = 0;
        N = entrada.nextInt();

        //processamento e saida
        for(rep=1;rep<=N;rep++) //Sistema de repetição: se rep não for igual a N, vai acrescentar 1+ até ser igual. (Progressiva)
        {
            result = 0;
            X = entrada.nextInt();
            Y = entrada.nextInt();
            if(X<Y) //Se X for menor que Y
            {
                for(aux=X+1,result=0;aux<Y;aux++) //aux vai ser X + 1, result vai ser igual a 0, se aux for menor que Y, aux vai receber +1
                {
                    if(aux%2!=0) //Se o resto da divisão de aux por 2 for 1 ou -1
                        result = aux + result; //result vai receber ele mesmo +1 (até a divisão ser igual a 1 ou -1)
                }
            }
            else if(Y<X) //Senão se X for menor que Y
            {
                for(aux=Y+1,result=0;aux<X;aux++) //aux vai ser Y + 1, result vai ser igual a 0, se aux for menor que X, aux vai receber +1
                {
                    if(aux%2!=0)//Se o resto da divisão de aux por 2 for 1 ou -1
                        result = aux + result;//result vai receber ele mesmo +1 (até a divisão ser igual a 1 ou -1)
                }
            }
            else{
                result = 0;}
            System.out.printf("%d\n", result);
        }
    }
}

//Código re-adaptado do link abaixo
//https://github.com/joy1954islam/uri-problem-solution-in-c/blob/master/problem%201099%20sum%20of%20consecutive%20odd%20number%20ll.c
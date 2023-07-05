import java.util.Scanner;

public class beecrowd1159copy {
    public static void main(String[] args) {

        //variaveis
        int X, aux, soma;
        
        //entrada
        Scanner entrada = new Scanner (System.in);
        X = entrada.nextInt();

        //processamento e saida
        while(X!=0){ //Sistema de repetição: Se "X" for diferente de 0, vai continuar, senão, vai parar.
            soma = 0; 
            for(aux=1; aux<=5; X++){ //Sequência de 5 números 
                if(X%2==0){ //Se for par
                    soma += X; //Soma = Soma + X
                    aux += 1; //auxa = auxa + 1
                }
            }
            System.out.printf("%d\n", soma);
            X = entrada.nextInt();
        }
        entrada.close();
    }
}

//Versão mais compacta da 1159 que estava resolvendo
//https://www.youtube.com/watch?v=jVfHoYLz4l4
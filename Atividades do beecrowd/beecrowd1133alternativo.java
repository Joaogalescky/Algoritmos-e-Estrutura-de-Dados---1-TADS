import java.util.Scanner;

public class beecrowd1133alternativo {
 
    public static void main(String[] args){

        //variaveis
        int X, Y, i;
        Scanner entrada;

        //entrada
        entrada = new Scanner (System.in);
        X = entrada.nextInt();
        Y = entrada.nextInt();
        entrada.close();
            
        //processamento e saida
        if(X>0 && Y>0){ //Se as entradas forem maiores que 0
            if(X>Y){ //Se X for maior que Y
                for(i=Y+1;i<X; i++){ //Sistema de repetição: "i" vai receber Y + 1, se for menor que X, "i" recebe +1
                    if((i%5==2)||(i%5==3)){ //Se o resto da divisão de aux por 5 = 2 ou 3
                        System.out.printf("%d\n", i);
                    }
                }
            }

            else if(X<Y){
                for(i=X+1;i<Y; i++){ //Sistema de repetição: "i" vai receber X + 1, se for menor que Y, "i" recebe +1
                    if((i%5==2)||(i%5==3)){ //Se o resto da divisão de aux por 5 = 2 ou 3
                        System.out.printf("%d\n", i);
                    }
                }
            }
        }
        else{ //Senão
            System.out.println("Operação inválida, somente números positivos");
        }
    }
}

//Código adaptado para o link abaixo
//https://urisolve.blogspot.com/2016/06/uri-online-judge-solution-1133-rest-of.html
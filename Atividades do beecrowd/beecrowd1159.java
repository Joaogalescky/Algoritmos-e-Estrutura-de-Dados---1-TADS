import java.util.Scanner;

public class beecrowd1159 {
    public static void main(String[] args) {

        //variaveis
        int X, aux, aux2, soma;
        
        //entrada
        Scanner entrada = new Scanner (System.in);
        X = entrada.nextInt();

        
        //processamento e saida
        while(X!=0){ //Sistema de repetição: Se "X" for diferente de 0, vai continuar, senão, vai parar.
            if(X%2==0){
                aux=X+8;
                while(X<aux){
                    aux2 = aux;
                    aux = aux - 2;
                    System.out.printf("%d\n", aux2);
                }
            }
            else if(X%2!=0){
                aux=X+9;
                while(X<aux){
                    aux2 = aux;
                    aux = aux - 2;
                    System.out.printf("%d\n", aux2);
                }
            }
            X = entrada.nextInt();
        }
    }
}
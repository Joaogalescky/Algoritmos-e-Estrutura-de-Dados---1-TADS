import java.util.Scanner;

public class Perfeito {
    public static void main(String [] args) {

        //Pergunte um número ao usuário e em seguida informe se o número digitado é um número perfeito.
        //Um número perfeito é aquele que é igual à soma dos seus divisores menores ele.
        //Exemplo: 6
        //1+2+3=6
        //Logo, 6 é um número perfeito.

            //variaveis
            int N, repetidor, perfeito;
            Scanner entrada;

            //entrada
            entrada = new Scanner(System.in);
            N = entrada.nextInt();
            entrada.close();

            //processamento e saida
            perfeito = 0;

            for(repetidor=1; repetidor<N; repetidor++){
                if(N%repetidor==0){
                    perfeito = perfeito + repetidor;
                }
            }
        if(perfeito==N){
            System.out.println("É um número perfeito");
            }
        else {
            System.out.println("Não é um número perfeito");
        }
    }
}

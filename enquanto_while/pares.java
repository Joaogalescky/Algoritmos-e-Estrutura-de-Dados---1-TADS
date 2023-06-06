package enquanto_while;
import java.util.Scanner;

public class pares {
    public static void main (String [] args){

        //variaveis
        int valor;
        Scanner entrada = new Scanner(System.in);

        //entrada
        System.out.println("Entre com valores inteiros. Digite 0 para parar.");
        valor = entrada.nextInt();

        while(valor !=0){
            if(valor%2==0){
                System.out.println("Par");
            }
            else{
                System.out.println("Impar");
            }

            valor = entrada.nextInt();

        }
        entrada.close();
    }
}
        // != significa *diferente de*
        // sera par se o (%) resto da divisão por 2 for igual a 0
        // sera impar se o resto (%) resto da divisão por 2 não for igual a 0
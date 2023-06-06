package para_for;
import java.util.Scanner;

public class divisor_primo{
public static void main(String [] args){

        //variaveis
        int valor, i, n_div;
        Scanner entrada = new Scanner(System.in);

        //entrada
        System.out.println("Digite um valor");
        valor = entrada.nextInt();
        entrada.close();

        //processamento e saida
        //enquanto (i é igual a 1, se i for menor ou igual a "valor", então i recebe +1)
        n_div=0;
        for(i=1;i<=valor;i++){
            //se (resto da divisão de "valor" por i for = 0) então
            if(valor%i==0){
                System.out.printf("%d\n", i);
                n_div++;
            }
        }
        if(n_div<3){
            System.out.println("É primo");
        }
        else {
            System.out.println("Não é primo");
        }
    }
}


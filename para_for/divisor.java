package para_for;
import java.util.Scanner;

public class divisor{
public static void main(String [] args){

        //variaveis
        int valor, i;
        Scanner entrada = new Scanner(System.in);

        //entrada
        System.out.println("Digite um valor");
        valor = entrada.nextInt();
        entrada.close();

        //processamento e saida
        //enquanto (i é igual a 1, se i for menor ou igual a "valor", então i recebe +1)
        for(i=1;i<=valor;i++){
            //se (resto da divisão de "valor" por i for = 0) então
            if(valor%i==0){
                System.out.printf("%d\n", i);
            }
        }
    }
}


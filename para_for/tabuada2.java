package para_for;
import java.util.Scanner;

public class tabuada2 {
    public static void main(String[] args){

        //variaveis
        int x, i, result;
        Scanner entrada;

        //entrada
        entrada = new Scanner(System.in);
        System.out.println("Entre com um valor: ");
        x = entrada.nextInt();
        entrada.close();

        //processamento e saida
        //para 1 de 1 até 10 passo 1 faça (for)
        for(i=1;i<=10;i++){
            result = x*i;
            System.out.printf("%dx%d=%d\n", x, i, result);
        }
    }
}

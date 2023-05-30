package repetição;
import java.util.Scanner;

public class Mdc {
    public static void main(String[] args) {
        
            //variaveis
            int a, b, rep=1, mdc=1;
            Scanner entrada = new Scanner(System.in);

            //entrada
            System.out.println("Entre com dois valores:");
            a = entrada.nextInt();
            b = entrada.nextInt();
            entrada.close();

            //processamento
            //sistema de repetição, enquanto o repetidor(que é igual a 1) for menor ou igual as variaveis da entrada, vai agregar 1
            while(rep<=a && rep<=b){
                //se o resto da divisão das variaveis com o repetidor for igual a 0, o mdc assume o valor do rep para a saida no System.out.printf
                if(a%rep==0 && b%rep==0){
                mdc = rep;
            }
            rep++;
        }
            //saida
            System.out.printf("MDC (%d, %d) = %d\n", a, b, mdc);
    }
}

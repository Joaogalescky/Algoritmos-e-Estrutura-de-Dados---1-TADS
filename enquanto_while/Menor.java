package enquanto_while;
import java.util.Scanner;
public class Menor {
    public static void main(String[] args) {
        
        //variaveis
        int n, repetidor;
        Scanner entrada;

        entrada = new Scanner(System.in);
        System.out.println("Digite seus números positivos, digite 0 no final para ser mostrado o menor valor");

        n = 1;
        repetidor = Integer.MAX_VALUE;
        // Integer.MAX_VALUE é o maior número permitido pelo computador, podendo atuar como repetidor.
        System.out.printf("Numero maximo permitido: %d\n", repetidor);

        while(n!=0){
            n = entrada.nextInt();
            if (n!=0 && n<repetidor){
                repetidor = n;
            }
        }
        entrada.close();
        System.out.println("---------------------");
        System.out.printf("O menor número é: %d\n", repetidor);
        System.out.println("---------------------");
    }
}
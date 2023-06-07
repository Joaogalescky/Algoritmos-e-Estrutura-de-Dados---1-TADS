import java.util.Scanner;

public class beecrowd1589 {
 
    public static void main(String[] args) {

        //variaveis
        int T, R1, R2, R3;
        Scanner entrada; 

        //entrada
        entrada = new Scanner(System.in);
        T = entrada.nextInt();

        //processamento e saida
        for (int i = 0; i < T; i++) {
        	R1 = entrada.nextInt();
        	R2 = entrada.nextInt();
        	R3 = R1 + R2;
        	System.out.printf("%d\n", R3);
        }
        entrada.close();
    }
}

//Foi utilizado como base de estudo o beecrowd1589alternativo
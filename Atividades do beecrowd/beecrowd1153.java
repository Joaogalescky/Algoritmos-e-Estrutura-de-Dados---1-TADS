import java.util.Scanner;

public class beecrowd1153{
    public static void main(String []args) {
        
        int N, i, factorial = 1;
        Scanner entrada;

        entrada = new Scanner(System.in);
        N = entrada.nextInt();
        entrada.close();

        for(i = N; i >= 1; i--){  
            factorial*=i;
        }
        System.out.printf("%d\n",factorial);
    }
}

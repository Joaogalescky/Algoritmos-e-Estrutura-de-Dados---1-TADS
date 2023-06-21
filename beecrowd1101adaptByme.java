import java.util.Scanner;

public class beecrowd1101adaptByme {
 
    public static void main(String[] args) {
        int m, n, i, c=1, soma = 0, maior = 0, menor = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        while (c>0) {
            m = entrada.nextInt();
            n = entrada.nextInt();
            
            if (m > n) {
                maior = m;
                menor = n;
            } else {
                maior = n;
                menor = m;
            }
            
            c = menor;
            if (c>0){
                soma = 0;
                for (i = menor; i <= maior; i++) {
                System.out.printf("%d ", i);
                soma = soma + i;
            }
            System.out.printf("Sum=%d\n", soma);
            }
        }
        
        entrada.close();
    }
}
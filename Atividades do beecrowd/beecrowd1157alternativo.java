import java.util.Scanner; 
 
public class beecrowd1157alternativo {
 
    public static void main(String[] args) {
 
        //variaveis
        int N;
        Scanner entrada;
        
        //entrada
        entrada = new Scanner(System.in);
        N = entrada.nextInt();
        entrada.close();

        for (int i = 1; i <= N; i++) {
        	if (N % i == 0) System.out.println(i);
        }
    }
}

//https://github.com/eduardo-mior/URI-Online-Judge-Solutions/blob/master/Iniciante/URI%201157.java
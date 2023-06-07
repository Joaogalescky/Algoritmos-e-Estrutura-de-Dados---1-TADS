import java.util.Scanner;

public class beecrowd1589alternativo {
 
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int T = leitor.nextInt();
        int R1, R2, R3;
        for (int i = 0; i < T; i++) {
        	R1 = leitor.nextInt();
        	R2 = leitor.nextInt();
        	R3 = R1 + R2;
        	System.out.println(R3);
        leitor.close();
            
        }
    }
}

//https://github.com/eduardo-mior/URI-Online-Judge-Solutions/blob/master/Iniciante/URI%201589.java
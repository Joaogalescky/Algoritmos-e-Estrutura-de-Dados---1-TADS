import java.util.Scanner;

public class beecrowd2058 {
    public static void main(String[] args) {
 
    //variáveis
    int N, T;
    Double A;
    Scanner entrada;
    
    //entrada
    entrada = new Scanner(System.in);
    N = entrada.nextInt();
    entrada.close();
    
        //processamento e saida
        T = N-2;
        A = Math.pow(10,9);
        if(N>=3 && N<=A){
            System.out.printf("%d\n", T);
        }else {
            System.out.println("Numero invalido");
        }
    }
}
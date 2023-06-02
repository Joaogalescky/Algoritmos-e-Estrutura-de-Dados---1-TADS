import java.util.Scanner;

public class beecrowd2455 {
    public static void main(String[] args){
 
    //variaveis
    int P1, P2, C1, C2;
    Scanner entrada;
    
    //entrada
    entrada = new Scanner(System.in);
    P1 = entrada.nextInt();
    C1 = entrada.nextInt();
    P2 = entrada.nextInt();
    C2 = entrada.nextInt();
    entrada.close();
    
    //processamento e saida
        if (P1*C1==P2*C2){
            System.out.println("0");
        }
        if (P1*C1<P2*C2){
            System.out.println("1");
        }
        if (P1*C1>P2*C2){
            System.out.println("-1");
        }
    }
}
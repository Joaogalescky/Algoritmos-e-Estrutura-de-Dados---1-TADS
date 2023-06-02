import java.util.Scanner;

public class beecrowd2936 {
 
    public static void main(String[] args) {
 
    //variaveis
    int A, B, C, D, E, Prato;
    Scanner entrada;
    
    //entrada
    entrada = new Scanner(System.in);
    A = entrada.nextInt();
    B = entrada.nextInt();
    C = entrada.nextInt();
    D = entrada.nextInt();
    E = entrada.nextInt();
    entrada.close();
    
    //processamento e saida
    Prato = A*300 + B*1500 + C*600 + D*1000 + E*150 + 225;
        System.out.printf("%d\n", Prato);
    }
}
import java.util.Scanner;

public class beecrowd2862 {
    public static void main(String [] args) {
    
    
        //variaveis
        int C, N, i;
    
        //entrada
        Scanner entrada = new Scanner(System.in);
        C = entrada.nextInt();
        
        //processamento e saida
            for(i=0;i<C;i++){
            N = entrada.nextInt();
                if(N>8000){
                    System.out.println("Mais de 8000!");
                }
                else{
                    System.out.println("Inseto!");
                }
            }
        entrada.close();
    }
}

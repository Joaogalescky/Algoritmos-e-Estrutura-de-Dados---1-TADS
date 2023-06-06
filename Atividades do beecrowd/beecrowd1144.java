import java.util.Scanner;

public class beecrowd1144 {
 
    public static void main(String[] args){
 
        //variaveis
        int N, Calc1, Calc2, Calc3, repetidor;
        Scanner entrada;
        
        //entrada
        entrada = new Scanner(System.in);
        N = entrada.nextInt();
        entrada.close();
        
        //processamento e saida
        if(N>1 && N<1000){
            repetidor=0;
            while(repetidor<=N){
                Calc1 = repetidor;
                Calc2 = repetidor+Calc1;
                Calc3 = Calc2*2;
                System.out.printf("%d %d %d\n",Calc1, Calc2, Calc3);
                repetidor = repetidor + 1;
            }
        }
    }
}
import java.util.Scanner;

public class beecrowd1159 {
 
    public static void main(String[] args) {

        //variaveis
        int N, aux, aux2, i, i2;
        Scanner entrada;
    
        //entrada
        entrada = new Scanner (System.in);
        aux = 0;
        aux2 = 0;
    
        //processamento e saida
        for(i=1;i!=0;i++){
            N = entrada.nextInt();
            if(N%2==0){
                aux = N;
                for(i2=0;i2!=5;i2++){
                aux = aux + 2;
                }
            }
            else if(N%2!=0){
                aux2 = N;
                aux2 = aux2 + 1;
                for(i2=0;i2!=5;i2++){
                aux2 = aux2 + 2;
                }
            }
            if(N==0){
                entrada.close();
            } 
        }
        System.out.printf("%d\n", aux);
        System.out.printf("%d\n", aux2);
    }
}
import java.util.Scanner;

public class beecrowd1329alternativo {
 
    public static void main(String[] args) {

        //variaveis
        int N, N1, Maria, Joao, i;
        
        //entrada
        Scanner entrada = new Scanner (System.in);
        N = entrada.nextInt();
        
        //processamento e saida
        while(N!=0){
            Maria = 0;
            Joao = 0;
            for(i=0;i<N;i++){
                N1 = entrada.nextInt();
                if(N1 == 0)
                   Maria++;
                else
                   Joao++;
            }
            System.out.printf("Mary won %d times and John won %d times", Maria, Joao);
            N = entrada.nextInt();
        }
        
    }
}

//Utilizei o link abaixo para estudo, alterei apenas o nome das variaveis
//https://github.com/alanlopes4/uri/blob/master/URI1329.java
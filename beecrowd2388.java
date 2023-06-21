import java.util.Scanner;

public class beecrowd2388 {
    public static void main(String [] args) {

        //variaveis
        int N, T=0, V=0, soma=0, i;

        //entrada
        Scanner entrada = new Scanner (System.in);

        //processamento e saida
        N = entrada.nextInt();
        if(N>=1 && N<=1000){
            for(i=0;i<N;i++){ //Sistema de repetição: "N" é o intervalo de tempo
                    T = entrada.nextInt(); //Tempo decorrido Hs
                    V = entrada.nextInt(); //Velocidade média km/h
                if(T>=1 && T <=100 && V>=0 && V<=120){ 
                    soma += T*V;
                }
            }
            System.out.printf("%d\n", soma);
        } 
        else{
            System.out.println("Operação inválida, inicie com intervalos acima de 1 ou menor que 1000");
        }
        entrada.close();
    }    
}

//Link abaixo usado para encontrar a variável de armazenamento
//https://github.com/heltonricardo/beecrowd-uri/blob/master/2-ad-hoc/2388.py#L1

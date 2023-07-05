import java.util.Scanner;

public class beecrowd1329 {
 
    public static void main(String[] args) {

        //variaveis
        int N, N1, Maria, Joao, i;
        
        //entrada
        Scanner entrada = new Scanner (System.in);
        N = entrada.nextInt();
        
        if(N>=1 && N<=10000){
            while(N!=0){  //Se "N" for diferente de 0, execute
                Maria = 0;
                Joao = 0;
                for(i=N;i!=0;i--){ // "i" igual a N, se "i" for diferente de 0, "i" menos 1
                    N1 = entrada.nextInt();
                    if(N1==0){ //Se "N1" igual a 0 
                        Maria = Maria + 1; //"Maria" recebe ela mesma mais 1
                    }
                    else{ //Senão
                        Joao = Joao + 1; //"Joao" recebe ela mesma mais 1
                    }
                }
                System.out.printf("Mary won %d times and John won %d times\n", Maria, Joao);
                N = entrada.nextInt(); //Próxima entrada de "N"
            }
        } else{ 
            System.out.println("Operação inválida");
        }
    }      
}

//Código corrigido utilizando sua versão alternativa
import java.util.Scanner;

public class beecrowd2152 {
    
    public static void main(String [] args) {

            //variaveis
            int T, H=0, M=0, O=0; //T = quantidade de testes; H = hora; M = minuto; O = ocorrência (0, porta fechou, 1, porta abriu);

            //entrada
            Scanner entrada = new Scanner (System.in);
            T = entrada.nextInt();

            //processamento e saida
            for(int i=0;i<T;i++){
            H = entrada.nextInt();
            M = entrada.nextInt();
            O = entrada.nextInt();
                if(H<10){
                    System.out.printf("0%d:", H);
                } else{
                    System.out.printf("%d:", H);
                }
                if(M<10){
                    System.out.printf("0%d", M);
                } else{
                    System.out.printf("%d", M);
                }
                if(O==1){
                    System.out.printf(" - A porta abriu!\n");
                } else{
                    System.out.printf(" - A porta fechou!\n");
                }
            }
        entrada.close();
    }
}

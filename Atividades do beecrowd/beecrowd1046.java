import java.io.IOException;
import java.util.Scanner;

public class beecrowd1046 {
 
    public static void main(String[] args) throws IOException {
 
            //variaveis
            int hora_inicial, hora_final;
            int dia=24;
            Scanner entrada;
    
            //entrada
            entrada = new Scanner(System.in);
            hora_inicial = entrada.nextInt();
            hora_final = entrada.nextInt();
            entrada.close();
            
            //processamento e saida
            if (hora_inicial == hora_final){
                System.out.println("O JOGO DUROU 24 HORA(S)");
            }else{
            int parcialInicial = hora_inicial;
            int parcialFinal = hora_final;
            int parcial = parcialFinal - parcialInicial;
            if(parcial < 0){
                parcial += dia;
            }
            hora_final = (int)parcial;
            System.out.printf("O JOGO DUROU %d HORA(S)\n", hora_final);
        }
    }
}
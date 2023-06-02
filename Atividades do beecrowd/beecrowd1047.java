import java.util.Scanner;

public class beecrowd1047 {
    public static void main(String[] args){
 
    //variaveis
    int hora_inicial, minuto_inicial, hora_final, minuto_final, horas_total, minutos_total;
    int dia=24*60;
    Scanner entrada;
    
    //entrada
            entrada = new Scanner(System.in);
            hora_inicial = entrada.nextInt();
            minuto_inicial = entrada.nextInt();
            hora_final = entrada.nextInt();
            minuto_final = entrada.nextInt();
            entrada.close();
            
            //processamento e saida
            //partida durou 24 horas
            if (hora_inicial == hora_final && minuto_inicial == minuto_final){
                System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
            }else{
            //convertendo para minutos
            int parcialInicial = hora_inicial * 60 + minuto_inicial;
            int parcialFinal = hora_final * 60 + minuto_final;
            int parcial = parcialFinal - parcialInicial;

            //verificando se o jogo começou num dia ou acabou no outro
            if(parcial < 0){
                parcial += dia;
            }

            horas_total = (int)parcial/60;
            minutos_total = parcial - horas_total*60;

            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horas_total, minutos_total);
        }
    }
}
package atividades;
import java.util.Scanner;

public class função2 {

    public static boolean ehPositivo(int n) {
        if(n>0){
            return true;
        } 
            return false;
    }

    public static void main(String [] args) {

        //variaveis
        int n;

        //entrada
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um valor");
        n = entrada.nextInt();
        System.out.printf("É positivo? %b\n", ehPositivo(n = entrada.nextInt()));
        entrada.close();
    }
    
}

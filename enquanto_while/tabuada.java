package enquanto_while;
import java.util.Scanner;
public class tabuada {
    public static void main(String[] args){

        //variaveis
        int numero, repetidor, resultado;
        Scanner entrada;

        //entrada
        entrada = new Scanner(System.in);
        numero = entrada.nextInt();
        entrada.close();
        
        repetidor = 1;
        while(repetidor<=10){
            resultado = numero*repetidor;
            System.out.printf("%dx%d=%d\n", numero, repetidor, resultado);
            repetidor++;  
        }
    }
}

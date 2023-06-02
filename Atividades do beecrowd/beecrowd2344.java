import java.util.Scanner;

public class beecrowd2344 {
 
    public static void main(String[] args){
 
    //variaveis
    int nota;
    Scanner entrada;
    
    //entrada
    entrada = new Scanner(System.in);
    nota = entrada.nextInt();
    entrada.close();
    
    //processamento e saida
        if (nota==0){
            System.out.println("E");
        }
        if (nota<=1 && nota>=35){
            System.out.println("D");
        }
        if (nota<=36 && nota>=60){
            System.out.println("C");
        }
        if (nota<=61 && nota>=85){
            System.out.println("B");
        }
        if (nota<=86 && nota>=100){
            System.out.println("A");
        }
    }
}
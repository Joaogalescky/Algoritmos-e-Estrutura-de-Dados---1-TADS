import java.util.Scanner;

public class beecrowd2791 {
 
    public static void main(String[] args) {
 
    //variaveis
    int C1,C2,C3,C4, Op;
    Scanner entrada;
    
    //entrada
    entrada = new Scanner(System.in);
    C1 = entrada.nextInt();
    C2 = entrada.nextInt();
    C3 = entrada.nextInt();
    C4 = entrada.nextInt();
    entrada.close();
    
    //processamento e saida
            if (C1==1 && C2==0 && C3==0 && C4==0){
                Op = 1;
                System.out.printf("%d\n", Op);
            } else if (C1==0 && C2==1 && C3==0 && C4==0){
                Op = 1 + 1;
                System.out.printf("%d\n", Op); 
            } else if (C1==0 && C2==0 && C3==1 && C4==0){
                Op = 1 + 1 + 1;
                System.out.printf("%d\n", Op);
            } else if (C1==0 && C2==0 && C3==0 && C4==1){
                Op = 1 + 1 + 1 + 1;
                System.out.printf("%d\n", Op);
        }else{
            System.out.println("Operação invalida");
        }
    }
}
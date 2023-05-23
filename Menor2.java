import java.util.Scanner;
public class Menor2 {
    public static void main(String[] args) {
        
        //variaveis
        int n, b, repetidor;
        Scanner entrada;

        entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros que deseja digitar");
        b = entrada.nextInt();
        b = b -1;

        while(n!=0){
            n = entrada.nextInt();
            if (){
                repetidor = n;
                n<b;
                b=n
            }
        }
        entrada.close();
        System.out.println("---------------------");
        System.out.printf("O menor número é: %d\n", repetidor);
        System.out.println("---------------------");
    }
}
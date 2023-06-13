import java.util.Scanner;

public class Par {

    static Scanner entrada = new Scanner (System.in);

    public static void cabecalho() {
        System.out.println("============================");
    }

    public static int getInt(){
        int valor = entrada.nextInt();
        return valor;
    }

    public static int ehPar(int a){
        int valor = a%2;
        return valor;
    }

    public static void main(String [] args){

        //variaveis
        int n, par;

        //entrada e saida
        cabecalho();
        System.out.println("Digite um valor inteiro: ");
        n = getInt();
        par = ehPar(n);
        if(par==0){
            System.out.printf("%d é par\n", n);
        } else {
            System.out.printf("%d é impar\n", n);
        }
    }
    
}

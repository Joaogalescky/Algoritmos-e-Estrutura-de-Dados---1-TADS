import java.util.Scanner;

class Recursividadefibonatte{

    //Recursividade
    public static int fibonacci(int n) {
        if(n<=2){
            return 1;
        }
        return fibonacci(n-2) + fibonacci(n-1);
        //Fibonacci será o valor de "n" (a entrada) - 2 + "n" - 1 (Exemplo: fibonacci(3): fibonacci(1) + fibonacci(2) = fibonacci(3) = 1 + 1)
        //Fibonacci(1) é menor que 2, logo retornara 1
        //Fibonacci(2) é igual a 2, logo vai retornar 1
        //Fibonacci: 1¹ 1² 2³ 3(4) 5(5) 9(6)...
    }

    public static void main(String [] args) {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        System.out.println(fibonacci(n));
    }
} 
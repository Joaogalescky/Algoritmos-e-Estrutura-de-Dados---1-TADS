package atividades;
    import java.util.Scanner;

class cubo{
    public static void main(String[] args){
        //variáveis
        int valor;
        int cubo;
        Scanner entrada;

        //entrada
        entrada = new Scanner(System.in);
        System.out.println("valor: ");
        valor = entrada.nextInt();
        entrada.close();

        //processamento
        cubo = valor * valor * valor;

        //saída
        System.out.printf("O cubo de %d é %d\n", valor, cubo);
    }
}
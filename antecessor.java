import java.util.Scanner;

class antecessor{
    public static void main(String[] args){
        //variáveis
        int valor;
        int antecessor, sucessor;
        Scanner entrada;

        //entrada
        entrada = new Scanner(System.in);
        System.out.println("Valor: ");
        valor = entrada.nextInt();
        entrada.close();

        //Processamento
        antecessor = valor -1;
        sucessor = valor +1;

        //SAída
        System.out.printf("O antecessor de %d é %d\n" , valor, antecessor);
        System.out.printf("O Sucessor de %d é %d\n", valor, sucessor);
    }
}
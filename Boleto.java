import java.util.Scanner;

class Boleto{
    public static void main (String[] args) {
        //variaveis
        int dias;
        float valor, juros, total;
        Scanner entrada;

        //entrada
        entrada = new Scanner(System.in);
        System.out.println("Digite o valor inicial do boleto: ");
        valor = entrada.nextFloat();
        System.out.println("Digite o valor dos juros: ");
        juros = entrada.nextFloat();
        System.out.println("Digite quantos dias passaram após a data de vencimento: ");
        dias = entrada.nextInt();
        entrada.close();

        //processmento
        total = valor + valor * juros/100 * dias;

        //saida
        System.out.printf("O valor total do boleto é: R$ %.2f", total);
    }
}
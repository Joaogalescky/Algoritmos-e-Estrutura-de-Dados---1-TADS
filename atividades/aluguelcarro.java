package atividades;
import java.util.Scanner;

public class aluguelcarro{
    public static void main(String[] args){
        //variáveis
        String nome;
        int dias;
        float quilometros, valor;
        Scanner entrada;

        //entrada
        entrada = new Scanner(System.in);
        System.out.println("Seu nome: ");
        nome = entrada.next();
        System.out.println("Quantidade de dias que permaneceu com o carro: ");
        dias = entrada.nextInt();
        System.out.println("Quilometragem percorrida com o carro: ");
        quilometros = entrada.nextFloat();
        entrada.close();

        //processamento
        valor = (dias * 60) + (quilometros * 0.15f);

        //Saída
        System.out.printf("Boa noite, %s. \nO valor a ser pago pelo alugel de seu veículo é de R$%.2f\n", nome, valor);
    }
}
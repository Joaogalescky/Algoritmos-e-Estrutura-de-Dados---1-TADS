package atividades;
import java.util.Scanner;

public class carrofixo{
        public static void main (String[] args) {
        //variaveis
        float Carro_fabrica, Carro_novo, Distribuidor_porc, Imposto_porc;
        Scanner entrada;

        //entrada
        entrada = new Scanner(System.in);
        System.out.println("Digite o valor de fábrica do veículo: ");
        Carro_fabrica = entrada.nextFloat();
        System.out.println("Digite o percentual do Distribuidor do veículo: ");
        Distribuidor_porc = entrada.nextFloat();
        System.out.println("Digite o percentual do imposto ser pago do veículo: ");
        Imposto_porc = entrada.nextFloat();
        entrada.close();

        //processamento
        Carro_novo = (Float) Carro_fabrica * (Distribuidor_porc/100) + Carro_fabrica * (Imposto_porc/100) + Carro_fabrica;

        //saida
        System.out.println("-----------------------------------");
        System.out.printf("O valor do veículo será de: R$ %.2f.\n", Carro_novo);
        System.out.println("-----------------------------------");
    }
}

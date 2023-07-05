import java.util.Scanner;

public class exercicio {
    //Considere um algoritmo que pergunta e o peso de uma pessoa, e a partir disso calcula e retorna seu índice de massa corporal (IMC), de acordo com a seguinte fórmula:
    //IMC = peso/altura²

    public static double IMC(){
        double peso, altura, imc;
        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite o seu peso:");
        peso = entrada.nextFloat();
        System.out.println("Digite a sua altura");
        altura = entrada.nextFloat();
        entrada.close();

        imc = (peso)/Math.pow(altura, 2);
        return imc;
    }

    public static void main (String [] args){

        System.out.printf("O seu IMC é: %d", IMC());
    }
}

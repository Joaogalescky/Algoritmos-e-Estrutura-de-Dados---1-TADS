import java.util.Scanner;

public class raizcubo2{
    public static void main(String[] args){
        //variaveis
        float valor;
        float raiz;
        double expoente;
        Scanner entrada;

        //entrada
        entrada = new Scanner(System.in);
        valor = entrada.nextFloat();
        entrada.close();

        //processamento
        raiz = (float) Math.sqrt(valor);
        expoente = Math.pow(valor, 3);

        //saida
        System.out.printf("Raiz : %.2f\n", raiz);
        System.out.printf("Ao cubo : %.2f\n", expoente);
    }
    }
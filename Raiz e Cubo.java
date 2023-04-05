import java.util.Scanner;

class Raiz{
    public static void main(String args){

        //variaveis
        float valor;
        float raiz;
        Scanner entrada;

        //entrada
        entrada = new Scanner(System.in);
        valor = entrada.nextFloat();
        entrada.close();

        //processamento
        raiz = (float) Math.sqrt(valor);
        pot = (float) Math.pow(valor, 3);

        //saida
        System.out.printf("Raiz : %f\n", raiz)
        System.out.printf("Ao cubo : %f\n", pot);
    }
    }
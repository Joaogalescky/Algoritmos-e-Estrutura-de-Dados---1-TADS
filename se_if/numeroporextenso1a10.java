import java.util.Scanner;

public class numeroporextenso1a10{
    public static void main(String[] args){
        //variáveis
        int numero;
        Scanner entrada;

        //entrada
        entrada = new Scanner(System.in);
        System.out.println("Digete um número de 0 a 10");
        numero = entrada.nextInt();
        entrada.close();

        //processamento
        //Utilizando if
        if (numero==0)
        System.out.println("zero");
        else if (numero==1)
        System.out.println("um");
        else if (numero==2)
        System.out.println("dois");
        else if (numero==3)
        System.out.println("três");
        else if (numero==4)
        System.out.println("quatro");
        else if (numero==5)
        System.out.println("cinco");
        else if (numero==6)
        System.out.println("seis");
        else if (numero==7)
        System.out.println("sete");
        else if (numero==8)
        System.out.println("oito");
        else if (numero==9)
        System.out.println("nove");
        else if (numero==10)
        System.out.println("dez");
        else{
            System.out.println("Número não está no sistema");
        }
    }
}
import java.util.Scanner;

public class hora{
    public static void main(String[] args){
        //variáveis
        int hora, minutos, segundos;
        int resultado;
        Scanner entrada;

        //entrada
        entrada = new Scanner(System.in);
        System.out.println("hora: ");
        hora = entrada.nextInt();
        System.out.println("minutos: ");
        minutos = entrada.nextInt();
        System.out.println("segundos: ");
        segundos = entrada.nextInt();
        entrada.close();

        //Processamento
        resultado = hora * 3600;
        resultado = resultado + minutos * 60;
        resultado = resultado + segundos;

        //Saída
        System.out.printf("Se passaram %d segundos desde 00:00\n", resultado);
    }
}
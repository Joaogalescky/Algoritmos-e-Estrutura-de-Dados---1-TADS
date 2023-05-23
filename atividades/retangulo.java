package atividades;
    import java.util.Scanner;

class retangulo{
    public static void main(String[] args){
        //variáveis
        int altura, base, perimetro, area;
        Scanner entrada;

        //entrada
        entrada = new Scanner(System.in);
        System.out.println("Altura do retângulo: ");
        altura = entrada.nextInt();
        System.out.println("Base do Retângulo: ");
        base = entrada.nextInt();
        entrada.close();

        //processamento
        perimetro = 2 * (base + altura);
        area = base * altura;

        //saída
        System.out.printf("O perímetro desse retãngulo é de %d.\nA área desse retângulo é de %d\n", perimetro, area);
    }
}
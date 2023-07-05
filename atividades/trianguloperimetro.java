package atividades;
import java.util.Scanner;

 class trianguloperimetro{

    public static float distancia_entre_dois_pontos (float x0, float y0, float x1, float y1){
        float D;
        D = (float) Math.sqrt(Math.pow(2, x0-x1) + Math.pow(2, y0-y1));
    
        return D;

    }

    public static float perimetro_triangulo(int x0, int y0, int x1, int y1, int x2, int y2) {
        float perimetro;
        float perimetro1;
        float perimetro2;
        float total;
        perimetro = (float) distancia_entre_dois_pontos(x0, y0, x1, y1);
        perimetro1 = (float) distancia_entre_dois_pontos(x1, y1, x2, y2);
        perimetro2 = (float) distancia_entre_dois_pontos(x2, y2, x0, y0);

        total = (float) perimetro + perimetro1 + perimetro2;
        return perimetro;
    }

    public static void main(String[] args) {
        
        int x0, y0, x1, y1, x2, y2;

        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("Digite o valor de 'X0'");
        x0 = entrada.nextInt();
        System.out.println("Digite o valor de 'Y0'");
        y0 = entrada.nextInt();
        System.out.println("Digite o valor de 'X1'");
        x1 = entrada.nextInt();
        System.out.println("Digite o valor de 'Y1'");
        y1 = entrada.nextInt();
        System.out.println("Digite o valor de 'X2'");
        x2 = entrada.nextInt();
        System.out.println("Digite o valor de 'Y2'");
        y2 = entrada.nextInt();
        entrada.close();

        float perimetro2;

        perimetro2 = perimetro_triangulo(x0, y0, x1, y1, x2, y2);
        System.out.println(perimetro2);

    }
}
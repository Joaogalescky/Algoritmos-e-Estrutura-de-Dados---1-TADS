package atividades;
import java.util.Scanner;

 class Planocartesiano{

    public static float distancia_entre_dois_pontos (float XB, float XA, float YB, float YA){
        float D;
        D = (float) Math.sqrt(Math.pow(XB-XA, 2) + Math.pow(YB-YA, 2));
    
        return D;

    }

    public static void main(String[] args) {
    
        float xb, xa, yb, ya;

        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite o valor de 'xb'");
        xb = entrada.nextFloat();
        System.out.println("Digite o valor de 'xa'");
        xa = entrada.nextFloat();
        System.out.println("Digite o valor de 'yb'");
        yb = entrada.nextFloat();
        System.out.println("Digite o valor de 'ya'");
        ya = entrada.nextFloat();
        entrada.close();
 
        float retorno;
        retorno = distancia_entre_dois_pontos(xb, xa, yb, ya);
        
        System.out.println(retorno);
    }
}
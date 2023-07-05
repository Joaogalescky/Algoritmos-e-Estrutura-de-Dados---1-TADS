package atividades;

import java.util.Scanner;

public class Media {
    
    static Scanner sc = new Scanner (System.in);

    public static void cabecalho() {
        System.out.println("============================");
    }

    public static String getString(){
        String st;
        st = sc.next();
        return st;
    }

    public static int getInt(){
        int valor;
        valor = sc.nextInt();
        return valor;
    }

    public static void fechaScanner(){
        sc.close();
    }

    public static float calcularMedia(int a, int b, int c){
        float media;
        media = (a+b+c)/3;
        return media;
    }

    public static void main (String [] args) {

        //variaveis
        int v1, v2, v3;
        float media;

        //entrada e saida
        cabecalho();
        System.out.println("Digite três valores: ");
        v1 = getInt();
        v2 = getInt();
        v3 = getInt();
        media = calcularMedia(v1,v2,v3);
        System.out.printf("Media %f\n", media);
        cabecalho();
        fechaScanner();
    }
}


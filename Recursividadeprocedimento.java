import java.util.Scanner;

class Recursividadeprocedimento{

    //Recursividade
    public static void linhaCaractere(int x) {
        int i;
        for(i=0;i<x;i++){
            System.out.printf("*");
        }
        System.out.println();
    }

    public static void triangulo(int n) {
        int i;
        for(i=n;i>0;i--){
            linhaCaractere(i);
        }
    }

    public static void trianguloRec(int n){
        if(n>0){
            linhaCaractere(n); //A chamada dessa função fará o desenho de cima
            trianguloRec(n-1);
            linhaCaractere(n); //A chamada dessa função fará o desenho de abaixo
        }
    }
    //Fim recursividade

public static void main(String []args) {
    
    //entrada
    Scanner entrada = new Scanner (System.in);
    int n = entrada.nextInt();
    entrada.close();

    //saida da recursividade
    trianguloRec(n);

    } 
}
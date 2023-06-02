import java.util.Scanner;

public class beecrowd1049 {
    public static void main(String[] args) {

        //variaveis
        String palavra_1, palavra_2, palavra_3;
        Scanner entrada;

        //entrada
        entrada = new Scanner(System.in);
        palavra_1 = entrada.next();
        palavra_2 = entrada.next();
        palavra_3 = entrada.next();
        entrada.close();
        
        //processamento e saida
        if (palavra_1.equalsIgnoreCase("vertebrado") && palavra_2.equalsIgnoreCase("ave") && palavra_3.equalsIgnoreCase("carnivoro"))
            System.out.print("aguia");
        if (palavra_1.equalsIgnoreCase("vertebrado") && palavra_2.equalsIgnoreCase("ave") && palavra_3.equalsIgnoreCase("onivoro"))
            System.out.print("pombo");
        if (palavra_1.equalsIgnoreCase("vertebrado") && palavra_2.equalsIgnoreCase("mamifero") && palavra_3.equalsIgnoreCase("onivoro"))
            System.out.print("homem");
        if (palavra_1.equalsIgnoreCase("vertebrado") && palavra_2.equalsIgnoreCase("mamifero") && palavra_3.equalsIgnoreCase("herbivoro"))
            System.out.print("vaca");
        if (palavra_1.equalsIgnoreCase("invertebrado") && palavra_2.equalsIgnoreCase("inseto") && palavra_3.equalsIgnoreCase("hematofago"))
            System.out.print("pulga");
        if (palavra_1.equalsIgnoreCase("invertebrado") && palavra_2.equalsIgnoreCase("inseto") && palavra_3.equalsIgnoreCase("herbivoro"))
            System.out.print("lagarta");
        if (palavra_1.equalsIgnoreCase("invertebrado") && palavra_2.equalsIgnoreCase("anelideo") && palavra_3.equalsIgnoreCase("hematofago"))
            System.out.print("sanguessuga");
        if (palavra_1.equalsIgnoreCase("invertebrado") && palavra_2.equalsIgnoreCase("analideo") && palavra_3.equalsIgnoreCase("onivoro"))
            System.out.print("minhoca");
        }
    }
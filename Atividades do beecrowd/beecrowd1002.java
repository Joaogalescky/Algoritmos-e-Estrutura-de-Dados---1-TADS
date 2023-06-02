import java.util.Scanner;

public class beecrowd1002 {
    public static void main(String[] args) {
 
    //variáveis
    double raio, area, pi;
    Scanner entrada;
    
    //entrada
    entrada = new Scanner(System.in);
    raio = entrada.nextDouble();
    entrada.close();
    
    //processament
    //área = pi.raio² - pi=3.14159
        pi=3.14159;
        area=pi*(raio*raio);
        System.out.printf("A=%.4f\n", area);
    }
}
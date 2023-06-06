package caso_case;
import java.util.Scanner;
public class calculadora3{
    public static void main(String[] args){
        
        //variáveis
        float a, b, result;
        String op;
        Scanner entrada;

        //entrada
        entrada = new Scanner(System.in);
        System.out.println("A: ");
        a = entrada.nextFloat();
        System.out.println("Op (=-/*): ");
        op = entrada.next();
        System.out.println("B: ");
        b = entrada.nextFloat();
        entrada.close();

        //processamento e saída
        switch(op) {
            case "+":
            result = a + b;
            System.out.printf("%.2f + %.2f = %.2f\n", a, b, result);
            break;
            case "-":
            result = a - b;
            System.out.printf("%.2f - %.2f = %.2f\n", a, b, result);
            break;
            case "/":
            result = a / b;
            System.out.printf("%.2f / %.2f = %.2f\n", a, b, result);
            break;
            case "*":
            result = a * b;
            System.out.printf("%.2f * %.2f = %.2f\n", a, b, result);
            break;
            default:
            System.out.println("Operação inválida");
        }
    }
}